package pe.com.yoursoccerfield.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by lnakaya on 29/06/2017.
 */
public class Court {
    private String id;
    private String name;
    private int capacity;
    private String address;
    private String email;
    private String phone;
    private float price;
    private String photo;
    private int type;
    private boolean state;
    private Owner owner;
    private Ubigeo ubigeo;
    private Service service;

    public Court() {
    }

    public Court(String id, String name, int capacity, String address, String email, String phone, float price, String photo, int type, boolean state, Owner owner, Ubigeo ubigeo, Service service) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.price = price;
        this.photo = photo;
        this.type = type;
        this.state = state;
        this.owner = owner;
        this.ubigeo = ubigeo;
        this.service = service;
    }

    public String getId() {return id;}
    public String getIdAsValue() { return "'" + getId() + "'";}
    public Court setId(String id) {this.id = id;
        return this;}

    public String getName() {return name;}
    public String getNameAsValue() { return "'" + getName() + "'";}
        public Court setName(String name) {this.name = name;
        return this;}

    public int getCapacity() {return capacity;}
    public String getCapacityAsString() {return String.valueOf(getCapacity());}
    public Court setCapacity(int capacity) {this.capacity = capacity;
        return this;}

    public String getAddress() {return address;}
    public String getAddressAsValue() { return "'" + getAddress() + "'";}
    public Court setAddress(String address) {this.address = address;
        return this;}

    public String getEmail() {return email;}
    public String getEmailAsValue() { return "'" + getEmail() + "'";}
    public Court setEmail(String email) {this.email = email;
        return this;}

    public String getPhone() {return phone;}
    public String getPhoneAsValue() { return "'" + getPhone() + "'";}
    public Court setPhone(String phone) {this.phone = phone;
        return this;}

    public float getPrice() {return price;}
    public String getPriceAsString() {return String.valueOf(getPrice());}
    public Court setPrice(float price) {this.price = price;
        return this;}

    public String getPhoto() {return photo;}
    public String getPhotoAsValue() { return "'" + getPhoto() + "'";}
    public Court setPhoto(String photo) {this.photo = photo;
        return this;}

    public int getType() {return type;}
    public String getTypeAsString() {return String.valueOf(getType());}
    public Court setType(int type) {this.type = type;
        return this;}

    public boolean getState() {return state;}
    public String getStateAsString() { return String.valueOf(getState());}
    public Court setState(boolean state) {this.state = state;
        return this;}

    public Owner getOwner() {return owner;}
    public String getOwnerAsValue(){return "'" + getOwner() + "'";}
    public Court setOwner(Owner owner) {this.owner = owner;
        return this;}

    public Ubigeo getUbigeo() {return ubigeo;}
    public String getUbigeoAsValue(){return "'" + getUbigeo() + "'" ;}
    public Court setUbigeo(Ubigeo ubigeo) {this.ubigeo = ubigeo;
        return this;}

    public Service getService() { return service;  }
    public String getServiceAsValue(){return "'" + getService()+ "'" ;}
    public Court setService(Service service) {this.service = service;
        return this;}

    public static Court build(ResultSet rs, OwnersEntity ownersEntity , UbigeosEntity ubigeosEntity, ServicesEntity servicesEntity) {
        try {
            return (new Court())
                    .setId(rs.getString("id"))
                    .setName(rs.getString("name"))
                    .setCapacity(rs.getInt("capacity"))
                    .setAddress(rs.getString("address"))
                    .setEmail(rs.getString("email"))
                    .setPhone(rs.getString("phone"))
                    .setPrice(rs.getFloat("price"))
                    .setPhoto(rs.getString("photo"))
                    .setType(rs.getInt("type"))
                    .setState(rs.getBoolean("state"))
                    .setOwner(ownersEntity.findById(rs.getString("owner_id")))
                    .setUbigeo(ubigeosEntity.findById(rs.getString("ubigeo_id")))
                    .setService(servicesEntity.findById(rs.getString("service_id")));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
