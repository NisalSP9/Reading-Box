/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection.impl;

import java.sql.Connection;
import dbconnection.DBResourceConnection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author nisalsp9
 */
public class MysqlDBResourceConnectionImpl implements DBResourceConnection{

    public Connection getConnection() throws SQLException, ClassNotFoundException {
        
        Class.forName("com.mysql.jdbc.Driver");
        
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/dmcmslk", "root", "ep1137");
        
        return connection;    
        
        
    }
    
}
