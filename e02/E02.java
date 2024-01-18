import java.util.Scanner;

class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        int num1 = scanner.nextInt();

        System.out.println("Give a number:");
        int num2 = scanner.nextInt();

        System.out.println();
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

        scanner.close();
    }
}
