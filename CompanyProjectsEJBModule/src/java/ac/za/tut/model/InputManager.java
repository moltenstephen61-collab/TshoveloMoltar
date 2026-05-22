/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ac.za.tut.model;

/**
 * Utility class to manage and clean raw input values.
 */
public class InputManager {

    /**
     * Checks if a text parameter is missing, empty, or consists only of whitespace.
     */
    public static boolean isInvalidString(String value) {
        // Matches null, completely empty, or strings containing only spaces
        return value == null || value.trim().matches("^\\s*$");
    }

    /**
     * Validates and parses a string ID safely. 
     * Returns null if the value is non-numeric or invalid.
     */
    public static Long parseSafeId(String rawId) {
        if (rawId == null) {
            return null;
        }
        
        String cleanId = rawId.trim();
        // Regex pattern to ensure the string contains only digits
        if (!cleanId.matches("^\\d+$")) {
            return null;
        }
        
        try {
            return Long.parseLong(cleanId);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}