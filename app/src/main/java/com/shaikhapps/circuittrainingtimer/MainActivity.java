package com.shaikhapps.circuittrainingtimer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    public static final String TAG = MainActivity.class.getSimpleName();
    int timerIntAtOnes;
    int timerIntAtTens;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView initialTimer = (TextView) findViewById(R.id.timer);
        final Button hourUpButton = (Button) findViewById(R.id.hourUpButton);

        initialTimer.setText("00:00:00");
        timerIntAtOnes = initialTimer.getText().charAt(1);
        timerIntAtTens = initialTimer.getText().charAt(0);
        hourUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (timerIntAtOnes < 57 )/*57 because 9 + 48 = 57*/ {
                    timerIntAtOnes++;
                }
                else{
                    timerIntAtOnes = 48;
                    timerIntAtTens++;
                }
                if(timerIntAtTens > 48 && timerIntAtOnes > 50 ){
                    timerIntAtOnes = 48;
                    timerIntAtTens = 48;
                }
                initialTimer.setText(String.valueOf(timerIntAtTens - 48) + String.valueOf(timerIntAtOnes - 48) + ":00:00");
                //Toast.makeText(getBaseContext(), String.valueOf(timerIntAtTens) + "," + String.valueOf(timerIntAtOnes), Toast.LENGTH_SHORT).show();
            }
        });
    }


}
