/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOS;

import DB.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pham Quang Thanh - CE171732
 */
public class CategoriesDAOS {

    Connection conn;

    public CategoriesDAOS() {
        try {
            conn = DBConnection.connect();
        } catch (SQLException ex) {
            Logger.getLogger(CategoriesDAOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet getAllCategory() {
        ResultSet rs = null;

        try {
            Statement st = conn.createStatement();
            rs = st.executeQuery("select * from Categories where CateStatus =0 ");
        } catch (SQLException ex) {
            Logger.getLogger(CategoriesDAOS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }

}
