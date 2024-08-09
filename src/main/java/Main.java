public class Main {
    int a  = 10;
    public static void greet(){
        System.out.println("Hello User");
    }

    public static void main() {
        Main main = new Main();
        main.greet();
        System.out.println("This is main");
    }

    public static void main(String[] args) {
        main();
    }

}
