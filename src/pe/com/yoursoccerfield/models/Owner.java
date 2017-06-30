package pe.com.yoursoccerfield.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by lnakaya on 6/17/2017.
 */
public class Owner {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String dni;
    private String photo;
    private String phone;
    private String position;


    public String getId() {
        return id;
    }

    public Owner setId(String id) {
        this.id = id;
        return this;
    }

    public String getIdAsValue() { return "'" + getId() + "'" ;}

    public String getFirstNameAsValue(){
        return "'" + getFirstName()+"'";
    }

    public String getFirstName() {
        return firstName;
    }

    public Owner setFirstName(String firstName) {
        this.firstName = firstName;
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

    public String getPassword() {
        return password;
    }

    public Owner setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getDni() {
        return dni;
    }

    public Owner setDni(String dni) {
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

    public static Owner build(ResultSet resultSet){
        try {
            return (new Owner())
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
