package ch.hslu.sofeng.static_webpage;

public class CampusPayCustomer {
    private String firstName;
    private String lastName;
    private String email;

    public CampusPayCustomer(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }
}