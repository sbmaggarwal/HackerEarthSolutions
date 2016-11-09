package com.shubham;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by shubham on 09/11/16.
 * Link : https://www.hackerearth.com/practice/basic-programming/input-output/basics-of-input-output/practice-problems/algorithm/find-factorial/
 */
public class Factorial {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(reader.readLine());

        int[] result = fact(num);
        int i = result.length - 1;
        while (i > 0 && result[i] == 0)
            --i;
        while (i >= 0)
            System.out.print(result[i--]);
        System.out.println();
    }

    static int[] fact(int n) {
        int[] r = new int[100];
        r[0] = 1;
        for (int i = 1; i <= n; ++i) {
            int carry = 0;
            for (int j = 0; j < r.length; ++j) {
                int x = r[j] * i + carry;
                r[j] = x % 10;
                carry = x / 10;
            }
        }
        return r;
    }
}
