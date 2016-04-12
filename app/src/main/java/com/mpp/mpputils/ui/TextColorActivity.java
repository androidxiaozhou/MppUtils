package com.mpp.mpputils.ui;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.view.Gravity;
import android.widget.TextView;

import com.mpp.mpputils.utils.TextColorUtil;

/**
 * Created by mengpeipei on 2016/4/11.
 */
public class TextColorActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this) ;
        tv.setGravity(Gravity.CENTER);
        tv.setTextSize(14);
        tv.setText(Html.fromHtml("变色文字为：" + TextColorUtil.getHtmlColorText("我有一个梦想，我要去实现","#00ff99")));
        setContentView(tv);
    }
}
