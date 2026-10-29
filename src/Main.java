import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("--------------------------------------------------");
            System.out.println("Choose what operation you want to perform:");
            System.out.println();
            System.out.println("A. Convert from any system to the decimal system");
            System.out.println("B. Convert from decimal system to another system");
            System.out.println("C. Summing up numbers from different systems");
            System.out.println("D. Subtracting numbers from different systems");
            System.out.println("E. Multiplying numbers from different systems");
            System.out.println("F. Dividing numbers from different systems");
            System.out.println();
            System.out.println("W. Exit the program");
            System.out.println("--------------------------------------------------");
            System.out.print("Enter your choice: ");

            choice = sc.next().toUpperCase().charAt(0);

            switch (choice) {
                case 'A':
                    System.out.println("You chose A");
                    break;
                case 'B':
                    System.out.println("You chose B");
                    break;
                case 'C':
                    System.out.println("You chose C");
                    break;
                case 'D':
                    System.out.println("You chose D");
                    break;
                case 'E':
                    System.out.println("You chose E");
                    break;
                case 'F':
                    System.out.println("You chose F");
                    break;
                case 'W':
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Wrong choice!");
            }
            System.out.println();

        } while (choice != 'W');

        sc.close();
    }
}