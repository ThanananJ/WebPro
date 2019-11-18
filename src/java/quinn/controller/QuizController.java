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
import quinn.model.Answer;
import quinn.model.Item;
import quinn.model.Quiz;
import quinn.model.Student;
import quinn.model.Teacher;

/**
 *
 * @author nattawanee.sks
 */
public class QuizController {
    //New
    public static List<Quiz> findByDescription(String findDesc,String findGrade,String findSubject){
        List<Quiz> list = null;
        Quiz q;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from quizes where description LIKE ? and CLASS_ID LIKE ? AND SUBJECT LIKE ?");
            pstm.setString(1, "%"+findDesc+"%");
            pstm.setString(2, findGrade+"%");
            pstm.setString(3, findSubject);
            ResultSet rs = null;
            rs = pstm.executeQuery();
            while(rs.next()){
                if(list == null){
                    list = new ArrayList(100);
                }
                q = new Quiz(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getInt(7));
                list.add(q);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static List<Quiz> findByGradeSubject(String findGrade,String findSubject){
        List<Quiz> list = null;
        Quiz q;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from quizes where class_id LIKE ? AND SUBJECT LIKE ?");
            pstm.setString(1, findGrade+"%");
            pstm.setString(2, "%"+findSubject+"%");
            ResultSet rs = null;
            rs = pstm.executeQuery();
            while(rs.next()){
                if(list == null){
                    list = new ArrayList(100);
                }
                q = new Quiz(rs.getInt("quiz_id"),rs.getString("description"), rs.getString("subject"), rs.getString("q_type"), rs.getInt("t_id"), rs.getString("class_id"), rs.getInt("maxscore"));
                list.add(q);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static List<Quiz> findByTeacherId(int findTeacherId){
        List<Quiz> list = null;
        Quiz q;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from quizes where T_ID = ?");
            pstm.setInt(1, findTeacherId);
            ResultSet rs = null;
            rs = pstm.executeQuery();
            while(rs.next()){
                if(list == null){
                    list = new ArrayList(100);
                }
                q = new Quiz(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getInt(7));
                list.add(q);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static List<Quiz> findByDesc(String find){
        List<Quiz> list = null;
        Quiz q;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from quizes where description LIKE ?");
            pstm.setString(1, find);
            ResultSet rs = null;
            rs = pstm.executeQuery();
            while(rs.next()){
                if(list == null){
                    list = new ArrayList(100);
                }
                q = new Quiz(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getInt(7));
                list.add(q);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static List<Quiz> findByGrade(String find){
        List<Quiz> list = null;
        Quiz q;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from quizes where class_id LIKE ?");
            pstm.setString(1, find+"%");
            ResultSet rs = null;
            rs = pstm.executeQuery();
            while(rs.next()){
                if(list == null){
                    list = new ArrayList(100);
                }
                q = new Quiz(rs.getInt("quiz_id"),rs.getString("description"), rs.getString("subject"), rs.getString("q_type"), rs.getInt("t_id"), rs.getString("class_id"), rs.getInt(7));
                list.add(q);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static List<Quiz> findBySubject(String find){
        List<Quiz> list = null;
        Quiz q;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from quizes where subject LIKE ?");
            pstm.setString(1, "%"+find+"%");
            ResultSet rs = null;
            rs = pstm.executeQuery();
            while(rs.next()){
                if(list == null){
                    list = new ArrayList(100);
                }
                q = new Quiz(rs.getInt("quiz_id"),rs.getString("description"), rs.getString("subject"), rs.getString("q_type"), rs.getInt("t_id"), rs.getString("class_id"), rs.getInt(7));
                list.add(q);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
    public static Quiz findByQuizID(int quiz_id){
        Quiz q = null;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("SELECT * FROM quizes where quiz_id = ?");
            pstm.setInt(1, quiz_id);
            ResultSet rs = pstm.executeQuery();
            if(rs.next()){
                q = new Quiz(rs.getInt(1),rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getInt(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return q;
    }
    
    public static List<Item> findItem(int quiz_id){
        List<Item> items = null;
        Item i = null;
        Connection conn = BuildConnection.getConnection();
        
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from items where quiz_id = ?");
            pstm.setInt(1, quiz_id);
            ResultSet rs = null;
            rs = pstm.executeQuery();
            while(rs.next()){
                if(items ==null){
                    items = new ArrayList(100);
                }
                i = new Item(rs.getInt("item_id"), rs.getString("description"), rs.getInt("quiz_id"));
                items.add(i);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }
     public static Item findItemById(String des,int quiz_id){
        Item items = null;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from items where description like ? and quiz_id = ?");
            pstm.setString(1, des);
            pstm.setInt(2, quiz_id);
            ResultSet rs = null;
            rs = pstm.executeQuery();
            if(rs.next()){
                items = new Item(rs.getInt("item_id"), rs.getString("description"), rs.getInt("quiz_id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return items;
    }
    
    public static List<Answer> findAnswer(int item_id){
        List<Answer> answers = null;
        Answer a = null;
        Connection conn = BuildConnection.getConnection();
        
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from answers where item_id = ?");
            pstm.setInt(1, item_id);
            ResultSet rs = null;
            rs = pstm.executeQuery();
            while(rs.next()){
                if(answers ==null){
                    answers = new ArrayList(100);
                }
                a = new Answer(rs.getInt("answer_id"), rs.getString("description"), rs.getBoolean("isCorrect"), rs.getInt("item_id"));
                answers.add(a);
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return answers;
    }
    
    public static boolean findIsAnswer(String answer, int item_id){
        Answer a = null;
        boolean isAnswer = false;
        Connection conn = BuildConnection.getConnection();
        
        try {
            PreparedStatement pstm = conn.prepareStatement("select * from answers where item_id = ? and description LIKE ?");
            pstm.setInt(1, item_id);
            pstm.setString(2, "%" + answer + "%");
            ResultSet rs = null;
            rs = pstm.executeQuery();
            if(rs.next()){
                a = new Answer(rs.getInt("answer_id"), rs.getString("description"), rs.getBoolean("isCorrect"), rs.getInt("item_id"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a != null;
    }
    
    public static boolean addQuiz(Quiz q){
        Connection conn = BuildConnection.getConnection();
        boolean fin = false;
        try {
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO quizes(description, subject, q_type, t_id, class_id, maxscore) VALUES (?, ?, ?, ?, ?, ?)");
            pstm.setString(1, q.getDescription());
            pstm.setString(2, q.getSubject());
            pstm.setString(3, q.getType());
            pstm.setInt(4, q.getQuizOwner());
            pstm.setString(5, q.getClassAllowToDo());
            pstm.setInt(6, q.getMaxScore());
            fin = pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fin;
    }
    
    public static boolean addItem(Item i, Quiz q){
        Connection conn = BuildConnection.getConnection();
        boolean fin = false;
        try {
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO items(description, quiz_id) VALUES (?, ?)");
            pstm.setString(1, i.getDescription());
            pstm.setInt(2, q.getQuiz_id());
            fin = pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fin;
    }
    
    public static boolean addAnswer(Item i, Answer a){
        Connection conn = BuildConnection.getConnection();
        boolean fin = false;
        try {
            PreparedStatement pstm = conn.prepareStatement("INSERT INTO answers(description, isCorrect, item_id) VALUES (?, ?, ?)");
            pstm.setString(1, a.getDescription());
            pstm.setBoolean(2, a.isIsCorrect());
            pstm.setInt(3, i.getItem_id());
            fin = pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fin;
    }
    
    public static boolean deleteQuiz(Quiz q){
        Connection conn = BuildConnection.getConnection();
        boolean fin = false;
        try {
            PreparedStatement pstm = conn.prepareStatement("DELETE FROM quizes where quiz_id = ?");
            pstm.setInt(1, q.getQuiz_id());
            pstm.execute();
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fin;
    }
    
    public static boolean EditQuiz(Quiz q){
        Connection conn = BuildConnection.getConnection();
        boolean fin = false;
        try {
            PreparedStatement pstm = conn.prepareStatement("UPDATE quizes SET Description = ?, Subject = ?, q_type = ?, t_id = ?, class_id = ?, maxscore = ? WHERE quiz_id = ?");
            pstm.setString(1, q.getDescription());
            pstm.setString(2, q.getSubject());
            pstm.setString(3, q.getType());
            pstm.setInt(4, q.getQuizOwner());
            pstm.setString(5, q.getClassAllowToDo());
            pstm.setInt(6, q.getMaxScore());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return fin;
    }
    
    public static boolean EditItem(Answer a){
        Connection conn = BuildConnection.getConnection();
        boolean fin = false;
        try {
            PreparedStatement pstm = conn.prepareStatement("UPDATE items SET Description = ? WHERE item_id = ?");
            pstm.setString(1, a.getDescription());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return fin;
    }
    
    public static boolean EditAnswer(Answer a){
        Connection conn = BuildConnection.getConnection();
        boolean fin = false;
        try {
            PreparedStatement pstm = conn.prepareStatement("UPDATE answer SET Description = ?, isCorrect = ? WHERE quiz_id = ?");
            pstm.setString(1, a.getDescription());
            pstm.setBoolean(2, a.isIsCorrect());
            pstm.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(QuizController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return fin;
    }
    
    public static void main(String[] args) {
//        QuizController qc = new QuizController();
//        List<Quiz> q = qc.findByTeacherId(61);
//        q = qc.findByGradeSubject("5","Mathematic");
        
        
//        System.out.println(q.get(0).getDescription());
//        List<Item> i = qc.findItem(2);
//        System.out.println();
//        List<Answer> a = qc.findAnswer("000002");
//        System.out.println(a);
//        Quiz q = new Quiz("Math quiz II", "Math", "2", 3, "601", 2);
//        Quiz q1 = qc.findByDesc(q.getDescription()).get(0);
//        qc.addQuiz(q);
////        
//        List<Quiz> ql = qc.findByDesc(" ");
//        System.out.println(q1.getQuiz_id());

//        Item i = new Item("c", q1.getQuiz_id());
//        qc.addItem(i,q1);
//        System.out.println(i.getItem_id());
//        Item it = qc.findItemById(i.getDescription(),i.getQuiz_id());
//        System.out.println(it.getItem_id());
//        System.out.println(i);
//        boolean a = qc.findIsAnswer("sky", i.getItem_id());
//        System.out.println(a);
//          Quiz qp = new Quiz("Math quiz 3", "Mathematics","3",1,"602",10);
//          qc.addQuiz(qp);
    }
}
