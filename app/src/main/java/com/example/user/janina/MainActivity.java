package com.example.user.janina;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void save(View view) {
        Intent intent =new Intent(this,HomeActivity.class);
        startActivity(intent);
    }

    public void saveus(View view) {
        Intent intent=new Intent(this,RegistrationActivity.class);
        startActivity(intent);
    }
}
