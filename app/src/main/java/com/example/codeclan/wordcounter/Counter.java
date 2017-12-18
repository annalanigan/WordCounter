package com.example.codeclan.wordcounter;

/**
 * Created by annalanigan on 18/12/2017.
 */

public class Counter {

    private String input;

    public void Counter(){
        this.input = "";
    }

    public void setInput(String newInput){
        input = newInput;
    }

    public String getInput(){
        return input;
    }

    public int countWords(){
        String[] returning = input.split(" ");
        return returning.length;
    }

}

