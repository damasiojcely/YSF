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

    public List<Court> findAllCourts(){
        return getCourtsEntity().findAll(getOwnersEntity(),getUbigeosEntity(),getServicesEntity());
    }

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
/*
    public List<Ubigeo> findAllUbigeos(){
        return getUbigeosEntity().findAll();
    }*/
}
