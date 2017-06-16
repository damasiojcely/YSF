package pe.com.yoursoccerfield;

/**
 * Created by Pc user on 16/06/2017.
 */
public class UbigeoPeru {
    private String id;
    private String departamentId;
    private String provinceId;
    private String districtId;
    private String departamentName;
    private String provinceName;
    private String districtName;

    public UbigeoPeru() {
    }

    public UbigeoPeru(String id, String departamentId, String provinceId, String districtId, String departamentName, String provinceName, String districtName) {
        this.id = id;
        this.departamentId = departamentId;
        this.provinceId = provinceId;
        this.districtId = districtId;
        this.departamentName = departamentName;
        this.provinceName = provinceName;
        this.districtName = districtName;
    }


    public String getId() {return id;}
    public UbigeoPeru setId(String id) {this.id = id;
        return this;}
    public String getDepartamentId() {return departamentId;}
    public UbigeoPeru setDepartamentId(String departamentId) {this.departamentId = departamentId;
        return this;}
    public String getProvinceId() {return provinceId;}
    public UbigeoPeru setProvinceId(String provinceId) {this.provinceId = provinceId;
        return this;}
    public String getDistrictId() {return districtId;}
    public UbigeoPeru setDistrictId(String districtId) {this.districtId = districtId;
        return this;}
    public String getDepartamentName() {return departamentName;}
    public UbigeoPeru setDepartamentName(String departamentName) {this.departamentName = departamentName;
        return this;}
    public String getProvinceName() {return provinceName;}
    public UbigeoPeru setProvinceName(String provinceName) {this.provinceName = provinceName;
        return this;}
    public String getDistrictName() {return districtName;}
    public UbigeoPeru setDistrictName(String districtName) {this.districtName = districtName;
        return this;}


}