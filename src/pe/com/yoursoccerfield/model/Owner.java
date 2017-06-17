package pe.com.yoursoccerfield.model;

/**
 * Created by Pc user on 16/06/2017.
 */
public class Owner {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private int dni;
    private String photo;
    private String phone;
    private String position;

    public Owner() {
    }

    public Owner(int id, String firstName, String lastName, String email, String password, int dni, String photo, String phone, String position) {
        this.id = id;
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.password = password;
        this.setDni(dni);
        this.setPhoto(photo);
        this.setPhone(phone);
        this.setPosition(position);
    }


    public int getId() {
        return id;
    }

    public Owner setId(int id) {
        this.id = id;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Owner setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Owner setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Owner setEmail(String email) {
        this.email = email;
        return this;
    }

    public int getDni() {
        return dni;
    }

    public Owner setDni(int dni) {
        this.dni = dni;
        return this;
    }

    public String getPhoto() {
        return photo;
    }

    public Owner setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Owner setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getPosition() {
        return position;
    }

    public Owner setPosition(String position) {
        this.position = position;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Owner setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
}
