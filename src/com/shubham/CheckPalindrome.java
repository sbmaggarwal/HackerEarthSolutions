package com.shubham;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckPalindrome {

    public static void main(String[] args) throws IOException {

        String YES = "YES";
        String NO = "NO";
        boolean isPalindrome = true;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String word = reader.readLine();

        int length = word.length();

        if(length < 2)
            isPalindrome = true;

        int half = length/2;

        for(int i = 0 ; i < half ; i++) {

            if(word.charAt(i) != word.charAt(length - i - 1)) {

                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println(YES);
        else
            System.out.println(NO);
    }
}
