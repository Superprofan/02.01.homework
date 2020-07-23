package com.superprofan.threebuttonstwoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_TEXT= "com.superprofan.threebuttonstwoactivities.extra.MESSAGE";

    Button choiceOne, choiceTwo, choiceThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      /*  choiceOne = findViewById(R.id.button1);
        choiceTwo = findViewById(R.id.button2);
        choiceThree = findViewById(R.id.button3);*/
    }

    public void choice(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        switch (view.getId()){
            case R.id.button1:
                intent.putExtra(EXTRA_TEXT, getString(R.string.choice_1_text));
                startActivity(intent);
                break;
            case R.id.button2:
                intent.putExtra(EXTRA_TEXT, getString(R.string.choice_2_text));
                startActivity(intent);
                break;
            case R.id.button3:
                intent.putExtra(EXTRA_TEXT, getString(R.string.choice_3_text));
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}