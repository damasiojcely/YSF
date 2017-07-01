package pe.com.yoursoccerfield.services;

import pe.com.yoursoccerfield.models.*;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by lnakaya on 7/1/2017.
 */
public class YSFService {
    private Connection connection;
    private YSFDataStore dataStore;

    public YSFService(InitialContext ctx) {
        try {
            connection = ((DataSource) ctx.lookup("jdbc/MySQLDataSource2"))
                    .getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
    public YSFService(){
        try{
            InitialContext ctx = new InitialContext();
            connection = ((DataSource) ctx.lookup("jdbc/MySQLDataSource2")).getConnection();
        } catch (NamingException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection getConnection() {
        return connection;
    }

    private YSFDataStore getDataStore() {
        if(dataStore == null) {
            dataStore = new YSFDataStore(getConnection());
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
