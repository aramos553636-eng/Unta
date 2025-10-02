public class Patient implements Comparable<Patient> {
    private String name;
    private int priority;  // 1 is the highest priority, 4 is the lowest
    private String condition;
    private String arrivalTime;

    // Constructor to initialize a new Patient
    public Patient(String name, int priority, String condition, String arrivalTime) {
        this.name = name;
        this.priority = priority;
        this.condition = condition;
        this.arrivalTime = arrivalTime;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String getCondition() {
        return condition;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    // compareTo method to define the sorting order: priority first, then arrival time
    @Override
    public int compareTo(Patient otherPatient) {
        // First, compare by priority (ascending: lower number = higher priority)
        if (this.priority < otherPatient.priority) {
            return -1;
        } else if (this.priority > otherPatient.priority) {
            return 1;
        }
        // If priority is the same, compare by arrival time
        return this.arrivalTime.compareTo(otherPatient.arrivalTime);
    }

    @Override
    public String toString() {
        return String.format("[P%d] %s - %s (%s)", priority, name, condition, arrivalTime);
    }
}
