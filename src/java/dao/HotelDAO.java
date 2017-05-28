/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.Hotel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author nisalsp9
 */
public interface HotelDAO {
    
    public boolean addHotel(Connection connection,Hotel hotel)throws ClassNotFoundException,SQLException;
    public ResultSet getHotels(Connection connection)throws ClassNotFoundException,SQLException;
    public boolean deleteHotel(Connection connection,String hotelID)throws ClassNotFoundException,SQLException;
    public boolean updateHotel(Connection connection,Hotel hotel,String id)throws ClassNotFoundException,SQLException;
    
}
