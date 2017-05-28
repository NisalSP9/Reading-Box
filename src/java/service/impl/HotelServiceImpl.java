/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service.impl;

import dao.HotelDAO;
import dao.impl.HotelDAOImpl;
import dto.Hotel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import service.HotelService;

/**
 *
 * @author nisalsp9
 */
public class HotelServiceImpl implements HotelService {

    public boolean addHotel(Connection connection, Hotel hotel) throws ClassNotFoundException, SQLException {

        HotelDAO dAO = new HotelDAOImpl();

        return dAO.addHotel(connection, hotel);

    }

    public ResultSet getHotels(Connection connection) throws ClassNotFoundException, SQLException {

        HotelDAO dAO = new HotelDAOImpl();

        return dAO.getHotels(connection);

    }

    public boolean deleteHotel(Connection connection, String hotelID) throws ClassNotFoundException, SQLException {

        HotelDAO dAO = new HotelDAOImpl();
        return dAO.deleteHotel(connection, hotelID);

    }

    public boolean updateHotel(Connection connection, Hotel hotel, String id) throws ClassNotFoundException, SQLException {

        HotelDAO dAO = new HotelDAOImpl();

        return dAO.updateHotel(connection, hotel, id);
    }
}
