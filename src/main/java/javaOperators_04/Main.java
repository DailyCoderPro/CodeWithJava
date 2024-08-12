package javaOperators_04;

import java.util.Scanner;

public class Main {

    // Arithmetic Operator


        // char || string

        // double

        // boolean



    // 2. "%"

    // 3. "x++", "++x", "x--", "--x"

    // Logical Operator

    // Bitwise Operator
    public static void main(String[] args) {
//        int i=0, j=0; int sum = 0;
//        int arr[] = new int[5];
//        arr[0] = 1; arr[1] = 2; arr[2] = 3; arr[3] = 4; arr[4] = 5;
//
//        while(i < 6){
//            System.out.println(i);
//            sum += arr[j++];
//            if(j>=arr.length){
//                j=0;
//            }
//            i++;
//        }
//        System.out.println(sum);

        // We can not apply arithmetic operation on boolean type
//        int a = 20;
//        int b = 10;
//        System.out.println(a/b); // 2
//        System.out.println(b/a); // 0
//        double a = 20;
//        double b = 10;
//        System.out.println(a/b); // R- 2.0 RA- 2.0 Sam - 2.0 sh - 2.0
//        System.out.println(b/a); // R- 0.0 RA - 0.5 Sam - 0.0 sh - 0.5

        // ++(increment) --(decrement)
//        int a = 10;
//        int b = 20;

//        int x = a++ + b-- + ++a + --b; // SH - 60 RA - 60 R - 60 SAM - 61
        //exp | a++  |  b-- | ++a | --b
        // a++ - 10  |  10  |  10  |  10
        // b-- - 20  |  20  |  20  |  20
        // ++an - 11  |  12  |  11  |  12
        // --b - 19  |  18  |  19  |  18
        // pre - --a, ++b  first calculate then use
        // post - a++, b-- first use then calculate

        // "%" ------ Modulus "/" ---- divide
//        int a = -20;
//        int b = 5;
//
//
//        int c = a / b; // RA - 0 SH - -4 R - 0  SAM -  -4
//        int rem = a % b; // RA - 0  SH - 0 R - -20 SAM - 0
//        System.out.println(c);
//        System.out.println(rem);

//Given an array of size n,
// how can you use the modulus operator to create a circular
// index that wraps around when it reaches the end of the array?
//[1,2,3,4,5,6] -> [1, 2, 3,4,5,6]
//        n =35
//        int length = 6;
//        for(int i =0; i< 15; i++){
////            0 1 2 3 4 5
//            // 6 % 6 = 0 7 % 6 = 1 8 % 6 = 2 9 % 6 = 3 10 % 6= 4 11 % 6 = 5
//            // 12 % 6 = 0 13 % 6 = 1 14
//
//            // Given an array [1,2,3,4,5,6] find circular sum till index reaches to 35
//        }
        // Logical Operator
        // || -- Logical OR
        // true  || true  -> true
        // true  || false -> true
        // false || true  -> true
        // false || false -> false

        // && -- Logical AND
        // true  && true  -> true
        // true  && false -> false
        // false && true  -> false
        // false && false -> false


        // ! -- Logical NOT
        // !true -> false
        // !false -> true

        // Bitwise And
        // 7 -> 1 1 1
        //     &
        // 6 -> 1 1 0
        //--------------
        // 6 -> 1 1 0
//        System.out.println(7 & 6);
        // Bitwise OR
        // 7 -> 1 1 1
        //     |
        // 6 -> 1 1 0
        //--------------
        // 7 -> 1 1 1
//        System.out.println(7 | 6);
        // 7 -> 1 1 1
        // ~7-> 0 0 0 -> 0

        // 6 -> 1 1 0
        // ~6 ->0 0 1 -> 1
//        System.out.println(~7);
//        System.out.println(~6);
//        System.out.println(~-5);
        //
        // 5 -(5 + 1) = -6
        // -5 -(-5 + 1) = -(-4) = 4

        // Bitwise XOR
        // 7 -> 1 1 1
        //     ^
        // 6 -> 1 1 0
        //--------------
        // 1 -> 0 0 1
//        System.out.println(7 ^ 6);

        // Left Shift <<
//        6 << 2
        //0 0 0 0 0 1 1 1 -> 0 0 0 0 1 1 1 0 -> 0 0 0 1 1 1 0 0 -> 24
//        System.out.println(7 << 2);
        // x << n -> x * 2**n


        // Right Shift >>
        // 6 >> 2
        // 0 0 0 0 0 1 1 0 -> 0 0 0 0 0 0 1 1 -> 0 0 0 0 0 0 0 1 -> 1
//        System.out.println(7 >> 1);
        // x >> n -> x / 2**n
        // n = 100  1 to n -> sum of n number from 1 to 100

//        int n = 100;
//        int sum = n * (n+1)/2;
//        for (int i = 0; i <= n; i++) {
//            sum = i;
//        }
//        System.out.println(sum);
        // Arithmetic Progression
        // 1 2 3 4 5 6 -> 1
        // 2 4 6 8 10 -> 2
        // 10 50 90 130 170 -> 40
        // 3 -> 90 cd - 40
        // 10 + 80 = 90
        // nth = a + (n-1)d
        // sum of n terms = 10 50 90 130 -> 280  n =4  d = 40   1st = 10  l = a + (n-1)40
        // n/2(a + a+(n-1)d) -> n/2(a+l)
        // n+1 th term - nth term = common difference 50 - 10 = 40

        // 2 4 6 8 10 12     -> 40

        // 3 12 21 30  find 30th term
        // 40th term = 2 + (40-1) * 2 = 80 = l
//        sum of 40 digit = 40/2(2 + 80) = 20*82 = 1640
        //

    }
}
