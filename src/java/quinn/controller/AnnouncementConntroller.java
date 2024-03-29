/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinn.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import quinn.db.BuildConnection;
import quinn.model.Announcement;
import quinn.model.Student;

/**
 *
 * @author Mark
 */
public class AnnouncementConntroller {

    public static List<Announcement> findAll() {

        List<Announcement> al = null;
        Announcement a = null;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from announcements ORDER BY announce_id DESC");
            ResultSet rs = null;
            rs = pstm.executeQuery();
            while (rs.next()) {
                if (al == null) {
                    al = new ArrayList(100);
                }
                a = new Announcement(rs.getInt(1), rs.getString(2));
                al.add(a);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }

    public static int findID(int an_id) {

        int result = 0;
        Announcement a = null;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("select announce_id from announcements Where announce_id = ? ORDER BY announce_id DESC");
            pstm.setInt(1, an_id);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                result = rs.getInt(1);
            }
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    public static boolean addAnnounce(Announcement a) {
        Connection conn = BuildConnection.getConnection();
        boolean fin = false;

        try {
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO announcements(content) VALUES ?");
            pstm.setString(1, a.getContent());
            fin = pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(AnnouncementConntroller.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fin;
    }

}
