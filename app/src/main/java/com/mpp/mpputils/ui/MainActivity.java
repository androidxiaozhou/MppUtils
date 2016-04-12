package com.mpp.mpputils.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.mpp.mpputils.R;
import com.mpp.mpputils.utils.number.DateFormatUtil;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView)findViewById(R.id.tv_description) ;
        tv.setText(DateFormatUtil.getDateFormat(System.currentTimeMillis(), DateFormatUtil.FormatType.DATE_ALL));

    }
}
