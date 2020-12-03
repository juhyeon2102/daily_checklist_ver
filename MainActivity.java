package com.example.daily_checklist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    CalendarView cal;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cal = (CalendarView)findViewById(R.id.calendarView);
        text = (TextView)findViewById(R.id.editTextDate);

        CalendarViewListener listener = new CalendarViewListener();
        cal.setOnDateChangeListener(listener);
    }

    public void getDate(View view){
            long time = cal.getDate();
            Date d1 = new Date(time);
            Calendar c = Calendar.getInstance();
            c.setTime(d1);

            int year = c.get((Calendar.YEAR));
            int month = c.get(Calendar.MONTH) + 1;
            int day = c.get(Calendar.DAY_OF_MONTH);

            text.setText(year + "년" + month + "월" + day + "일");
        }

        class CalendarViewListener implements CalendarView.OnDateChangeListener{

            @Override
            public void onSelectedDayChange(CalendarView arg0, int arg1, int arg2, int arg3)
            {
                text.setText(arg1 + "년" + (arg2 + 1) + "월" + arg3 + "일");
            }
        }
}