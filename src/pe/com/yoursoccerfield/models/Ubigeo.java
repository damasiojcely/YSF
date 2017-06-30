package pe.com.yoursoccerfield.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Laura Nakaya on 6/17/2017.
 */
public class Ubigeo {
    private String id;
    private String departmentId;
    private String provinceId;
    private String districtId;
    private String departmentName;
    private String provinceName;
    private String districtName;

    public String getId() { return id; }

    public Ubigeo setId(String id) {
        this.id = id;
        return this;
    }

    public String getIdAsValue(){
        return "'" + getId() + "'";
    }

    public String getDepartmentId() { return departmentId; }

    public String getDepartmentIdAsValue(){ return "'" + getDepartmentId() + "'"; }

    public Ubigeo setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }

    public String getProvinceId() {return provinceId;  }

    public String getProvinceIdAsValue(){ return "'" + getProvinceId() + "'";  }

    public Ubigeo setProvinceId(String provinceId) {
        this.provinceId = provinceId;
        return this;
    }

    public String getDistrictId() {  return districtId;  }

    public String getDistrictIdAsValue(){ return "'" + getDistrictId() + "'";  }

    public Ubigeo setDistrictId(String districtId) {
        this.districtId = districtId;
        return this;
    }

    public String getDepartmentName() { return departmentName;  }

    public String getDepartmentNameAsValue(){return "'" + getDepartmentName()+ "'"; }

    public Ubigeo setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;
    }

    public String getProvinceName() { return provinceName; }

    public String getProvinceNameAsValue(){ return "'" + getProvinceName() + "'";  }

    public Ubigeo setProvinceName(String provinceName) {
        this.provinceName = provinceName;
        return this;
    }

    public String getDistrictName() {  return districtName;  }

    private String getDistrictNameAsValue(){ return "'" + getDistrictName() + "'"; }

    public Ubigeo setDistrictName(String districtName) {
        this.districtName = districtName;
        return this;
    }

    public static Ubigeo build(ResultSet resultSet){
        try {
            return (new Ubigeo())
                    .setId(resultSet.getString("id"))
                    .setDepartmentId(resultSet.getString("department"))
                    .setProvinceId(resultSet.getString("province"))
                    .setDistrictId(resultSet.getString("district"))
                    .setDepartmentName(resultSet.getString("department_name"))
                    .setProvinceName(resultSet.getString("province_name"))
                    .setDistrictName(resultSet.getString("district_name"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
