package pe.com.yoursoccerfield.models;

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

    public List<Court> findAllCourts(){ return getCourtsEntity().findAll(getOwnersEntity(),getUbigeosEntity(),getServicesEntity()); }

    private OrganizersEntity getOrganizersEntity() {
        if(organizersEntity==null){
            organizersEntity = new OrganizersEntity(getConnection());
        }
        return organizersEntity;
    }

    public List<Organizer> findAllOrganizers(){
        return getOrganizersEntity().findAll();
    }

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
        return getReservationsEntity().findAll(getOrganizersEntity(),getCourtsEntity(),getOwnersEntity(),getUbigeosEntity(),getServicesEntity());
    }

    private ServicesEntity getServicesEntity() {
        if(servicesEntity==null){
            servicesEntity = new ServicesEntity(getConnection());
        }
        return servicesEntity;
    }

    public List<Service> findAllServices(){
        return getServicesEntity().findAll();
    }

    private UbigeosEntity getUbigeosEntity() {
        if(ubigeosEntity==null){
            ubigeosEntity = new UbigeosEntity(getConnection());
        }
        return ubigeosEntity;
    }


    public List<Ubigeo> findAllDepartments() { return getUbigeosEntity().findAllDepartments();  }

    public List<Ubigeo> findAllProvinces() {
        return getUbigeosEntity().findAllProvinces();
    }

    public List<Ubigeo> findAllDistricts() {
        return getUbigeosEntity().findAllDistricts();
    }



    public Owner findOwnerById(String id){
        return getOwnersEntity().findById(id);
    }

    public boolean updateOwner(Owner owner){ return getOwnersEntity().update(owner); }

    public Reservation findReservationById(String id){ return getReservationsEntity().findById(id,getOrganizersEntity(),getCourtsEntity(),getOwnersEntity(),getUbigeosEntity(),getServicesEntity()); }

    public boolean updateReservation(Reservation reservation){ return getReservationsEntity().update(reservation); }

    public Court findCourtById(String id){return getCourtsEntity().findById(id,getOwnersEntity(),getUbigeosEntity(),getServicesEntity());}

    public boolean updateCourt(Court court){return getCourtsEntity().update(court);}

    public Organizer findOrganizerById(String id){return getOrganizersEntity().findById(id);}

    public boolean updateOrganizer(Organizer organizer){return getOrganizersEntity().update(organizer);}

    public boolean loginOrganizer(Organizer organizer) {return getOrganizersEntity().login(organizer);}

    public Participant findParticipantById(String id){ return getParticipantsEntity().findById(id,getOrganizersEntity()); }

    public boolean updateParticipant(Participant participant){return getParticipantsEntity().update(participant);}

    public Service findServiceById(String id){ return getServicesEntity().findById(id); }

    public boolean updateService(Service service){return getServicesEntity().update(service);}

    public boolean addCourt(Court court){return getCourtsEntity().add(court);}

    public boolean addOrganizer(Organizer organizer){return getOrganizersEntity().add(organizer);}

    public boolean addOwner(Owner owner){return getOwnersEntity().add(owner);}

    public boolean loginOwner(Owner owner) {return getOwnersEntity().login(owner);}

    public boolean addParticipant(Participant participant){return getParticipantsEntity().add(participant);}

    public boolean addReservation(Reservation reservation){return getReservationsEntity().add(reservation);}

    public boolean addService(Service service){return getServicesEntity().add(service);}

}
