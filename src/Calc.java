import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        int num1 = userInput.nextInt();
        System.out.println("Please enter your second number: ");
        int num2 = userInput.nextInt();

        int resultAdd = addition(num1, num2);
        System.out.println("Your numbers added are " + num1 + " + " + num2 + " = " + resultAdd);
        int resultSub = subtract(num1, num2);
        System.out.println("Your numbers subtracted are " + num1 + " - " + num2 + " = " + resultSub);
        int resultMult = multiplied(num1, num2);
        System.out.println("Your numbers multiplied are " + num1 + " x " + num2 + " = " + resultMult);
        int resultDiv = divided(num1, num2);
        System.out.println("Your numbers divided are " + num1 + " / " + num2 + " = " + resultDiv);
    }

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiplied(int a, int b) {
        return a * b;
    }

    public static int divided(int a, int b) {
        return a / b;
    }

}
