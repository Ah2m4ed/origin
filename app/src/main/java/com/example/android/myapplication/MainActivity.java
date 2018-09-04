package com.example.android.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    private Button fuck;
    private int i=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fuck=(Button) findViewById(R.id.fuck);
        fuck.setBackgroundResource(R.drawable.circle_button);
        fuck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (view == fuck){
                    if ((i%2)==0) {
                        fuck.setBackgroundResource(R.drawable.pause_button);
                        i++;
                    }

                    else {
                        fuck.setBackgroundResource(R.drawable.circle_button);
                        i++;
                    }
                }
            }
        });
    }
}
