package com.haley.a1stcl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class check extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check);

        final Intent i = getIntent();

        final int r1 = i.getIntExtra("1", 0);
        final int r2 = i.getIntExtra("2", 0);
        final int r3 = i.getIntExtra("3", 0);
        final int r4 = i.getIntExtra("4", 0);
        final int r5 = i.getIntExtra("5", 0);
        final int r6 = i.getIntExtra("6", 0);

        final TextView tv = findViewById(R.id.textView2);

        final int result = r1 + r2 + r3 + r4 + r5 + r6;

        tv.setText("총 " +result+ "점");
    }
}