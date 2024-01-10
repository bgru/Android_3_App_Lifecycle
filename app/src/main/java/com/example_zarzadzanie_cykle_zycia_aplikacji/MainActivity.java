package com.example_zarzadzanie_cykle_zycia_aplikacji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Chronometer;

public class MainActivity extends LifeCycleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Chronometer clock = findViewById(R.id.chronometer);
        clock.start();
    }

    public void openA2(View view){
        startActivity(new Intent(this, Second_Activity.class));
    }

    public void close (View view){
        System.exit(0);
    }

}

