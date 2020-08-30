import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ExercisesOnArraysAndCollections {


    //1
    static void isPrime(ArrayList<Integer> input) {
        ArrayList<Integer> primeList = new ArrayList<Integer>();

        for (int i = 0; i < input.size(); i++) {
            if (isPrime(input.get(i))) {
                primeList.add(input.get(i));
            }
        }
        System.out.println("Sublist with prime numbers: " + primeList);
    }

    static boolean isPrime(int input) {

        if (input == 1) {
            return false;
        }
        for (int i = 2; i < input; i++) {
            if ((input % i) == 0) {
                return false;
            }
        }
        return true;
    }


    //2
    public static <myList> ArrayList<myList> removeDuplicates(ArrayList<myList> list) {
        ArrayList<myList> newList = new ArrayList<myList>();

        for (myList element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

    //3

    public static int Exercise3() {

        System.out.println("Exercise 3. Write a program that returns the digits of number in descending order." + '\n' + "Enter an integer: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int sortedNumber = 0;
        for (int i = 9; i >= 0; i--) {
            int tmpNumber = number;
            while (tmpNumber > 0) {
                int digit = tmpNumber % 10;
                if (digit == i) {
                    sortedNumber *= 10;
                    sortedNumber += digit;
                }
                tmpNumber /= 10;
            }
        }
        System.out.println(sortedNumber);
        return sortedNumber;
    }

    //5
    public static String reverse(String inputstring) {

        if (inputstring == null || inputstring.equals(""))
            return inputstring;

        Stack<Character> stack = new Stack<Character>();

        char[] character = inputstring.toCharArray();
        for (int i = 0; i < inputstring.length(); i++)
            stack.push(character[i]);

        int k = 0;

        while (!stack.isEmpty()) {

            character[k++] = stack.pop();
        }
        return String.copyValueOf(character);
    }

    //6

    public static boolean IsSymmetric(String inputstring) {
        System.out.println("Exercise 6. Write a program that check if a word is symmetric, ignoring cases" + '\n' + "Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String newstring = scanner.nextLine();
        int i = 0;
        int j = newstring.length() - 1;

        while (i < j) {

            if (newstring.charAt(i) != newstring.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }


    public static void main(String[] args) {
        //1
        ArrayList<Integer> newlist = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("Exercise 1. Given a list of integers, return a sub list that contains only the\n" +
                "prime numbers" + '\n' + "Enter integers. To stop enter 0");
        int numberForList = 999999999;
        while (numberForList != 0) {
            numberForList = input.nextInt();
            if (numberForList != 0) {
                newlist.add(numberForList);
            }
        }
        isPrime(newlist);


        //2
        System.out.println("Exercise 2. Implement a way of finding a list eliminating the duplicates\n" +
                "from a list." + '\n' + "Enter integers. To stop enter a non integer or eol");
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList());
        while (scan.hasNextInt()) {
            list.add(scan.nextInt());
        }

        ArrayList<Integer> newList = removeDuplicates(list);

        System.out.println("ArrayList with duplicates removed: " + newList + '\n');

        //3

        Exercise3();

        //5
        System.out.println("Exercise 5. Reverse a string using only a stack" + '\n' + "Enter a string: ");
        Scanner scanner = new Scanner(System.in);
        String inputstring = scanner.nextLine();
        inputstring = reverse(inputstring);
        System.out.println("Reverse of the given string is : " + inputstring);

        //6
        if (IsSymmetric(inputstring))
            System.out.print("Is symmetric");
        else
            System.out.print("Is not symmetric");


    }
}


