package Program;

public class Account {
    protected String username;
    protected String password;
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getName() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Method to check login credentials
    public boolean checkLogin(){
        return username.equals("Program.Student") && password.equals("Password");
    }


}
