package pe.com.yoursoccerfield.model;

/**
 * Created by Pc user on 16/06/2017.
 */
public class People {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String position;
    private int dni;
    private String photo;
    private String phone;

    public People() {
    }

    public People(String id, String firstName, String lastName, String email, String position, int dni, String photo, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.position = position;
        this.dni = dni;
        this.photo = photo;
        this.phone = phone;
    }


    public String getId() {return id;}
    public People setId(String id) {this.id = id;
        return this;}
    public String getFirstName() {return firstName;}
    public People setFirstName(String firstName) {this.firstName = firstName;
        return this;}
    public String getLastName() {return lastName;}
    public People setLastName(String lastName) {this.lastName = lastName;
        return this;}
    public String getEmail() {return email;}
    public People setEmail(String email) {this.email = email;
        return this;}
    public String getPosition() {return position;}
    public People setPosition(String position) {this.position = position;
        return this;}
    public int getDni() {return dni;}
    public People setDni(int dni) {this.dni = dni;
        return this;}
    public String getPhoto() {return photo;}
    public People setPhoto(String photo) {this.photo = photo;
        return this;}
    public String getPhone() {return phone;
    }
    public People setPhone(String phone) {this.phone = phone;
        return this;}
}
