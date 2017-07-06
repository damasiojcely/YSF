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

    public Service findById(String id) {
        String criteria = " id = '" + id + "'";
        return findByCriteria(criteria).get(0);
    }

    public Service findByName(String name) {
        String criteria = " name = '" +name + "'";
        return findByCriteria(criteria).get(0);
    }

    public List<Service> findAllOrderByName() {
        String criteria = "true ORDER BY name";
        return findByCriteria(criteria);
    }
    


    public List<Service> findByCriteria(String criteria) {
        String sql = getDefaultQuery() +
                (criteria.equalsIgnoreCase("") ? "" : " WHERE " + criteria);
        List<Service> services = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) {
                services.add(Service.build(resultSet));
            }
            return services;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(Service service) {
        String sql = "INSERT INTO services (id,name,price) " +
                "VALUES(" + service.getIdAsValue() + ", " + service.getNameAsValue()+" ,"+
                service.getPriceAsString() + ")";
        return change(sql);
    }

    public boolean delete(Service service) {
        String sql = "DELETE FROM services WHERE id = " + service.getIdAsValue();
        return change(sql);
    }


    public boolean update(Service service) {
        String sql = "UPDATE services SET name = " + service.getNameAsValue() +
                ", price = " + service.getPriceAsString()+
                "WHERE id = " + service.getIdAsValue();
        return change(sql);
    }








}
