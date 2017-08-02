package pe.com.yoursoccerfield.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by Yessenia on 16/06/2017.
 */
public class Reservation {
    private int id;
    private Date createDate;
    private Boolean state;
    private Date gameTime;
    private float hours;
    private float total;
    private Organizer organizer;
    private Court court;

    public Reservation() {
    }

    public Reservation(int id, Date createDate, Boolean state, Date gameTime, float hours, float total, Organizer organizer, Court court) {
        this.id = id;
        this.createDate = createDate;
        this.state = state;
        this.gameTime = gameTime;
        this.hours = hours;
        this.total = total;
        this.organizer = organizer;
        this.court = court;
    }

    public int getId() {
        return id;
    }

    public String getIdAsString() {
        return String.valueOf(getId());
    }

    public Reservation setId(int id) {
        this.id = id;
        return this;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getCreateDateAsValue() { return "'" + getCreateDate() + "'";}

       public Reservation setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public Boolean getState() {
        return state;
    }

    public String getStateAsString(){return String.valueOf(getState());}

    public Reservation setState(Boolean state) {
        this.state = state;
        return this;
    }

    public Date getGameTime() {
        return gameTime;
    }

    public String getGameTimeAsValue() { return "'" + getGameTime()+ "'";}

    public Reservation setGameTime(Date gameTime) {
        this.gameTime = gameTime;
        return this;
    }

    public float getHours() {
        return hours;
    }

    public String getHoursAsString() { return String.valueOf(getHours());}

    public Reservation setHours(float hours) {
        this.hours = hours;
        return this;
    }

    public float getTotal() {return total;}

    public String getTotalAsString(){return String.valueOf(getTotal());}

    public Reservation setTotal(float total) {
        this.total = total;
        return this;
    }

    public Organizer getOrganizer() {
        return organizer;
    }
    public String getOrganizerAsValue() {return "'" + getOrganizer()+"'";}

    public Reservation setOrganizer(Organizer organizer) {
        this.organizer = organizer;
        return this;
    }

    public Court getCourt() {
        return court;
    }
    public String getCourtAsValue() {return "'" + getCourt()+"'";}

    public Reservation setCourt(Court court) {
        this.court = court;
        return this;
    }

    public static Reservation build(ResultSet resultSet,
                                    OrganizersEntity organizersEntity,
                                    CourtsEntity courtsEntity,
                                    OwnersEntity ownersEntity,
                                    UbigeosEntity ubigeosEntity){
        try{
            return (new Reservation())
                    .setId(resultSet.getInt("id"))
                    .setCreateDate(resultSet.getDate("created_date"))
                    .setState(resultSet.getBoolean("state"))
                    .setGameTime(resultSet.getDate("game_time"))
                    .setHours(resultSet.getFloat("hours"))
                    .setTotal(resultSet.getFloat("total"))
                    .setOrganizer(organizersEntity.findById(resultSet.getString("organizer_id")))
                    .setCourt(courtsEntity.findById(resultSet.getString("court_id"),ownersEntity,ubigeosEntity));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }



}
