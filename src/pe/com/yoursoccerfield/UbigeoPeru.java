package pe.com.yoursoccerfield;

/**
 * Created by LAURA NAKAYA user on 17/06/2017.
 */
public class UbigeoPeru {
    private String id;
    private String departmentId;
    private String provinceId;
    private String districtId;
    private String departmentName;
    private String provinceName;
    private String districtName;

    public UbigeoPeru() {
    }

    public UbigeoPeru(String id, String departmentId, String provinceId,
                      String districtId, String departmentName, String provinceName,
                      String districtName) {
        this.id = id;
        this.departmentId = departmentId;
        this.provinceId = provinceId;
        this.districtId = districtId;
        this.departmentName = departmentName;
        this.provinceName = provinceName;
        this.districtName = districtName;
    }

    public String getId() { return id; }

    public String getIdAsValue(){
        return "'" + getId() + "'";
    }

    public UbigeoPeru setId(String id) {
        this.id = id;
        return this;
    }

    public String getDepartmentId() { return departmentId;}

    public String getDepartmentIdAsValue(){
        return "'" + getDepartmentId() + "'";
    }

    public UbigeoPeru setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
        return this;
    }

    public String getProvinceId() { return provinceId; }

    public String getProvinceIdAsValue(){ return "'" + getProvinceId() + "'";  }

    public UbigeoPeru setProvinceId(String provinceId) {
        this.provinceId = provinceId;
        return this;
    }

    public String getDistrictId() { return districtId; }

    public String getDistrictIdAsValue(){ return "'" + getDistrictId() + "'";  }

    public UbigeoPeru setDistrictId(String districtId) {
        this.districtId = districtId;
        return this;
    }

    public String getDepartmentName() { return departmentName; }

    public String getDepartmentNameAsValue(){
        return "'" + getDepartmentName()+ "'";
    }

    public UbigeoPeru setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
        return this;
    }

    public String getProvinceName() { return provinceName; }

    public String getProvinceNameAsValue(){ return "'" + getProvinceName() + "'";  }

    public UbigeoPeru setProvinceName(String provinceName) {
        this.provinceName = provinceName;
        return this;
    }

    public String getDistrictName() { return districtName; }

    private String getDistrictNameAsValue(){ return "'" + getDistrictName() + "'"; }

    public UbigeoPeru setDistrictName(String districtName) {
        this.districtName = districtName;
        return this;
    }
}