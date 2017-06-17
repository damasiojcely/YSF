package pe.com.yoursoccerfield.models;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by otoya on 17/06/2017.
 */
public class OrganizerEntity {

    public OrganizerEntity(Connection connection) {
        super( connection,"organizer");
    }

    public OrganizerEntity() {
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
        List<Organizer> regions = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) {
                regions.add((new Organizer())
                        .setId(resultSet.getInt("organizer_id"))
                        .setFirstName(resultSet.getString("organizer_first_name"))
                        .setLastName(resultSet.getString("organizer_last_name"));
            }
            return regions;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public boolean add(Organizer organizer) {
        String sql = "INSERT INTO organizer(organizer_id, organizer_first_name,organizer_last_name) " +
                "VALUES(" + organizer.getIdAsString() + ", "
                organizer.getFirstName() + ", "
                organizer.getLastName();
        return change(sql);
    }

    public boolean delete(Organizer organizer) {
        String sql = "DELETE FROM regions WHERE organizer_id = " + organizer.getIdAsString();
        return change(sql);
    }

    public boolean delete(String name) {
        return change("DELETE FROM regions WHERE organizer_first_name = " +
                "'" + name + "'");
    }

    public boolean update(Organizer organizer) {
        String sql = "UPDATE organizer SET organizer_first_name = " + organizer.getFirstName() +
                " WHERE organizer_id = " + organizer.getIdAsString();
        return change(sql);
    }
}


