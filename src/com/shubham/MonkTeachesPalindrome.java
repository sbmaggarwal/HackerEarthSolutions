package com.shubham;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by shubham on 10/11/16.
 * Link : https://www.hackerearth.com/practice/algorithms/string-algorithm/basics-of-string-manipulation/practice-problems/algorithm/monk-teaches-palindrome/
 */
public class MonkTeachesPalindrome {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int noOfTests = Integer.parseInt(reader.readLine());
        List<String> output = new ArrayList<>();

        for (int i = 0 ; i < noOfTests ; i++) {

            String word = reader.readLine();
            if(isPalindrome(word)) {

                output.add("YES " + ((word.length()%2 == 0) ? "EVEN" : "ODD"));
            } else {

                output.add("NO");
            }
        }

        for (String a : output) {

            System.out.println(a);
        }
    }

    private static boolean isPalindrome(String word) {

        boolean isPalindrome = true;
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

        return isPalindrome;
    }
}
