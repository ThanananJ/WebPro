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
    private String answer_id;
    private String description;
    private boolean isCorrect;
    private String item_id;

    public Answer(String answer_id, String description, boolean isCorrect, String item_id) {
        this.answer_id = answer_id;
        this.description = description;
        this.isCorrect = isCorrect;
        this.item_id = item_id;
    }

    public String getAnswer_id() {
        return answer_id;
    }

    public void setAnswer_id(String answer_id) {
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

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    @Override
    public String toString() {
        return "Answer{" + "answer_id=" + answer_id + ", description=" + description + ", isCorrect=" + isCorrect + ", item_id=" + item_id + '}';
    }
    
    
}
