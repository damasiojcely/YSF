package pe.com.yoursoccerfield.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Pc user on 15/06/2017.
 */
public class Additional {
    private String id;
    private String name;
    private float price;

    public Additional() {
    }

    public Additional(String id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String getId() {return id;}
    public Additional setId(String id) {this.id = id;
        return this;}
    public String getName() {return name;}
    public Additional setName(String name) {this.name = name;
        return this;}
    public float getPrice() {return price;}
    public Additional setPrice(float price) {this.price = price;
        return this;}

    public static Additional build(ResultSet rs) {
        try {
            return (new Additional())
                    .setId(rs.getString("id"))
                    .setName(rs.getString("name"))
                    .setPrice(rs.getFloat("price"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }



}