package com.example.petshop;

import java.util.Date;

class Happy extends Mood {
    public Happy(Date date) {
        super(date);
    }

    @Override public String returnMood() {
        return "Happy";
    }

}
