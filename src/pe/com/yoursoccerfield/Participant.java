package pe.com.yoursoccerfield;

/**
 * Created by Otoya user on 16/06/2017.
 */
public class Participant {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int Organizer;


    public Participant() {
    }

    public Participant(int id, String firstName, String lastName, String email, String password, int organizer) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPassword(password);
        setOrganizer(organizer);
    }


    public int getId() {
        return id;
    }

    public Participant setId(int id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Participant setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Participant setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Participant setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Participant setPassword(String password) {
        this.password = password;
        return this;
    }

    public int getOrganizer() {
        return Organizer;
    }

    public Participant setOrganizer(int organizer) {
        Organizer = organizer;
        return this;
    }
}
