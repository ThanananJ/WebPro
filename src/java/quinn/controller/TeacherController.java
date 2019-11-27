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
import java.util.logging.Level;
import java.util.logging.Logger;
import quinn.db.BuildConnection;
import quinn.model.Student;
import quinn.model.Teacher;

/**
 *
 * @author nattawanee.sks
 */
public class TeacherController {

    public static Teacher findByTeacherId(int teacherId) {
        Teacher t = null;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from teacher where t_id = ?");
            pstm.setInt(1, teacherId);
            ResultSet rs = null;
            rs = pstm.executeQuery();
            if (rs.next()) {
                t = new Teacher(rs.getInt("t_id"), rs.getString("f_name"), rs.getString("l_name"), rs.getString("password"), rs.getString("class_id"));
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }

    public static Teacher findByTeacherFullName(String teacherFristName, String teacherLastName) {
        Teacher t = null;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from teacher where f_name like ? and l_name like ?");
            pstm.setString(1, teacherFristName);
            pstm.setString(2, teacherLastName);
            ResultSet rs = null;
            rs = pstm.executeQuery();
            if (rs.next()) {
                t = new Teacher(rs.getInt("t_id"), rs.getString("f_name"), rs.getString("l_name"), rs.getString("password"), rs.getString("class_id"));
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }

}
