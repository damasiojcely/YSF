package pe.com.yoursoccerfield.viewcontrollers;

import pe.com.yoursoccerfield.models.Organizer;
import pe.com.yoursoccerfield.models.Owner;
import pe.com.yoursoccerfield.services.YSFService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {

    YSFService service=new YSFService();
    String email;
    String password;
    String id;
    String actionUri;
    public static String OWNER_IN_URI = "/_ownerIn.jsp";
    public static String ORGANIZER_IN_URI = "/_organizerIn.jsp";
    public static String INDEX_URI = "/index.jsp";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        email = request.getParameter("email");
        password = request.getParameter("password");
        if (service.getOrganizerByEmail(email, password)) {
            String message = "You are an organizer";
            log(message);
            id = String.valueOf(service.getOrganizerByEmail(email,password));

            RequestDispatcher dispatcher = request.getRequestDispatcher(ORGANIZER_IN_URI);
            dispatcher.forward(request, response);
        }
        if (service.getOwnerByEmail(email, password)) {
            String message = "You are an owner";
            log(message);
            id = String.valueOf(service.getOwnerByEmail(email,password));
            RequestDispatcher dispatcher = request.getRequestDispatcher(OWNER_IN_URI);
            dispatcher.forward(request, response);
        }
        else {
            String message = "Error access";
            log(message);
            id= String.valueOf(0);
            RequestDispatcher dispatcher = request.getRequestDispatcher(INDEX_URI);
            dispatcher.forward(request, response);
        }
        
        
        Organizer organizer=service.getOrganizerIdByEmail(email,password);
        HttpSession session = request.getSession();
//        String user = "USUARIO_X"; //aqui tu identificador de usuario
       /* String num=new String(String.valueOf(organizer));*/
//        session.setAttribute("usuario",organizer.getId());
        session.setAttribute("organizer",organizer);
        
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("code",id);
        String code = id;


    }
    
    

}
