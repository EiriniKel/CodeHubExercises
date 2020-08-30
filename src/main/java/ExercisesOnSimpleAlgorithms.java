import java.util.Scanner;

public class ExercisesOnSimpleAlgorithms {


    public static double Exercise1() {


        System.out.println("Exercise 1. Write a program that calculates the factorial of a number n\n" +
                "(n!)." + '\n' + "Enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double factorial = 1;

        for (int i = 1; i <= number; ++i) {
            factorial *= i;
        }
        System.out.printf("The factorial of " + number + " is " + factorial + '\n');
        return factorial;
    }

    public static double Exercise2() {

        System.out.println("Exercise 2. Find the maximum value of n as int so that the calculated\n" +
                "output is valid." + '\n' + "Enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        int inputnumber = scanner.nextInt();
        int res = 2;
        long factorial = 2;
        long printFactorial = 0;
        while (factorial >= 0) {

            res++;
            factorial = factorial * res;
            if (factorial > 0)
                printFactorial = factorial;
        }
        System.out.println("Maximum integer value: " + printFactorial + "\n");
        return printFactorial;
    }

    public static boolean Exercise3() {

        System.out.println("Exercise3. Write a program that returns true or false depending on if\n" +
                "the number is prime or not." + '\n' + "Enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int division = 0;
        division = number / 2;
        boolean result = true;

        if (number <= 0 || number == 1) {
            result = false;
        }

        for (int i = 2; i <= division; i++) {
            if (number % i == 0) {
                result = false;
            }
        }
        System.out.println(result);
        return result;
    }

    public static double Exercise4() {

        System.out.println('\n' + "Exercise4. Write a program that, for a given n, it calculates the\n" +
                "following value: 1 + ½ + ⅓ + … + 1/n." + '\n' + "Enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        double i;
        double sum = 0;

        for (i = 1; i <= number; i++) {
            sum = sum + 1 / i;
        }

        System.out.println("The sum is " + sum + '\n');
        return sum;

    }

    public static int Exercise5() {

        System.out.println("Exercise 5. Write a program that counts the digits of a long number."
                + '\n' + "Enter a long number: ");
        Scanner scanner = new Scanner(System.in);
        long number = scanner.nextLong();
        int count = 0;

        while (number != 0) {
            number = number / 10;
            count = count + 1;
        }

        System.out.println("The number of digits is " + count + '\n');
        return count;
    }

    public static String Exercise6() {

        System.out.println("Exercise 6. Given a positive float number, print its decimal part. For\n" +
                "example, given the number 2.31, the output should be 0.31."
                + '\n' + "Enter a positive float number: ");
        Scanner scanner = new Scanner(System.in);
        float number = scanner.nextFloat();

        String floatToString = String.valueOf(number);
        int decimal = floatToString.indexOf(".");
        System.out.println("The decimal part is " + floatToString.substring(decimal));
        return floatToString.substring(decimal);

//        double doubleNumber = number;
//        double x = 0;
//
//        x = doubleNumber % 1;
//        x = doubleNumber - (int)doubleNumber; //we lose precision that way

    }

    public static void main(String[] args) {
        Exercise1();
        Exercise2();
        Exercise3();
        Exercise4();
        Exercise5();
        Exercise6();
    }


}
