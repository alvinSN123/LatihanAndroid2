package com.example.latihan2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlmostActivity extends AppCompatActivity {

    Button btnver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost);

        btnver = (Button) findViewById(R.id.btnverify);

        btnver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AlmostActivity.this,VeifyActivity.class);
                startActivity(intent);
            }
        });

    }
}
