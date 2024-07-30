package com.riwi.entities;

public class Board {
    private int id;
    private String title;
    private String description;
    private int user_id;

    public Board() {
    }

    public Board(String description, int id, String title, int user_id) {
        this.description = description;
        this.id = id;
        this.title = title;
        this.user_id = user_id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Board{" +
                "description='" + description + '\'' +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", user_id=" + user_id +
                '}';
    }
}
