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

    public List<Reservation> findByCriteria(String criteria, OrganizersEntity organizersEntity, CourtsEntity courtsEntity,
    OwnersEntity ownersEntity, UbigeosEntity ubigeosEntity, ServicesEntity servicesEntity){
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Reservation> reservation= new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if (resultSet == null) return null;
            while(resultSet.next()){
                reservation.add(Reservation.build(resultSet, organizersEntity,courtsEntity,ownersEntity,ubigeosEntity,servicesEntity));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
/*
    public List<Reservation>findAll(OrganizersEntity organizersEntity){
        return findByCriteria("", organizersEntity);
    }

    public Reservation findById(int id, OrganizersEntity organizersEntity){
        try{
            String sql="id = "+String.valueOf(id);
            return findByCriteria(sql, organizersEntity).get(0);
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }*/


}
