package com.zdzioch;

import java.util.Arrays;

/**
 * Created by mzdzioch on 2017-09-16.
 */
public class Recursive {

    public static void main(String[] args) {

        System.out.println(sqrt(2, 12));

    }

    public static int sqrt(int number, int n) {
        int result = 0;
        int t = 0;

        if(n == 1) {
            result = number;
        } else if(n % 2 == 0) {
            t = sqrt(number, n/2);
            result = t * t;
        } else {
            t = sqrt(number, n/2);
            result = t * t * number;
        }

        return result;
    }

    public static int binarySearch(int tab[], int x) {

        int left = 0;
        int right = tab.length-1;
        int c = (left + right)/2;

        if(x > tab[c]) {
            int[] subtab = Arrays.copyOfRange(tab, c+1, right);
            binarySearch(subtab, x);
        } else {
            int[] subtab = Arrays.copyOfRange(tab, left, c);
            binarySearch(subtab, x);

        }
        return 0;
    }


}
