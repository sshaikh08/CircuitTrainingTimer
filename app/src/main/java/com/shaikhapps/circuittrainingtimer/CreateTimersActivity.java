package com.shaikhapps.circuittrainingtimer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class CreateTimersActivity extends ActionBarActivity {

    public static final String TAG = CreateTimersActivity.class.getSimpleName();
    private int timerIntAtOnes;
    private int timerIntAtTens;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        final TextView timer = (TextView) findViewById(R.id.timer);
        Button hourUpButton = (Button) findViewById(R.id.hourUpButton);
        Button hourDownButton = (Button) findViewById(R.id.hourDownButton);

        timer.setText("00:00:00");
        /*int values return is ASC|| values of the integers in char form so to
         get exact values I subtract 48 because the char 0 is 48 as an int*/
        timerIntAtOnes = timer.getText().charAt(1) - 48;
        timerIntAtTens = timer.getText().charAt(0) - 48;
        hourUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timerIntAtOnes < 9 ) {
                    timerIntAtOnes++;
                }
                else{
                    timerIntAtOnes = 0;
                    timerIntAtTens++;
                }
                if(timerIntAtTens > 0 && timerIntAtOnes > 2 ){
                    timerIntAtOnes = 0;
                    timerIntAtTens = 0;
                }
                timer.setText(String.valueOf(timerIntAtTens) + String.valueOf(timerIntAtOnes) + ":00:00");
                //Toast.makeText(getBaseContext(), String.valueOf(timerIntAtTens) + "," + String.valueOf(timerIntAtOnes), Toast.LENGTH_SHORT).show();
            }
        });
        hourDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(timerIntAtTens == 1 && timerIntAtOnes == 0){
                    timerIntAtTens = 0;
                    timerIntAtOnes = 9;
                }
                if(timerIntAtTens < 1 && timerIntAtOnes < 1){
                    timerIntAtOnes = 2;
                    timerIntAtTens = 1;
                }
                else{
                    timerIntAtOnes--;
                }
                timer.setText(String.valueOf(timerIntAtTens) + String.valueOf(timerIntAtOnes) + ":00:00");
            }
        });

    }
}
