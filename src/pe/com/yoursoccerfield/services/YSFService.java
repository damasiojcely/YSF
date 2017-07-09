package pe.com.yoursoccerfield.services;

import pe.com.yoursoccerfield.models.*;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import javax.swing.plaf.synth.Region;
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

    public Owner getOwnerById(String id){
        return getDataStore().findOwnerById(id);
    }

    public boolean updateOwner(Owner owner){
        return getDataStore().updateOwner(owner);
    }

    public Reservation getReservationById(String id){
        return getDataStore().findReservationById(id);
    }

    public boolean updateReservation(Reservation reservation){
        return getDataStore().updateReservation(reservation);
    }

    public Court getCourtById(String id){return getDataStore().findCourtById(id);}

    public boolean updateCourt(Court court){return getDataStore().updateCourt(court);}

    public Organizer getOrganizerById(String id){return getDataStore().findOrganizerById(id);}

    public boolean updateOrganizer(Organizer organizer){return getDataStore().updateOrganizer(organizer);}

    public Participant getParticipantById(String id){return getDataStore().findParticipantById(id);}

    public boolean updateParticipant(Participant participant){return getDataStore().updateParticipant(participant);}

    public Service getServiceById(String id){return getDataStore().findServiceById(id);}
    public boolean updateService(Service service){return getDataStore().updateService(service);}

     public boolean addCourt(Court court){return getDataStore().addCourt(court); }

     public boolean addOrganizer(Organizer organizer){return getDataStore().addOrganizer(organizer);}

     public boolean addOwner(Owner owner){return getDataStore().addOwner(owner); }

     public boolean addParticipant(Participant participant){return getDataStore().addParticipant(participant);}

     public boolean addReservation(Reservation reservation){return getDataStore().addReservation(reservation); }

     public boolean addService(Service service){return getDataStore().addService(service);}

     public boolean loginOrganizer(Organizer organizer){return getDataStore().loginOrganizer(organizer);}

     public boolean loginOwner(Owner owner){return getDataStore().loginOwner(owner);}

    public List<Ubigeo> getUbigeosD(){ return getDataStore().findAllDepartments();}

    public List<Ubigeo> getUbigeosP(){ return getDataStore().findAllProvinces();}

    public List<Ubigeo> getUbigeosDi(){ return getDataStore().findAllDistricts();}



}
