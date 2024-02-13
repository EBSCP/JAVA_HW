public class Patient {
    private int patientId;
    private String Name;

    public String getName() {
        return Name;
    }
    public Patient(int patientId,String name) {
        this.Name =name;
        this.patientId= patientId;
    }
    public int getPatientId() {
        return patientId;
    }
    public String toString() {
        return "Patient " + patientId + ": " + Name;
    }
}
