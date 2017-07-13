package pe.com.yoursoccerfield.viewcontrollers;

import pe.com.yoursoccerfield.models.Organizer;
import pe.com.yoursoccerfield.models.Participant;
import pe.com.yoursoccerfield.services.YSFService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

@WebServlet(name = "ParticipantsServlet", urlPatterns = "/participants")
public class ParticipantsServlet extends HttpServlet {
    // Service Layer access object
    YSFService service = new YSFService();
    // Action View Paths
    public static String PARTICIPANTS_EDIT_URI = "/editParticipant.jsp";
    public static String PARTICIPANTS_ADD_URI = "/newParticipant.jsp";
    public static String PARTICIPANTS_INDEX_URI = "/listParticipants.jsp";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch(action) {
            case "update": {
                Participant participant = service.getParticipantById(request.getParameter("id"));
                participant.setFirstName(request.getParameter("firstName"));
                participant.setLastName(request.getParameter("lastName"));
                participant.setEmail(request.getParameter("email"));
                participant.setPosition(request.getParameter("position"));
                String message = service.updateParticipant(participant) ?
                        "Update success" :
                        "Error while updating";
                log(message);
            }
            case "agregate": {
                Participant participant=new Participant();
                participant.setId(request.getParameter("id"));
                Organizer organizer=service.getOrganizerById(request.getParameter("id"));
                participant.setFirstName(request.getParameter("firstName"));
                participant.setLastName(request.getParameter("lastName"));
                participant.setEmail(request.getParameter("email"));
                participant.setPosition(request.getParameter("position"));
                participant.setOrganizer(organizer);
                String message = service.addParticipant(participant) ?
                        "Update success" :
                        "Error while updating";
                log(message);
            }
            case "delete":{
                Participant participant=service.getParticipantById(request.getParameter("id"));
                String message = service.deleteParticipant(participant)?
                        "Delete success" :
                        "Error while delete";
                log(message);
            }
        }
        RequestDispatcher dispatcher =
                request.getRequestDispatcher(PARTICIPANTS_INDEX_URI);
        dispatcher.forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String actionUri;
        switch(action) {
            case "add": {
                actionUri = PARTICIPANTS_ADD_URI;
                request.setAttribute("action", "add");
                break;
            }
            case "edit": {
                Participant participant = service.getParticipantById(request.getParameter("id"));
                request.setAttribute("participant", participant);
                request.setAttribute("action", "edit");
                actionUri = PARTICIPANTS_EDIT_URI;
                break;
            }
            default:
                actionUri = PARTICIPANTS_INDEX_URI;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(actionUri);
        dispatcher.forward(request, response);
    }
}
