class WorkshopRegistration {
    public void registerParticipant(String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException(
                "Registration denied for " + name + ": Must be at least 18 years old (provided age: " + age + ")"
            );
        }
        System.out.println("Registration successful for " + name + "!");
    }
}

public class WorkshopDemo {
    public static void main(String[] args) {
        WorkshopRegistration workshop = new WorkshopRegistration();
        
        try {
            System.out.println("Attempting to register a 16-year-old participant...");
            workshop.registerParticipant("Alice", 16);
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
