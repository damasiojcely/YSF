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

    public List<Court> findAll(OwnersEntity ownersEntity, UbigeosEntity ubigeosEntity,ServicesEntity servicesEntity) {
        return findByCriteria("", ownersEntity, ubigeosEntity,servicesEntity);
    }


    public Court findById(String id, OwnersEntity ownersEntity, UbigeosEntity ubigeosEntity,ServicesEntity servicesEntity) {

        String criteria = "id = " + "'" + id + "'";
        return findByCriteria(criteria, ownersEntity,ubigeosEntity,servicesEntity).get(0);

    }


    public List<Court> findByCriteria(String criteria, OwnersEntity ownersEntity, UbigeosEntity ubigeosEntity,ServicesEntity servicesEntity) {
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Court> courts = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) courts.add(Court.build(rs, ownersEntity, ubigeosEntity,servicesEntity));
            return courts;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return courts;
    }



    public boolean add(Court court) {
        String sql = "INSERT INTO courts (id, name, capacity,address,email,phone,price,photo,type,state,owner_id ,ubigeo_id,service_id) VALUES(" +
                court.getId() + ", " +
                court.getName() + ", " +
                court.getCapacity() + ", " +
                court.getAddress()+ ", " +
                court.getEmail()+ ", " +
                court.getPhone()+ ", " +
                court.getPrice()+ ", " +
                court.getPhoto()+ ", " +
                court.getType()+ ", " +
                court.getState()+ ", " +
                court.getOwner().getId()+ ", " +
                court.getUbigeo().getId() + "," +
                court.getService().getId()+")";

        return change(sql);
    }

    public boolean update(Court court) {
        String sql = "UPDATE courts SET " +
                "id = " + court.getId() + ", " +
                "name = " + court.getName() + ", " +
               " capacity = " + court.getCapacity() + ", " +
               " address = " + court.getAddress() + ", " +
               "email = " + court.getEmail() + ", " +
               " phone = " + court.getPhone() + ", " +
               " price = " + court.getPrice() + ", " +
               " photo = " + court.getPhoto() + ", " +
               " type = " + court.getType() + ", " +
               "  state = " + court.getState() + ", " +

                "owner_id = " + court.getOwner().getId() +
                "ubigeo_id = " + court.getUbigeo().getId() +
                "service_id = " + court.getService().getId() +
                " WHERE id = " + court.getId();
        return change(sql);
    }

    public boolean delete(Court court) {
        String sql = "DELETE FROM court WHERE id = " +
                court.getId();
        return change(sql);
    }




}
