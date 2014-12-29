package com.ddiehl.android.helloandroid.mvp;


public class CalculateInteractorImpl implements CalculateInteractor {
    @Override
    public void calculate(Integer num1, Integer num2, OnCalculateFinishedListener listener) {
        boolean error = false;

        if (num1 == null) {
            error = true;
            listener.onNum1Error();
        }

        if (num2 == null) {
            error = true;
            listener.onNum2Error();
        }

        if (!error) {
            listener.onSuccess(num1 + num2);
        }

    }
}
