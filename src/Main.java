import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a, b, c, d;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the first value");
        a = scan.nextInt();
        System.out.println("Please enter the second value");
        b = scan .nextInt();
        System.out.println("Please enter the third value");
        c = scan.nextInt();
        System.out.println("Please enter the fourth value");
        d = scan.nextInt();

        System.out.println(a + " " + "+" + " " + b + " "+ "+" + " " + c + " " + "+"+ " " + d + " " + "=" + " " + sum(a,b,c,d));
        System.out.println(a + " " +"*" + " " + b + " " + "*"  + " " + d + " " + "=" + " " + multiply(a,b,d));
        System.out.println(b + " " +"/" + " " + d + " " + "=" + " " + devide(d,b));
        System.out.println(b + " " + "-" + " " + c + " " + "="  +   " " + subtract(c,b));




    }

    public static int sum(int a, int b, int c, int d){
        int total = a + b + c + d;
        return total;
    }

    public static int multiply(int a, int b, int c){
        int total = a * b * c;
        return total;
    }

    public static Double devide(double a, double b){

        Double total = b/a;

        return total;
    }

    public static int subtract(int a, int b){
        int total = b - a;
        return total;
    }


}