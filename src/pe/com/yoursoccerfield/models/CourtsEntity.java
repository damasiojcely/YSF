package pe.com.yoursoccerfield.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CourtsEntity extends BaseEntity{

    public CourtsEntity(Connection connection) {
        super(connection, "courts");
    }

    public CourtsEntity() {
        super();
    }


    public List<Court> findAllId(String id,OwnersEntity ownersEntity,UbigeosEntity ubigeosEntity) {
        String criteria = " owner_id = '"+id+"'";
        return findByCriteria(criteria,ownersEntity,ubigeosEntity);
    }


    public List<Court> findByCriteria(String criteria, OwnersEntity ownersEntity, UbigeosEntity ubigeosEntity) {
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Court> courts = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) courts.add(Court.build(rs, ownersEntity,ubigeosEntity));
            return courts;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Court> findAll(OwnersEntity ownersEntity, UbigeosEntity ubigeosEntity) {
        return findByCriteria("", ownersEntity, ubigeosEntity);
    }

    public Court findById(String id, OwnersEntity ownersEntity, UbigeosEntity ubigeosEntity) {
        try {
            String  sql = "id = '" + id + "'";
            return findByCriteria(sql, ownersEntity, ubigeosEntity).get(0);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(Court court) {
        String sql = "INSERT INTO courts(id, name, capacity,address,email,phone,price,photo," +
                "type,state,owner_id ,ubigeo_id) VALUES(" +
                court.getIdAsValue() + ", " +
                court.getNameAsValue() + ", " +
                court.getCapacityAsString() + ", " +
                court.getAddressAsValue()+ ", " +
                court.getEmailAsValue()+ ", " +
                court.getPhoneAsValue()+ ", " +
                court.getPriceAsString()+ ", " +
                court.getPhotoAsValue()+ ", " +
                court.getTypeAsString()+ ", " +
                court.getStateAsString()+ ", " +
                court.getOwner().getIdAsValue()+ ", " +
                court.getUbigeo().getIdAsValue() + ")" ;
        return change(sql);
    }

    public boolean update(Court court) {
        String sql = "UPDATE courts SET name = " + court.getNameAsValue() +
               ", capacity = " + court.getCapacityAsString() +
               ", address = " + court.getAddressAsValue() +
               ", email = " + court.getEmailAsValue() +
               ", phone = " + court.getPhoneAsValue() +
               ", price = " + court.getPriceAsString() +
               ", photo = " + court.getPhotoAsValue() +
               ", type = " + court.getTypeAsString() +
               ", state = " + court.getStateAsString() +
               ", owner_id = " + court.getOwner().getIdAsValue() +
               ", ubigeo_id = " + court.getUbigeo().getIdAsValue() +
                " WHERE id = " + court.getIdAsValue();
        return change(sql);
    }

    public boolean delete(Court court) {
        String sql = "DELETE FROM courts WHERE id = " +
                court.getIdAsValue();
        return change(sql);
    }




}
