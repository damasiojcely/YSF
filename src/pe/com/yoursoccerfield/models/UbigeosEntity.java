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
        String sql = getDefaultQuery() + " GROUP BY "+ criteria;
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


    List<Ubigeo>findAllDepartments(){
        String criteria = "department_name";
        return findByCriteria(criteria);
    }

    List<Ubigeo>findAllProvinces(){
        String criteria = "province_name";
        return findByCriteria(criteria);
    }
    List<Ubigeo>findAllDistricts(){
        String criteria = "district_name";
        return findByCriteria(criteria);
    }


    public Ubigeo findById(String id){
        String criteria = " id = '" + id + "'";
        return findByCriteria(criteria).get(0);
    }


}
