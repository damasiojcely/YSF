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
        super( connection,"reservation");
    }

    public ReservationsEntity() {
        super();
    }

    public List<Reservation> findByCriteria(String criteria, OrganizerEntity organizerEntity){
        String sql = getDefaultQuery() + criteria == "" ? "" : " WHERE " + criteria;
        List<Reservation> reservation= new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if (resultSet == null) return null;
            while(resultSet.next()){
                reservation.add(Reservation.build(resultSet,organizerEntity));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Reservation>findAll(OrganizerEntity organizerEntity){
        return findByCriteria("",organizerEntity);
    }

    public Reservation findById(int id, OrganizerEntity organizerEntity){
        try{
            String sql="id = "+String.valueOf(id);
            return findByCriteria(sql,organizerEntity).get(0);
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }


}
