/*Write a program to concatenate two integer arrays into a single sorted array having distinct values.
        I/P: {1,9,1,5,7,9,0}, {2,4,8,3,9,6}
        O/P: {0,1,2,3,4,5,6,7,8,9}

   */
package com.miniAssignment.ex;

import java.util.Set;
import java.util.TreeSet;

public class ConcatenateArrays {
    public static void main(String[] args) {
        int[] array1 = {1,9,1,5,7,9,0};
        int[] array2 = {2,4,8,3,9,6};

        Set<Integer> set=new TreeSet<Integer>();// Creating an object of Set and

        for(int i=0;i<array1.length;i++){ // inserting array1 elements into set
            set.add(array1[i]);   // set store the element in ascending order and remove the duplicate one.
        }
        for(int i=0;i<array2.length;i++){
            set.add(array2[i]);
        }

        System.out.print(set);
    }
}
