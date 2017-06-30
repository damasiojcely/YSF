package pe.com.yoursoccerfield.models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 * Created by Yessenia on 16/06/2017.
 */
public class Reservation {
    private int id;
    private boolean state;
    private Date date;
    private Date gameDate;
    private Date gameTime;
    private Organizer organizer;
    private Court court;

    public Reservation() {
    }

    public Reservation(int id, boolean state, Date date, Date gameDate, Date gameTime, Organizer organizer, Court court) {
        this.id = id;
        this.state = state;
        this.date = date;
        this.gameDate = gameDate;
        this.gameTime = gameTime;
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

    public boolean getState() {
        return state;
    }

    public String getStateAsValue() {
        return String.valueOf(getState());
    }

    public Reservation setState(boolean state) {
        this.state = state;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public String getDateAsValue() {
        return "'" + getDate() + "'";
    }

    public Reservation setDate(Date date) {
        this.date = date;
        return this;
    }

    public Date getGameDate() {
        return gameDate;
    }

    public String getGameDateAsValue() {
        return "'" + getGameDate() + "'";
    }

    public Reservation setGameDate(Date gameDate) {
        this.gameDate = gameDate;
        return this;
    }

    public Date getGameTime() {
        return gameTime;
    }

    public String getGameTimeAsValue() {
        return "'" + getGameTime() + "'";
    }

    public Reservation setGameTime(Date gameTime) {
        this.gameTime = gameTime;
        return this;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public String getOrganizerAsValue() {
        return "'" + getOrganizer() + "'";
    }

    public Reservation setOrganizer(Organizer organizer) {
        this.organizer = organizer;
        return this;
    }

    public Court getCourt() {
        return court;
    }

    public String getCourtAsValue() {
        return "'" + getCourt() + "'";
    }

    public Reservation setCourt(Court court) {
        this.court = court;
        return this;
    }

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
                    .setOrganizer(organizersEntity.findById(resultSet.getInt("organizer_id")))
                    .setCourt(courtsEntity.findById(resultSet.getString("court_id"),ownersEntity,ubigeosEntity,servicesEntity));
            } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
