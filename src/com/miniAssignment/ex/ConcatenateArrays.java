/*Write a program to concatenate two integer arrays into a single sorted array having distinct values.
        I/P: {1,9,1,5,7,9,0}, {2,4,8,3,9,6}
        O/P: {0,1,2,3,4,5,6,7,8,9}
   */
package com.miniAssignment.ex;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ConcatenateArrays {
    public static void main(String[] args) {

        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
//reading the number of elements from the that we want to enter
        n=sc.nextInt();
//creates an array in the memory of length 10
        int[] array = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++)
        {
//reading array elements from the user
            array[i]=sc.nextInt();
        }
        int m;
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
//reading the number of elements from the that we want to enter
        m=sc1.nextInt();
//creates an array in the memory of length 10
        int[] array1 = new int[10];
        System.out.println("Enter the elements of the array: ");
        for(int j=0; j<m; j++)
        {
//reading array elements from the user
            array1[j]=sc.nextInt();
        }
        Set<Integer> set=new TreeSet<Integer>();// Creating an object of Set and
// inserting array1 elements into set
        for(int i=0;i<array.length;i++){
// set store the element in ascending order and remove the duplicate one.
            set.add(array[i]);
        }
        for(int i=0;i<array1.length;i++){
            set.add(array1[i]);
        }

        System.out.print(set);
    }
}
