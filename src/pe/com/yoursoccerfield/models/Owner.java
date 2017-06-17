package pe.com.yoursoccerfield.models;

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

    public Owner() {
    }

    public Owner(String id, String firstName, String lastName,
                 String email, String password, String dni, String photo,
                 String phone, String position)
    {
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

    public String getId() { return id; }

    public String getIdAsValue(){ return "'" + getId() + "'";}

    public Owner setId(String id) {
        this.id = id;
        return  this;
    }

    public String getFirstName() { return firstName; }

    public String getFirstNameAsValue(){ return "'" + getFirstName() + "'";}

    public Owner setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() { return lastName; }

    public String getLastNameAsValue(){ return "'" + getLastName() + "'";}

    public Owner setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() { return email; }

    public String getEmailAsValue(){ return "'" + getEmail() + "'";}

    public Owner setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() { return password; }

    public String getPasswordAsValue(){ return "'" + getPassword() + "'";}

    public Owner setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getDni() { return dni; }

    public String getDniAsValue(){ return  "'" + getDni() + "'";}

    public Owner setDni(String dni) {
        this.dni = dni;
        return this;
    }

    public String getPhoto() { return photo;}

    public String getPhotoAsValue(){ return "'" + getPhoto() + "'";}

    public Owner setPhoto(String photo) {
        this.photo = photo;
        return this;
    }

    public String getPhone() {  return phone; }

    public String getPhoneAsValue(){return "'" + getPhone() + "'";}

    public Owner setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getPosition() { return position;  }

    public String getPositionAsValue(){return "'" + getPosition() + "'";}

    public Owner setPosition(String position) {
        this.position = position;
        return this;
    }
}
