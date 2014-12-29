package com.ddiehl.android.helloandroid.mvp;

/**
 * Created by Damien on 12/28/2014.
 */
public interface OnCalculateFinishedListener {

    public void onNum1Error();
    public void onNum2Error();
    public void onSuccess(int sum);

}
