/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dto.HotelContact;
import factory.DatabaseResourceFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import service.ContactService;
import service.impl.ConatactServiceImpl;

/**
 *
 * @author nisalsp9
 */
public class ContactController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ContactController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ContactController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String id = request.getParameter("id");
            

            Connection connection = DatabaseResourceFactory.getResourceFactory().getConnection();

            ContactService service = new ConatactServiceImpl();

            ResultSet resultSet = service.getContact(connection,id);

            JSONArray jSONArray = new JSONArray();

            while (resultSet.next()) {
                JSONObject json = new JSONObject();
                json.put("contactID", resultSet.getString(1));
                json.put("hotelID", resultSet.getString(2));
                json.put("personName", resultSet.getString(3));
                json.put("position", resultSet.getString(4));
                json.put("number1", resultSet.getString(5));
                json.put("number2", resultSet.getString(6));
                json.put("email", resultSet.getString(7));
                jSONArray.put(json);

            }

            PrintWriter out = response.getWriter();
            out.print(jSONArray);
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(HotelController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HotelController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (JSONException ex) {
            Logger.getLogger(HotelController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

         try {
            // processRequest(request, response);
            //System.out.println("llllllllllllllllllllllllllllllllllllllllll");
            BufferedReader reader = request.getReader();

            JSONObject jsonObject = new JSONObject(reader.readLine());

            String hotelID = jsonObject.getString("hotelID");
            String name = jsonObject.getString("name");
            String position = jsonObject.getString("position");
            String num1 = jsonObject.getString("num1");
            String num2 = jsonObject.getString("num2");
            String email = jsonObject.getString("email");
            
             HotelContact contact = new HotelContact("", hotelID, name, position, num1, num2, email);
            

            Connection connection = DatabaseResourceFactory.getResourceFactory().getConnection();

            ContactService service = new ConatactServiceImpl();

            boolean rst = service.addContact(connection, contact);

            if (rst) {

               

            } else {

                PrintWriter pw = response.getWriter();
                pw.print("Something went wrong....!");

            }

        } catch (JSONException ex) {
            Logger.getLogger(HotelController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(HotelController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(HotelController.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
