package pe.com.yoursoccerfield.models;

/**
 * Created by Otoya user on 16/06/2017.
 */
public class Participant {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String position;
    private int Organizer;

    public Participant() {
    }

    public Participant(int id, String firstName, String lastName, String email, String position, int organizer) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPosition(position);
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

    public String getPosition() {
        return position;
    }

    public Participant setPosition(String position) {
        this.position = position;
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
