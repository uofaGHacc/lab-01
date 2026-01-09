package com.example.petshop;

class Scorpion extends Pet {

    public Scorpion(String name) {
        super(name);
    }

    @Override public String speak() {
        return "hiss";
    }

}
