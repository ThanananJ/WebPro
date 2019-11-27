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
public class Announcement {

    private int an_id;
    private String content;

    public Announcement(int id, String content) {
        this.content = content;
    }

    public Announcement(String content) {
        this.content = content;
    }

    public int getAn_id() {
        return an_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Announcement{" + "an_id=" + an_id + ", content=" + content + '}';
    }

}
