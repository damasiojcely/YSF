package pe.com.yoursoccerfield.models;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by otoya on 17/06/2017.
 */
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
        String criteria = " id = '"+ id+"'";
        return findByCriteria(criteria).get(0);
    }

    public Organizer findByName(String name) {
        String criteria = " first_name = '" +
                name + "'";
        return findByCriteria(criteria).get(0);
    }

    public List<Organizer> findAllOrderByName() {
        String criteria = "true ORDER BY first_name";
        return findByCriteria(criteria);
    }

      public List<Organizer> findAllById(String id) {
        String criteria = " id = '"+ id+"'";
        return findByCriteria(criteria);
    }
    

    public  boolean findByEmailPassword(String email,String password) {
            boolean st =false;
//            String sql=getDefaultQuery()+" where email=? and password=? ";
            try{
//                Connection con= DriverManager.getConnection
//                        ("jdbc:mysql://localhost:3306/dbsoccer","root","alumno");
                PreparedStatement ps =getConnection().prepareStatement
                        ( "select id from organizers where email=? and password=?" );
                ps.setString(1, email);
                ps.setString(2, password);
                ResultSet rs =ps.executeQuery();
                st = rs.next();
            }catch(Exception e)
            {
                e.printStackTrace();
            }
            return st;
        }

    public boolean findByLogin(Organizer organizer){
        String sql = "SELECT * FROM organizers WHERE email =" +organizer.getEmailAsValue()+ " and password = " + organizer.getPasswordAsValue()+"";
        return change(sql);
    }

   /* public boolean findByEmailPassword(String email,String password){
        String criteria= "email = '"+email+"' and password = '"+password+"'";
        if(findByCriteria(criteria) == null){
            return false;
        }
        return false;
    }*/

    public List<Organizer> findByCriteria(String criteria) {
        String sql = getDefaultQuery() +
                (criteria.isEmpty() ? "" : " WHERE " + criteria);
        List<Organizer> organizers = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) {
                organizers.add(Organizer.build(resultSet));
            }
            return organizers;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(Organizer organizer) {
        String sql = "INSERT INTO organizers (id,first_name, last_name, email, password, dni,photo,phone,position) " +
                "VALUES(" + organizer.getIdAsValue() + ", " + organizer.getFirstNameAsValue()+" ,"+
                organizer.getLastNameAsValue() +", "+organizer.getEmailAsValue()+", "+ organizer.getPasswordAsValue() + ", "+
                organizer.getDniAsValue()+", "+organizer.getPhotoAsValue()+", "+organizer.getPhoneAsValue()+", "+organizer.getPositionAsValue()+ ")";
        return change(sql);
    }

    public boolean delete(Organizer organizer) {
        String sql = "DELETE FROM organizers WHERE id = " + organizer.getIdAsValue();
        return change(sql);
    }

    public boolean updatePass(Organizer organizer) {
        String sql = "UPDATE organizers SET WHERE password = " + organizer.getPasswordAsValue()+
                     " WHERE id = " + organizer.getIdAsValue();
        return change(sql);
    }

    public boolean updatePhoto(Organizer organizer) {
        String sql = "UPDATE organizers SET WHERE photo = " + organizer.getPhotoAsValue()+
                " WHERE id = " + organizer.getIdAsValue();
        return change(sql);
    }

    public boolean update(Organizer organizer) {
        return change("UPDATE organizers SET first_name = " + organizer.getFirstNameAsValue()+
                ", last_name = " + organizer.getLastNameAsValue()+
                ", email = " + organizer.getEmailAsValue() +
                ", password = " + organizer.getPasswordAsValue()+
                ", dni = " + organizer.getDniAsValue() +
                ", photo = " + organizer.getPhotoAsValue() +
                ", phone = " + organizer.getPhoneAsValue() +
                ", position = " + organizer.getPositionAsValue()+
                " WHERE id = " + organizer.getIdAsValue());
    }
}
