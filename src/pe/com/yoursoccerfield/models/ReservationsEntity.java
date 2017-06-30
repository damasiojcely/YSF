package pe.com.yoursoccerfield.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReservationsEntity extends BaseEntity {


    public ReservationsEntity(Connection connection) {
        super(connection,"reservations");
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



    public List<Reservation> findByCriteria(
            String criteria,OrganizersEntity organizersEntity,
            CourtsEntity courtsEntity,OwnersEntity ownersEntity,
            UbigeosEntity ubigeosEntity,ServicesEntity servicesEntity){

        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Reservation> reservations = new ArrayList<>();

        try {
            ResultSet resultSet = getConnection().createStatement().executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) reservations.add(Reservation.build(resultSet,organizersEntity,courtsEntity,ownersEntity,ubigeosEntity,servicesEntity));
            return reservations;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return reservations;

    }

}

