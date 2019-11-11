/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinn.model;

/**
 *
 * @author nattawanee.sks
 */
public class Score {
    private String st_id;
    private String quiz_id;
    private int score;

    public Score(String st_id, String quiz_id, int score) {
        this.st_id = st_id;
        this.quiz_id = quiz_id;
        this.score = score;
    }

    public String getSt_id() {
        return st_id;
    }

    public void setSt_id(String st_id) {
        this.st_id = st_id;
    }

    public String getQuiz_id() {
        return quiz_id;
    }

    public void setQuiz_id(String quiz_id) {
        this.quiz_id = quiz_id;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Score{" + "st_id=" + st_id + ", quiz_id=" + quiz_id + ", score=" + score + '}';
    }
    
    
}
