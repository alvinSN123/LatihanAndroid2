package com.example.latihan2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VeifyActivity extends AppCompatActivity {

    Button btn_ver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veify);

        btn_ver = (Button) findViewById(R.id.btnsend);

        btn_ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(VeifyActivity.this,UserActivity.class);
                startActivity(intent);
            }
        });
    }
}
