package com.potato.wanandroid.presenter.login;

import android.text.TextUtils;

import com.potato.wanandroid.R;
import com.potato.wanandroid.app.MyApplaction;
import com.potato.wanandroid.base.presenter.BasePresenter;
import com.potato.wanandroid.contract.login.LoginContract;
import com.potato.wanandroid.data.entity.main.LoginEntity;
import com.potato.wanandroid.data.http.BaseObserver;
import com.potato.wanandroid.data.http.BaseResponse;
import com.potato.wanandroid.data.DataManager;

import javax.inject.Inject;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class LoginPresenter extends BasePresenter<LoginContract.View> implements LoginContract.Presenter {
    private DataManager mDataManager;

    @Inject
    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
        mDataManager = dataManager;
    }

    @Override
    public void setLoginAccount(String account) {

    }

    @Override
    public void setLoginPassword(String password) {

    }

    @Override
    public void getLoginData(String account, String password) {
        if(TextUtils.isEmpty(account) || TextUtils.isEmpty(password)){
            mView.showMessage(MyApplaction.getInstance().getString(R.string.account_pws_not_null));
        }
        mDataManager.login(account, password)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new BaseObserver<BaseResponse<LoginEntity>>(mView) {

                    @Override
                    public void onSuccess(BaseResponse<LoginEntity> entityBaseResponse) {
                        if(entityBaseResponse.getErrorCode() == BaseResponse.SUCCESS){
                            mView.loginSuccess(entityBaseResponse.getData());
                        }else{
                            mView.showMessage(entityBaseResponse.getErrorMsg());
                        }
                    }
                });

    }
}
