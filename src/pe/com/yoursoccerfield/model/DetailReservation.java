package pe.com.yoursoccerfield.model;

/**
 * Created by Pc user on 16/06/2017.
 */

public class DetailReservation {
    private int id;
    private float total;
    private float hours;
    private FieldAddi fieldAddi;
    private Reservation reservation;

    public DetailReservation() {
    }

    public DetailReservation(int id, float total, float hours, FieldAddi fieldAddi, Reservation reservation) {
        this.setId(id);
        this.setTotal(total);
        this.setHours(hours);
        this.setFieldAddi(fieldAddi);
        this.setReservation(reservation);
    }


    public int getId() {
        return id;
    }

    public DetailReservation setId(int id) {
        this.id = id;
        return this;
    }

    public float getTotal() {
        return total;
    }

    public DetailReservation setTotal(float total) {
        this.total = total;
        return this;
    }

    public float getHours() {
        return hours;
    }

    public DetailReservation setHours(float hours) {
        this.hours = hours;
        return this;
    }

    public FieldAddi getFieldAddi() {
        return fieldAddi;
    }

    public DetailReservation setFieldAddi(FieldAddi fieldAddi) {
        this.fieldAddi = fieldAddi;
        return this;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public DetailReservation setReservation(Reservation reservation) {
        this.reservation = reservation;
        return this;
    }
}