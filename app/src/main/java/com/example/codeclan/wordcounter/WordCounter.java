package com.example.codeclan.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounter extends AppCompatActivity {

    Button submitButton;
    EditText inputText;
    TextView outputText;
    Counter countMe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        submitButton = findViewById(R.id.submit_button);
        inputText = findViewById(R.id.input_text);
        outputText = findViewById(R.id.output_text);
        countMe = new Counter();
    }

    public void onSubmitButtonClicked(View button){
        String sentence = inputText.getText().toString();
        countMe.setInput(sentence);
        int response = countMe.countWords();
        outputText.setText(countMe.outputString());
    }


}
