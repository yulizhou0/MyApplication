package com.routon.soft.PowerInspect.ativity;

import android.content.DialogInterface;
import android.os.Bundle;

import com.routon.soft.PowerInspect.R;
import com.routon.soft.PowerInspect.base.BaseActivity;
import com.routon.soft.PowerInspect.base.EMLayoutBinder;
import com.routon.soft.PowerInspect.base.EMViewBinder;
import com.routon.soft.PowerInspect.view.CustomDialog;
import com.routon.soft.PowerInspect.view.GifView;

/**
 * Created by Administrator on 2017/10/13.
 */
@EMLayoutBinder(R.layout.activity_launch)
public class DataImportActivity extends BaseActivity{
    @EMViewBinder(R.id.gif)
    private GifView gifView;
    private CustomDialog dialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        gifView.setMovieResource(R.raw.waitting);
        CustomDialog.Builder customBuilder = new
                CustomDialog.Builder(this);
        customBuilder.setTitle(R.string.title)
                .setMessage("xxx.xls第X行第X列数据错误")
                .setNegativeButton(getString(R.string.update), new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                        //TODO 退出系统
                    }
                });
        dialog = customBuilder.create();
        dialog.show();
    }
}
