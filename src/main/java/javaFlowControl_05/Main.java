package javaFlowControl_05;

public class Main {
    public static void main(String[] args) {
        //
//        String name = "sam";
//        switch (name){
//            case "sam":
//            case "raj":
//            case "hritik": {
//                String one = "1";
//                System.out.println("Sam"+" "+ one);
//            }
//                break;
//            case "sh":
//                System.out.println("Sharma");
//                break;
//            case "ra":
//            case "biswasGhati":
//                System.out.println("Raja Ji");
//                break;
//            case "r":
//                System.out.println("Raunik");
//                break;
//            default:
//                System.out.println("Meow");
//
//        }
        // //Check if a Number is a Palindrome
        // 12321
//        int a = 123454321;
//        String as = Integer.toString(a);
//        String temp = "";
//        for(int  i =as.length() -1; i >= 0 ; i--){
//            temp += as.charAt(i);
//        }
//        if(as.equals(temp)){
//            System.out.println("yes Palindrome");
//        }else{
//            System.out.println("Not a palindrome");
//        }
//        int a = 11321;
//        int temp = 0;
//        int tempA = a;
//        while(a != 0){
//            temp = temp*10; //  1232 * 10 = 12320
//            temp = temp + a % 10; // 12320 + 2 = 12321
//            a = a / 10;
//        }
//        if(tempA == temp){
//            System.out.println("this is a plindrome");
//        }else{
//            System.out.println("not a plindrome");
//        }
//        System.out.println(temp + " " + tempA);

//        int a = 1234543721;
//        String as = Integer.toString(a);
//        int j = as.length() -1;
//        boolean isPal = true;
//        for(int  i = 0 ; i < as.length()/2 ; i++){
//            if(as.charAt(i) != as.charAt(j)){
//                isPal = false;
//                break;
//            }
//            j--;
//        }
//        if(isPal == true){
//            System.out.println("palindrome");
//        }else{
//            System.out.println("Not Palindrome");
//        }
//
        // Prime Number
        int a = 81; //
        int count  = 0;
        for(int  i= 1; i <= a; i++){
            if( a % i == 0){
                count++;
            }
        }
        if(count > 2){
            System.out.println(count);
            System.out.println("Not a Prime Number");
        }else {
            System.out.println(count);
            System.out.println("a Prime Number");
        }

    }
}
