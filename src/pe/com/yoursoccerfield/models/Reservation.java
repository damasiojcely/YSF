package pe.com.yoursoccerfield.models;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Reservation {
    private int id;
    private Date createDate;
    private Boolean state;
    private Date gameTime;
    private float hours;
    private float total;
    private Organizer organizer;
    private Court court;


    public int getId() {
        return id;
    }

    public Reservation setId(int id) {
        this.id = id;
        return this;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public Reservation setCreateDate(Date createDate) {
        this.createDate = createDate;
        return this;
    }

    public Boolean getState() {
        return state;
    }

    public Reservation setState(Boolean state) {
        this.state = state;
        return this;
    }

    public Date getGameTime() {
        return gameTime;
    }

    public Reservation setGameTime(Date gameTime) {
        this.gameTime = gameTime;
        return this;
    }

    public float getHours() {
        return hours;
    }

    public Reservation setHours(float hours) {
        this.hours = hours;
        return this;
    }

    public float getTotal() {
        return total;
    }

    public Reservation setTotal(float total) {
        this.total = total;
        return this;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public Reservation setOrganizer(Organizer organizer) {
        this.organizer = organizer;
        return this;
    }

    public Court getCourt() {
        return court;
    }

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
