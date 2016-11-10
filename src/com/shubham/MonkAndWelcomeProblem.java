package com.shubham;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by shubham on 10/11/16.
 * Link : https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/monk-and-welcome-problem/
 */
public class MonkAndWelcomeProblem {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine());

        String[] arr1 = reader.readLine().split(" ");
        String[] arr2 = reader.readLine().split(" ");

        for(int i = 0 ; i < length ; i++) {

            arr2[i] = String.valueOf(Integer.parseInt(arr1[i]) + Integer.parseInt(arr2[i]));
        }

        for (String a : arr2) {

            System.out.print(a + " ");
        }
    }
}
