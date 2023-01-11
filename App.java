import java.util.Scanner;

public class App {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("1. Login as admin\n" + "2. Login as pharmacist\n");
        int choice;
        System.out.print("Enter choice : ");
        choice = scan.nextInt();
        
        switch(choice) {
            //login as admin
            case 1 : System.out.println("\n-------------------------------------------------------Admin login-----------------------------------------");
                     Admin admin = new Admin();
                     admin.login(admin);
                     break; 
            //login as pharmacist
            case 2 : System.out.println("\n-------------------------------------------------------Pharmacist login-------------------------------------");
                    Pharmacist pharmacist = new Pharmacist();
                    pharmacist.login(pharmacist);
                    break;
        }         
        scan.close();
    }
}
