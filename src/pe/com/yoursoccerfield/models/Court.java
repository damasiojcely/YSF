package pe.com.yoursoccerfield.models;

import java.sql.ResultSet;
import java.sql.SQLException;


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


    public String getIdAsValue() { return "'" + getId() + "'" ;}
    public String getNameAsValue(){return "'" + getName() + "'" ;}

    public String getId() {return id;}
    public Court setId(String id) {this.id = id;return this;}
    public String getName() {return name;}
    public Court setName(String name) {this.name = name;return this;}
    public int getCapacity() {return capacity;}
    public Court setCapacity(int capacity) {this.capacity = capacity;return this;}
    public String getAddress() {return address;}
    public Court setAddress(String address) {this.address = address;return this;}
    public String getEmail() {return email;}
    public Court setEmail(String email) {this.email = email;return this;}
    public String getPhone() {return phone;}
    public Court setPhone(String phone) {this.phone = phone;return this;}
    public float getPrice() {return price;}
    public Court setPrice(float price) {this.price = price;return this;}
    public String getPhoto() {return photo;}
    public Court setPhoto(String photo) {this.photo = photo;return this;}
    public int getType() {return type;}
    public Court setType(int type) {this.type = type;return this;}
    public boolean getState() {return state;}
    public Court setState(boolean state) {this.state = state;return this;}
    public Owner getOwner() {return owner;}
    public Court setOwner(Owner owner) {this.owner = owner;return this;}
    public Ubigeo getUbigeo() {return ubigeo;}
    public Court setUbigeo(Ubigeo ubigeo) {this.ubigeo = ubigeo;return this;}
    public Service getService() {
        return service;
    }
    public Court setService(Service service) { this.service = service;return this; }

    public static Court build(ResultSet rs, OwnersEntity ownersEntity , UbigeosEntity ubigeosEntity,ServicesEntity servicesEntity) {
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
                    .setService(servicesEntity.findById(rs.getInt("service_id")));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }





}
