package com.potato.wanandroid.ui.login;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.potato.wanandroid.R;
import com.potato.wanandroid.base.activity.BaseActivity;
import com.potato.wanandroid.presenter.login.LoginPresenter;

import butterknife.BindView;

public class LoginActivity extends BaseActivity<LoginPresenter> {

    @BindView(R.id.edt_account)
    EditText edtAccount;
    @BindView(R.id.edt_pwd)
    EditText edtPwd;
    @BindView(R.id.lin_lgoin)
    LinearLayout linLgoin;
    @BindView(R.id.btn_login)
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initToolbar() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initInject() {

    }
}
