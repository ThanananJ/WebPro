/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinn.model;

/**
 *
 * @author Mark
 */
public class Answer {
    private int answer_id;
    private String description;
    private boolean isCorrect;
    private int item_id;

    public Answer(int answer_id, String description, boolean isCorrect, int item_id) {
        this.answer_id = answer_id;
        this.description = description;
        this.isCorrect = isCorrect;
        this.item_id = item_id;
    }

    public Answer(String description, boolean isCorrect, int item_id) {
        this.description = description;
        this.isCorrect = isCorrect;
        this.item_id = item_id;
    }

    public int getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(int answer_id) {
        this.answer_id = answer_id;
    }

    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    @Override
    public String toString() {
        return "Answer{" + "answer_id=" + answer_id + ", description=" + description + ", isCorrect=" + isCorrect + ", item_id=" + item_id + '}';
    }
    
}
