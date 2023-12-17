import java.util.ArrayList;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        // Start application
        Scanner scanner = new Scanner(System.in);
        System.out.println("Application Started");
        System.out.println("----- Menu -----");
        System.out.println("1. Add Contact");
        System.out.println("2. Print Contact");
        System.out.println("3. Exit");
        // Define variables & arrays
        int menu = 0;
        boolean quit = false;
        ArrayList<String> cNames = new ArrayList<>();
        ArrayList<String> cNumbers = new ArrayList<>();
        do {
            // Get number of menu
            System.out.println("Please enter yor choise: ");
            menu = scanner.nextInt();
            switch (menu) {
                // Add Contact
                case 1:
                    System.out.println("Enter name: ");
                    String name = scanner.next();
                    cNames.add(name);
                    System.out.println("Enter number: ");
                    String number = scanner.next();
                    cNumbers.add(number);
                    break;
                // Print Contant
                case 2:
                    for(int i = 0; i < cNames.size(); i++) {
                        System.out.println("Name: " + cNames.get(i) + " ----- Phone: " + cNumbers.get(i));
                    }
                    break;
                // Exit
                case 3:
                    System.out.println("Application ended...");
                    quit = true;
            }
        } while (!quit);
    }
}

