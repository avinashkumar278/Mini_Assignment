/*
4.	Write a program to break a list into n size batches of list
I/P: [1,2,3,5,6,7,8,9,10,4,11]
n=3
O/P: [[1,2,3],[5,6,7],[8,9,10],[4,11]]
 */
package com.miniAssignment.ex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
    public class ListPartitions {

        public static void main(String[] args) {
            int[] arrayInput = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int batchSize = 3;
            System.out.println("ListPartitions : ");
            List<int[]> batches = createBatches(arrayInput, batchSize);
            for (int i = 0; i < batches.size(); i++) {
                System.out.print(Arrays.toString(batches.get(i)));
            }
        }
        public static List<int[]> createBatches(int[] array, int batchSize) {
            List<int[]> batches = new ArrayList<>();

            int startIndex = 0;
            while (startIndex < array.length) {
                int endIndex = Math.min(startIndex + batchSize, array.length);
                int[] batch = Arrays.copyOfRange(array, startIndex, endIndex);
                batches.add(batch);
                startIndex += batchSize;
            }
            return batches;
        }
    }