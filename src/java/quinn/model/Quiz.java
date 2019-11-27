/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinn.model;

import quinn.controller.TeacherController;

/**
 *
 * @author Mark
 */
public class Quiz {

    private int quiz_id;
    private String description;
    private String subject;
    private String type;
    private int quizOwner;
    private String classAllowToDo;
    private int maxScore;

    //ใช้เวลา SELECT
    public Quiz(int quiz_id, String description, String subject, String type, int quizOwner, String classAllowToDo, int maxScore) {
        this.quiz_id = quiz_id;
        this.description = description;
        this.subject = subject;
        this.type = type;
        this.quizOwner = quizOwner;
        this.classAllowToDo = classAllowToDo;
        this.maxScore = maxScore;
    }

    //ใช้เวลา add delete
    public Quiz(String description, String subject, String type, int quizOwner, String classAllowToDo, int maxScore) {
        this.description = description;
        this.subject = subject;
        this.type = type;
        this.quizOwner = quizOwner;
        this.classAllowToDo = classAllowToDo;
        this.maxScore = maxScore;
    }

    public int getQuiz_id() {
        return quiz_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuizOwner() {
        return quizOwner;
    }

    public void setQuizOwner(int quizOwner) {
        TeacherController tc = new TeacherController();
        Teacher owner = tc.findByTeacherId(quizOwner);
        this.quizOwner = owner.getUserName();
    }

    public String getClassAllowToDo() {
        return classAllowToDo;
    }

    public void setClassAllowToDo(String classAllowToDo) {
        this.classAllowToDo = classAllowToDo;
    }

    public int getMaxScore() {
        return maxScore;
    }

    public void setMaxScore(int maxScore) {
        this.maxScore = maxScore;
    }

    @Override
    public String toString() {
        return "Quiz{" + "quiz_id=" + quiz_id + ", description=" + description + ", subject=" + subject + ", type=" + type + ", quizOwner=" + quizOwner + ", classAllowToDo=" + classAllowToDo + ", maxScore=" + maxScore + '}';
    }

    public static void main(String[] args) {
        Quiz q = new Quiz(1, "eng", "Thai", "1", 1, "401", 2);
        System.out.println(q.type);
    }
}
