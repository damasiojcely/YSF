package pe.com.yoursoccerfield.models;

/**
 * Created by Otoya user on 16/06/2017.
 */
public class Organizer {
    private int id;
    private  String firstName;
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
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPassword(password);
        this.setDni(dni);
        this.setPhoto(photo);
        this.setPhone(phone);
        this.setPosition(position);
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

    public void setDni(int dni) {
        this.dni = dni;
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

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public Organizer setPosition(String position) {
        this.position = position;
        return this;
    }
}
