package com.example.codeclan.wordcounter;

import java.util.HashMap;

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

    public String outputString() {
            return "The total word count is " + countWords();
    }


    public String occurances() {
        HashMap<String, Integer> sentence = new HashMap<>();
        String[] returning = input.split(" ");
        String finalOutput = "";
        for (int i = 0; i < countWords(); i++) {
            if (!sentence.containsKey(returning[i])) {
                sentence.put(returning[i], 1);
            } else {
                sentence.put(returning[i], (Integer) sentence.get(returning[i]) + 1);
            }
        } for (Object item : sentence.keySet()){
            finalOutput += item + " " + (Integer) sentence.get(item) + "; ";
        }
        return finalOutput;
    }


}

