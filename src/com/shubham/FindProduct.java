package com.shubham;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by shubham on 09/11/16.
 * Link : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-product/
 */
public class FindProduct {

    public static void main(String[] args) throws Exception {

        double modu = Math.pow(10, 9) + 7;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(reader.readLine());

        String[] arr = reader.readLine().split(" ");

        double init = Integer.parseInt(arr[0]);

        for(int i = 1 ; i < length ; i++) {

            double num = Integer.parseInt(arr[i]);

            init = (num * init) % modu;
        }

        System.out.println((int) init);
    }
}
