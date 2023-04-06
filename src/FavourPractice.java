public class FavourPractice {

    private String firstName;
    private String lastName;
    private int accountNumber;

    public FavourPractice(String firstName, String lastName, double accountNumber) {
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber >= 0){
            this.accountNumber = accountNumber;
        }


    }

    public void getAccountNumber(){
    }
}

