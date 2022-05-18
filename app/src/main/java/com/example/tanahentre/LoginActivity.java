package com.example.tanahentre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ImageView button_login = findViewById(R.id.button_login);

        button_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent button_login = new Intent(LoginActivity.this, MainActivity.class);
                Toast.makeText(getApplicationContext(), "Login Success!", Toast.LENGTH_SHORT).show();
                startActivity(button_login);
            }
        });


        TextView daftar_akun = findViewById(R.id.daftar_akun);

        daftar_akun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent daftar_akun = new Intent(LoginActivity.this, RegisterActivity.class);
                Toast.makeText(getApplicationContext(), "Go to Register Page!", Toast.LENGTH_SHORT).show();
                startActivity(daftar_akun);
            }
        });
    }
}