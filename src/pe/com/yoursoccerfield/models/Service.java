package pe.com.yoursoccerfield.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by lnakaya on 29/06/2017.
 */
public class Service {
    private String id;
    private String name;
    private float price;
    private Court court;

    public Service() {
    }

    public Service(String id, String name, float price, Court court) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.court = court;
    }

    public String getId() {return id;}

    public String getIdAsValue() { return "'" + getId() + "'";}

    public Service setId(String id) {this.id = id;
        return this;}

    public String getName() {return name;}

    public String getNameAsValue() { return "'" + getName() + "'";}

    public Service setName(String name) {this.name = name;
        return this;}

    public float getPrice() {return price;}

    public String getPriceAsString() {
        return String.valueOf(getPrice());
    }

    public Service setPrice(float price) {this.price = price;
        return this;}

    public Court getCourt() {
        return court;
    }

    public String getCourtAsValue() { return "'" + getCourt() + "'";}

    public Service setCourt(Court court) {
        this.court = court;
        return this;
    }


    public static Service build(ResultSet rs,CourtsEntity courtsEntity,OwnersEntity ownersEntity,UbigeosEntity ubigeosEntity) {
        try {
            return (new Service())
                    .setId(rs.getString("id"))
                    .setName(rs.getString("name"))
                    .setPrice(rs.getFloat("price"))
                    .setCourt(courtsEntity.findById(rs.getString("court_id"),ownersEntity,ubigeosEntity));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


}