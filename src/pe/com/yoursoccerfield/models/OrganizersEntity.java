package pe.com.yoursoccerfield.models;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by otoya on 17/06/2017.
 */
public class OrganizersEntity extends  BaseEntity{

    public OrganizersEntity(Connection connection) {
        super( connection,"organizer");
    }

    public OrganizersEntity() {
        super();
    }

    List<Organizer> findAll() {
        return findByCriteria("");
    }

    public Organizer findById(int id) {
        String criteria = " organizer_id = " +
                String.valueOf(id);
        return findByCriteria(criteria).get(0);
    }

    public Organizer findByName(String name) {
        String criteria = " organizer_first_name = '" +
                name + "'";
        return findByCriteria(criteria).get(0);
    }

    public List<Organizer> findAllOrderedByName() {
        String criteria = "true ORDER BY organizer_first_name";
        return findByCriteria(criteria);
    }


    public List<Organizer> findByCriteria(String criteria) {
        String sql = getDefaultQuery() +
                criteria == "" ? "" : " WHERE " + criteria;
        List<Organizer> organizers = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) {
                organizers.add((new Organizer())
                        .setId(resultSet.getString("id"))
                        .setFirstName(resultSet.getString("first_name"))
                        .setLastName(resultSet.getString("last_name")));
            }
            return organizers;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }




}


