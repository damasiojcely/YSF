package pe.com.yoursoccerfield.models;

import com.sun.org.apache.regexp.internal.RE;

import java.sql.Connection;
import java.util.List;

/**
 * Created by lnakaya on 7/1/2017.
 */
public class YSFDataStore {
    private Connection connection;
    private CourtsEntity courtsEntity;
    private OrganizersEntity organizersEntity;
    private OwnersEntity ownersEntity;
    private ParticipantsEntity participantsEntity;
    private ReservationsEntity reservationsEntity;
    private ServicesEntity servicesEntity;
    private UbigeosEntity ubigeosEntity;


    public YSFDataStore(Connection connection) {
        this.connection= connection;    }

    public YSFDataStore() {
    }

    public Connection getConnection() {
        return connection;
    }

    public YSFDataStore setConnection(Connection connection) {
        this.connection = connection;
        return this;
    }

    private CourtsEntity getCourtsEntity() {
        if(courtsEntity==null){
            courtsEntity = new CourtsEntity(getConnection());
        }
        return courtsEntity;
    }

    public List<Court> findAllCourts(){ return getCourtsEntity().findAll(getOwnersEntity(),getUbigeosEntity()); }

    private OrganizersEntity getOrganizersEntity() {
        if(organizersEntity==null){
            organizersEntity = new OrganizersEntity(getConnection());
        }
        return organizersEntity;
    }

    public List<Organizer> findAllOrganizers(){
        return getOrganizersEntity().findAll();
    }

    public List<Organizer> finAllByIdOrganizers(String id){return getOrganizersEntity().findAllById(id);}

    private OwnersEntity getOwnersEntity() {
        if(ownersEntity==null){
            ownersEntity = new OwnersEntity(getConnection());
        }
        return ownersEntity;
    }

    public List<Owner> findAllOwners(){
        return getOwnersEntity().findAll();
    }

    public ParticipantsEntity getParticipantsEntity() {
        if(participantsEntity==null){
            participantsEntity = new ParticipantsEntity(getConnection());
        }
        return participantsEntity;
    }

    public List<Participant> findAllParticipants(){
        return getParticipantsEntity().findAll(getOrganizersEntity());
    }



    private ReservationsEntity getReservationsEntity() {
        if(reservationsEntity==null){
            reservationsEntity = new ReservationsEntity(getConnection());
        }
        return reservationsEntity;
    }

    public List<Reservation> findAllReservations(){
        return getReservationsEntity().findAll(getOrganizersEntity(),getCourtsEntity(),getOwnersEntity(),getUbigeosEntity());
    }

    private ServicesEntity getServicesEntity() {
        if(servicesEntity==null){
            servicesEntity = new ServicesEntity(getConnection());
        }
        return servicesEntity;
    }

    public List<Service> findAllServices(){
        return getServicesEntity().findAll(getCourtsEntity(),getOwnersEntity(),getUbigeosEntity());
    }

    private UbigeosEntity getUbigeosEntity() {
        if(ubigeosEntity==null){
            ubigeosEntity = new UbigeosEntity(getConnection());
        }
        return ubigeosEntity;
    }

    public List<Ubigeo> findAllUbigeos() { return getUbigeosEntity().findAll(); }


    public Organizer findOrganizerIdByEmail(String email,String password){
        return getOrganizersEntity().findyIdByEmailPassword(email,password);
    }



    public Owner findOwnerById(String id){
        return getOwnersEntity().findById(id);
    }

    public boolean updateOwner(Owner owner){ return getOwnersEntity().update(owner); }

    public Reservation findReservationById(String id){ return getReservationsEntity().findById(id,getOrganizersEntity(),getCourtsEntity(),getOwnersEntity(),getUbigeosEntity()); }

    public boolean updateReservation(Reservation reservation){ return getReservationsEntity().update(reservation); }

    public Court findCourtById(String id){return getCourtsEntity().findById(id,getOwnersEntity(),getUbigeosEntity());}

    public boolean updateCourt(Court court){return getCourtsEntity().update(court);}

    public Organizer findOrganizerById(String id){return getOrganizersEntity().findById(id);}

    public boolean updateOrganizer(Organizer organizer){return getOrganizersEntity().update(organizer);}

    public Participant findParticipantById(String id){ return getParticipantsEntity().findById(id,getOrganizersEntity()); }

    public boolean updateParticipant(Participant participant){return getParticipantsEntity().update(participant);}

    public Service findServiceById(String id){ return getServicesEntity().findById(id,getCourtsEntity(),getOwnersEntity(),getUbigeosEntity()); }

    public boolean updateService(Service service){return getServicesEntity().update(service);}

    public boolean addCourt(Court court){return getCourtsEntity().add(court);}

    public boolean addOrganizer(Organizer organizer){return getOrganizersEntity().add(organizer);}

    public boolean addOwner(Owner owner){return getOwnersEntity().add(owner);}

    public boolean addParticipant(Participant participant){return getParticipantsEntity().add(participant);}

    public boolean addReservation(Reservation reservation){return getReservationsEntity().add(reservation);}

    public boolean addService(Service service){return getServicesEntity().add(service);}

    public Owner findOwnerIdByEmail(String email,String password){
        return getOwnersEntity().findyIdByEmailPassword(email,password);
    }

    public List<Owner> findAllByIdOwners(String id){return  getOwnersEntity().findAllById(id);}

/*    public List<Organizer> findAllOrganizerByOwner(String id){return getOrganizersEntity().findOrganizerByOwner(id);}*/


public List<Service> findAllByServiceOwner(String id){
    return getServicesEntity().findServiceByOwner(id,getCourtsEntity(),getOwnersEntity(),getUbigeosEntity());
}

public List<Reservation> findAllByReservationOwner(String id){
    return getReservationsEntity().findReservationByOwner(id,getOrganizersEntity(),getCourtsEntity(),getOwnersEntity(),getUbigeosEntity());
}


    public List<Participant> findAllParticipantsById(String id){return getParticipantsEntity().findAllId(id,getOrganizersEntity());}

    public List<Court> findAllCourtsByOwner(String id){return getCourtsEntity().findAllId(id,getOwnersEntity(),getUbigeosEntity());}

    public List<Reservation> findAllReservationsById(String id){return getReservationsEntity().findAllById(id,getOrganizersEntity(),
            getCourtsEntity(),getOwnersEntity(),getUbigeosEntity());}


    public List<Organizer> findAllOrganizerByOwner(String id){return getOrganizersEntity().findOrganizerByOwner(id);}




    public boolean findOrganizerByEmail(String email,String password){ return getOrganizersEntity().findByEmailPassword(email,password); }

    public boolean findOwnerByEmail(String email,String password){return getOwnersEntity().findByEmailPass(email,password);}


    public boolean deleteCourt(Court court){ return getCourtsEntity().delete(court);}

    public boolean deleteOrganizer(Organizer organizer){ return getOrganizersEntity().delete(organizer);}

    public boolean deleteOwner(Owner owner){return getOwnersEntity().delete(owner); }

    public boolean deleteParticipant(Participant participant){return getParticipantsEntity().delete(participant);}

    public boolean deleteReservation(Reservation reservation){return getReservationsEntity().delete(reservation);}

    public boolean deleteService(Service service){return getServicesEntity().delete(service);}

}