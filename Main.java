public class Main {
    public static void main(String[] args) {
        ERQueue erQueue = new ERQueue();
        
        // Patients arriving at the ER with their details
        erQueue.arrive("Pedro Cruz", 1, "Head injury - NOW UNCONSCIOUS ⚠", "23:52");
        erQueue.arrive("Carlos Mendoza", 2, "Compound fracture - leg", "23:50");
        erQueue.arrive("Lisa Wang", 2, "Severe asthma attack", "23:56");
        erQueue.arrive("Maria Santos", 3, "Deep laceration on arm", "23:48");
        erQueue.arrive("Ana Lim", 4, "Sprained ankle", "23:49");
        
        // Display the queue after all patients have arrived
        erQueue.displayQueue();

        // Treat the next patient (highest priority)
        erQueue.treatNext();
        
        // Display the remaining patients in the queue
        erQueue.displayQueue();
    }
}
