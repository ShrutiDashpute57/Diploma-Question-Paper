package com.appdid.diploma_question_papers;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main9Activity extends AppCompatActivity {
    Button jk1,jk2,jk3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        jk1 = findViewById(R.id.jk1);
        jk2 = findViewById(R.id.jk2);
        jk3 = findViewById(R.id.jk3);

        jk1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("http://msbte.engg-info.website/sites/default/files/Summer%202016%201%20new/17624%202016%20Summer%20Question%20Paper.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });

        jk2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Uri uri = Uri.parse("http://msbte.engg-info.website/sites/default/files/Summer%202017%20Question%20papers%202/17624%202017%20Summer%20Question%20Paper.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

        jk3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uri = Uri.parse("http://msbte.engg-info.website/sites/default/files/s18%20papers%202/17624-2018-Summer-question-paper.pdf"); // missing 'http://' will cause crashed
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
        setTitle("Software Testing");
    }
}
