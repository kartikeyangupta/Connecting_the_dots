package com.example.mr_robot.map_assignment;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Final_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_);
        final TextView tv = findViewById(R.id.tv1);
        final Button reset = findViewById(R.id.resetbtn);
        final Button exit = findViewById(R.id.exitbtn);
        Intent i = getIntent();
        String scorestr = i.getStringExtra("scoree");
        tv.setText(scorestr);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(Final_Activity.this,MainActivity.class);
                startActivity(i1);
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Final_Activity.super.onDestroy();
            }
        });
    }
}
