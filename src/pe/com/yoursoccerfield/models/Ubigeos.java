package pe.com.yoursoccerfield.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Laura Nakaya on 6/17/2017.
 */
public class Ubigeos {
    private String id;
    private String departmentId;
    private String provinceId;
    private String districtId;
    private String departmentName;
    private String provinceName;
    private String districtName;

    public String getId() { return id; }

    public Ubigeos setId(String id) {
        this.id = id;
        return this;
    }

    public String getDepartmentId() { return departmentId; }

    public String getDepartmentIdAsValue(){ return "'" + getDepartmentId() + "'"; }

    public Ubigeos setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }

    public String getProvinceId() {return provinceId;  }

    public String getProvinceIdAsValue(){ return "'" + getProvinceId() + "'";  }

    public Ubigeos setProvinceId(String provinceId) {
        this.provinceId = provinceId;
        return this;
    }

    public String getDistrictId() {  return districtId;  }

    public String getDistrictIdAsValue(){ return "'" + getDistrictId() + "'";  }

    public Ubigeos setDistrictId(String districtId) {
        this.districtId = districtId;
        return this;
    }

    public String getDepartmentName() { return departmentName;  }

    public String getDepartmentNameAsValue(){return "'" + getDepartmentName()+ "'"; }

    public Ubigeos setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;
    }

    public String getProvinceName() { return provinceName; }

    public String getProvinceNameAsValue(){ return "'" + getProvinceName() + "'";  }

    public Ubigeos setProvinceName(String provinceName) {
        this.provinceName = provinceName;
        return this;
    }

    public String getDistrictName() {  return districtName;  }

    private String getDistrictNameAsValue(){ return "'" + getDistrictName() + "'"; }

    public Ubigeos setDistrictName(String districtName) {
        this.districtName = districtName;
        return this;
    }

    public static Ubigeos build(ResultSet resultSet){
        try {
            return (new Ubigeos())
                    .setId(resultSet.getString("id"))
                    .setDepartmentId(resultSet.getString("department_id"))
                    .setProvinceId(resultSet.getString("province_id"))
                    .setDistrictId(resultSet.getString("district_id"))
                    .setDepartmentName(resultSet.getString("department_name"))
                    .setProvinceName(resultSet.getString("province_name"))
                    .setDistrictName(resultSet.getString("district_name"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
