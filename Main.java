package student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ReservationManager manager = new ReservationManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("========================================");
        System.out.println("   WELCOME TO CAMPUSRESERVE SYSTEM    ");
        System.out.println("========================================");

        do {
            System.out.println("\n1. Book a Resource");
            System.out.println("2. View All Reservations");
            System.out.println("3. Exit");
            System.out.print("Select an option (1-3): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Request ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter Your Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Resource (e.g., Lab-A, Conference-Room): ");
                    String resource = scanner.nextLine();

                    System.out.print("Enter Time Slot (24-hr format hour, e.g., 10 for 10 AM): ");
                    int slot = scanner.nextInt();

                    System.out.print("Enter Priority (1-High, 2-Medium, 3-Low): ");
                    int priority = scanner.nextInt();

                    CampusReserve booking = new CampusReserve(id, name, resource, slot, priority);
                    manager.addReservation(booking);
                    break;

                case 2:
                    manager.displayAllReservations();
                    break;

                case 3:
                    System.out.println("Exiting CampusReserve. Have a productive day!");
                    break;

                default:
                    System.out.println("Invalid option! Please enter 1, 2, or 3.");
            }
        } while (choice != 3);

        scanner.close();}}
