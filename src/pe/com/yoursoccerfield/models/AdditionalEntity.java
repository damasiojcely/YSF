package pe.com.yoursoccerfield.models;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdditionalEntity extends BaseEntity{


    public AdditionalEntity( Connection connection) {
        super(connection, "additionals");
    }

    public  AdditionalEntity() {
        super();
    }

    List<Additional> findAll() {
        return findByCriteria("");
    }

    public Additional findById(int id) {
        String criteria = " id = " +
                String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }

    public Additional findByName(String name) {
        String criteria = " name = '" +
                name + "'";
        return findByCriteria(criteria).get(0);
    }

    public List<Additional> findAllOrderedByName() {
        String criteria = "true ORDER BY name";
        return findByCriteria(criteria);
    }


    public List<Additional> findByCriteria(String criteria) {
        String sql = getDefaultQuery() +
                criteria == "" ? "" : " WHERE " + criteria;
        List<Additional> additional = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) {additional.add((new Additional())
                        .setId(resultSet.getString("id"))
                        .setName(resultSet.getString("name"))
                         .setPrice(resultSet.getFloat("price")));
            }
            return additional;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(Additional additional) {
        String sql = "INSERT INTO additionals (id,name,price) " +
                "VALUES(" + additional.getId() + ", " +additional.getName()+" ,"+
                additional.getPrice() + ")";
        return change(sql);
    }

    public boolean delete(Additional additional) {
        String sql = "DELETE FROM additionals WHERE id = " + additional.getId();
        return change(sql);
    }


    public boolean update(Additional additional) {
        String sql = "UPDATE additionals SET WHERE id = " + additional.getId();
        return change(sql);
    }








}
