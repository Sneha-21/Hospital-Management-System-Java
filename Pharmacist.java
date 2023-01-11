public class Pharmacist extends User {

    public Pharmacist() {
        name = "Mithra";
        userName = "mithra@gmail.com";
        password = "mithra123";
    }

    //choosing the action to be performed
    public void menu() {
        int choice;
        System.out.println("\n1. View medicine details" + "\n2. Add medicines" + "\n3. Update medicines" + "\n4. Logout");
        System.out.print("Enter choice : ");
        choice = App.scan.nextInt();
        
        do {
            switch(choice) {
                case 1: //viewMedDetails();
                        
                        break;
                case 2: //addMedicines();
                        break;

                case 3: //updateMedicines();
                        break;

                case 4: System.out.println("Successfully Logged out!!");
                        break;
            }
            System.out.print("Enter choice : ");
            choice = App.scan.nextInt();

        }while(choice < 4);
        
    }
}
