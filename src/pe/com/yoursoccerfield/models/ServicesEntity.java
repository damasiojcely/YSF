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

    List<Service> findAll(CourtsEntity courtsEntity,OwnersEntity ownersEntity,UbigeosEntity ubigeosEntity) {
        return findByCriteria("",courtsEntity,ownersEntity,ubigeosEntity);
    }

    public Service findById(String id,CourtsEntity courtsEntity,OwnersEntity ownersEntity,UbigeosEntity ubigeosEntity) {
        String criteria = " id = '" + id + "'";
        return findByCriteria(criteria,courtsEntity,ownersEntity,ubigeosEntity).get(0);
    }

    public Service findByName(String name,CourtsEntity courtsEntity,OwnersEntity ownersEntity,UbigeosEntity ubigeosEntity) {
        String criteria = " name = '" +name + "'";
        return findByCriteria(criteria,courtsEntity,ownersEntity,ubigeosEntity).get(0);
    }

    public List<Service> findAllOrderByName(CourtsEntity courtsEntity,OwnersEntity ownersEntity,UbigeosEntity ubigeosEntity) {
        String criteria = "true ORDER BY name";
        return findByCriteria(criteria,courtsEntity,ownersEntity,ubigeosEntity);
    }



    public List<Service> findServiceByOwner(String criteria,CourtsEntity courtsEntity,OwnersEntity ownersEntity,UbigeosEntity ubigeosEntity) {
        String sql = " SELECT s.* from owners o , courts c , services s where s.court_id=c.id and c.owner_id=o.id and o.id="+"'"+criteria+"'" ;
        List<Service> services = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) {
                services.add(Service.build(resultSet,courtsEntity,ownersEntity,ubigeosEntity));
            }
            return services;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }




    public List<Service> findByCriteria(String criteria,CourtsEntity courtsEntity,OwnersEntity ownersEntity,UbigeosEntity ubigeosEntity) {
        String sql = getDefaultQuery() +
                (criteria.equalsIgnoreCase("") ? "" : " WHERE " + criteria) ;
        List<Service> services = new ArrayList<>();
        try {
            ResultSet resultSet = getConnection()
                    .createStatement()
                    .executeQuery(sql);
            if(resultSet == null) return null;
            while(resultSet.next()) {
                services.add(Service.build(resultSet,courtsEntity,ownersEntity,ubigeosEntity));
            }
            return services;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public boolean add(Service service) {
        String sql = "INSERT INTO services (id,name,price,court_id) " +
                "VALUES(" + service.getIdAsValue() + ", " + service.getNameAsValue()+" ,"+
                service.getPriceAsString() + ", "+ service.getCourtAsValue()+ ")";
        return change(sql);
    }

    public boolean delete(Service service) {
        String sql = "DELETE FROM services WHERE id = " + service.getIdAsValue();
        return change(sql);
    }


    public boolean update(Service service) {
        String sql = "UPDATE services SET name = " + service.getNameAsValue() +
                ", price = " + service.getPriceAsString()+
                ", court_id = " + service.getCourtAsValue()+
                "WHERE id = " + service.getIdAsValue();
        return change(sql);
    }








}
