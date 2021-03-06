package pe.com.yoursoccerfield.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Otoya user on 16/06/2017.
 */
public class Participant {


    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private String position;
    private  Organizer organizer;


    public Participant() {
    }

    public Participant(String id, String firstName, String lastName, String email, String position, Organizer organizer) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.position = position;
        this.organizer = organizer;
    }


    public String getId() {
        return id;
    }

    public String getIdAsValue() { return "'" + getId() + "'";}

    public Participant setId(String id) {
        this.id = id;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getFirstNameAsValue() { return "'" + getFirstName() + "'";}

    public Participant setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }
    public String getLastNameAsValue() { return "'" + getLastName() + "'";}

    public Participant setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public String getEmailAsValue() { return "'" + getEmail() + "'";}

    public Participant setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPosition() {
        return position;
    }
    public String getPositionAsValue() { return "'" + getPosition() + "'";}

    public Participant setPosition(String position) {
        this.position = position;
        return this;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public String getOrganizerAsValue() { return "'" + getOrganizer() + "'";}

    public Participant setOrganizer(Organizer organizer) {
        this.organizer = organizer;
        return this;
    }


    public static Participant build(ResultSet rs, OrganizersEntity organizersEntity) {
        try {
            return (new Participant())
                    .setId(rs.getString("id"))
                    .setFirstName(rs.getString("first_name"))
                    .setLastName(rs.getString("last_name"))
                    .setEmail(rs.getString("email"))
                    .setPosition(rs.getString("position"))
                    .setOrganizer(organizersEntity.findById(rs.getString("organizer_id")));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
