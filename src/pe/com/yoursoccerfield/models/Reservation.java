package pe.com.yoursoccerfield.models;

import com.sun.org.apache.regexp.internal.RE;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by Yessenia on 16/06/2017.
 */
public class Reservation {
    private int id;
    private Date created_date;
    private boolean state;
    private Date gameTime;
    private float hours;
    private float total;
    private Organizer organizer;
    private Court court;

    public Reservation() {
    }

    public Reservation(int id, Date created_date, boolean state, Date gameTime, float hours, float total, Organizer organizer, Court court) {
        this.id = id;
        this.created_date = created_date;
        this.state = state;
        this.gameTime = gameTime;
        this.hours = hours;
        this.total = total;
        this.organizer = organizer;
        this.court = court;
    }


    public int getId() { return id;}

    public Reservation setId(int id) {  this.id = id;
    return this;}

    public Date getCreated_date() { return created_date; }

    public Reservation setCreated_date(Date created_date) {   this.created_date = created_date;
    return this;}

    public boolean isState() {   return state;    }

    public Reservation setState(boolean state) {  this.state = state;
        return this;   }

    public Date getGameTime() {  return gameTime;   }

    public Reservation setGameTime(Date gameTime) { this.gameTime = gameTime;
    return this;}

    public float getHours() {  return hours;    }

    public Reservation setHours(float hours) {      this.hours = hours;
    return this;}

    public float getTotal() {   return total;  }

    public Reservation setTotal(float total) { this.total = total;
    return this;}

    public Organizer getOrganizer() {  return organizer; }

    public Reservation setOrganizer(Organizer organizer) { this.organizer = organizer;
    return this;}

    public Court getCourt() { return court; }

    public Reservation setCourt(Court court) {
        this.court = court;
        return this;
    }

/*
    public static Reservation build(ResultSet resultSet, OrganizersEntity organizersEntity,
                                    CourtsEntity courtsEntity, OwnersEntity ownersEntity,
                                    UbigeosEntity ubigeosEntity, ServicesEntity servicesEntity) {
        try {
            return (new Reservation())
                    .setId(resultSet.getInt("id"))
                    .setState(resultSet.getBoolean("state"))
                    .setDate(resultSet.getDate("date"))
                    .setGameDate(resultSet.getDate("game_date"))
                    .setGameTime(resultSet.getDate("game_time"))
                    .setOrganizer(organizersEntity.findById(resultSet.getString("organizer_id")))
                    .setCourt(courtsEntity.findById(resultSet.getString("court_id"),ownersEntity,ubigeosEntity,servicesEntity));
            } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
*/

}
