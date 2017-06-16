package pe.com.yoursoccerfield;

/**
 * Created by Pc user on 16/06/2017.
 */
public class Organizer {
    private int id;
    private String password;
    private People people;
    private Participant participant;

    public Organizer() {
    }

    public Organizer(int id, String password, People people, Participant participant) {
        this.id = id;
        this.password = password;
        this.people = people;
        this.participant = participant;
    }


    public int getId() {
        return id;
    }

    public Organizer setId(int id) {
        this.id = id;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public Organizer setPassword(String password) {
        this.password = password;
        return this;
    }

    public People getPeople() {
        return people;
    }

    public Organizer setPeople(People people) {
        this.people = people;
        return this;
    }

    public Participant getParticipant() {
        return participant;
    }

    public Organizer setParticipant(Participant participant) {
        this.participant = participant;
        return this;
    }
}
