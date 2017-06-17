package pe.com.yoursoccerfield.model;

import java.util.Date;

/**
 * Created by Pc user on 16/06/2017.
 */
public class Reservation {
    private int id;
    private boolean state;
    private Date date;
    private Date gameDate;
    private Date gameTime;
    private Organizer organizer;
    private Field field;

    public Reservation() {
    }

    public Reservation(int id, boolean state, Date date, Date gameDate, Date gameTime, Organizer organizer, Field field) {
        this.id = id;
        this.state = state;
        this.date = date;
        this.gameDate = gameDate;
        this.gameTime = gameTime;
        this.organizer = organizer;
        this.setField(field);
    }


    public int getId() {
        return id;
    }

    public Reservation setId(int id) {
        this.id = id;
        return this;
    }

    public boolean isState() {
        return state;
    }

    public Reservation setState(boolean state) {
        this.state = state;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Reservation setDate(Date date) {
        this.date = date;
        return this;
    }

    public Date getGameDate() {
        return gameDate;
    }

    public Reservation setGameDate(Date gameDate) {
        this.gameDate = gameDate;
        return this;
    }

    public Date getGameTime() {
        return gameTime;
    }

    public Reservation setGameTime(Date gameTime) {
        this.gameTime = gameTime;
        return this;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public Reservation setOrganizer(Organizer organizer) {
        this.organizer = organizer;
        return this;
    }

    public Field getField() {
        return field;
    }

    public Reservation setField(Field field) {
        this.field = field;
        return this;
    }
}
