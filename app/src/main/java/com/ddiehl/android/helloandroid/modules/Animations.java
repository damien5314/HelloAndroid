package com.ddiehl.android.helloandroid.modules;

import android.app.Activity;
import android.os.Bundle;

import com.ddiehl.android.helloandroid.R;

public class Animations extends Activity {
    private static final String TAG = Animations.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animations);

    }
}
