package pe.com.yoursoccerfield.models;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServicesEntity extends BaseEntity{


    public ServicesEntity(Connection connection) {
        super(connection, "services");
    }

    public ServicesEntity() {
        super();
    }

    List<Service> findAll() {
        return findByCriteria("");
    }

    public Service findById(int id) {
        String criteria = " id = " +
                String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }

    public Service findByName(String name) {
        String criteria = " name = '" +
                name + "'";
        return findByCriteria(criteria).get(0);
    }

    public List<Service> findAllOrderedByName() {
        String criteria = "true ORDER BY name";
        return findByCriteria(criteria);
    }


    public List<Service> findByCriteria(String criteria) {
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Service> services = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) {
                services.add((new Service())
                        .setId(resultSet.getString("id"))
                        .setName(resultSet.getString("name"))
                         .setPrice(resultSet.getFloat("price")));
            }
            return services;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return services;
    }

    public boolean add(Service service) {
        String sql = "INSERT INTO additionals (id,name,price) " +
                "VALUES(" + service.getId() + ", " + service.getName()+" ,"+
                service.getPrice() + ")";
        return change(sql);
    }

    public boolean delete(Service service) {
        String sql = "DELETE FROM additionals WHERE id = " + service.getId();
        return change(sql);
    }


    public boolean update(Service service) {
        String sql = "UPDATE additionals SET WHERE id = " + service.getId();
        return change(sql);
    }








}
