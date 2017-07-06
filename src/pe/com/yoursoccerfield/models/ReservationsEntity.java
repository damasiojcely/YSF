package pe.com.yoursoccerfield.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yessenia on 17/06/2017.
 */
public class ReservationsEntity extends BaseEntity {

    public ReservationsEntity(Connection connection) {
        super( connection,"reservations");
    }

    public ReservationsEntity() {
        super();
    }

    public List<Reservation> findAll(OrganizersEntity organizersEntity,
                                     CourtsEntity courtsEntity,
                                     OwnersEntity ownersEntity,
                                     UbigeosEntity ubigeosEntity,
                                     ServicesEntity servicesEntity){
        return findByCriteria("",organizersEntity,courtsEntity,ownersEntity,ubigeosEntity,servicesEntity);
    }

    public Reservation findById(String id,
                                OrganizersEntity organizersEntity,
                                CourtsEntity courtsEntity,
                                OwnersEntity ownersEntity,
                                UbigeosEntity ubigeosEntity,
                                ServicesEntity servicesEntity){
        String criteria = "id = " + "'" + id + "'";
        return findByCriteria(criteria,organizersEntity,courtsEntity,ownersEntity,ubigeosEntity,servicesEntity).get(0);
    }



    public List<Reservation> findByCriteria(
            String criteria,OrganizersEntity organizersEntity,
            CourtsEntity courtsEntity,OwnersEntity ownersEntity,
            UbigeosEntity ubigeosEntity,ServicesEntity servicesEntity){

        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Reservation> reservations = new ArrayList<>();

        try {
            ResultSet resultSet = getConnection().createStatement().executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) {
                reservations.add(Reservation.build(resultSet,organizersEntity,courtsEntity,ownersEntity,ubigeosEntity,servicesEntity));
            }
            return reservations;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }

    public  boolean add(Reservation reservation) {
        return change("INSERT INTO reservations(id,created_date,state,game_time,hours,total,organizer_id,court_id" +
                "VALUES (" + reservation.getIdAsString() + "," +
                reservation.getCreateDateAsValue() + "," + reservation.getStateAsString() + "," +
                reservation.getGameTimeAsValue() + "," + reservation.getHoursAsString() + "," + reservation.getTotalAsString() +
                reservation.getOrganizer().getIdAsValue()+reservation.getCourt().getIdAsValue()+
                ")");
    }


    public boolean delete(Reservation reservation){

        return change("DELETE FROM reservations WHERE id = " + reservation.getIdAsString());
    }

    public  boolean update(Reservation reservation){
        return change("UPDATE reservations SET created_date = " + reservation.getCreateDateAsValue() +
                ", state = " + reservation.getStateAsString() +
                ", game_time = " + reservation.getGameTimeAsValue()+
                ", hours = " + reservation.getHoursAsString()+
                ", total = "+ reservation.getTotalAsString() +
                ", organizer_id = " + reservation.getOrganizer().getIdAsValue() +
                ", court_id = " + reservation.getCourt().getIdAsValue() +
                " WHERE id = " + reservation.getIdAsString());
    }


}
