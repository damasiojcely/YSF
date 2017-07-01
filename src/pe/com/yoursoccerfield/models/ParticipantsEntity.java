package pe.com.yoursoccerfield.models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by otoya on 17/06/2017.
 */

public class ParticipantsEntity extends BaseEntity {

    public ParticipantsEntity(Connection connection) {
        super(connection, "participants");
    }

    public ParticipantsEntity() {
        super();
    }

    public List<Participant> findAll(OrganizersEntity organizersEntity) {
        return findByCriteria("", organizersEntity);
    }

    public Participant findById(String id,  OrganizersEntity organizersEntity) {
        String criteria = "id = " + "'" + id + "'";
        return findByCriteria(criteria, organizersEntity).get(0);
    }

    public List<Participant> findByCriteria(String criteria, OrganizersEntity organizersEntity) {
        String sql = getDefaultQuery() + (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Participant> participants = new ArrayList<>();
        try {
            ResultSet rs = getConnection().createStatement().executeQuery(sql);
            if(rs == null) return null;
            while(rs.next()) participants.add(Participant.build(rs, organizersEntity));
            return participants;
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return participants;
    }

    public List<Participant> findByOrganizer(Organizer organizer, OrganizersEntity organizersEntity) {
        String criteria = "organizer_id = " + organizer.getIdAsValue();
        return findByCriteria(criteria, organizersEntity);
    }

    public List<Participant> findAllOrderByFirstName(OrganizersEntity organizersEntity, boolean isAscending) {
        return findByCriteria("true ORDER BY first_name" +
                (isAscending ? "" : " DESC"), organizersEntity );
    }

    public List<Participant> findAllOrderByLastName(OrganizersEntity organizersEntity, boolean isAscending) {
        return findByCriteria("true ORDER BY last_name" +
                (isAscending ? "" : " DESC"), organizersEntity );
    }

    public boolean add(Participant participant) {
        String sql = "INSERT INTO participants(id, first_name, last_name,email,position,organizer_id) VALUES(" +
                participant.getIdAsValue() + ", " +
                participant.getFirstNameAsValue() + ", " +
                participant.getLastNameAsValue() + ", " +
                participant.getEmailAsValue()+","+
                participant.getPositionAsValue()+","+
                participant.getOrganizer().getIdAsValue() + ")";
        return change(sql);
    }

    public boolean update(Participant participant) {
        String sql = "UPDATE participants SET " +
                "first_name = " + participant.getFirstNameAsValue() + ", " +
               "last_name = "+ participant.getLastNameAsValue() + ", " +
                "email="+ participant.getEmailAsValue()+","+
                "position="+ participant.getPositionAsValue()+"'"+
                "organizer_id = " + participant.getOrganizer().getIdAsValue() +
                " WHERE participant_id = " + participant.getIdAsValue();
        return change(sql);
    }

    public boolean delete(Participant participant) {
        String sql = "DELETE FROM participants WHERE id = " +
                participant.getIdAsValue();
        return change(sql);
    }

    public boolean delete(String id) {
        String sql = "DELETE FROM participants WHERE id = " +
                "'" + id + "'";
        return change(sql);
    }


}
