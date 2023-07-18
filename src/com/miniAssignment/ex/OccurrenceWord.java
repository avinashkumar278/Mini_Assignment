/*	Write a program to count the occurrence of a word in a string:
        String: Java is my favorite language. Java is java.
        I/P: java
        O/P: 3
*/
package com.miniAssignment.ex;

    import java.util.Scanner;

    public class OccurrenceWord {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            System.out.print("Enter a word to count: ");
            String word = scanner.next();


            String temp[] = inputString.split(" ");

            int count = 0;
            for (int i = 0; i < temp.length; i++) {
                if (word.equalsIgnoreCase(temp[i]))
                    count++;
            }
            System.out.println(count);
        }

}
