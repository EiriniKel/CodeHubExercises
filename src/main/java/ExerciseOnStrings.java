import java.util.Scanner;

public class ExerciseOnStrings {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter password : ");
        String password = in.nextLine();

        int x = 0;
        if (UpperCase(password)) {
            x += 1;
        }
        if (LowerCase(password)) {
            x += 1;
        }
        if (OneNumber(password)) {
            x += 1;
        }
        if (SpecialChar(password)) {
            x += 1;
        }
        if (EightChars(password)) {
            x += 1;
        }
        if (SequenseOfThree(password)) {
            x += 1;
        }
        //System.out.println(x);

        if (EightChars(password) && x >= 3) {
            if (UpperCase(password) && LowerCase(password) && OneNumber(password) && SpecialChar(password) && SequenseOfThree(password)) {
                System.out.println("Very Strong Password");
            } else if (OneNumber(password) && SequenseOfThree(password) || SpecialChar(password) && SequenseOfThree(password)) {
                System.out.println("Password OK");
            } else if (SequenseOfThree(password)) {
                System.out.println("Strong password");
            }
        }
        if (x < 3) {
            System.out.println("Invalid password. Password's length must be at least 8 characters long and " + '\n' +
                    "must follow at least 2 of the following criteria : at least one uppercase character," + '\n' +
                    "at least one lowercase character, at least one number,at least one special character,Password" + '\n' +
                    "Cannot contain a sequence of 3 same characters or a sequence of 3 consecutive characters");
        }
    }


    // condition 1
    public static boolean UpperCase(String password) {
        boolean atleastOneUpper = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                atleastOneUpper = true;
                return atleastOneUpper;
            }
        }
        return false;
    }

    //condition 2
    public static boolean LowerCase(String password) {
        boolean atleastOneLower = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                atleastOneLower = true;
                return atleastOneLower;
            }
        }
        return false;

    }

    //condition 3
    public static boolean OneNumber(String password) {
        boolean atleastOneDigit = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                atleastOneDigit = true;
                return atleastOneDigit;
            }
        }
        return false;
    }

    //condition 4
    public static boolean SpecialChar(String password) {
        String specialChars = "@#$%^&+=";
        String str2[] = password.split("");
        for (int i = 0; i < str2.length; i++) {
            if (specialChars.contains(str2[i])) {
                return true;
            }
        }
        return false;
    }


    //condition 5
    public static boolean EightChars(String password) {
        if (password.length() < 8) {
            return false;
        }
        return true;
    }

    //condition 6
    public static boolean SequenseOfThree(String password) {
        int count = 0;
        boolean sameCh = true;
        boolean consecutiveCh = true;
        for (int i = 0; i < password.length(); i++) {
            for (int j = 0; j < password.length(); j++)
                if (password.charAt(i) == password.charAt(j))
                    ++count;
            if (count > 2) {
                return false;
            } else {
                count = 0;
            }
            for (int j = 0; j < password.length(); j++)
                if (password.charAt(i) == password.charAt(j) - count)
                    ++count;
            if (count > 2)
                return false;
            else
                count = 0;
        }
        if (sameCh && consecutiveCh) {
            return true;
        } else {
            return false;
        }
    }

}