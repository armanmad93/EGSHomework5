package com.company;

import java.util.Random;

/**
 * @author Arman Karapetyan
 */

public class ArrayUtils {

    private ArrayUtils() {
    }

    /**
     * Create a method that sorts the int array elements by odd and even number such that
     * if first number is odd then second must be even number and so on for the next elements of the array.
     */
    public static int[] evenAndOddArraySort(int[] inputArray) {

        int size = getMinimumCountOfEvenOrOddNumbers(inputArray);
        int[] sortedArray = new int[inputArray.length];
        int[] finallyArray = new int[size * 2];

        int end = sortedArray.length - 1;
        int start = 0;
        boolean term = false;

        // even numbers add begin odd numbers add end
        for (int i = 0; i < sortedArray.length; i++) {
            if (inputArray[i] % 2 == 0) {
                sortedArray[start] = inputArray[i];
                start++;
            } else {
                sortedArray[end] = inputArray[i];
                end--;
            }
        }

        start = 0;
        end = sortedArray.length - 1;

        for (int i = 0; i < size * 2; i++) {

            if (term) {
                finallyArray[i] = sortedArray[end];
                end--;
                term = false;
            } else {
                finallyArray[i] = sortedArray[start];
                start++;
                term = true;
            }

        }

        return finallyArray;
    }

    // find minimum count even or odd numbers
    private static int getMinimumCountOfEvenOrOddNumbers(int[] inputArray) {

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

        }
        return Math.min(evenCount, oddCount);
    }

    /**
     * Create a method that says Is the int array in ascending sequence.
     */
    public static boolean isAscendingSequence(int[] inputArray) {

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < inputArray[i - 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Create a method that returns the arithmetic mean of given int array elements.
     */
    public static int getArithmeticAverage(int[] inputArray) {

        int average = 0;

        for (int i = 0; i < inputArray.length; i++) {
            average += inputArray[i];
        }

        return (average / inputArray.length);
    }

    /**
     * Create a method that receives two int arrays and returns an array of only the unique
     */
    public static int[] getUniqueElements(int[] inputArray1, int[] inputArray2) {

        int[] allElements = getAllElements(inputArray1, inputArray2);
        int[] uniqueElements = new int[getUniqueArraySize(allElements)];
        int count = 0;
        boolean term;

        for (int i = 0; i < allElements.length; i++) {
            term = true;
            for (int j = 0; j < allElements.length; j++) {
                if (allElements[i] == allElements[j] && i != j) {
                    term = false;
                    break;
                }
            }
            if (term) {
                uniqueElements[count] = allElements[i];
                count++;
            }
        }

        return uniqueElements;
    }

    // find unique Array size
    private static int getUniqueArraySize(int[] allElements) {
        int count = 0;
        boolean term;
        for (int i = 0; i < allElements.length; i++) {
            term = true;
            for (int j = 0; j < allElements.length; j++) {
                if (allElements[i] == allElements[j] && i != j) {
                    term = false;
                    break;
                }
            }
            if (term) {
                count++;
            }
        }
        return count;
    }

    // add all elements in one array
    private static int[] getAllElements(int[] inputArray1, int[] inputArray2) {

        int[] allElements = new int[inputArray1.length + inputArray2.length];

        for (int i = 0; i < inputArray1.length; i++) {
            allElements[i] = inputArray1[i];
        }

        for (int i = 0; i < inputArray2.length; i++) {
            allElements[inputArray1.length + i] = inputArray2[i];
        }
        return allElements;
    }

    /**
     * Create a method that receives a sorted array and returns an array in random order.
     */
    public static int[] getRandomSort(int[] sortedArray) {

        Random random = new Random();
        int[] randomArrayOrder = new int[sortedArray.length];
        int[] forUniqueNumbers = new int[sortedArray.length];
        boolean term;

        //generate number for empty array and this number cant generate Random
        for (int i = 0; i < forUniqueNumbers.length; i++) {
            forUniqueNumbers[i] = sortedArray.length + 1;
        }

        for (int i = 0; i < sortedArray.length; i++) {
            term = true;
            while (term) {
                int generate = random.nextInt(sortedArray.length);
                if (forUniqueNumbers[generate] == sortedArray.length + 1) {
                    randomArrayOrder[i] = sortedArray[generate];
                    term = false;
                }
                forUniqueNumbers[generate] = generate;
            }

        }

        return randomArrayOrder;
    }

    /**
     * Create a method that finds pairs of numbers whose sum is equal to a given value
     * and return array with these values.
     */
    public static int[] getPairsOfNumbersSumArray(int sum, int[] inputArray) {
        int[] outputArray = new int[getPairsOfNumbersSumArraySize(sum, inputArray)];
        int count = 0;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[i] + inputArray[j] == sum) {

                    outputArray[count++] = inputArray[i];
                    outputArray[count++] = inputArray[j];

                    inputArray[i] = -1;
                    inputArray[j] = -1;

                }
            }
        }

        return outputArray;
    }

    // get output array size
    public static int getPairsOfNumbersSumArraySize(int sum, int[] inputArray) {

        int[] inputArrayClone = new int[inputArray.length];
        int count = 0;

        // i am change elements from array , so i need clone
        System.arraycopy(inputArray, 0, inputArrayClone, 0, inputArray.length);

        for (int i = 0; i < inputArrayClone.length; i++) {
            for (int j = i + 1; j < inputArrayClone.length; j++) {
                if (inputArrayClone[i] + inputArrayClone[j] == sum) {

                    count += 2;
                    inputArrayClone[i] = -1;
                    inputArrayClone[j] = -1;

                }
            }
        }
        return count;
    }

    /**
     * Create a method that finds and returns the most frequently occurring element in an array.
     */
    public static int getMostFrequentlyElement(int[] inputArray) {

        int count = 0;
        int element = 0;
        int maxCount = 0;

        for (int i = 0; i < inputArray.length; i++) {
            for (int j = 1; j < inputArray.length; j++) {
                if (inputArray[i] == inputArray[j]) {
                    count++;
                }
            }
            if (count > maxCount) {
                element = i;
            }
            maxCount = count;
            count = 0;
        }

        return inputArray[element];
    }

    /**
     * Given an integer array nums sorted in non-decreasing order, remove the duplicates
     * in-place such that each unique element appears only once. The relative order of the
     * elements should be kept the same.Since it is impossible to change the length of the
     * array in some languages, you must instead have the result be placed in the first part
     * of the array nums. More formally, if there are k elements after removing the
     * duplicates, then the first k elements of nums should hold the final result. It does not
     * matter what you leave beyond the first k elements.Return k after placing the final
     * result in the first k slots of nums. Do not allocate extra space for another array. You
     * must do this by modifying the input array in-place with O(1) extra memory.
     */
    public static int[] getNotDuplicateArray(int[] inputArray) {

        int j = 0;
        for (int i = 0; i < inputArray.length - 1; i++) {
            if (inputArray[i] != inputArray[i + 1]) {
                inputArray[j++] = inputArray[i];
            }

            //for last index
            if (i == inputArray.length - 2) {
                inputArray[j++] = inputArray[inputArray.length - 1];
            }
        }

        return inputArray;
    }

}

