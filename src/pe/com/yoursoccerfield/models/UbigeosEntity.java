package pe.com.yoursoccerfield.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lnakaya on 6/17/2017.
 */
public class UbigeosEntity extends BaseEntity{


    public UbigeosEntity(Connection connection) {
        super(connection,"ubigeos");
    }


    public UbigeosEntity() { super(); }

    List<Ubigeo> findAll() {
        return findByCriteria("");
    }

    public Ubigeo findById(String id){
        String criteria = " id = " + "'" + id + "'";
        return findByCriteria(criteria).get(0);
    }

    public List<Ubigeo> findByCriteria(String criteria){
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Ubigeo> ubigeos= new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if (resultSet == null) return null;
            while(resultSet.next()){
                ubigeos.add(Ubigeo.build(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ubigeos;
    }





}
