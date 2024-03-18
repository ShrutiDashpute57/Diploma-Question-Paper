package com.appdid.diploma_question_papers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    Button com1,com2,com3,com4;
    Button coms1,coms2,coms3,coms4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        com1 = findViewById(R.id.com1);
        com2 = findViewById(R.id.com2);
        com3 = findViewById(R.id.com3);
        com4 = findViewById(R.id.com4);
        coms1 = findViewById(R.id.coms1);
        coms2 = findViewById(R.id.coms2);
        coms3 = findViewById(R.id.coms3);
        coms4 = findViewById(R.id.coms4);

        com1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Main11Activity.class);
                startActivity(intent);
            }
        });


        com2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Main12Activity.class);
                startActivity(intent);
            }
        });

        com3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Main13Activity.class);
                startActivity(intent);
            }
        });


        com4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Main14Activity.class);
                startActivity(intent);
            }
        });


        coms1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Main15Activity.class);
                startActivity(intent);
            }
        });


        coms2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Main16Activity.class);
                startActivity(intent);
            }
        });

        coms3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Main17Activity.class);
                startActivity(intent);
            }
        });


        coms4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main3Activity.this,Main18Activity.class);
                startActivity(intent);
            }
        });


        setTitle("Computer");



    }
}
