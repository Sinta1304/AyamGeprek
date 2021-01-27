package com.Sinta.ayamgeprek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final int welcomeScreenDisplay = 3000; // 3000 = 3 detik
        Thread welcomeThread = new Thread(){

            int wait = 0;
            @Override
            public void run (){
                try {
                    super.run();
                    while (wait < welcomeScreenDisplay){
                        sleep(100);
                        wait += 100;
                    }
                }   catch (Exception e) {
                    System.out.println("EXc=" + e);

                }finally {
                    Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                    finish();
                    startActivity(intent);
                }
            }
        };
        welcomeThread.start();
    }
}