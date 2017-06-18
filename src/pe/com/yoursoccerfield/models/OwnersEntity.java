package pe.com.yoursoccerfield.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lnakaya on 6/17/2017.
 */
public class OwnersEntity extends BaseEntity{


    public OwnersEntity() {super();   }

    public OwnersEntity(Connection connection) {
        super(connection,"owner");
    }

    public List<Owner>findByCriteria(String criteria){
        String sql = getDefaultQuery() + criteria == "" ? "" : " WHERE " + criteria;
        List<Owner> owners = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet== null) return null;
            while(resultSet.next()){
                owners.add(Owner.build(resultSet));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    List<Owner>findAll(){
        return findByCriteria("");
    }

    public Owner findById(String id){
        String criteria =  " id = '" + id + "'";
        return findByCriteria(criteria).get(0);
    }

    public Owner findByFisrtName(String firstName){
        String criteria = " first_name = '" + firstName + "'";
        return findByCriteria(criteria).get(0);
    }

    public Owner findByLastName(String lastName){
        String criteria = " last_name = '" + lastName + "'";
        return findByCriteria(criteria).get(0);
    }

    public  boolean add(Owner owner) {
        return change("INSERT INTO owner(id,first_name,last_name,email," +
                "password,dni,photo,phone,position) VALUES (" + owner.getIdAsValue() + "," +
                owner.getFirstNameAsValue() + "," + owner.getLastNameAsValue() + "," +
                owner.getEmailAsValue() + "," + owner.getPasswordAsValue() + "," +
                owner.getDniAsValue() + "," + owner.getPhotoAsValue() + "," +
                owner.getPhoneAsValue() + "," + owner.getPositionAsValue() + ")");
    }

    public boolean delete(Owner owner){
        return change("DELETE FROM owner WHERE id = " + owner.getIdAsValue());
    }

   /* public  boolean update(Owner owner){
        return change("UPDATE owner SET first_name = " + owner.getFirstNameAsValue() +
                ", last_name = " + owner.getLastNameAsValue() + ", email = " +
                owner.getEmailAsValue() + ", password,dni,photo,phone,position")*/

}
