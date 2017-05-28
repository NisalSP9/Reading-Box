package service.impl;

import dao.ContactDAO;
import dao.impl.ContactDAOImpl;
import dto.HotelContact;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import service.ContactService;

/**
 *
 * @author nisalsp9
 */
public class ConatactServiceImpl implements ContactService {

    public boolean addContact(Connection connection, HotelContact hotelContact) throws ClassNotFoundException, SQLException {

        ContactDAO dAO = new ContactDAOImpl();

        return dAO.addContact(connection, hotelContact);
    }

    public ResultSet getContact(Connection connection,String id) throws ClassNotFoundException, SQLException {
        ContactDAO dAO = new ContactDAOImpl();
        return dAO.getContact(connection,id);
    }
}
