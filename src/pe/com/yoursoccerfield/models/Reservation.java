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
    private java.sql.Date createDate;
    private Boolean state;
    private java.sql.Date gameTime;
    private float hours;
    private float total;
    private Organizer organizer;
    private Court court;


    public int getId() {
        return id;
    }

    public String getIdAsValue() { return "'" + getId() + "'";}

    public Reservation setId(int id) {
        this.id = id;
        return this;
    }

    public java.sql.Date getCreateDate() {
        return createDate;
    }

    public String getCreate_DateAsValue() { return "'" + getCreateDate() + "'";}

       public Reservation setCreateDate(java.sql.Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public Boolean getState() {
        return state;
    }

    public String getStateAsValue(){return "'" + getState() + "";}

    public Reservation setState(Boolean state) {
        this.state = state;
        return this;
    }

    public java.sql.Date getGameTime() {
        return gameTime;
    }

    public String getGame_TimeAsValue() { return "'" + getGameTime()+ "'";}

    public Reservation setGameTime(java.sql.Date gameTime) {
        this.gameTime = gameTime;
        return this;
    }

    public float getHours() {
        return hours;
    }

    public String getHoursAsValue() { return "'" + getHours()+ "'";}

    public Reservation setHours(float hours) {
        this.hours = hours;
        return this;
    }

    public float getTotal() {return total;}

    public String getTotalAsValue() { return "'" + getTotal()+ "'";}


    public Reservation setTotal(float total) {
        this.total = total;
        return this;
    }

    public Organizer getOrganizer() {
        return organizer;
    }
    public String getOrganizerAsValue() {return "'" + getOrganizer();}

    public Reservation setOrganizer(Organizer organizer) {
        this.organizer = organizer;
        return this;
    }

    public Court getCourt() {
        return court;
    }
    public String getCourtAsValue() {return "'" + getCourt();}

    public Reservation setCourt(Court court) {
        this.court = court;
        return this;
    }

    public static Reservation build(ResultSet resultSet,
                                    OrganizersEntity organizersEntity,
                                    CourtsEntity courtsEntity,
                                    OwnersEntity ownersEntity,
                                    UbigeosEntity ubigeosEntity,
                                    ServicesEntity servicesEntity){
        try{
            return (new Reservation())
                    .setId(resultSet.getInt("id"))
                    .setCreateDate(resultSet.getDate("created_date"))
                    .setState(resultSet.getBoolean("state"))
                    .setGameTime(resultSet.getDate("game_time"))
                    .setHours(resultSet.getFloat("hours"))
                    .setTotal(resultSet.getFloat("total"))
                    .setOrganizer(organizersEntity.findById(resultSet.getString("organizer_id")))
                    .setCourt(courtsEntity.findById(resultSet.getString("court_id"),ownersEntity,ubigeosEntity,servicesEntity));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }



}
