package javaInputOutput_03;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Output
        //1. System
//        The System class contains several useful class fields and methods.
//        It cannot be instantiated. Among the facilities provided by the System
//        class are standard input, standard output, and error output streams;
//        access to externally defined properties and environment variables;
//        a means of loading files and libraries; and a utility method for quickly
//        copying a portion of an array.
//        System.out.print("String"); // same line
//        System.out.println("Line"); // new line

        // 2. Input in Java
        Scanner input  = new Scanner(System.in);

        int a;
        a = input.nextInt();
        char c = input.next().charAt(0);
        String s = input.nextLine();
        String _s = input.nextLine();

        System.out.println(_s);

        System.out.println(a);
        System.out.println(c);
        System.out.println(s);






    }
}
