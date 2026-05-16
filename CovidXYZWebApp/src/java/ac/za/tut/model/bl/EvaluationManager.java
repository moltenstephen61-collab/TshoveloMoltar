/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model.bl;

/**
 *
 * @author TSHOVELO MOLTAR
 */
public class EvaluationManager {
    //
    public boolean checkMasks(String check){
        //
        boolean maskon = false;
        //
        if(check.equalsIgnoreCase("On")){
            maskon = true;
        }
        return maskon;
    }
    public String checkTemperature(double temp){
        //
        String access = "denied";
        //
        if(temp >= 36 && temp <= 38){
            access = "granted";
        }
        //
        return access;
    }
    
}
