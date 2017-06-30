package pe.com.yoursoccerfield.models;

import java.sql.Connection;
import java.util.List;

public class HRDataStore {
        private Connection connection;
        private CourtsEntity courtsEntity;
        private OrganizersEntity organizersEntity;
        private OwnersEntity ownersEntity;
        private ParticipantsEntity participantsEntity;
        private ReservationsEntity reservationsEntity;
        private ServicesEntity servicesEntity;
        private UbigeosEntity ubigeosEntity;



    public HRDataStore(Connection connection) {
        this.connection = connection;
    }

    public HRDataStore() {
    }

    public Connection getConnection() {
        return connection;
    }

    public HRDataStore setConnection(Connection connection) {
        this.connection = connection;
        return this;
    }

    public CourtsEntity getCourtsEntity() {
        if(courtsEntity==null){
            courtsEntity = new CourtsEntity(getConnection());
        }
        return courtsEntity;
    }

    public List<Court> findAllCourts(){
        return getCourtsEntity().findAll(getOwnersEntity(),getUbigeosEntity(),getServicesEntity());
    }

    public OrganizersEntity getOrganizersEntity() {
        if(organizersEntity==null){
            organizersEntity = new OrganizersEntity(getConnection());
        }
        return organizersEntity;
    }

    public List<Organizer> findAllOrganizers(){
        return getOrganizersEntity().findAll();
    }

    public OwnersEntity getOwnersEntity() {
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

    public ReservationsEntity getReservationsEntity() {
        if(reservationsEntity==null){
            reservationsEntity = new ReservationsEntity(getConnection());
        }
        return reservationsEntity;
    }

    public List<Reservation> findAllReservations(){
        return getReservationsEntity().findAll(getOrganizersEntity(),getCourtsEntity(),getOwnersEntity(),getUbigeosEntity(),getServicesEntity());
    }

    public ServicesEntity getServicesEntity() {
        if(servicesEntity==null){
            servicesEntity = new ServicesEntity(getConnection());
        }
        return servicesEntity;
    }

    public List<Service> findAllServices(){
        return getServicesEntity().findAll();
    }

    public UbigeosEntity getUbigeosEntity() {
        if(ubigeosEntity==null){
            ubigeosEntity = new UbigeosEntity(getConnection());
        }
        return ubigeosEntity;
    }

    public List<Ubigeo> findAllUbigeos(){
        return getUbigeosEntity().findAll();
    }
}
