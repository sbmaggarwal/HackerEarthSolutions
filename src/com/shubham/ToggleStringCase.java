package com.shubham;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by shubham on 09/11/16.
 * Link : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/modify-the-string/
 */
public class ToggleStringCase {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String word = reader.readLine();
        String result = "";

        int length = word.length();

        for(int i = 0 ; i < length ; i++) {

            int asciiValue = word.charAt(i);

            if (asciiValue > 64 && asciiValue < 91) {

                result += Character.toString((char) (asciiValue + 32));
            } else {

                result += Character.toString((char) (asciiValue - 32));
            }
        }

        System.out.println(result);
    }
}
