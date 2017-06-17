package pe.com.yoursoccerfield.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Otoya user on 16/06/2017.
 */
public class Participant {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String position;
    private  Organizer organizer;

    public Participant() {
    }

    public Participant(int id, String firstName, String lastName, String email, String position, Organizer organizer) {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setEmail(email);
        this.setPosition(position);
        this.setOrganizer(organizer);
    }


    public int getId() {
        return id;
    }

    public String getIdAsValue() { return "'" + getId() + "'";}

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

    public Organizer getOrganizer() {
        return organizer;
    }

    public Participant setOrganizer(Organizer organizer) {
        this.organizer = organizer;
        return this;
    }


    public static Participant build(ResultSet rs, OrganizerEntity organizerEntity) {
        try {
            return (new Participant())
                    .setId(rs.getInt("participant_id"))
                    .setFirstName(rs.getString("participant_first_name"))
                    .setLastName(rs.getString("participant_last_name"))
                    .setOrganizer(organizerEntity.findById(rs.getInt("organizer_id")));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
