import java.util.Scanner;

class E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which num1 multiplication table to show?");
        int num1 = scanner.nextInt();

        System.out.println("Until which multiplier?");
        int num2 = scanner.nextInt();

        for (int i = 1; i <= num2; i++) {
            int result = i * num1;
            System.out.println(i + " x " + num1 + " = " + result);
        }

        scanner.close();

    }
}