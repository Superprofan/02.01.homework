package com.superprofan.threebuttonstwoactivities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    //public static final String EXTRA_TEXT = "com.superprofan.threebuttonstwoactivities.extra.REPLY";
    private EditText textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textResult = findViewById(R.id.et_result);
        Intent intent = getIntent();
        String display = intent.getStringExtra(MainActivity.EXTRA_TEXT);
        textResult.setText(display);
    }
}
