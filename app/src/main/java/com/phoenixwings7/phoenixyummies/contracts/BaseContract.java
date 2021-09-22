package com.phoenixwings7.phoenixyummies.contracts;

public interface BaseContract {
    interface BaseView {
        void setPresenter();
    }

    interface BasePresenter<ViewType> {
        void bindView(ViewType view);
        void unbindView();
    }
}
