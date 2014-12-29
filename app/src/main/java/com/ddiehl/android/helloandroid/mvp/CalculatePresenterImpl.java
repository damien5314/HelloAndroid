package com.ddiehl.android.helloandroid.mvp;


public class CalculatePresenterImpl implements CalculatePresenter, OnCalculateFinishedListener {

    private CalculateView mCalculateView;
    private CalculateInteractor mCalculateInteractor;

    public CalculatePresenterImpl(CalculateView view) {
        mCalculateView = view;
        mCalculateInteractor = new CalculateInteractorImpl();
    }

    @Override
    public void validateInputs(Integer num1, Integer num2) {
        mCalculateInteractor.calculate(num1, num2, this);
    }

    @Override
    public void onNum1Error() {
        mCalculateView.setNum1Error();
    }

    @Override
    public void onNum2Error() {
        mCalculateView.setNum2Error();
    }

    @Override
    public void onSuccess(int sum) {
        mCalculateView.displaySum(sum);
    }
}
