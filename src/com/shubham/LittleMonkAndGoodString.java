package com.shubham;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by shubham on 10/11/16.
 * Link : https://www.hackerearth.com/practice/algorithms/string-algorithm/string-searching/practice-problems/algorithm/little-monk-and-good-string/
 */
public class LittleMonkAndGoodString {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String word = reader.readLine();
        int count = 0;
        int prev = 0;

        Map<String, Integer> vowel = new HashMap<>();
        vowel.put("a", 1);
        vowel.put("e", 1);
        vowel.put("i", 1);
        vowel.put("o", 1);
        vowel.put("u", 1);

        for (int i = 0 ; i < word.length() ; i++) {

            if (vowel.containsKey(word.substring(i, i+1))) {

                count++;
            } else {

                if(prev < count)
                    prev = count;

                count = 0;
            }
        }

        if(prev < count)
            prev = count;

        System.out.println(prev);
    }
}
