import java.util.Arrays;
// Class for the admin info
public class AdminInfo {

    // Array for usernames
    // Array for passwords

    private String[] userNames = {"leyton", "sam", "john", "AC"};
    private String[] passwords = {"abc123", "affff", "red", "a233fff"};

    public AdminInfo(){
        // AdminInfo Contructor
    }

    // Returns true if the user is admin
    public boolean isAdmin(String _userName, String _password){
        // Creates a false variable

        boolean isAdmin = false;

        // If the list contains the username
        if(Arrays.asList(userNames).contains(_userName)){
            // Get the index of this username
            int indexOfUserName = Arrays.asList(userNames).indexOf(_userName);

            // If the password equals that usernames password then return true
            if(passwords[indexOfUserName].equals(_password)){
                isAdmin = true;
            }
        }

        return isAdmin;
    }



}
