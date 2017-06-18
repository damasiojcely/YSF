package pe.com.yoursoccerfield.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Pc user on 16/06/2017.
 */

public class DetailReservation {
    private int id;
    private float total;
    private float hours;
    private Reservation reservation;
    private Organizer organizer;

    public DetailReservation() {
    }

    public DetailReservation(int id, float total, float hours, Reservation reservation) {
        this.setId(id);
        this.setTotal(total);
        this.setHours(hours);
        this.setReservation(reservation);
    }


    public int getId() {
        return id;
    }
    public String getIdAsString() {
        return String.valueOf(getId());
    }

    public DetailReservation setId(int id) {
        this.id = id;
        return this;
    }

    public float getTotal() {
        return total;
    }
    public String getTotalAsString() {
        return String.valueOf(getTotal());
    }

    public DetailReservation setTotal(float total) {
        this.total = total;
        return this;
    }

    public float getHours() {
        return hours;
    }
    public String getHoursAsString() {
        return String.valueOf(getHours());
    }

    public DetailReservation setHours(float hours) {
        this.hours = hours;
        return this;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public String getReservationAsValue() {
        return "'" + getReservation() + "'";
    }


    public DetailReservation setReservation(Reservation reservation) {
        this.reservation = reservation;
        return this;
    }

    public Organizer getOrganizer() {
        return organizer;
    }
    public String getOrganizerAsValue() {
        return "'" + getOrganizer() + "'";
    }

    public DetailReservation setOrganizer(Organizer organizer) {
        this.organizer = organizer;
        return this;
    }

    public static DetailReservation build(ResultSet resultSet, ReservationsEntity reservationsEntity, OrganizersEntity organizersEntity) {
        try {
            return (new DetailReservation())
                    .setId(resultSet.getInt("id"))
                    .setTotal(resultSet.getFloat("total"))
                    .setHours(resultSet.getFloat("hours"))
                    //.setFieldAddi(fieldAddiEntity.findById(resultSet.getArray("id")));
                    .setReservation(reservationsEntity.findById(resultSet.getInt("reservation_id"), organizersEntity));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}