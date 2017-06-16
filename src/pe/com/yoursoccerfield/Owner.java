package pe.com.yoursoccerfield;

/**
 * Created by Pc user on 16/06/2017.
 */
public class Owner {
    private int id;
    private String password;
    private People people;

    public Owner() {
    }

    public Owner(int id, String password, People people) {
        this.id = id;
        this.password = password;
        this.people = people;
    }


    public int getId() {
        return id;
    }

    public Owner setId(int id) {
        this.id = id;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Owner setPassword(String password) {
        this.password = password;
        return this;
    }

    public People getPeople() {
        return people;
    }

    public Owner setPeople(People people) {
        this.people = people;
        return this;
    }
}
