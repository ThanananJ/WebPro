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
public class Item {
    private String item_id;
    private String description;
    private String quiz_id;

    public Item(String item_id, String description, String quiz_id) {
        this.item_id = item_id;
        this.description = description;
        this.quiz_id = quiz_id;
    }

    public String getItem_id() {
        return item_id;
    }

    public void setItem_id(String item_id) {
        this.item_id = item_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuiz_id() {
        return quiz_id;
    }

    public void setQuiz_id(String quiz_id) {
        this.quiz_id = quiz_id;
    }

    @Override
    public String toString() {
        return "Item{" + "item_id=" + item_id + ", description=" + description + ", quiz_id=" + quiz_id + '}';
    }
    
    
}
