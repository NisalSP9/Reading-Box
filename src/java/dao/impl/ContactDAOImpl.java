package dao.impl;

import dao.ContactDAO;
import dto.HotelContact;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nisalsp9
 */
public class ContactDAOImpl implements ContactDAO {

    public boolean addContact(Connection connection, HotelContact hotelContact) throws ClassNotFoundException, SQLException {
        
        String sql = "INSERT INTO hotel_contacts VALUES('0',"
                + "'" + hotelContact.getHotelId() + "',"
                + "'" + hotelContact.getPersonName() + "',"
                + "'" + hotelContact.getPersonPosition() + "',"
                + "'" + hotelContact.getPhoneNum1() + "',"
                + "'" + hotelContact.getPhoneNum2() + "',"
                + "'" + hotelContact.getEmail() + "')";
        
        Statement statement = connection.createStatement();
        
        return 0 < statement.executeUpdate(sql);
    }

    public ResultSet getContact(Connection connection,String id) throws ClassNotFoundException, SQLException {
        String sql = "select * from hotel_contacts where hotel_id = '"+id+"'";

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        return resultSet;
    }
    
}
