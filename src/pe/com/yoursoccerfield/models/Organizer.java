package pe.com.yoursoccerfield.models;

/**
 * Created by Pc user on 16/06/2017.
 */
public class Organizer {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int dni;
    private String photo;
    private String phone;
    private String position;

    public Organizer() {
    }

    public Organizer(int id, String firstName, String lastName, String email, String password, int dni, String photo, String phone, String position) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.dni = dni;
        this.photo = photo;
        this.phone = phone;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public Organizer setId(int id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Organizer setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Organizer setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Organizer setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Organizer setPassword(String password) {
        this.password = password;
        return this;
    }

    public int getDni() {
        return dni;
    }

    public Organizer setDni(int dni) {
        this.dni = dni;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public Organizer setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Organizer setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public Organizer setPosition(String position) {
        this.position = position;
        return this;
    }
}
