/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import dao.HotelDAO;
import dto.Hotel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author nisalsp9
 */
public class HotelDAOImpl implements HotelDAO {

    public boolean addHotel(Connection connection, Hotel hotel) throws ClassNotFoundException, SQLException {

        String sql = "insert into hotels values('0',"
                + "'" + hotel.getName() + "',"
                + "'" + hotel.getNameCN() + "',"
                + "'" + hotel.getCity() + "',"
                + "'" + hotel.getCate() + "',"
                + "'" + hotel.getType() + "',"
                + "'" + hotel.getChain() + "',"
                + "'" + hotel.getAddress() + "',"
                + "'" + hotel.getGps() + "')";

        Statement statement = connection.createStatement();

        return 0 < statement.executeUpdate(sql);

    }

    public ResultSet getHotels(Connection connection) throws ClassNotFoundException, SQLException {

        String sql = "select * from hotels";

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(sql);

        return resultSet;

    }

    public boolean deleteHotel(Connection connection, String hotelID) throws ClassNotFoundException, SQLException {

        String sql = "delete from hotels where hotel_id = '" + hotelID + "'";

        Statement statement = connection.createStatement();
        return 0 < statement.executeUpdate(sql);

    }

    public boolean updateHotel(Connection connection, Hotel hotel, String id) throws ClassNotFoundException, SQLException {

        String sql = "update hotels set hotel_name = '" + hotel.getName() + "',"
                + "hotel_name_cn = '" + hotel.getNameCN() + "',"
                + "city_id = '" + hotel.getCity() + "',"
                + "hotel_category = '" + hotel.getCate() + "',"
                + "hotel_type='" + hotel.getType() + "',"
                + "hotel_chain='" + hotel.getChain() + "',"
                + "hotel_address='" + hotel.getAddress() + "',"
                + "hotel_gps_location='" + hotel.getGps() + "' where hotel_id = '"+id+"'";

        Statement statement = connection.createStatement();

        return 0 < statement.executeUpdate(sql);

    }

}
