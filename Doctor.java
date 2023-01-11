public class Doctor {
    private int id;
    private String name;
    private String specialization;
    private String qualification;
    private int roomNumber;

    public Doctor(int id, String name, String specialization, String qualification, int roomNumber) {
        this.id = id;
        this.name = name;
        this.specialization= specialization;
        this.qualification = qualification;
        this.roomNumber = roomNumber;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return "\nId            : " + id +
               "\nName          : " + name +
               "\nSpecialization: " + specialization +
               "\nQualifiaction : " + qualification +
               "\nRoom Number   : " + roomNumber + "\n";
    } 

}
