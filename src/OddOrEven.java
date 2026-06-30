import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int number = Integer.valueOf(reader.nextLine());
        System.out.println("Give a number:");

        if (number % 2 == 0) {
            System.out.println("Number " + number + " is even");
        } else {
            System.out.println("Number " + number + " is odd.");
        }

    }
}
