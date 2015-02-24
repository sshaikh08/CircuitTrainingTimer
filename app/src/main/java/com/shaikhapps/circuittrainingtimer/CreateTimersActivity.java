package com.shaikhapps.circuittrainingtimer;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class CreateTimersActivity extends ActionBarActivity {

    public static final String TAG = CreateTimersActivity.class.getSimpleName();

    private int mHourTensValue;
    private int mHourOnesValue;
    private int mMinuteTensValue;
    private int mMinuteOnesValue;
    private int mSecondTensValue;
    private int mSecondOnesValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create);

        final TextView timer = (TextView) findViewById(R.id.timer);
        Button hourUpButton = (Button) findViewById(R.id.hourUpButton);
        Button hourDownButton = (Button) findViewById(R.id.hourDownButton);
        Button minuteUpButton = (Button) findViewById(R.id.minuteUpButton);
        Button minuteDownButton = (Button) findViewById(R.id.minuteDownButton);
        Button secondUpButton = (Button) findViewById(R.id.secondUpButton);
        Button secondDownButton = (Button) findViewById(R.id.secondDownButton);

        timer.setText("00:00:00");


        hourUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mHourOnesValue < 9 ) {
                    mHourOnesValue++;
                }
                else{
                    mHourOnesValue = 0;
                    mHourTensValue++;
                }
                if(mHourTensValue > 0 && mHourOnesValue > 2 ){
                    mHourOnesValue = 0;
                    mHourTensValue = 0;
                }


                timer.setText(String.valueOf(mHourTensValue) + String.valueOf(mHourOnesValue) + ":" + String.valueOf(mMinuteTensValue) + String.valueOf(mMinuteOnesValue) + ":"  + String.valueOf(mSecondTensValue) + String.valueOf(mSecondOnesValue ));
                //Toast.makeText(getBaseContext(), String.valueOf(mHourValue), Toast.LENGTH_SHORT).show();
            }
        });
        hourDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mHourTensValue == 1 && mHourOnesValue == 0){
                    mHourTensValue = 0;
                    mHourOnesValue = 9;
                }
                if(mHourTensValue < 1 && mHourOnesValue < 1){
                    mHourOnesValue = 2;
                    mHourTensValue = 1;
                }
                else{
                    mHourOnesValue--;
                }
                timer.setText(String.valueOf(mHourTensValue) + String.valueOf(mHourOnesValue) + ":" + String.valueOf(mMinuteTensValue) + String.valueOf(mMinuteOnesValue) + ":"  + String.valueOf(mSecondTensValue) + String.valueOf(mSecondOnesValue ));
            }
        });

        minuteUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mMinuteOnesValue < 9 ) {
                    mMinuteOnesValue++;
                }
                else{
                    mMinuteOnesValue = 0;
                    mMinuteTensValue++;
                }
                if(mMinuteTensValue > 5 && mMinuteOnesValue > 9 ){
                    mMinuteOnesValue = 0;
                    mMinuteTensValue = 0;
                }


                timer.setText(String.valueOf(mHourTensValue) + String.valueOf(mHourOnesValue) + ":" + String.valueOf(mMinuteTensValue) + String.valueOf(mMinuteOnesValue) + ":"  + String.valueOf(mSecondTensValue) + String.valueOf(mSecondOnesValue ));
                //Toast.makeText(getBaseContext(), String.valueOf(mHourValue), Toast.LENGTH_SHORT).show();
            }
        });
        minuteDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mMinuteTensValue == 1 && mMinuteOnesValue == 0){
                    mMinuteTensValue = 0;
                    mMinuteOnesValue = 9;
                }
                if(mMinuteTensValue < 1 && mMinuteOnesValue < 1){
                    mMinuteTensValue = 6;
                    mMinuteOnesValue = 0;
                }
                else{
                    mMinuteOnesValue--;
                }
                timer.setText(String.valueOf(mHourTensValue) + String.valueOf(mHourOnesValue) + ":" + String.valueOf(mMinuteTensValue) + String.valueOf(mMinuteOnesValue) + ":"  + String.valueOf(mSecondTensValue) + String.valueOf(mSecondOnesValue ));
            }
        });

        secondUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mSecondOnesValue < 9 ) {
                    mSecondOnesValue++;
                }
                else{
                    mSecondOnesValue = 0;
                    mSecondTensValue++;
                }
                if(mSecondTensValue > 5 && mSecondOnesValue > 9 ){
                    mSecondOnesValue = 0;
                    mSecondTensValue = 0;
                }


                timer.setText(String.valueOf(mHourTensValue) + String.valueOf(mHourOnesValue) + ":" + String.valueOf(mMinuteTensValue) + String.valueOf(mMinuteOnesValue) + ":"  + String.valueOf(mSecondTensValue) + String.valueOf(mSecondOnesValue ));
                //Toast.makeText(getBaseContext(), String.valueOf(mHourValue), Toast.LENGTH_SHORT).show();
            }
        });
        secondDownButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mSecondTensValue == 1 && mSecondOnesValue == 0){
                    mSecondTensValue = 0;
                    mSecondOnesValue = 9;
                }
                if(mSecondTensValue < 1 && mSecondOnesValue < 1){
                    mSecondTensValue = 6;
                    mSecondOnesValue = 0;
                }
                else{
                    mSecondOnesValue--;
                }
                timer.setText(String.valueOf(mHourTensValue) + String.valueOf(mHourOnesValue) + ":" + String.valueOf(mMinuteTensValue) + String.valueOf(mMinuteOnesValue) + ":"  + String.valueOf(mSecondTensValue) + String.valueOf(mSecondOnesValue ));
            }
        });

    }
}
