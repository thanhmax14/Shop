/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOS;

import DB.DBConnection;
import LoginWithGoogle.GooglePojo;
import Models.Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pham Quang Thanh - CE171732
 */
public class UsersDaos {

    Connection conn;

    public UsersDaos() {
        try {
            conn = DBConnection.connect();
        } catch (SQLException ex) {
            Logger.getLogger(UsersDaos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Users checkAccount(String user, String passw) {
        Users us = null;
        try {

            PreparedStatement ps = conn.prepareStatement("select * from Users where (Username=? and [Password]=? ) or Email=? and [Password]=?");
            ps.setString(1, user);
            ps.setString(2, passw);
            ps.setString(3, user);
            ps.setString(4, passw);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                us = new Users(rs.getString("Username"), rs.getString("Fullname"), rs.getString("Email"), rs.getInt("Phone"),
                        rs.getString("UserType"), rs.getString("Gender"), rs.getDate("Birthday"),
                        rs.getString("Address"), rs.getString("Password"), rs.getInt("UserStatus"),
                        rs.getString("ResetToken"), rs.getString("image"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersDaos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return us;
    }

    public Users checkUserExit(GooglePojo info) {
        Users us = null;
        try {
            PreparedStatement ps = conn.prepareStatement("select * from Users where Username=? and Email=?");
            ps.setString(1, info.getEmail());
            ps.setString(2, info.getEmail());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                us = new Users(rs.getString("Username"), rs.getString("Fullname"), rs.getString("Email"), rs.getInt("Phone"),
                        rs.getString("UserType"), rs.getString("Gender"), rs.getDate("Birthday"),
                        rs.getString("Address"), rs.getString("Password"), rs.getInt("UserStatus"),
                        rs.getString("ResetToken"), rs.getString("image"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersDaos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return us;

    }

    public int siginWithGoogle(GooglePojo info) {
        int count = 0;
        try {
            PreparedStatement ps = conn.prepareStatement("Insert into Users values(?,?,?,'','Customer','',NULL,'','','0','',?)");
            ps.setString(1, info.getEmail());
            ps.setString(2, info.getName());
            ps.setString(3, info.getEmail());
            ps.setString(4, info.getPicture());
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsersDaos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count;

    }

    public Users register(Users us) {
        int count = 0;
        try {
            PreparedStatement ps = conn.prepareStatement("Insert into [Users] values (?,?,?,?,'Customer','','','',?, '0','','')");
            ps.setString(1, us.getUsername());
            ps.setString(2, us.getFullname());
            ps.setInt(3, us.getPhone());
            ps.setString(4, us.getEmail());
            ps.setString(5, us.getPassword());
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsersDaos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (count == 0) ? null : us;
    }

    public Users Update(Users Infor) {
        int count = 0;
        try {
            PreparedStatement ps = conn.prepareStatement("update Users set Fullname=?,Email=?,Phone=?,Gender=?,Birthday = ?, [Address]= ? where Username = ?");
            ps.setString(1, Infor.getFullname());
            ps.setString(2, Infor.getEmail());
            ps.setInt(3, Infor.getPhone());
            ps.setString(4, Infor.getGender());
            ps.setDate(5, Infor.getBirthday());
            ps.setString(6, Infor.getAddress());
            ps.setString(7, Infor.getUsername());
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsersDaos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return (count == 0) ? null : Infor;
    }

    public Users checkUserExitByEmail(String email) {
        Users us = null;
        try {
            PreparedStatement ps = conn.prepareStatement("select * from Users where Email=?");
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                us = new Users(rs.getString("Username"), rs.getString("Fullname"), rs.getString("Email"), rs.getInt("Phone"),
                        rs.getString("UserType"), rs.getString("Gender"), rs.getDate("Birthday"),
                        rs.getString("Address"), rs.getString("Password"), rs.getInt("UserStatus"),
                        rs.getString("ResetToken"), rs.getString("image"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersDaos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return us;
    }

    public int addResetToken(String token, String username) {
        int count = 0;
        try {
            PreparedStatement ps = conn.prepareStatement("update Users set ResetToken=? where Username=?");
            ps.setString(1, token);
            ps.setString(2, username);
            count = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(UsersDaos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return count != 0 ? 1 : -1;
    }

    public Users checkTokenReset(String reset) {
        Users us = null;
        try {
            PreparedStatement ps = conn.prepareStatement("select * from Users where ResetToken=?");
            ps.setString(1, reset);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                us = new Users(rs.getString("Username"), rs.getString("Fullname"), rs.getString("Email"), rs.getInt("Phone"),
                        rs.getString("UserType"), rs.getString("Gender"), rs.getDate("Birthday"),
                        rs.getString("Address"), rs.getString("Password"), rs.getInt("UserStatus"),
                        rs.getString("ResetToken"), rs.getString("image"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsersDaos.class.getName()).log(Level.SEVERE, null, ex);
        }
        return us;
    }

}
