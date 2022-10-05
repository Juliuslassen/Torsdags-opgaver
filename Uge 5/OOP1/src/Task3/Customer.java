package Task3;

public class Customer {

    private String firstName;
    private String lastName;
    private String username;
    private int iD;

    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getiD() {
        return iD;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    @Override
    public String toString() {
        return "Customer: " + firstName + ", "+ lastName+ ", " + username;
    }
}
