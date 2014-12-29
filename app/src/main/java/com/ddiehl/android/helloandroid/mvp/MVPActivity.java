package com.ddiehl.android.helloandroid.mvp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.ddiehl.android.helloandroid.R;

public class MVPActivity extends Activity implements CalculateView, View.OnClickListener {

    private EditText mNum1View;
    private EditText mNum2View;
    private EditText mSumView;
    private CalculatePresenter mCalculatePresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_model_view_presenter);

        mNum1View = (EditText) findViewById(R.id.value_num1);
        mNum2View = (EditText) findViewById(R.id.value_num2);
        mSumView = (EditText) findViewById(R.id.value_sum);

        findViewById(R.id.button_calculate_sum).setOnClickListener(this);

        mCalculatePresenter = new CalculatePresenterImpl(this);
    }

    @Override
    public void setNum1Error() {
        mNum1View.setError("Must enter a number");
    }

    @Override
    public void setNum2Error() {
        mNum2View.setError("Must enter a number");
    }

    @Override
    public void displaySum(int num) {
        mSumView.setText(String.valueOf(num));
    }

    @Override
    public void onClick(View v) {
        String num1text = mNum1View.getText().toString();
        String num2text = mNum2View.getText().toString();

        mCalculatePresenter.validateInputs(
                num1text.equals("") ? null : Integer.valueOf(num1text),
                num2text.equals("") ? null : Integer.valueOf(num2text));
    }
}
