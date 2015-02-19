package com.shaikhapps.circuittrainingtimer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class CreateTimersActivity extends ActionBarActivity {

    public static final String TAG = CreateTimersActivity.class.getSimpleName();

    private int hourValue;
    private int hourOnesValue;
    private int hourTensValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        final TextView timer = (TextView) findViewById(R.id.timer);
        Button hourUpButton = (Button) findViewById(R.id.hourUpButton);
        Button hourDownButton = (Button) findViewById(R.id.hourDownButton);

        timer.setText("00:00:00");
        hourOnesValue = Character.getNumericValue(timer.getText().charAt(1));
        hourTensValue = Character.getNumericValue(timer.getText().charAt(0))*10;

        hourUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                hourValue = hourTensValue  + hourOnesValue;
                if (hourValue < 12){
                    hourValue++;
                }
                else{
                    hourValue = 0;
                }

                //timer.setText(String.valueOf(hourTensValue) + String.valueOf(hourOnesValue) + ":00:00");
                Toast.makeText(getBaseContext(), String.valueOf(hourValue), Toast.LENGTH_SHORT).show();
            }
        });
        /*hourDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(hourTensValue == 1 && hourOnesValue == 0){
                    hourTensValue = 0;
                    hourOnesValue = 9;
                }
                if(hourTensValue < 1 && hourOnesValue < 1){
                    hourOnesValue = 2;
                    hourTensValue = 1;
                }
                else{
                    hourOnesValue--;
                }
                timer.setText(String.valueOf(hourTensValue) + String.valueOf(hourOnesValue) + ":00:00");
            }
        });*/

    }
}
