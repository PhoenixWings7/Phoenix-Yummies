package com.phoenixwings7.phoenixyummies.contracts;

import com.phoenixwings7.phoenixyummies.Repository;

public interface MainContract extends BaseContract {
    interface View extends BaseView {
        Repository createRepo();
    }
    interface Presenter extends BasePresenter<View> {}
}
