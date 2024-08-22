package Lesson_02;

import java.util.*;


public class Test {
    int a = 10; // sh/sam - local X  rau - static X raja - instance C
    static int b = 40;
    public Test(){

    }

    public static void main(String[] args) {
        // Problem: Write a Java program that accepts two command-line arguments,
        // converts them from String to int using Integer.parseInt(),
        // adds them, and prints the sum.
        System.out.println(Arrays.stream(args).count());


        //Create an ArrayList of Integer.
        // Add the int values 10, 20, and 30 using autoboxing.
        // Print all the elements of the list.
//        ArrayList<Integer> arrayList = new ArrayList<Integer>();
//        arrayList.add(10);
//        arrayList.add(20);
//        arrayList.add(30);
//        for(int item: arrayList){
//            System.out.println(item);
//        }
//        for(int i =0; i < arrayList.size(); i++){
//            System.out.println(arrayList.get(i));
//        }



        // Primitive data type
        // byte, short, int, float, double, char, boolean
//        byte byteVar = 12; // -127 to 128 ()

        // Non-Primitive datatype
//        String, Arrays, ENUM, Class, Object

        // Wrapper class
        // int -> Integer
        // char -> Character
        // double -> Double
        // boolean -> Boolean

        // 3 types of variable in case scope
        // 1. local variable - {varia} -> function, for loop
        // 2. Instance Variable -> Variable inside a class ->
        // 3. static Variable -> Class Ka
//       String a =  Student.schoolName;
//       int roll = new Student().rollNo;

       // Auto Boxing
//        int value = 100;
//        Integer wI = value;

//        // 20. unboxing
//        Integer x = Integer.valueOf(200);
//        int _X = x;

//        double d = value;
//        int _d = (int)d;

        //Write a program that takes two String inputs representing integers,
        // converts them to Integer objects using Integer.
        // parseInt(), compares them using Integer.compareTo(), and prints the larger of the two.
//        String a = "123";
//        String b = "243";
//        Integer ai = Integer.valueOf(a);
//        Integer bi = Integer.valueOf(b);
////        int ai = Integer.parseInt(a);
////        int bi = Integer.parseInt(b);
//        String res  = ai.compareTo(bi) == 0 ? "Equal" : ai.compareTo(bi) < 0 ? "ai < b1" : "ai > bi";
//        System.out.println(res);

    }



}
