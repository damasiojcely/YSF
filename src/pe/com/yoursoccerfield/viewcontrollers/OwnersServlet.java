package pe.com.yoursoccerfield.viewcontrollers;

import pe.com.yoursoccerfield.models.Owner;
import pe.com.yoursoccerfield.services.YSFService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "OwnersServlet" , urlPatterns = "/owners")
public class OwnersServlet extends HttpServlet{

    YSFService service = new YSFService();

    public static String OWNERS_EDIT_URI = "/editOwner.jsp";
    public static String OWNERS_ADD_URI = "/newOwner.jsp";
    public static String OWNERS_INDEX_URI = "/listOwners.jsp";


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException {
         String action = request.getParameter("action");
         switch (action){
             case "update": {
                 Owner owner = service.getOwnerById(request.getParameter("id"));
                 owner.setFirstName(request.getParameter("firstName"));
                 owner.setLastName(request.getParameter("lastName"));
                 owner.setEmail(request.getParameter("email"));
                 owner.setPassword(request.getParameter("password"));
                 owner.setDni(request.getParameter("dni"));
                 owner.setPhoto(request.getParameter("photo"));
                 owner.setPhone(request.getParameter("phone"));
                 owner.setPosition(request.getParameter("position"));
                 String message = service.updateOwner(owner) ?
                         "Update success" :
                         "Error while updating";
                 log(message);
             }
             case "agregate":{
                 Owner owner=new Owner();
                 owner.setId(request.getParameter("id"));
                 owner.setFirstName(request.getParameter("firstName"));
                 owner.setLastName(request.getParameter("lastName"));
                 owner.setEmail(request.getParameter("email"));
                 owner.setPassword(request.getParameter("password"));
                 owner.setDni(request.getParameter("dni"));
                 owner.setPhoto(request.getParameter("photo"));
                 owner.setPhone(request.getParameter("phone"));
                 owner.setPosition(request.getParameter("position"));
                 String message = service.addOwner(owner)?
                         "Add success" :
                         "Error while updating";
                 log(message);
             }
             case "delete":{
                 Owner owner= service.getOwnerById(request.getParameter("id"));
                 String message=service.deleteOwner(owner)?
                         "Delete success" :
                         "Error while del";
                 log(message);
             }
         }
         RequestDispatcher dispatcher=request.getRequestDispatcher(OWNERS_INDEX_URI);
         dispatcher.forward(request,response);
    }

    public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        String action = request.getParameter("action");
        String actionUri;
        switch (action){
            case "add": {
                actionUri = OWNERS_ADD_URI;
                request.setAttribute("action","add");
                break;
            }
            case "edit": {
                Owner owner=service.getOwnerById(request.getParameter("id"));
                request.setAttribute("owner",owner);
                request.setAttribute("action","edit");
                actionUri=OWNERS_EDIT_URI;
                break;
            }
            default:
                actionUri=OWNERS_INDEX_URI;
        }
        RequestDispatcher dispatcher=request.getRequestDispatcher(actionUri);
        dispatcher.forward(request,response);
    }
}