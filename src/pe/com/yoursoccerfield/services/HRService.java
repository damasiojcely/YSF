package pe.com.yoursoccerfield.services;

import pe.com.yoursoccerfield.models.HRDataStore;
import pe.com.yoursoccerfield.models.Court;
import pe.com.yoursoccerfield.models.Organizer;
import pe.com.yoursoccerfield.models.Owner;
import pe.com.yoursoccerfield.models.Participant;
import pe.com.yoursoccerfield.models.Service;
import pe.com.yoursoccerfield.models.Ubigeo;
import pe.com.yoursoccerfield.models.Reservation;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.util.List;
import java.sql.SQLException;


public class HRService {
    private Connection connection;
    private HRDataStore dataStore;

    public HRService(InitialContext ctx) {
        try {
            connection = ((DataSource) ctx.lookup("jdbc/MySQLDataSource"))
                    .getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
    public HRService(){
        try{
            InitialContext ctx = new InitialContext();
            connection = ((DataSource) ctx.lookup("jdbc/MySQLDataSource")).getConnection();
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() {
        return connection;
    }

    private HRDataStore getDataStore() {
        if(dataStore == null) {
            dataStore = new HRDataStore(getConnection());
        }
        return dataStore;
    }

    public List<Organizer> getOrganizers(){
        return getDataStore().findAllOrganizers();
    }

    public List<Court> getCourts(){
        return getDataStore().findAllCourts();
    }

    public List<Owner> getOwners(){
        return getDataStore().findAllOwners();
    }

    public List<Participant> getParticipants(){
        return getDataStore().findAllParticipants();
    }

    public List<Reservation> getReservations() {return getDataStore().findAllReservations();}

    public List<Service> getServices(){
        return getDataStore().findAllServices();
    }

    public List<Ubigeo> getUbigeos(){
        return getDataStore().findAllUbigeos();
    }


}