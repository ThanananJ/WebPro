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
    private String st_fname;
    private String st_lname;
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

    public Score(int st_id, String st_fname, String st_lname, int quiz_id, String quiz_name, int score, int maxscore) {
        this.st_id = st_id;
        this.st_fname = st_fname;
        this.st_lname = st_lname;
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

    public String getSt_fname() {
        return st_fname;
    }

    public void setSt_fname(String st_fname) {
        this.st_fname = st_fname;
    }

    public String getSt_lname() {
        return st_lname;
    }

    public void setSt_lname(String st_lname) {
        this.st_lname = st_lname;
    }

    @Override
    public String toString() {
        return "Score{" + "st_id=" + st_id + ", st_fname=" + st_fname + ", st_lname=" + st_lname + ", quiz_id=" + quiz_id + ", quiz_name=" + quiz_name + ", score=" + score + ", maxscore=" + maxscore + '}';
    }

}
