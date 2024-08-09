package javaVariableAndDatatypes_02;

public class Student {
    public int rollNo;
    public int id;
    static String schoolName = "SAM AC";

    public String convertToBinary(int i){
        Integer num = i; /// auto boxing
        return Integer.toBinaryString(i);
    }
}
