package com.company;

import java.util.Arrays;

/**
 * @author Arman Karapetyan
 */

public class Main {

    public static void main(String[] args) {

        //chack lesson 1
        System.out.println(Arrays.toString(ArrayUtils.evenAndOddArraySort(new int[]{4, 5, 3, 5, 6, 5, 3, 6, 8, 11, 1, 2})));
        System.out.println(Arrays.toString(ArrayUtils.evenAndOddArraySort(new int[]{1, 2})));

        //chack lesson 2
        System.out.println(ArrayUtils.isAscendingSequence(new int[]{1, 2}));
        System.out.println(ArrayUtils.isAscendingSequence(new int[]{2, 1}));
        System.out.println(ArrayUtils.isAscendingSequence(new int[]{2, 1, 3}));
        System.out.println(ArrayUtils.isAscendingSequence(new int[]{1, 2, 5}));

        // chack lesson 3
        System.out.println(ArrayUtils.getArithmeticAverage(new int[]{1, 2, 6}));

        //chack lesson 4
        System.out.println(Arrays.toString(ArrayUtils.getUniqueElements(new int[]{1, 2, 5, 10, 21, 10}, new int[]{1, 2, 6})));
        System.out.println(Arrays.toString(ArrayUtils.getUniqueElements(new int[]{1, 2, 5, 10, 21}, new int[]{1, 2, 6, 10})));

        //chack lesson 5
        System.out.println(Arrays.toString(ArrayUtils.getRandomSort(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10})));
        System.out.println(Arrays.toString(ArrayUtils.getRandomSort(new int[]{1, 1, 2, 2, 3, 3, 4, 4, 5, 5})));

        //chack lesson 6
        System.out.println(Arrays.toString(ArrayUtils.getPairsOfNumbersSumArray(20, new int[]{5, 10, 10, 13, 7, 15, 5})));
        System.out.println(Arrays.toString(ArrayUtils.getPairsOfNumbersSumArray(20, new int[]{5, 5, 7, 8, 1, 9, 5})));
        System.out.println(Arrays.toString(ArrayUtils.getPairsOfNumbersSumArray(20, new int[]{5, 45, 7, 38, 20, 10, 10})));
        System.out.println(Arrays.toString(ArrayUtils.getPairsOfNumbersSumArray(20, new int[]{5, 45, 7, -1, 20, 21, 10})));

        //chack lesson 7
        System.out.println(ArrayUtils.getMostFrequentlyElement(new int[]{5, 45, 7, 38, 20, 10, 10, 7, 45, 45}));
        System.out.println(ArrayUtils.getMostFrequentlyElement(new int[]{5, 45, 7, 38, 20, 10, 10, 7, 45, 7, 8, 1, 7}));
        System.out.println(ArrayUtils.getMostFrequentlyElement(new int[]{5, 11, 7, 38, 20, 11, 11, 7, 45, 11, 45}));
        System.out.println(ArrayUtils.getMostFrequentlyElement(new int[]{5, 11, 7, 38, 20, 7, 45, 11, 45}));

        //chack lesson 8
        System.out.println(Arrays.toString(ArrayUtils.getNotDuplicateArray(new int[]{1, 1, 1, 3, 3, 4, 4, 5, 5, 6})));
        System.out.println(Arrays.toString(ArrayUtils.getNotDuplicateArray(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6})));
        System.out.println(Arrays.toString(ArrayUtils.getNotDuplicateArray(new int[]{1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 6})));

    }
}
