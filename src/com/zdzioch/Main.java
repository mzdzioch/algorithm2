package com.zdzioch;

public class Main {

    public static void main(String[] args) {

        //int number = convert(1011101, 2);
        //System.out.println(number);

        //konwertowanie
        //char[] number = convertNumberToBinary(25, 3);
        //for (int i=0; i<number.length; i++)
        //System.out.println(number[i]);

        //potegowanie
        //System.out.println(exponential(2, 13));

        //wieza hanoi
        move(4, 3, 2);
        //moveSecond(3, 1,2,3);

    }

    public static int convert(int binaryNumber, int p) {

        int result = 0;
        int a = 1;
        char[] chars = ("" + binaryNumber).toCharArray();

        int test;

        for(int k = chars.length - 1; k >= 0; k--) {
            result += (chars[k] - '0') * a;
            System.out.println(result + " " + chars[k]);
            a = a * p;
        }

        return result;
    }

    public static char[] convertNumberToBinary(int number, int p) {
        int result;
        String convert = "";

        while( number > 0) {
            result = number % p;
            number = number / p;
            convert = result + convert;
        }

        char[] chars = convert.toCharArray();
        return chars;
    }
    // 2^ 13    ; 13 B= 1 1 0 1    8+4+0+1
    // S1 r=1 n=6  p=1   ->1
    // S2 r=0 n=3 p=4   ->2
    // S3 r=1 n=1 p=4*4   ->4
    // S4 r=1 n=0 p=16*16     ->8

    public static int exponential(int a, int n) {

        int p = a;
        int result=1;
        int r;

        while(n > 0) {
            r = n % 2;
            n = n/2;


            if(r != 0){
                if(r>100) r = r/1000;
                result = r * result * p;
            }

            p =  p * p;
        }
        return result;
    }

    public static void move(int n, int src, int dst) {

        if(n == 1) {
            System.out.println("From " + src + " to " + dst);

        } else {
            move(n-1, 1,2);
            move( 1, 1,3);
            move(n-1,2,3);
        }
    }

    public static void moveSecond(int n, int src, int  help, int dst) {

        if(n > 0) {
            moveSecond(n - 1, 1, 3, 2);
            System.out.println("From " + src + " to " + dst);
            moveSecond(n - 1, 2, 1,3);
        }
    }
}

