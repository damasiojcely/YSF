package pe.com.yoursoccerfield;

/**
 * Created by Pc user on 16/06/2017.
 */
public class Participant {
    private int id;
    private String password;
    private People people;

    public Participant() {
    }

    public Participant(int id, String password, People people) {
        this.id = id;
        this.password = password;
        this.people = people;
    }


    public int getId() {
        return id;
    }

    public Participant setId(int id) {
        this.id = id;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Participant setPassword(String password) {
        this.password = password;
        return this;
    }

    public People getPeople() {
        return people;
    }

    public Participant setPeople(People people) {
        this.people = people;
        return this;
    }
}
