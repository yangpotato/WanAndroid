package com.potato.wanandroid.ui.login;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.potato.wanandroid.R;
import com.potato.wanandroid.base.activity.BaseActivity;
import com.potato.wanandroid.contract.login.LoginContract;
import com.potato.wanandroid.data.entity.main.LoginEntity;
import com.potato.wanandroid.presenter.login.LoginPresenter;
import com.potato.wanandroid.utils.CommonUtils;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContract.View {

    @BindView(R.id.edt_account)
    EditText edtAccount;
    @BindView(R.id.edt_pwd)
    EditText edtPwd;
    @BindView(R.id.lin_lgoin)
    LinearLayout linLgoin;
    @BindView(R.id.btn_login)
    Button btnLogin;

    private String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initInject() {
        mActivityComponent.inject(this);
    }

    @Override
    protected void initToolbar() {

    }

    @Override
    protected void initUI() {

    }

    @Override
    protected void initData() {

    }


    @OnClick(R.id.btn_login)
    public void onViewClicked() {
        if(checkEmpty())
            mPresenter.getLoginData(username, password);
    }

    private boolean checkEmpty(){
        username = edtAccount.getText().toString().trim();
        password = edtPwd.getText().toString().trim();
        if(username.length() < 6 || password.length() < 6){
            CommonUtils.showMessage(this, getString(R.string.account_pws_size_error));
            return false;
        }
        return true;
    }

    @Override
    public void loginSuccess(LoginEntity entity) {
        CommonUtils.showMessage(this, getString(R.string.account_pws_size_error));
    }
}
