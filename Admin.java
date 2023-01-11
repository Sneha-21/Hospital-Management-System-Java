public class Admin extends User {

    public Admin() {
        name = "Janani";
        userName = "janani@gmail.com";
        password = "jan123";
    }
    //choosing the action to be performed
    public void menu() {
        int choice;
        System.out.println("\n1. Add Doctor" + "\n2. Add patient" + "\n3. Modify doctor details" + "\n4. Modify patient details" + "\n5. View doctor details" + 
                           "\n6. View patient details" + "\n7. Assign doctors to patients" + "\n8. Logout");
        System.out.print("\nEnter admin choice : ");
        choice = App.scan.nextInt();
        
        do {
            switch(choice) {
                case 1: addDoctor();
                        break;

                case 2: addPatient();
                        break;

                case 3: modifyDoctorDetails();
                        break;

                case 4: modifyPatientDetails();
                        break;

                case 5: viewDoctorDetails();
                        break;

                case 6: viewPatientDetails();
                        break;

                case 7: //assignDoctorToPatients();
                        break;

                case 8: System.out.println("Successfully Logged out!!");
                        break;
            }
            System.out.print("\nEnter admin choice : ");
            choice = App.scan.nextInt();
        }while(choice < 8);
    }
    //view details of an existing doctor
    public void viewDoctorDetails() {
        String query;
        System.out.print("\nEnter Doctor name or speciality: ");
        query = App.scan.next();

        if(HospitalDatabase.doctorsNameKey.containsKey(query))
                System.out.println(HospitalDatabase.doctorsNameKey.get(query));
        else if(HospitalDatabase.doctorsSpecializationKey.containsKey(query))
                System.out.println(HospitalDatabase.doctorsSpecializationKey.get(query));
        else 
                System.out.println("\nNo records found");
    }

    //modify an existing doctor detail
    public void modifyDoctorDetails() {
        int id;
        System.out.print("\nEnter Doctor ID: ");
        id = App.scan.nextInt();
        Doctor d = HospitalDatabase.doctorsIdKey.get(id);
        int choice;
        System.out.println("\n1. Modify name" + "\n2. Modify specialization" + "\n3. Modify room number" + "\n4. Modify qualifiaction" + "\n5. Save");
        System.out.print("\nEnter edit choice: ");
        choice = App.scan.nextInt();
        String newData;
        
        do {
                switch(choice) {
                    case 1: System.out.print("\nEnter new name: "); 
                            newData = App.scan.next();
                            d.setName(newData);    
                            break;

                    case 2: System.out.print("\nEnter new Specializtion: "); 
                            newData = App.scan.next();
                            d.setSpecialization(newData);
                            break;

                    case 3: System.out.print("\nEnter new room number: "); 
                            int newNumber = App.scan.nextInt(); 
                            d.setRoomNumber(newNumber);
                            break;

                    case 4: System.out.print("\nEnter new qualification: ");
                            newData = App.scan.next();
                            d.setQualification(newData);
                            break;

                    case 5: System.out.println("\nSaved successfully!!");
                            break;
                }
                System.out.print("\nEnter edit choice : ");
                choice = App.scan.nextInt();
    
            }while(choice < 5);
    }

    //creating a new entry for doctor
    public void addDoctor() {
        String name, specialization, qualification;
        int room, id;
        System.out.print("\nEnter ID: ");
        id = App.scan.nextInt();
        if(HospitalDatabase.doctorsIdKey.containsKey(id))
                System.out.println("\nID already exists");
        else {
                System.out.print("\nEnter name: ");
                name = App.scan.next();
                System.out.print("\nEnter qualifiaction: ");
                qualification = App.scan.next();
                System.out.print("\nEnter specialization: ");
                specialization = App.scan.next();
                System.out.print("\nEnter room number: ");
                room = App.scan.nextInt();
                Doctor d = new Doctor(id, name, specialization, qualification, room);
                HospitalDatabase.doctors.add(d);
                HospitalDatabase.addDoctorKey(); 
        }
    }

    //view details of an existing patient
    public void viewPatientDetails() {
        String query;
        System.out.print("\nEnter Patient contact number: ");
        query = App.scan.next();

        if(HospitalDatabase.patients.containsKey(query))
                System.out.println(HospitalDatabase.patients.get(query));
        else 
                System.out.println("\nNo records found");
    }

    //modify an existing patient detail
    public void modifyPatientDetails() {
        String id;
        System.out.print("\nEnter patient contact number: ");
        id = App.scan.next();
        Patient p = HospitalDatabase.patients.get(id);
        int choice;
        System.out.println("\n1. Modify name" + "\n2. Modify contact number" + "\n3. Modify admit status" + "\n4. Modify gender" + "\n5. modify age" + "\n6. Save");
        System.out.print("\nEnter edit choice: ");
        choice = App.scan.nextInt();
        String newData;
        
        do {
                switch(choice) {
                    case 1: System.out.print("\nEnter new name: "); 
                            newData = App.scan.next();
                            p.setName(newData);    
                            break;

                    case 2: System.out.print("\nEnter new contact number: "); 
                            newData = App.scan.next();
                            p.setContactNumber(newData);
                            break;

                    case 3: System.out.print("\nEnter new admit status: "); 
                            newData = App.scan.next(); 
                            p.setAdmitstatus(newData);
                            break;

                    case 4: System.out.print("\nEnter gender: ");
                            newData = App.scan.next();
                            p.setGender(newData);
                            break;
                    case 5: System.out.print("\nEnter new age: "); 
                            int newNumber = App.scan.nextInt(); 
                            p.setAge(newNumber);
                            break;

                    case 6: System.out.println("\nSaved successfully!!");
                            break;
                }
                System.out.print("\nEnter edit choice : ");
                choice = App.scan.nextInt();
    
            }while(choice < 6);
    }

    //creating a new entry for patient
    public void addPatient() {
        String name, contactNumber, gender,admitStatus;
        int age, id;
        System.out.print("\nEnter contact number: ");
        contactNumber = App.scan.next();
        if(HospitalDatabase.patients.containsKey(contactNumber))
                System.out.println("\nRecord already exists");
        else {
                System.out.print("\nEnter name: ");
                name = App.scan.next();
                System.out.print("\nEnter gender: ");
                gender = App.scan.next();
                System.out.print("\nEnter admit status: ");
                admitStatus = App.scan.next();
                System.out.print("\nEnter age: ");
                age = App.scan.nextInt();
                System.out.print("\nEnter id: ");
                id = App.scan.nextInt();
                Patient p = new Patient(id, name, contactNumber, gender, admitStatus, age);
                HospitalDatabase.patients.put(p.getContactNumber(),p);
        }
    }
        
}
