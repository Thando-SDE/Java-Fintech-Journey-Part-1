
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("I will tell you a story, but I need some information first.");
        System.out.println("What is the main character called?");
        String firstreply = scanner.nextLine();
        System.out.println("What is their job?");
        String secondreply = scanner.nextLine();
        System.out.println("Here is the story:");
        System.out.println("Onc upon a time there was " + firstreply + ", who was a " + secondreply + ".");
        System.out.println("On the way to work, " + firstreply + " reflected on life.");
        System.out.println("Perhaps " + firstreply + " will not be a " + secondreply + " forever.");

    }
}
