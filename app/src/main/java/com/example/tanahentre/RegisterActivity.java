package com.example.tanahentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        ImageView button_buatAkun = findViewById(R.id.button_buatAkun);

        button_buatAkun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent button_buatAkun = new Intent(RegisterActivity.this, LoginActivity.class);
                Toast.makeText(getApplicationContext(), "Register Success!", Toast.LENGTH_SHORT).show();
                startActivity(button_buatAkun);
            }
        });


        TextView login_akun = findViewById(R.id.login_akun);

        login_akun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login_akun = new Intent(RegisterActivity.this, LoginActivity.class);
                Toast.makeText(getApplicationContext(), "Go to Login Page!", Toast.LENGTH_SHORT).show();
                startActivity(login_akun);
            }
        });
    }
}