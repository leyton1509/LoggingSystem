import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        AdminInfo adminInfo = new AdminInfo();

        int tries = 0;
        boolean success = false;

        while(tries < 3){

            System.out.println("Enter username");
            String userName = myObj.nextLine();  // Read user input

            System.out.println("Enter password : ");
            String password = myObj.nextLine();


            if(adminInfo.isAdmin(userName, password)){
                System.out.println("Successful logging");
                success = true;
                tries = 3;
            }
            else{
                tries++;
                System.out.println("Failed logging, attempt number " + tries + " try again!");
            }

        }

        if(success == false){
            System.out.println("No more attempts to try, logging failed");
        }




    }
}
