package pe.com.yoursoccerfield.viewcontrollers;

import pe.com.yoursoccerfield.models.Organizer;
import pe.com.yoursoccerfield.services.YSFService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "OrganizersServlet",urlPatterns = "/organizers")
public class OrganizersServlet extends HttpServlet {

    YSFService service=new YSFService();

    public static String ORGANIZERS_EDIT_URI = "/editOrganizer.jsp";
    public static String ORGANIZERS_ADD_URI = "/newOrganizer.jsp";
    public static String ORGANIZERS_INDEX_URI = "/listOrganizers.jsp";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        switch(action) {
            case "update": {
                Organizer organizer = service.getOrganizerById(request.getParameter("id"));
                organizer.setFirstName(request.getParameter("firstName"));
                organizer.setLastName(request.getParameter("lastName"));
                organizer.setEmail(request.getParameter("email"));
                organizer.setPassword(request.getParameter("password"));
                organizer.setDni(request.getParameter("dni"));
                organizer.setPhoto(request.getParameter("photo"));
                organizer.setPhone(request.getParameter("phone"));
                organizer.setPosition(request.getParameter("position"));
                String message = service.updateOrganizer(organizer) ?
                        "Update success" :
                        "Error while updating";
                log(message);
            }
            case "agregate":{
                Organizer organizer=new Organizer();
                organizer.setId(request.getParameter("id"));
                organizer.setFirstName(request.getParameter("firstName"));
                organizer.setLastName(request.getParameter("lastName"));
                organizer.setEmail(request.getParameter("email"));
                organizer.setPassword(request.getParameter("password"));
                organizer.setDni(request.getParameter("dni"));
                organizer.setPhoto(request.getParameter("photo"));
                organizer.setPhone(request.getParameter("phone"));
                organizer.setPosition(request.getParameter("position"));
                String message = service.addOrganizer(organizer)?
                        "Add success" :
                        "Error while updating";
                log(message);

            }
        }
        RequestDispatcher dispatcher =
                request.getRequestDispatcher(ORGANIZERS_INDEX_URI);
        dispatcher.forward(request, response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        String actionUri;
        switch(action) {
            case "add": {
                actionUri = ORGANIZERS_ADD_URI;
                request.setAttribute("action", "add");
                break;
            }
            case "edit": {
                Organizer organizer = service.getOrganizerById(request.getParameter("id"));
                request.setAttribute("organizer", organizer);
                request.setAttribute("action", "edit");
                actionUri = ORGANIZERS_EDIT_URI;
                break;
            }
            default:
                actionUri = ORGANIZERS_INDEX_URI;
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(actionUri);
        dispatcher.forward(request, response);
    }
}
