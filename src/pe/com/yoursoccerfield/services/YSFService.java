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
/*ORGANIZERS*/
    public List<Organizer> getOrganizers(){
        return getDataStore().findAllOrganizers();
    }

    public Organizer getOrganizerById(String id){return getDataStore().findOrganizerById(id);}

    public boolean updateOrganizer(Organizer organizer){return getDataStore().updateOrganizer(organizer);}

    public boolean getOrganizerByEmail(String email,String password){
        return getDataStore().findOrganizerByEmail(email,password);
    }

    public boolean deleteOrganizer(Organizer organizer){return getDataStore().deleteOrganizer(organizer);}

    public boolean addOrganizer(Organizer organizer){return getDataStore().addOrganizer(organizer);}

    public boolean loginOrganizer(Organizer organizer){return getDataStore().findOrganizerByLogin(organizer);}

/*COURTS*/

    public boolean getOwnerByEmail(String email, String password){
    return getDataStore().findOwnerByEmail(email,password);
    }

    public List<Court> getCourts(){
        return getDataStore().findAllCourts();
    }

    public boolean deleteCourt(Court court){return getDataStore().deleteCourt(court);}

    public Court getCourtById(String id){return getDataStore().findCourtById(id);}

    public Court getCourtByOwner(String ownerId) {return  getDataStore().findCourtByOwner(ownerId);}

    public boolean updateCourt(Court court){return getDataStore().updateCourt(court);}

    public boolean addCourt(Court court){return getDataStore().addCourt(court); }


/*OWNERS*/

    public List<Owner> getOwners(){
        return getDataStore().findAllOwners();
    }

    public Owner getOwnerById(String id){
        return getDataStore().findOwnerById(id);
    }

    public boolean updateOwner(Owner owner){
        return getDataStore().updateOwner(owner);
    }

    public boolean deleteOwner(Owner owner){return getDataStore().deleteOwner(owner);}

    public boolean addOwner(Owner owner){return getDataStore().addOwner(owner); }

    public boolean loginOwner(Owner owner){return getDataStore().findOwnerByLogin(owner);}

 /*PARTICIPANTS*/

    public List<Participant> getParticipants(){
        return getDataStore().findAllParticipants();
    }

    public boolean addParticipant(Participant participant){return getDataStore().addParticipant(participant);}

    public Participant getParticipantById(String id){return getDataStore().findParticipantById(id);}

    public boolean updateParticipant(Participant participant){return getDataStore().updateParticipant(participant);}

    public boolean deleteParticipant(Participant participant){ return getDataStore().deleteParticipant(participant);}

/*RESERVATIONS*/

    public List<Reservation> getReservations() {return getDataStore().findAllReservations();}

    public Reservation getReservationById(String id){
        return getDataStore().findReservationById(id);
    }

    public boolean updateReservation(Reservation reservation){
        return getDataStore().updateReservation(reservation);
    }

    public boolean addReservation(Reservation reservation){return getDataStore().addReservation(reservation); }


/*SERVICES*/

    public List<Service> getServices(){
        return getDataStore().findAllServices();
    }

    public Service getServiceById(String id){return getDataStore().findServiceById(id);}

    public boolean deleteReservation(Reservation reservation){return getDataStore().deleteReservation(reservation);}

    public boolean updateService(Service service){return getDataStore().updateService(service);}

    public boolean addService(Service service){return getDataStore().addService(service);}

    public boolean deleteService(Service service){return getDataStore().deleteService(service);}


/*UBIGEO*/
    public List<Ubigeo> getUbigeosD(){ return getDataStore().findAllDepartments();}

    public List<Ubigeo> getUbigeosP(){ return getDataStore().findAllProvinces();}

    public List<Ubigeo> getUbigeosDi(){ return getDataStore().findAllDistricts();}







}