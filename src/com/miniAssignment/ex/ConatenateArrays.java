package com.miniAssignment.ex;

import java.util.Set;
import java.util.TreeSet;

public class ConatenateArrays {
    public static void main(String[] args) {
        int[] array1 = {1,9,1,5,7,9,0};
        int[] array2 = {2,4,8,3,9,6};

        Set<Integer> set=new TreeSet<Integer>();

        for(int i=0;i<array1.length;i++){
            set.add(array1[i]);
        }
        for(int i=0;i<array2.length;i++){
            set.add(array2[i]);
        }

        System.out.print(set);
    }
}
