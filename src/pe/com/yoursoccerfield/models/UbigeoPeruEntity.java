package pe.com.yoursoccerfield.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lnakaya on 6/17/2017.
 */
public class UbigeoPeruEntity extends BaseEntity{


    public UbigeoPeruEntity(Connection connection) {
        super(connection,"ubigeoperu");
    }


    public UbigeoPeruEntity() { super(); }

    public List<UbigeoPeru> findByCriteria(String criteria){
        String sql = getDefaultQuery() + criteria == "" ? "" : " WHERE " + criteria;
        List<UbigeoPeru> ubigeosPeru= new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if (resultSet == null) return null;
            while(resultSet.next()){
                ubigeosPeru.add(UbigeoPeru.build(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    List<UbigeoPeru>findAll(){
        return findByCriteria("");
    }

    public UbigeoPeru fingById(String id){
        String criteria = " id = '" + id + "'";
        return findByCriteria(criteria).get(0);
    }



}
