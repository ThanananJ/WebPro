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
    private String quiz_name;
    private int score;
    private int maxscore;

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

    public Score(int st_id, int quiz_id, String quiz_name, int score, int maxscore) {
        this.st_id = st_id;
        this.quiz_id = quiz_id;
        this.quiz_name = quiz_name;
        this.score = score;
        this.maxscore = maxscore;
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

    public String getQuiz_name() {
        return quiz_name;
    }

    public void setQuiz_name(String quiz_name) {
        this.quiz_name = quiz_name;
    }

    public int getMaxscore() {
        return maxscore;
    }

    public void setMaxscore(int maxscore) {
        this.maxscore = maxscore;
    }
    
    @Override
    public String toString() {
        return "Score{" + "st_id=" + st_id + ", quiz_id=" + quiz_id + ", quiz_name=" + quiz_name + ", score=" + score + ", maxscore=" + maxscore + '}';
    }
    
}
