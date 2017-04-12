package com.hensen.marqueeview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {

    private ViewFlipper vf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vf = (ViewFlipper) findViewById(R.id.vf);
        vf.addView(View.inflate(this, R.layout.view_advertisement01, null));
        vf.addView(View.inflate(this, R.layout.view_advertisement02, null));
        vf.addView(View.inflate(this, R.layout.view_advertisement03, null));
    }
}
