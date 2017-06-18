package pe.com.yoursoccerfield.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FieldEntity extends BaseEntity{

    public FieldEntity(Connection connection) {
        super(connection, "field");
    }

    public FieldEntity() {
        super();
    }

    public List<Field> findAll(OwnerEntity ownerEntity,UbigeoPeruEntity ubigeoPeruEntity) {
        return findByCriteria("", ownerEntity,ubigeoPeruEntity);
    }

    public Field findById(int id,  OwnerEntity ownerEntity,UbigeoPeruEntity ubigeoPeruEntity) {

        try {
            String  sql = "id = " + String.valueOf(id);
            return findByCriteria(sql, ownerEntity, ubigeoPeruEntity).get(0);
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;


    }


    public List<Field> findByCriteria(String criteria, OwnerEntity ownerEntity,UbigeoPeruEntity ubigeoPeruEntity) {
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Field> F = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) F.add(Field.build(rs, OwnerEntity,UbigeoPeruEntity));
            return F;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return F;
    }

    public boolean add(Field field) {
        String sql = "INSERT INTO field (field_id, name, capacity,address,email,phone,price,photo,type,state,owner_id ,ubigeo_id) VALUES(" +
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
                field.getUbigeoPeru().getId() + ")";

        return change(sql);
    }

    public boolean update(Field field) {
        String sql = "UPDATE field SET " +
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
                "ubigeo_id = " + field.getUbigeoPeru().getId() +
                " WHERE id = " + field.getId();
        return change(sql);
    }

    public boolean delete(Field field) {
        String sql = "DELETE FROM field WHERE id = " +
                field.getId();
        return change(sql);
    }




}