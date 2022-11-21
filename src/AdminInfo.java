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
        boolean isAdmin = false;
        if(Arrays.asList(userNames).contains(_userName)){
            int indexOfUserName = Arrays.asList(userNames).indexOf(_userName);
            System.out.println(indexOfUserName);
            System.out.println(passwords[indexOfUserName]);
            if(passwords[indexOfUserName].equals(_password)){
                isAdmin = true;
            }
        }

        return isAdmin;
    }



}
