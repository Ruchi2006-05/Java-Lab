import java.util.Scanner;

public class Calculator {

    public int num1, num2, op;

    public int addNums(int n1, int n2) {
        return n1 + n2;
    }

    public int subtractNums(int n1, int n2) {
        return n1 - n2;
    }

    public int multiplyNums(int n1, int n2) {
        return n1 * n2;
    }

    public float divideNums(int n1, int n2) {
        return (float) n1 / n2;
    }

    public int calcMod(int n1, int n2) {
        return n1 % n2;
    }

    public static void main(String[] args) {

        Calculator c = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter first number:");
            c.num1 = sc.nextInt();

            System.out.println("Enter second number:");
            c.num2 = sc.nextInt();

            System.out.println("Choose operation:");
            System.out.println("0.Exit 1.Add 2.Subtract 3.Multiply 4.Divide 5.Modulus ");
            c.op = sc.nextInt();

            if (c.op == 0) {
                break;   // exit loop
            }

            float result = 0;

            switch (c.op) {
                case 1:
                    result = c.addNums(c.num1, c.num2);
                    break;
                case 2:
                    result = c.subtractNums(c.num1, c.num2);
                    break;
                case 3:
                    result = c.multiplyNums(c.num1, c.num2);
                    break;
                case 4:
                    result = c.divideNums(c.num1, c.num2);
                    break;
                case 5:
                    result = c.calcMod(c.num1, c.num2);
                    break;
                default:
                    System.out.println("Invalid choice");
                    continue;
            }

            System.out.println("Result: " + result);
        }

        System.out.println("Calculator closed.");
        sc.close();
    }
}
