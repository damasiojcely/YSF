package pe.com.yoursoccerfield.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class OwnersEntity extends BaseEntity{

    public OwnersEntity(Connection connection) { super(connection,"owners"); }

    public OwnersEntity() {super();   }

    List<Owner> findAll(){ return findByCriteria(""); }

    public Owner findById(String id){
        String criteria = "id = " + "'" + id + "'";
        return findByCriteria(criteria).get(0);
    }


    public Owner findByFisrtName(String firstName){
        String criteria = " first_name = '" + firstName + "'";
        return findByCriteria(criteria).get(0);
    }

    public List<Owner> findByCriteria(String criteria){
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Owner> owners = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()){
                owners.add(Owner.build(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return owners;
    }




}
