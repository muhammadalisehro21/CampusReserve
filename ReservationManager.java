package student;

import java.util.ArrayList;
import java.util.List;

public class ReservationManager {
    private List<CampusReserve> reservations;

    public ReservationManager() {
        reservations = new ArrayList<>();
    }

    // Check if the resource is already booked at the given time
    public boolean isSlotAvailable(String resourceName, int timeSlot) {
        for (CampusReserve res : reservations) {
            if (res.getResourceName().equalsIgnoreCase(resourceName) && res.getTimeSlot() == timeSlot) {
                return false; // Slot is taken
            }
        }
        return true; // Slot is free
    }

    // Add a reservation if slot is available
    public boolean addReservation(CampusReserve reservation) {
        if (isSlotAvailable(reservation.getResourceName(), reservation.getTimeSlot())) {
            reservations.add(reservation);
            System.out.println("SUCCESS: Reservation confirmed for " + reservation.getUserName());
            return true;
        } else {
            System.out.println("CONFLICT: " + reservation.getResourceName() + " is already booked at " + reservation.getTimeSlot() + ":00!");
            return false;
        }
    }

    // Display all active bookings
    public void displayAllReservations() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
            return;
        }
        System.out.println("\n--- Current Campus Bookings ---");
        for (CampusReserve res : reservations) {
            res.displayReservation();
        }
    }
}
