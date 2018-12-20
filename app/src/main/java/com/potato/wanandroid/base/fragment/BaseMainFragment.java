package com.potato.wanandroid.base.fragment;



import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.potato.wanandroid.R;

import me.yokeyword.fragmentation.SupportFragment;

public class BaseMainFragment extends SupportFragment {
    protected OnFragmentOpenDrawerListener mOnFragmentOpenDrawerListener;

    protected void initToolbarNav(Toolbar toolbar){
//        toolbar.setNavigationIcon(R.drawable.ic_dehaze_black_24dp);
//        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if(mOnFragmentOpenDrawerListener != null){
//                    mOnFragmentOpenDrawerListener.onOpenDrawer();
//                }
//            }
//        });
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        if(activity instanceof  OnFragmentOpenDrawerListener){
            mOnFragmentOpenDrawerListener = (OnFragmentOpenDrawerListener) activity;
        }
    }

    public interface OnFragmentOpenDrawerListener {
        void onOpenDrawer();
    }
}
