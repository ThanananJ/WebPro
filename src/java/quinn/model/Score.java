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
    private int st_id;
    private int quiz_id;
    private int score;

    public Score(int quiz_id, int score) {
        this.quiz_id = quiz_id;
        this.score = score;
    }

    public Score(int score) {
        this.score = score;
    }

    public Score(int st_id, int quiz_id, int score) {
        this.st_id = st_id;
        this.quiz_id = quiz_id;
        this.score = score;
    }

    public int getSt_id() {
        return st_id;
    }

    public void setSt_id(int st_id) {
        this.st_id = st_id;
    }

    public int getQuiz_id() {
        return quiz_id;
    }

    public void setQuiz_id(int quiz_id) {
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
