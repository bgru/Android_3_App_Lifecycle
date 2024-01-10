package com.example_zarzadzanie_cykle_zycia_aplikacji;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Third_Activity extends LifeCycleActivity {

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void close(View view) {
        System.exit(0);
    }

    @Override
    protected void onResume() {
        TextView textView = findViewById(R.id.counterView);
        textView.setText(String.valueOf(counter));
        super.onResume();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        counter++;
        outState.putInt("key1", counter);
        makeToast("onSaveInstanceState");
        makeNotification("onSaveInstanceState");
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle outState) {
        counter = outState.getInt("key1", counter);
        makeToast("onRestoreInstanceState");
        makeNotification("onRestoreInstanceState");
        super.onRestoreInstanceState(outState);
    }

}