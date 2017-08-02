package pe.com.yoursoccerfield.viewcontrollers;

import pe.com.yoursoccerfield.models.Organizer;
import pe.com.yoursoccerfield.models.Owner;
import pe.com.yoursoccerfield.services.YSFService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "LoginServlet" , urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    YSFService service=new YSFService();

  public static String OWNER_IN_URI = "/index3.jsp";
  public static String ORGANIZER_IN_URI = "/index2.jsp";
  public static String LOGIN_URI = "/login.jsp";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String email = request.getParameter("email");
        String password = request.getParameter("password");



        if (service.getOrganizerByEmail(email, password)) {
            RequestDispatcher dispatcher = request.getRequestDispatcher(ORGANIZER_IN_URI);
            dispatcher.forward(request, response);
            Organizer organizer=service.getOrganizerIdByEmail(email,password);
            HttpSession sessionOr = request.getSession();
            sessionOr.setAttribute("uorganizer",organizer.getId());

        }else if (service.getOwnerByEmail(email,password)){
            RequestDispatcher dispatcher = request.getRequestDispatcher(OWNER_IN_URI);
            dispatcher.forward(request, response);
            Owner owner = service.getOwnerIdByEmail(email,password);
            HttpSession sessionOw = request.getSession();
            sessionOw.setAttribute("uowner",owner.getId());
        }
        else {
            RequestDispatcher dispatcher = request.getRequestDispatcher(LOGIN_URI);
            dispatcher.include(request, response);
        }




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
