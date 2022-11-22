import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        // Create a scanner for reading lines

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        // Create instance of admin info

        AdminInfo adminInfo = new AdminInfo();

        // Tracks how many tries / if the end was a success

        int tries = 0;
        boolean success = false;

        // Loops 3 times

        while(tries < 3){

            // Enter username and password

            System.out.println("Enter username");
            String userName = myObj.nextLine();  // Read user input

            System.out.println("Enter password : ");
            String password = myObj.nextLine();

            // If the user is an admin then returns true


            if(adminInfo.isAdmin(userName, password)){
                System.out.println("Successful logging");
                success = true;
                tries = 3;
            }

            // If it returns false the user gets another go until 3 times
            else{
                tries++;
                System.out.println("Failed logging, attempt number " + tries + " try again!");
            }

        }

        // Prints a failed message if failed

        if(!success){
            System.out.println("No more attempts to try, logging failed");
        }




    }
}
