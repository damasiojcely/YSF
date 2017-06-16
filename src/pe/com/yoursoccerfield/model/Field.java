package pe.com.yoursoccerfield.model;

/**
 * Created by Pc user on 16/06/2017.
 */
public class Field {
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
    private UbigeoPeru ubigeoPeru;

    public Field() {
    }

    public Field(String id, String name, int capacity, String address, String email, String phone, float price, String photo, int type, boolean state, Owner owner, UbigeoPeru ubigeoPeru) {
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
        this.ubigeoPeru = ubigeoPeru;
    }

    public String getId() {return id;}
    public Field setId(String id) {this.id = id;
        return this;}
    public String getName() {return name;}
    public Field setName(String name) {this.name = name;
        return this;}
    public int getCapacity() {return capacity;}
    public Field setCapacity(int capacity) {this.capacity = capacity;
        return this;}
    public String getAddress() {return address;}
    public Field setAddress(String address) {this.address = address;
        return this;}
    public String getEmail() {return email;}
    public Field setEmail(String email) {this.email = email;
        return this;}
    public String getPhone() {return phone;}
    public Field setPhone(String phone) {this.phone = phone;
        return this;}
    public float getPrice() {return price;}
    public Field setPrice(float price) {this.price = price;
        return this;}
    public String getPhoto() {return photo;}
    public Field setPhoto(String photo) {this.photo = photo;
        return this;}
    public int getType() {return type;}
    public Field setType(int type) {this.type = type;
        return this;}
    public boolean isState() {return state;}
    public Field setState(boolean state) {this.state = state;
        return this;}
    public Owner getOwner() {return owner;}
    public Field setOwner(Owner owner) {this.owner = owner;
        return this;}
    public UbigeoPeru getUbigeoPeru() {return ubigeoPeru;}
    public Field setUbigeoPeru(UbigeoPeru ubigeoPeru) {this.ubigeoPeru = ubigeoPeru;
        return this;}
}
