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
    private int item_id;
    private String description;
    private int quiz_id;

    public Item(int item_id, String description, int quiz_id) {
        this.item_id = item_id;
        this.description = description;
        this.quiz_id = quiz_id;
    }

    public int getItem_id() {
        return item_id;
    }

    public void setItem_id(int item_id) {
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

    public void setQuiz_id(int quiz_id) {
        this.quiz_id = quiz_id;
    }

    @Override
    public String toString() {
        return "Item{" + "item_id=" + item_id + ", description=" + description + ", quiz_id=" + quiz_id + '}';
    }
    
    
}
