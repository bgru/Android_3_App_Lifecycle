package com.example_zarzadzanie_cykle_zycia_aplikacji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Second_Activity extends LifeCycleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }

    public void openA3(View view){
        startActivity(new Intent(this, Third_Activity.class));
    }

    public void close (View view){
        System.exit(0);
    }

}