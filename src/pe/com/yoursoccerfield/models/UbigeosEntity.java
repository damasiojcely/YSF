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

    public List<Ubigeo> findByCriteria(String criteria) {
        String sql = getDefaultQuery() + (criteria.equalsIgnoreCase("") ? "" : " WHERE " + criteria);
        List<Ubigeo> ubigeos = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if (resultSet == null) return null;
            while (resultSet.next()) {
                ubigeos.add(Ubigeo.build(resultSet));
            }
            return ubigeos;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    /*
    List<Ubigeo>findAllDepartments(){
        String sql = "SELECT distinct department_name from ubigeos";
        List<Ubigeo> ubigeos= new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if (resultSet == null) return null;
            while(resultSet.next()){
                ubigeos.add(Ubigeo.build(resultSet));
            }
            return ubigeos;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }*/

    public Ubigeo findById(String id){
        String criteria = " id = '" + id + "'";
        return findByCriteria(criteria).get(0);
    }


}
