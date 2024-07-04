package com.company;

public class Int_ExtractNumbers {
    public static void main(String[] args) {
        String s = "123abc7889def";
        StringBuilder result = new StringBuilder();

        // Iterate through each character in the string
        for (char c : s.toCharArray()) {
            // Check if the character is a digit
            if (Character.isDigit(c)) {
                // Append the digit to the result
                result.append(c);
            }
        }
        // Print the result
        System.out.println(result.toString());


        ///public class RemoveSpaces {
        //    public static void main(String[] args) {
        //        String str = "On        Automation   jjjj e";
        //        // Removing all spaces from the string
        //        String result = str.replaceAll("\\s+", "");
        //        System.out.println("Original string: " + str);
        //        System.out.println("String without spaces: " + result);
        //    }
        //}
    }
}