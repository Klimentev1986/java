import java.util.Scanner;

public class Main {


public static void main(String[] args) {
   int num1,num2,result;
   char op;
    Scanner scr = new Scanner(System.in);
    System.out.println("Input:");
    num1 = scr.nextInt();
    op = scr.next().charAt(0);
    num2 = scr.nextInt();
    switch (op) {
        case '+' :  result = num1+num2;
            System.out.println(result) ;break;
        case '-' :  result = num1-num2;
            System.out.println(result); break;
        case '*' :  result = num1*num2;
            System.out.println(result); break;
        case '/' :  result = num1/num2;
            System.out.println(result) ; break;
        default: System.out.println( "throws Exception" );

    }
}

}


