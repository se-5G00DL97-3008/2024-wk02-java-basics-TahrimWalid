import java.util.Scanner;

class B01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the starting count of bottles on the wall:");
        int bottleCount = scanner.nextInt();

        while (bottleCount > 0) {
            System.out.println(bottleCount + " bottles of beer on the wall, " + bottleCount + " bottles of beer.");
            System.out.println("Take one down and pass it around, " + (bottleCount - 1) + " bottles of beer on the wall.");
            System.out.println();

            bottleCount--;
        }

        System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
        System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");

        scanner.close();


    }
}