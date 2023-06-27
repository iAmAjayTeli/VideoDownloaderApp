package com.example.instareeldownloader;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().hide();
        Thread thread=new Thread(){
            @Override
            public void run() {
                try {
                   sleep(4000);
                }
                catch (Exception e)
                {
                    getAllStackTraces();

                }
                finally {
                    Intent intent=new Intent(SplashScreen.this,List.class);
                    startActivity(intent);
                    finish();
                }
            }
        }; thread.start();
    }

}