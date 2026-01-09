package com.example.petshop;

import java.util.Date;

abstract class Mood {
    private Date date;

    public Mood(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDefault() {
        this.date = new Date();
    }

    public void dateConst(Date date) {
        this.date = date;
    }

    public abstract String returnMood();

}
