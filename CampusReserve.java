package student;

public class CampusReserve {
    private int requestId;
    private String userName;
    private String resourceName;
    private int timeSlot;
    private int priority;

    public CampusReserve(int requestId, String userName, String resourceName, int timeSlot, int priority) {
        this.requestId = requestId;
        this.userName = userName;
        this.resourceName = resourceName;
        this.timeSlot = timeSlot;
        this.priority = priority;
    }

    public int getRequestId() {
        return requestId;
    }

    public String getUserName() {
        return userName;
    }

    public String getResourceName() {
        return resourceName;
    }

    public int getTimeSlot() {
        return timeSlot;
    }

    public int getPriority() {
        return priority;
    }

    public void displayReservation() {
        System.out.println("ID: " + requestId + " | User: " + userName + 
                           " | Resource: " + resourceName + 
                           " | Time: " + timeSlot + ":00 | Priority Level: " + priority);
    }
}
