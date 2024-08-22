package javaFunction_07;

import java.util.HashMap;

public class Test {
//    accessIdentifier static returnType functionName( type typeName, type2 typename2){
//        // logic
//        return returnType;
//    }

    // local Function + Instance Function
//    public int sum(int a, int b){
//        return a + b;
//    }

    // use local function inside instance function
//    public int sumUltra(int a, int b){
//        return sum(a,b);// local function
//    }

    // static function
//    public static int sumUltraPro(int a, int b){
//        Test testInstance = new Test();
//        return testInstance.sumUltra(a, b);
//    }
    // What is function?
    // -
    //Generate a Sequence of Prime Numbers
    // What is prime number -> which has only 2 divisor
    public static boolean isPrime (int num){
        if(num == 0 || num == 1){
            return false;
        }
        if(num == 2){
            return true;
        }
        int divisorCount = 0;
        for(int  i = 2; i < num/2 +1; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void firstNPrimeNum(int n){
        int count  = 0;
        int i = 0;
        while (count < n){
            if(isPrime(i)){
                System.out.print(i + " ");
                count++;
            }
            i++;
        }
        System.out.println();
    }
    public static int nthPrimeNum(int n){
        int count = 0;
        int  i = 0;
        int nthPrime = 2;
        while(count != n){
            if(isPrime(i)){
                count++;
            }
            if(count == n){
                nthPrime = i;
            }
            i++;
        }
        return nthPrime;

    }
    //0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610
    // Fibonacci Sequence - 0-  | 1   1 -secondLast | 2 - firstLast
    public static int nthFib(int n){
        if( n == 1){
            return 0;
        }else if( n == 2){
            return 1;
        }
        return nthFib(n-2) + nthFib(n-1);
    }

    // Factorial Sequence
    // 1! = 1
    // 2 ! = 2
    // 3 ! = 2! * 3
    // 4 ! = 3! * 4
    // 5 ! = 4! * 5 = 1* 2* 3* 4* 5
    // 6 ! = 5! * 6
    // 7 ! = 6! * 7 = 5040
    public static int nthFact(int n){
        if( n == 1){
            return 1;
        }
//        int fact = 1;
//        for(int i = 2; i<= n; i++){
//            fact *= i;
//        }
        return nthFact(n-1) * nthFact(n);
    }
    public static void printOneToN(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printOneToN(n-1);
        System.out.println(n);
        return;
    }
    public static void main(String[] args) {
//        System.out.println(isPrime(5));
//        firstNPrimeNum(5);
//        System.out.println(nthPrimeNum(50));
//        int fib = nthFib(16);
//        System.out.println(fib);
        HashMap<Integer, Integer> map = new HashMap<>();
        System.out.println(map.get(0));
    }
}
