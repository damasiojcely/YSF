package pe.com.yoursoccerfield.viewcontrollers;

import pe.com.yoursoccerfield.models.Reservation;
import pe.com.yoursoccerfield.services.YSFService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "ReservationsServlet", urlPatterns = "/reservations")
public class ReservationsServlet extends HttpServlet {

    YSFService service = new YSFService();

    public static String RESERVATIONS_EDIT_URI = "/editReservation.jsp";
    public static String RESERVATIONS_ADD_URI = "/newReservation.jsp";
    public static String RESERVATIONS_INDEX_URI = "/listReservations.jsp";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
       String action = request.getParameter("action");
       switch (action){
           case "update": {
               Reservation reservation = service.getReservationById(request.getParameter("id"));
               reservation.setCreateDate(Date.valueOf(request.getParameter("createDate")));
               reservation.setState(Boolean.valueOf(request.getParameter("state")));
               reservation.setGameTime(Date.valueOf(request.getParameter("gameTime")));
               reservation.setHours(Float.parseFloat(request.getParameter("hours")));
               reservation.setTotal(Float.parseFloat(request.getParameter("total")));
               String message = service.updateReservation(reservation)?
                       "Update sucess" :
                       "Error while updating";
               log(message);
           }
           case "agregate":{
               Reservation reservation=new Reservation();
               reservation.setId(Integer.parseInt(request.getParameter("id")));
               reservation.setCreateDate(Date.valueOf(request.getParameter("createDate")));
               reservation.setState(Boolean.valueOf(request.getParameter("state")));
               reservation.setGameTime(Date.valueOf(request.getParameter("gameTime")));
               reservation.setHours(Float.parseFloat(request.getParameter("hours")));
               reservation.setTotal(Float.parseFloat(request.getParameter("total")));
               String message = service.addReservation(reservation)?
                       "Update sucess" :
                       "Error while updating";
               log(message);
           }
           case "delete":{
               Reservation reservation=service.getReservationById(request.getParameter("id"));
               String message=service.deleteReservation(reservation) ?
                       "Delete success" :
                       "Error while del";
               log(message);
           }
       }
        RequestDispatcher dispatcher=request.getRequestDispatcher(RESERVATIONS_INDEX_URI);
       dispatcher.forward(request,response);
    }

    protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException ,IOException{
        String action = request.getParameter("action");
        String actionUri;
        switch (action){

            case "add": {
                actionUri = RESERVATIONS_ADD_URI;
                request.setAttribute("action","add");
                break;
            }
            case "edit": {
                Reservation reservation = service.getReservationById(request.getParameter("id"));
                request.setAttribute("reservation",reservation);
                request.setAttribute("action","edit");
                actionUri = RESERVATIONS_EDIT_URI;
                break;
            }
            default:
                actionUri=RESERVATIONS_INDEX_URI;
        }
        RequestDispatcher dispatcher=request.getRequestDispatcher(actionUri);
        dispatcher.forward(request,response);
    }
}