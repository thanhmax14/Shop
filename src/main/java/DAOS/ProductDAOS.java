/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOS;

import DB.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pham Quang Thanh - CE171732
 */
public class ProductDAOS {

    Connection conn;

    public ProductDAOS() {
        try {
            conn = DBConnection.connect();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAOS.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ResultSet getAllProduct() {
        ResultSet rs = null;

        try {
            Statement st = conn.createStatement();
            rs = st.executeQuery("select * from Products where ProStatus =0");
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAOS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    public ResultSet getAllProductByCategory(int cateID) {
        ResultSet rs = null;
        try {
            String sql = "SELECT    * FROM  Brands INNER JOIN Products ON Brands.BrandID = "
                    + "Products.BrandID INNER JOIN Categories ON Products.CateID = Categories.CateID where "
                    + "Categories.CateID =? and ProStatus=0 and Quantity > 0 and"
                    + " Categories.CateStatus=0 and Brands.BrandStatus=0";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, cateID);
            rs = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAOS.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;

    }

}
