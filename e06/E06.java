import java.util.Scanner;

class E06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which multiplication table to show?");
        int num = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            int result = i * num;
            System.out.println(i + " x " + num + " = " + result);
        }

        scanner.close();

    }
}