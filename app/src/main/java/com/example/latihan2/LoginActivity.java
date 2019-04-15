package com.example.latihan2;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    EditText editUsername, editPassword;
    Button btnLogin;
    TextView txtRegis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editUsername = (EditText) findViewById(R.id.etlogin);
        editPassword = (EditText) findViewById(R.id.etpasword);
        btnLogin = (Button) findViewById(R.id.btnlogin);
        txtRegis = (TextView) findViewById(R.id.txtregistrasi);

        String Regis = "doesn't have account ? Register";

        SpannableString ss = new SpannableString(Regis);

        StyleSpan txtBold = new StyleSpan(Typeface.BOLD);

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setUnderlineText(false);
            }

            @Override
            public void onClick(@NonNull View view) {
                Intent intent = new Intent(LoginActivity.this, Register.class);
                startActivity(intent);
            }
        };

        ss.setSpan(clickableSpan1, 23, 31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(txtBold, 23, 31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txtRegis.setText(ss);
        txtRegis.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
