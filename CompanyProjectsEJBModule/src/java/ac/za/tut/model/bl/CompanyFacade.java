/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.bl;

import ac.za.tut.entity.Company;
import ac.za.tut.entity.Project;
import ac.za.tut.model.InputManager;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author TSHOVELO MOLTAR
 */
@Stateless
public class CompanyFacade extends AbstractFacade<Company> implements CompanyFacadeLocal {

    @PersistenceContext(unitName = "CompanyProjectsEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CompanyFacade() {
        super(Company.class);
    }
    @Override
    public void processAndSaveCompanyWithProjects(
            String rawCompId, String compName,
            String title0, String descr0,
            String title1, String descr1,
            String title2, String descr2) {

        // 1. Audit numeric parameters using the InputManager gate
        Long companyId = InputManager.parseSafeId(rawCompId);
        if (companyId == null) {
            throw new IllegalArgumentException("Company ID must be a valid numeric identifier.");
        }

        // 2. Audit core identities using text matching rules
        if (InputManager.isInvalidString(compName)) {
            throw new IllegalArgumentException("Company Name cannot be empty.");
        }

        if (InputManager.isInvalidString(title0) || InputManager.isInvalidString(descr0)) {
            throw new IllegalArgumentException("Primary Project Title and Description are required.");
        }

        // 3. Optional parameters: Loop checks if titles are given without descriptions
        String[] dynamicTitles = {title1, title2};
        String[] dynamicDescriptions = {descr1, descr2};

        for (int i = 0; i < dynamicTitles.length; i++) {
            boolean hasTitle = !InputManager.isInvalidString(dynamicTitles[i]);
            boolean hasDescription = !InputManager.isInvalidString(dynamicDescriptions[i]);

            if (hasTitle && !hasDescription) {
                throw new IllegalArgumentException("Additional Project " + (i + 1) + " requires a matching description.");
            }
        }

        // 4. Everything is clean! Construct the entities
        Company company = new Company();
        company.setId(companyId); // Assumes you manually set the ID, otherwise skip if auto-generated
        company.setName(compName);

        List<Project> projectsList = new ArrayList<>();

        // Add the primary project
        Project primaryProject = new Project();
        primaryProject.setTitle(title0);
        primaryProject.setDescription(descr0);
        // If your Project model tracks the relationship back to Company:
        // primaryProject.setCompany(company); 
        projectsList.add(primaryProject);

        // Add the optional projects if they were filled out
        for (int i = 0; i < dynamicTitles.length; i++) {
            if (!InputManager.isInvalidString(dynamicTitles[i])) {
                Project optionalProject = new Project();
                optionalProject.setTitle(dynamicTitles[i]);
                optionalProject.setDescription(dynamicDescriptions[i]);
                // optionalProject.setCompany(company);
                projectsList.add(optionalProject);
            }
        }

        // Attach the list of projects to your company entity
        company.setProjects(projectsList);

        // 5. Save everything to the database using the underlying AbstractFacade or EntityManager
        this.create(company); 
    }
}
