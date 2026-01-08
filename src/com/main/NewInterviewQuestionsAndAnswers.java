package com.main;

import java.util.*;

public class NewInterviewQuestionsAndAnswers {

    public static void main(String[] args) {

        int[][] nestedArray = {{1, 4, 5}, {1, 7, 8}, {2, 5}};
        System.out.println("How to Print the above array into a single array?");
        int[] singleArray = Arrays.stream(nestedArray)
                                    .flatMapToInt(Arrays::stream)
                                    .toArray();
        System.out.println("Single Array: " + Arrays.toString(singleArray));
    }
}
