package com.haley.a1stcl;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class list extends AppCompatActivity {

    int result1 = 0;
    int result2 = 0;
    int result3 = 0;
    int result4 = 0;
    int result5 = 0;
    int result6 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        CollapsingToolbarLayout toolBarLayout = (CollapsingToolbarLayout) findViewById(R.id.toolbar_layout);
        toolBarLayout.setTitle("오늘의 CheckList");

        RadioGroup rg1 = findViewById(R.id.Q1group);
        RadioGroup rg2 = findViewById(R.id.Q2group);
        RadioGroup rg3 = findViewById(R.id.Q3group);
        RadioGroup rg4 = findViewById(R.id.Q4group);
        RadioGroup rg5 = findViewById(R.id.Q5group);
        RadioGroup rg6 = findViewById(R.id.Q6group);


        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.Q1A1) result1 = (int) 1;
                if (checkedId == R.id.Q1A2) result1 = (int) 2;
                if (checkedId == R.id.Q1A3) result1 = (int) 3;
                if (checkedId == R.id.Q1A4) result1 = (int) 4;
            }
        });

        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.Q2A1) result2 = (int) 4;
                if (checkedId == R.id.Q2A2) result2 = (int) 3;
                if (checkedId == R.id.Q2A3) result2 = (int) 2;
                if (checkedId == R.id.Q2A4) result2 = (int) 1;
            }
        });

        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {


            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.Q3A1) result3 = (int) 2;
                if (checkedId == R.id.Q3A2) result3 = (int) 3;
                if (checkedId == R.id.Q3A3) result3 = (int) 4;
                if (checkedId == R.id.Q3A4) result3 = (int) 1;
            }
        });

        rg4.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.Q4A1) result4 = (int) 1;
                if (checkedId == R.id.Q4A2) result4 = (int) 2;
                if (checkedId == R.id.Q4A3) result4 = (int) 4;
                if (checkedId == R.id.Q4A4) result4 = (int) 3;
            }
        });

        rg5.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.Q5A1) result5 = (int) 1;
                if (checkedId == R.id.Q5A2) result5 = (int) 2;
                if (checkedId == R.id.Q5A3) result5 = (int) 4;
                if (checkedId == R.id.Q5A4) result5 = (int) 3;
            }
        });

        rg6.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.Q6A1) result6 = (int) 1;
                if (checkedId == R.id.Q6A2) result6 = (int) 2;
                if (checkedId == R.id.Q6A3) result6 = (int) 4;
                if (checkedId == R.id.Q6A4) result6 = (int) 3;
            }
        });

        Button b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), check.class);
                intent.putExtra("1", result1);
                intent.putExtra("2", result2);
                intent.putExtra("3", result3);
                intent.putExtra("4", result4);
                intent.putExtra("5", result5);
                intent.putExtra("6", result6);
                startActivity(intent);

                finish();
            }
        });
    }
}