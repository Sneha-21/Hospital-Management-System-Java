import java.util.HashMap;
import java.util.ArrayList;

public class HospitalDatabase {
    public static HashMap<String, ArrayList<Doctor>> doctorsNameKey = new HashMap<>();
    public static HashMap<String, ArrayList<Doctor>> doctorsSpecializationKey = new HashMap<>();
    public static HashMap<Integer, Doctor> doctorsIdKey = new HashMap<>();
    public static ArrayList<Doctor> doctors  = new ArrayList<>();
    public static HashMap<String, Patient> patients = new HashMap<>();
    
    static {
        //doctor details
        Doctor doctor1 = new Doctor(01, "Dr.Ghajendra", "ENT", "MBBS, MD", 17);
        Doctor doctor2 = new Doctor(02, "Dr.Vikram", "Physician", "MBBS, MD", 45);
        Doctor doctor3 = new Doctor(03, "Dr.Rekha", "Surgeon", "BDM", 8);
        Doctor doctor4 = new Doctor(04, "Dr.Pramod", "Ortho", "MBBS, MD", 40);
        Doctor doctor5 = new Doctor(05, "Dr.Valle", "ENT", "MBBS, MD", 19);

        doctors.add(doctor1);
        doctors.add(doctor2);
        doctors.add(doctor3);
        doctors.add(doctor4);
        doctors.add(doctor5);
        
        addDoctorKey();

        //patient details
        Patient patient1 = new Patient(01, "Pankaj", "9047364759", "M", "Y", 30);
        Patient patient2 = new Patient(02, "Kuli", "7896056453", "M", "Y", 23);
        Patient patient3 = new Patient(03, "Samya", "9756453245", "F", "N", 45);
        Patient patient4 = new Patient(04, "Ravi", "6789045332", "M", "N", 35);
        Patient patient5 = new Patient(05, "Pavi", "9556890345", "F", "Y", 37);

        patients.put(patient1.getContactNumber(),patient1);
        patients.put(patient2.getContactNumber(),patient2);
        patients.put(patient3.getContactNumber(),patient3);
        patients.put(patient4.getContactNumber(),patient4);
        patients.put(patient5.getContactNumber(),patient5);
        //medicine details
    }

    public static void addDoctorKey() {
        //storing doctor's name as key for hashmap
        for(Doctor d : doctors) {
            if(doctorsNameKey.containsKey(d.getName()))
                doctorsNameKey.get(d.getName()).add(d);
            else {
                doctorsNameKey.put(d.getName(),new ArrayList<Doctor>());
                doctorsNameKey.get(d.getName()).add(d);
            }
        }

        //storing doctor's specialization as key for hashmap
        for(Doctor d : doctors) {
            if(doctorsSpecializationKey.containsKey(d.getSpecialization()))
            doctorsSpecializationKey.get(d.getSpecialization()).add(d);
            else {
                doctorsSpecializationKey.put(d.getSpecialization(),new ArrayList<Doctor>());
                doctorsSpecializationKey.get(d.getSpecialization()).add(d);
            }
        }

        //storing doctor's id as key for hashmap
        for(Doctor d : doctors) {
            doctorsIdKey.put(d.getId(),d);
        }
    }

}
