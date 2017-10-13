package com.routon.soft.PowerInspect.ativity;

import android.os.Bundle;

import com.routon.soft.PowerInspect.R;
import com.routon.soft.PowerInspect.base.BaseActivity;
import com.routon.soft.PowerInspect.base.EMLayoutBinder;
import com.routon.soft.PowerInspect.base.EMViewBinder;
import com.routon.soft.PowerInspect.view.GifView;

/**
 * Created by Administrator on 2017/10/13.
 */
@EMLayoutBinder(R.layout.activity_launch)
public class LaunchActivity extends BaseActivity{
    @EMViewBinder(R.id.gif)
    private GifView gifView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gifView.setMovieResource(R.raw.loading);
    }
}
