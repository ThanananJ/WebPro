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
    
    public static List<Announcement> findAll(){
        
        List<Announcement> al = null;
        Announcement a = null;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from announcements");
            ResultSet rs = null;
            rs = pstm.executeQuery();
            while(rs.next()){
                if(al == null){
                    al = new ArrayList(100);
                }
                a = new Announcement(rs.getInt("announce_id"), rs.getString("content"));
                al.add(a);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return al;
    }
    
    public static boolean addAnnounce(Announcement a){
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
    
    public static void main(String[] args) {
        AnnouncementConntroller ac = new AnnouncementConntroller();
//        Announcement a1 = new Announcement("Final Exam 13 Dec 2019 !!!!");
//        ac.addAnnounce(a1);
        List<Announcement> al = ac.findAll();
        System.out.println(al);
    }
}
