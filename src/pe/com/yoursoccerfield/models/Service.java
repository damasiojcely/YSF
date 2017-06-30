package pe.com.yoursoccerfield.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Pc user on 15/06/2017.
 */
public class Service {
    private String id;
    private String name;
    private float price;

    public Service() {
    }

    public Service(String id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public String getId() {return id;}
    public Service setId(String id) {this.id = id;
        return this;}
    public String getName() {return name;}
    public Service setName(String name) {this.name = name;
        return this;}
    public float getPrice() {return price;}
    public Service setPrice(float price) {this.price = price;
        return this;}

    public static Service build(ResultSet rs) {
        try {
            return (new Service())
                    .setId(rs.getString("id"))
                    .setName(rs.getString("name"))
                    .setPrice(rs.getFloat("price"));

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }



}