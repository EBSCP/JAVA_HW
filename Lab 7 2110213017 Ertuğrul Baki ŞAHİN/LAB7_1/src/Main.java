import java.util.Arrays;

public class Main {

    private static int patientId;
    private Patient[] patients;

    public static void main(String[] args) {

       Main hospital = new Main();
       hospital.patients = new Patient[4];
            for (int i =0; i< 4;i++) {
                String name = "Patient " + (i + 1);
                hospital.patients[i] = new Patient(patientId, name);
                patientId++; 
            }
        System.out.println(Arrays.toString(hospital.patients));
    }
}