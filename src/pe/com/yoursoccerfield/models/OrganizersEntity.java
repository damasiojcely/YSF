package pe.com.yoursoccerfield.models;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrganizersEntity extends  BaseEntity{

    public OrganizersEntity(Connection connection) {
        super( connection,"organizers");
    }

    public OrganizersEntity() {
        super();
    }

    List<Organizer> findAll() {
        return findByCriteria("");
    }

    public Organizer findById(String id) {
        String criteria = "id = " + "'" + id + "'";
        return findByCriteria(criteria).get(0);
    }

    public Organizer findByName(String name) {
        String criteria = " first_name = '" +
                name + "'";
        return findByCriteria(criteria).get(0);
    }

    public List<Organizer> findAllOrderedByName() {
        String criteria = "true ORDER BY first_name";
        return findByCriteria(criteria);
    }


    public List<Organizer> findByCriteria(String criteria) {
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Organizer> organizers = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) {
                organizers.add(Organizer.build(resultSet));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return organizers;
    }




}


