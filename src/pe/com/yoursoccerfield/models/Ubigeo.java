package pe.com.yoursoccerfield.models;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Laura Nakaya on 6/17/2017.
 */
public class Ubigeo {
    private String id;
    private String department;
    private String province;
    private String district;
    private String departmentName;
    private String provinceName;
    private String districtName;


    public Ubigeo() {
    }

    public Ubigeo(String id, String department, String province, String district, String departmentName, String provinceName, String districtName) {
        this.id = id;
        this.department = department;
        this.province = province;
        this.district = district;
        this.departmentName = departmentName;
        this.provinceName = provinceName;
        this.districtName = districtName;
    }

    public String getId() { return id; }

    public String getIdAsValue(){ return "'"+ getId() + "'" ;}

    public Ubigeo setId(String id) {
        this.id = id;
        return this;
    }

    public String getDepartment() { return department; }

    public String getDepartmentAsValue(){ return "'" + getDepartment() + "'"; }

    public Ubigeo setDepartment(String department) {
        this.department = department;
        return this;
    }

    public String getProvince() {return province;  }

    public String getProvinceAsValue(){ return "'" + getProvince() + "'";  }

    public Ubigeo setProvince(String province) {
        this.province = province;
        return this;
    }

    public String getDistrict() {  return district;  }

    public String getDistrictAsValue(){ return "'" + getDistrict() + "'";  }

    public Ubigeo setDistrict(String district) {
        this.district = district;
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
                    .setDepartment(resultSet.getString("department"))
                    .setProvince(resultSet.getString("province"))
                    .setDistrict(resultSet.getString("district"))
                    .setDepartmentName(resultSet.getString("department_name"))
                    .setProvinceName(resultSet.getString("province_name"))
                    .setDistrictName(resultSet.getString("district_name"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
