package com.phoenixwings7.phoenixyummies;

import com.phoenixwings7.phoenixyummies.contracts.MainContract;

public class MainPresenter implements MainContract.Presenter{
    private MainContract.View view;

    public MainPresenter(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void bindView(MainContract.View view) {
        this.view = view;
    }

    @Override
    public void unbindView() {
        this.view = null;
    }
}
