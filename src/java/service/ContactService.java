package service;

import dto.HotelContact;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author nisalsp9
 */
public interface ContactService {

    public boolean addContact(Connection connection, HotelContact hotelContact) throws ClassNotFoundException, SQLException;

    public ResultSet getContact(Connection connection,String id) throws ClassNotFoundException, SQLException;
}
