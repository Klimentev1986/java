import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Calculation result = new Calculation();
        System.out.println("input: ");
        String expression = input.nextLine();
        String answer = result.calc(expression);
        System.out.println("output: "+answer);



    }

    static class Calculation {
        public static String calc(String input) {
            int result = 0;
            String exception = "throws Exception";
            String[] inputSplit = input.split(" ");
            Integer num1 = 0;
            Integer num2 = 0;
            num1 = Integer.valueOf(inputSplit[0]);
            num2 = Integer.valueOf(inputSplit[2]);
            if ((num1 < 1) || (num1 > 10) || (num2 < 1) || (num2 > 10))
                return exception;
            String op = inputSplit[1];
            switch (op) {
                case "+" -> result = num1 + num2;
                case "-" -> result = num1 - num2;
                case "*" -> result = num1 * num2;
                case "/" -> result = num1 / num2;
                default -> {
                    return exception;

                }
            }
            String answer;
            answer = Integer.toString(result);
            return answer;
        }
    }
}
