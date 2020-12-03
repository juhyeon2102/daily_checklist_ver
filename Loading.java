package com.example.daily_checklist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Loading extends AppCompatActivity {

    private Button btn_move;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);

        btn_move = findViewById(R.id.btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( Loading.this , MainActivity.class);
                startActivity(intent);      // 액티비티 이동.
            }
        });


    }
}