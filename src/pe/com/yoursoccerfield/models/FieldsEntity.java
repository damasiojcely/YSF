package pe.com.yoursoccerfield.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FieldsEntity extends BaseEntity{

    public FieldsEntity(Connection connection) {
        super(connection, "field");
    }

    public FieldsEntity() {
        super();
    }

    public List<Field> findByCriteria(String criteria, OwnersEntity ownersEntity,UbigeosEntity ubigeosEntity) {
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Field> fields = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) fields.add(Field.build(rs, ownersEntity,ubigeosEntity));
            return fields;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return fields;
    }

    public List<Field> findAll(OwnersEntity ownersEntity, UbigeosEntity ubigeosEntity) {
        return findByCriteria("", ownersEntity, ubigeosEntity);
    }

       public Field findById(int id,  OwnersEntity ownersEntity,UbigeosEntity ubigeosEntity) {

        try {
            String  sql = "id = " + String.valueOf(id);
            return findByCriteria(sql, ownersEntity, ubigeosEntity).get(0);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;


    }

    public boolean add(Field field) {
        String sql = "INSERT INTO fields (field_id, name, capacity,address,email,phone,price,photo,type,state,owner_id ,ubigeo_id) VALUES(" +
                field.getId() + ", " +
                field.getName() + ", " +
                field.getCapacity() + ", " +
                field.getAddress()+ ", " +
                field.getEmail()+ ", " +
                field.getPhone()+ ", " +
                field.getPrice()+ ", " +
                field.getPhoto()+ ", " +
                field.getType()+ ", " +
                field.getState()+ ", " +
                field.getOwner().getId()+ ", " +
                field.getUbigeo().getId() + ")";

        return change(sql);
    }

    public boolean update(Field field) {
        String sql = "UPDATE fields SET " +
                "id = " + field.getId() + ", " +
                "name = " + field.getName() + ", " +
               " capacity = " + field.getCapacity() + ", " +
               " address = " + field.getAddress() + ", " +
               "email = " + field.getEmail() + ", " +
               " phone = " + field.getPhone() + ", " +
               " price = " + field.getPrice() + ", " +
               " photo = " + field.getPhoto() + ", " +
               " type = " + field.getType() + ", " +
               "  state = " + field.getState() + ", " +

                "owner_id = " + field.getOwner().getId() +
                "ubigeo_id = " + field.getUbigeo().getId() +
                " WHERE id = " + field.getId();
        return change(sql);
    }

    public boolean delete(Field field) {
        String sql = "DELETE FROM field WHERE id = " +
                field.getId();
        return change(sql);
    }




}
