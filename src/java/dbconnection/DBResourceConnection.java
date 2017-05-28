/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.Connection;
import connection.ResourceConnection;
import java.sql.SQLException;

/**
 *
 * @author nisalsp9
 */
public interface DBResourceConnection extends ResourceConnection{
    
    public Connection getConnection()throws SQLException,ClassNotFoundException;
    
}
