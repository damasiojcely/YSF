package pe.com.yoursoccerfield.models;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdditionalEntity extends BaseEntity{


    public AdditionalEntity( Connection connection) {
        super(connection, "additional");
    }

    public  AdditionalEntity() {
        super();
    }

    List<Additional> findAll() {
        return findByCriteria("");
    }

    public Additional findById(int id) {
        String criteria = " region_id = " +
                String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }

    public Additional findByName(String name) {
        String criteria = " region_name = '" +
                name + "'";
        return findByCriteria(criteria).get(0);
    }

    public List<Additional> findAllOrderedByName() {
        String criteria = "true ORDER BY region_name";
        return findByCriteria(criteria);
    }


    public List<Additional> findByCriteria(String criteria) {
        String sql = getDefaultQuery() +
                criteria == "" ? "" : " WHERE " + criteria;
        List<Additional> additionals = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) {additionals.add((new Additional())
                        .setId(resultSet.getString("id"))
                        .setName(resultSet.getString("name"))
                         .setPrice(resultSet.getFloat("price")));
            }
            return additionals;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(Additional additional) {
        String sql = "INSERT INTO additional (id,name,price) " +
                "VALUES(" + additional.getId() + ", " +additional.getName()+" ,"+
                additional.getPrice() + ")";
        return change(sql);
    }

    public boolean delete(Additional additional) {
        String sql = "DELETE FROM additional WHERE id = " + additional.getId();
        return change(sql);
    }


    public boolean update(Additional additional) {
        String sql = "UPDATE additional SET WHERE region_id = " + additional.getId();
        return change(sql);
    }








}
