package pe.com.yoursoccerfield.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yessenia on 17/06/2017.
 */
public class DetailReservationsEntity extends BaseEntity{

    public DetailReservationsEntity(Connection connection) {
            super( connection,"detailReservation");
        }

    public DetailReservationsEntity() {
            super();
        }

    public List<DetailReservation> findByCriteria(String criteria, ReservationsEntity reservationsEntity, OrganizersEntity organizersEntity){
        String sql = getDefaultQuery() + criteria == "" ? "" : " WHERE " + criteria;
        List<DetailReservation> detailReservations= new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if (resultSet == null) return null;
            while(resultSet.next()){
                detailReservations.add(DetailReservation.build(resultSet, reservationsEntity, organizersEntity));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<DetailReservation>findAll(ReservationsEntity reservationsEntity, OrganizersEntity organizersEntity){
        return findByCriteria("",reservationsEntity,organizersEntity);
    }


    public DetailReservation findById(int id, ReservationsEntity reservationsEntity, OrganizersEntity organizersEntity){
        try{
            String sql="id = "+String.valueOf(id);
            return findByCriteria(sql,reservationsEntity,organizersEntity).get(0);
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
