package com.ddiehl.android.helloandroid.mvp;


public interface CalculateInteractor {

    public void calculate(Integer num1, Integer num2, OnCalculateFinishedListener listener);

}
