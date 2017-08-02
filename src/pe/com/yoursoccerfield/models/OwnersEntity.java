package pe.com.yoursoccerfield.models;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
        super(connection,"owners");
    }


    public Owner findyIdByEmailPassword(String email,String password){
        String criteria= " email = '"+email+"' and password = '"+password+"'";
        return findByCriteria(criteria).get(0);
    }

    public List<Owner> findAllById(String id) {
        String criteria = " id = '"+ id+"'";
        return findByCriteria(criteria);
    }

    public boolean findByEmailPass(String email,String password) {
        boolean s =false;
        try{
            PreparedStatement ps =getConnection().prepareStatement(getDefaultQuery() + " where email=? and password=?" );
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs =ps.executeQuery();
            s = rs.next();
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return s;
    }


    public List<Owner>findByCriteria(String criteria){
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Owner> owners = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet== null) return null;
            while(resultSet.next()){
                owners.add(Owner.build(resultSet));
            }
            return owners;
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

    public boolean add(Owner owner) {
        String sql = "INSERT INTO owners (id,first_name, last_name, email, password, dni,photo,phone,position) " +
                "VALUES(" + owner.getIdAsValue() + ", " + owner.getFirstNameAsValue()+" ,"+
                owner.getLastNameAsValue() +", "+owner.getEmailAsValue()+", "+ owner.getPasswordAsValue() + ", "+
                owner.getDniAsValue()+", "+owner.getPhotoAsValue()+", "+owner.getPhoneAsValue()+", "+owner.getPositionAsValue()+ ")";
        return change(sql);
    }

    public boolean delete(Owner owner){

        return change("DELETE FROM owners WHERE id = " + owner.getIdAsValue());
    }

    public  boolean update(Owner owner){
        return change("UPDATE owners SET first_name = " + owner.getFirstNameAsValue() +
                ", last_name = " + owner.getLastNameAsValue() +
                ", email = " + owner.getEmailAsValue()+
                ", password = " + owner.getPasswordAsValue() +
                ", dni = " + owner.getDniAsValue()+
                ", photo = " + owner.getPhotoAsValue()+
                ", phone = " + owner.getPhoneAsValue()+
                ",position = "+ owner.getPositionAsValue() +
                " WHERE id = " +owner.getIdAsValue());
    }

    public boolean updatePhoto(Owner owner) {
        String sql = "UPDATE owners SET WHERE photo = " + owner.getPhotoAsValue()+
                " WHERE id = " + owner.getIdAsValue();
        return change(sql);
    }

    public boolean updatePass(Owner owner) {
        String sql = "UPDATE owners SET WHERE password = " + owner.getPasswordAsValue()+
                " WHERE id = " + owner.getIdAsValue();
        return change(sql);
    }



}
