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

    public Organizer() {

    }

    public String getId() {
        return id;
    }
    public String getIdAsValue() {
        return "'" + getId() + "'";}

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFirstNameAsValue(){
        return "'" + getFirstName() + "'";
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLastNameAsValue(){
        return "'" + getLastName() + "'";
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String getpasswordAsValue(){
        return "'" + getPassword() + "'";
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDni() {
        return dni;
    }

    public String getDniAsValue(){
        return "'" + getDni() + "'";
    }


    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPhoto() {
        return photo;
    }

    public String getPhotoAsValue(){
        return "'" + getPhoto() + "'";
    }


    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhone() {
        return phone;
    }

    public String getPhoneAsValue(){
        return "'" + getPhone() + "'";
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPosition() {
        return position;
    }

    public String getPositionAsValue(){
        return  "'" + getPosition() + "'";
    }


    public void setPosition(String position) {
        this.position = position;
    }

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
