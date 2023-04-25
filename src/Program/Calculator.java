package Program;

import java.util.ArrayList;

public class Calculator {
    private ArrayList<Account> account = new ArrayList<>();

    public ArrayList<Account> getAccount() {
        return account;
    }

    public void setAccount(ArrayList<Account> account) {
        this.account = account;
    }

    public void addAccount(Account accountAdded){
        this.account.add(accountAdded);
    }
}
