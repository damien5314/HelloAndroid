package com.ddiehl.android.helloandroid.modules;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.ddiehl.android.helloandroid.R;

/**
 * Created by Damien on 10/30/2014.
 */
public class EditTextChangeListener extends Activity {
    private static final String TAG = EditTextChangeListener.class.getSimpleName();
    int value = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_text_change_listener);

        EditText et = (EditText) findViewById(R.id.editText);

        et.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                if (b) {
                    ((EditText)view).setText(String.valueOf(value));
                } else {
                    value = Integer.valueOf(((EditText)view).getText().toString());
                    ((EditText)view).setText(value + " gallons");
                }
            }
        });

    }
}
