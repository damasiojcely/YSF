package pe.com.yoursoccerfield.viewcontrollers;

import pe.com.yoursoccerfield.models.Court;
import pe.com.yoursoccerfield.services.YSFService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CourtsServlet" , urlPatterns = "/courts")
public class CourtsServlet extends HttpServlet {

    YSFService service = new YSFService();

    public static String COURTS_EDIT_URI = "/editCourt.jsp";
    public static String COURTS_ADD_URI = "/newCourt.jsp";
    public static String COURTS_INDEX_URI = "/listCourts.jsp";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
        String action = request.getParameter("action");
        switch (action){
            case "update": {
                Court court = service.getCourtById(request.getParameter("id"));
                court.setName(request.getParameter("name"));
                court.setCapacity(Integer.parseInt(request.getParameter("capacity")));
                court.setAddress(request.getParameter("address"));
                court.setEmail(request.getParameter("email"));
                court.setPhone(request.getParameter("phone"));
                court.setPrice(Float.parseFloat(request.getParameter("price")));
                court.setPhoto(request.getParameter("photo"));
                court.setType(Integer.parseInt(request.getParameter("type")));
                court.setState(Boolean.parseBoolean(request.getParameter("state")));
                String message = service.updateCourt(court) ?
                        "Update success" :
                        "Error while updating";
                log(message);
            }
            case "agregate":{
                Court court= new Court();
                court.setId(request.getParameter("id"));
                court.setName(request.getParameter("name"));
                court.setCapacity(Integer.parseInt(request.getParameter("capacity")));
                court.setAddress(request.getParameter("address"));
                court.setEmail(request.getParameter("email"));
                court.setPhone(request.getParameter("phone"));
                court.setPrice(Float.parseFloat(request.getParameter("price")));
                court.setPhoto(request.getParameter("photo"));
                court.setType(Integer.parseInt(request.getParameter("type")));
                court.setState(Boolean.parseBoolean(request.getParameter("state")));
                String message = service.addCourt(court) ?
                        "Update success" :
                        "Error while updating";
                log(message);
            }
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(COURTS_INDEX_URI);
        dispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
      String action = request.getParameter("action");
      String actionUri;
      switch (action){
          case "add":{
              actionUri = COURTS_ADD_URI;
              request.setAttribute("action","add");
              break;
          }
          case "edit":{
              Court court = service.getCourtById(request.getParameter("id"));
              request.setAttribute("court",court);
              request.setAttribute("action","edit");
              actionUri = COURTS_EDIT_URI;
              break;
          }
          default:
              actionUri = COURTS_INDEX_URI;
      }
      RequestDispatcher dispatcher = request.getRequestDispatcher(actionUri);
      dispatcher.forward(request,response);
    }
}