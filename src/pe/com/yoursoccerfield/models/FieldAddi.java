package pe.com.yoursoccerfield.models;

/**
 * Created by Pc user on 16/06/2017.
 */
public class FieldAddi {
    private String id;
    private Field field;
    private Additional additional;

    public FieldAddi() {
    }

    public FieldAddi(String id, Field field, Additional additional) {
        this.id = id;
        this.field = field;
        this.additional = additional;
    }

    public String getId() {return id;}
    public FieldAddi setId(String id) {this.id = id;
        return this;}
    public Field getField() {return field;}
    public FieldAddi setField(Field field) {this.field = field;
        return this;}
    public Additional getAdditional() {return additional;}
    public FieldAddi setAdditional(Additional additional) {this.additional = additional;
        return this;}


}