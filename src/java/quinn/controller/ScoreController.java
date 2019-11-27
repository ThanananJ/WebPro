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
import quinn.model.Score;

/**
 *
 * @author nattawanee.sks
 */
public class ScoreController {

    public static List<Score> findScoreByStudent(int std_id) {
        List<Score> sl = null;
        Connection conn = BuildConnection.getConnection();

        try {
            PreparedStatement pstm = conn.prepareStatement("SELECT * FROM score where st_id = ?");
            pstm.setInt(1, std_id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                if (sl == null) {
                    sl = new ArrayList(100);
                }
                Score s = new Score(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getInt(7));
                sl.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ScoreController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sl;
    }

    public static List<Score> findScoreByQuiz(int quiz_id) {
        List<Score> sl = null;
        Connection conn = BuildConnection.getConnection();

        try {
            PreparedStatement pstm = conn.prepareStatement("SELECT * FROM score where quiz_id = ?");
            pstm.setInt(1, quiz_id);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                if (sl == null) {
                    sl = new ArrayList(100);
                }
                Score s = new Score(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getInt(6), rs.getInt(7));
                sl.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ScoreController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sl;
    }

    public static boolean AddScore(Score s) {
        boolean fin = false;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO Score(st_id, stFName, stLName, quiz_id, description, score, maxscore) VALUES (?, ?, ?, ?, ? ,? ,?)");
            pstm.setInt(1, s.getSt_id());
            pstm.setString(2, s.getSt_fname());
            pstm.setString(3, s.getSt_lname());
            pstm.setInt(4, s.getQuiz_id());
            pstm.setString(5, s.getQuiz_name());
            pstm.setInt(6, s.getScore());
            pstm.setInt(7, s.getMaxscore());
            fin = pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fin;
    }

    public static boolean DeleteScore(Score s) {
        boolean fin = false;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("DELETE FROM score WHERE st_id = ? and quiz_id = ?");
            pstm.setInt(1, s.getSt_id());
            pstm.setInt(2, s.getQuiz_id());
            fin = pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fin;
    }

}
