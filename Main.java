package Entities;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QueueManage queueManager = new QueueManage();
        ServiceDesk serviceDesk = new ServiceDesk(queueManager);
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n==== Virtual Queue System ====");
            System.out.println("1. Get Token");
            System.out.println("2. Call Next Customer");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Is this a VIP customer? (yes/no): ");
                    boolean isVIP = scanner.nextLine().equalsIgnoreCase("yes");
                    queueManager.addCustomer(new Customer(name, isVIP));
                    break;
                case 2:
                    serviceDesk.callNextCustomer();
                    break;
                case 3:
                    queueManager.displayQueue();
                    break;
                case 4:
                    System.out.println("Thank you for using the Virtual Queue System!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
