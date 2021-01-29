package com.lifu.plainnotes.model;

import java.util.Date;

import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName="notes")
public class NoteEntity {
    @PrimaryKey
    private int id;
    private Date date;
    private String txt;

    @Ignore
    public NoteEntity() {
    }

    public NoteEntity(int id, Date date, String txt) {
        this.id = id;
        this.date = date;
        this.txt = txt;
    }

    @Ignore
    public NoteEntity(int id, String txt) {
        this.id = id;
        this.txt = txt;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    @Override
    public String toString() {
        return "NoteEntity{" +
                "id=" + id +
                ", date=" + date +
                ", txt='" + txt + '\'' +
                '}';
    }
}
