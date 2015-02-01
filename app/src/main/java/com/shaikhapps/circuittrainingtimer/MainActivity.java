package com.shaikhapps.circuittrainingtimer;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button startCreateTimerActivityButton = (Button) findViewById(R.id.createTimerButton);

        startCreateTimerActivityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                createTimer();
            }
        });

    }

    private void createTimer(){
        Intent intent = new Intent(this, CreateTimersActivity.class);
        startActivity(intent);

    }
}
