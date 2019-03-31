package com.example.startactivityforresult;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    private EditText inputET;
    private Button sendMS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        inputET = findViewById(R.id.inputET);
        sendMS = findViewById(R.id.sendMS);

        sendMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = inputET.getText().toString();
                if (!message.equals("")) {
                    Intent intent = new Intent();
                    intent.putExtra("value", message);
                    setResult(RESULT_OK,intent);
                    finish();
                }
            }
        });
    }
}
