public class Patient {
    private int id;
    private String name;
    private String contactNumber;
    private String gender;
    private String admitstatus;
    private int age;

    public Patient(int id, String name, String contactNumber, String gender, String admitstatus, int age) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.gender = gender;
        this.admitstatus = admitstatus;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAdmitstatus(String admitstatus) {
        this.admitstatus = admitstatus;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        
        return "\nId             : " + id +
               "\nName           : " + name +
               "\nAge            : " + age +
               "\nGender         : " + gender +
               "\nContact Number : " + contactNumber +
               "\nAdmit Status   : " + admitstatus; 
    }  
}
