package za.ac.tut.model;

import javax.ejb.Stateless;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Stateless
public class CipcBean {

    // Regex pattern for YYYY/NNNNNN/NN
    private final String REGEX_PATTERN = "^(18|19|20)\\d{2}/\\d{6}/\\d{2}$";

    public boolean validateFormat(String regNum) {
        if (regNum == null) {
            return false;
        }
        return regNum.matches(REGEX_PATTERN);
    }

    public String determineCompanyType(String regNum) {
        // Extract the last 2 digits (the suffix)
        String suffix = regNum.substring(regNum.length() - 2);

        if (suffix.equals("07")) {
            return "Private Company (Pty) Ltd";
        } else if (suffix.equals("08")) {
            return "Non-Profit Company (NPC)";
        } else if (suffix.equals("23")) {
            return "Close Corporation (CC)";
        } else {
            return "Other / Unknown Suffix (" + suffix + ")";
        }
    }
}