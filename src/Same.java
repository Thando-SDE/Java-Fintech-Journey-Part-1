
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter the string:");
        System.out.println("Enter the second string");

        String first = reader.nextLine();
        String second = reader.nextLine();

        if (first.equals(second)) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }
    }
}
