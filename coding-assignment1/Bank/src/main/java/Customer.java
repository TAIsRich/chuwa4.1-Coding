public class Customer {

    private String uid;
    private String firstName;
    private String lastName;
    private boolean isValid;

    private CheckingAccount checkingAccount;
    private SavingAccount savingAccount;

    public Customer(String uid, String firstName, String lastName) {
        this.uid = uid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.isValid = true;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public boolean createCheckingAccount(String cid) {
        if (checkingAccount != null) {
            return false;
        }
        checkingAccount = new CheckingAccount(cid);

        return true;
    }

    public boolean createSavingAccount(String sid, double interest) {
        if (savingAccount != null) {
            return false;
        }
        savingAccount = new SavingAccount(sid, interest);

        return true;
    }
}
