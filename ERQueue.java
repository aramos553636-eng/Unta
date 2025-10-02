import java.util.PriorityQueue;

public class ERQueue {
    private PriorityQueue<Patient> queue;

    public ERQueue() {
        // PriorityQueue is used to order patients based on their priority and arrival time
        queue = new PriorityQueue<>();
    }

    // Method to add a patient to the queue
    public void arrive(String name, int priority, String condition, String time) {
        Patient newPatient = new Patient(name, priority, condition, time);
        queue.offer(newPatient);
        System.out.println("Patient " + name + " has arrived and is added to the queue.");
    }

    // Method to treat the patient with the highest priority (remove from the queue)
    public void treatNext() {
        if (queue.isEmpty()) {
            System.out.println("No patients to treat.");
            return;
        }
        Patient treatedPatient = queue.poll(); // Removes and returns the highest-priority patient
        System.out.println(">>> Treating patient now...");
        System.out.println("Treated: " + treatedPatient);
        // Inside ERQueue class after treating a patient


    }

    // Method to display the queue of patients
    public void displayQueue() {
        if (queue.isEmpty()) {
            System.out.println("No patients in the queue.");
            return;
        }

        System.out.println("=== UPDATED QUEUE ===");
        System.out.println("Patients Waiting: " + queue.size());
        int i = 1;
        for (Patient patient : queue) {
            System.out.println(i + ". " + patient);
            i++;
        }
    }
}
