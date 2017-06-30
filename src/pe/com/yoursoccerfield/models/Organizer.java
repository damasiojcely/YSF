package pe.com.yoursoccerfield.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Otoya user on 16/06/2017.
 */
public class Organizer {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String dni;
    private String photo;
    private String phone;
    private String position;

    public Organizer(String id, String firstName, String lastName, String email, String password, String dni, String photo, String phone, String position) {
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

    public Organizer() {

    }


    public String getId() {
        return id;
    }
    public String getIdAsValue(){return "'"+ getId() +"'";}
    public Organizer setId(String id) { this.id = id;
        return this; }

    public String getFirstName() {
        return firstName;
    }
    public String getFirstNameAsValue(){return "'"+ getFirstName() +"'";}
        public Organizer setFirstName(String firstName) {this.firstName = firstName;
        return this; }

    public String getLastName() {
        return lastName;
    }
    public String getLastNameAsValue(){return "'"+ getLastName() +"'";}
    public Organizer setLastName(String lastName) {this.lastName = lastName;
    return this;}

    public String getEmail() {
        return email;
    }
    public String getEmailAsValue(){return "'"+ getEmail() +"'";}
    public Organizer setEmail(String email) { this.email = email;
        return this;}

    public String getPassword() {
        return password;
    }
    public String getPasswordAsValue(){return "'"+ getPassword() +"'";}
    public Organizer setPassword(String password) { this.password = password;
        return this;}

    public String getDni() {
        return dni;
    }
    public String getDniAsValue(){return "'"+ getDni() +"'";}
    public Organizer setDni(String dni) { this.dni = dni;
        return this; }

    public String getPhoto() {
        return photo;
    }
    public String getPhotoAsValue(){return "'"+ getPhoto() +"'";}
    public Organizer setPhoto(String photo) {this.photo = photo;
        return this; }

    public String getPhone() {
        return phone;
    }
    public String getPhoneAsValue(){return "'"+ getPhone() +"'";}
    public Organizer setPhone(String phone) {this.phone = phone;
        return this; }

    public String getPosition() {
        return position;
    }
    public String getPositionAsValue(){return "'"+ getPosition() +"'";}
    public Organizer setPosition(String position) {this.position = position;
        return this; }

    public static Organizer build(ResultSet resultSet){
        try {
            return (new Organizer())
                    .setId(resultSet.getString("id"))
                    .setFirstName(resultSet.getString("first_name"))
                    .setLastName(resultSet.getString("last_name"))
                    .setEmail(resultSet.getString("email"))
                    .setPassword(resultSet.getString("password"))
                    .setDni(resultSet.getString("dni"))
                    .setPhoto(resultSet.getString("photo"))
                    .setPhone(resultSet.getString("phone"))
                    .setPosition(resultSet.getString("position"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
