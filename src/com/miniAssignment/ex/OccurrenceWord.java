/*	Write a program to count the occurrence of a word in a string:
        String: Java is my favorite language. Java is java.
        I/P: java
        O/P: 3
*/
package com.miniAssignment.ex;

    import java.util.Scanner;

    public class OccurrenceWord {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);// Create a Scanner object

            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();//Read user input

            System.out.print("Enter a word to count: ");
            String word = scanner.next();

//String is split by spaces in temp. A for loop is used to find if the word is available in temp.

            String temp[] = inputString.split(" ");

            int count = 0;
            for (int i = 0; i < temp.length; i++) {
                if (word.equalsIgnoreCase(temp[i]))
                    count++;
            }
            System.out.println(count);
        }

}
