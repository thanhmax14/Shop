/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thanh
 */
public class DBConnection {

    public static Connection connect() throws SQLException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
<<<<<<< HEAD
        // tao doi thuong thu thi cau lenh
        Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-RSCIO45\\MSSALSERVER:1433;databaseName=se1712;user=sa;password=Sang123;encrypt=true;trustServerCertificate=true;");
//                    
     
       
=======
//        // tao doi thuong thu thi cau lenh
//        Connection conn = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-CHPUKQ9I\\SQLEXPRESS:1433;databaseName=showShop2;user=sa;password=Ly0394509954;encrypt=true;trustServerCertificate=true;");
//                 
        //thanh
        Connection conn = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-1E1A6I4:1433;databaseName=showShop2;user=sa;password=Thanh;encrypt=true;trustServerCertificate=true;");

>>>>>>> 7a4d13c9ee6e31576b432e40fed69dfb5fe99f9a
        return conn;
    }

}
