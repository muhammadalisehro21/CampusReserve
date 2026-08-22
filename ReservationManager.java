package student;

import java.util.ArrayList;
import java.util.List;

public class ReservationManager {
    private List<CampusReserve> reservations;

    public ReservationManager() {
        reservations = new ArrayList<>();
    }
    public boolean isSlotAvailable(String resourceName, int timeSlot) {
        for (CampusReserve res : reservations) {
            if (res.getResourceName().equalsIgnoreCase(resourceName) && res.getTimeSlot() == timeSlot) {
                return false;
            }}
        return true;  }
    public boolean addReservation(CampusReserve reservation) {
        if (isSlotAvailable(reservation.getResourceName(), reservation.getTimeSlot())) {
            reservations.add(reservation);
            System.out.println("SUCCESS: Reservation confirmed for " + reservation.getUserName());
            return true;
        } else {
            System.out.println("CONFLICT: " + reservation.getResourceName() + " is already booked at " + reservation.getTimeSlot() + ":00!");
            return false;}}
    
    public void displayAllReservations() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
            return;
        }
        System.out.println("--- Current Campus Bookings ---");
        for (CampusReserve res : reservations) {
            res.displayReservation();}}}
