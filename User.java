import java.text.*;
import java.util.*;

public abstract class User {
    protected String name;
    protected String userName;
    protected String password;

    //menu() is defined by child class - admin and pharmacist
    public abstract void menu();

    public void login(User user) {
        String userName;
        String password;
        System.out.println("\n--------------------------------------------------------Login-----------------------------------");
        System.out.print("Enter user name : ");
        userName = App.scan.next();
        System.out.print("Enter password : ");
        password = App.scan.next();
        verifyLogin(userName,password,user);
    }

    //verify the credentials
    public void verifyLogin(String userName, String password, User user) {
        if(userName.equals(user.userName) && password.equals(user.password)) {
            System.out.println("--------------------------------------------------------Welcome-----------------------------------------------");
            SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
            Date date = new Date();
            System.out.println("Last login : " + formatDate.format(date));
            user.menu();
        }

        else {
            System.out.println("Login failed! Invalid user name or password");
            login(user);
        }
    }

}
