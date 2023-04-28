package Program;

public class Account {
    protected String username;
    protected String password;
    protected int logged;
    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public int getLogged() {
        return logged;
    }

    public void setLogged(int logged) {
        this.logged = logged;
    }

    // Method to check login credentials
    public boolean checkLogin(){
        return username.equals("Program.Student") && password.equals("Password");
    }


}
