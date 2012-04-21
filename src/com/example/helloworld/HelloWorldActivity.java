package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class HelloWorldActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("HELLO", "Hello Android!!! edit edit edit ");
        setContentView(R.layout.main);
    }
}