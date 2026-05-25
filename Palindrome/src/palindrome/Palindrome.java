package palindrome;

public class Palindrome {
    public static void main(String[] args) {
        String palindrome = "212";
        String valid = "";
        
        if (palindrome != null && palindrome.matches("[\\d]+")) {
            // Reverse the string
            for (int i = palindrome.length() - 1; i >= 0; i--) {
                valid += palindrome.charAt(i);
            }
        }
        
        if (valid.equals(palindrome)) {
            System.out.println(palindrome + " is a Palindrome");
        } else {
            System.out.println(palindrome + " is Not a Palindrome");
        }
    }
}
