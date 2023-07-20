package com.miniAssignment.ex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
    public class ListPartitions {

        public static void main(String[] args) {
            int[] arrayInput = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            int batchSize = 3;

            List<int[]> batches = createBatches(arrayInput, batchSize);
            for (int i = 0; i < batches.size(); i++) {
                System.out.println(Arrays.toString(batches.get(i)));
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