package com.mpp.mpputils.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mpp.mpputils.R;
import com.mpp.mpputils.utils.number.DateFormatUtil;

/**
 * 日期格式化页面
 */
public class DateFormateActivity extends Activity {
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);

        final TextView tv = (TextView) findViewById(R.id.tv_description);
        Button button = (Button) findViewById(R.id.bt_date_switch);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (i) {
                    case 0:
                        tv.setText(DateFormatUtil.getDateFormat(System.currentTimeMillis(), DateFormatUtil.FormatType.DATE_ALL));
                        break;
                    case 1:
                        tv.setText(DateFormatUtil.getDateFormat(System.currentTimeMillis(), DateFormatUtil.FormatType.DATE_HOUR_MINUTE));
                        break;
                    case 2:
                        tv.setText(DateFormatUtil.getDateFormat(System.currentTimeMillis(), DateFormatUtil.FormatType.DATE_TIME_ALL));
                        break;
                    case 3:
                        tv.setText(DateFormatUtil.getDateFormat(System.currentTimeMillis(), DateFormatUtil.FormatType.TIME_ALL));
                        break;
                    case 4:
                        tv.setText(DateFormatUtil.getDateFormat(System.currentTimeMillis(), DateFormatUtil.FormatType.MONTH_DAY_1));
                        break;
                    case 5:
                        tv.setText(DateFormatUtil.getDateFormat(System.currentTimeMillis(), DateFormatUtil.FormatType.MONTH_DAY_2));
                        break;
                    case 6:
                        tv.setText(DateFormatUtil.getDateFormat(System.currentTimeMillis(), DateFormatUtil.FormatType.YEAR_MONTH));
                        break;
                }
                if (i < 6) {
                    i++;
                } else {
                    i = 0;
                }
            }
        });

    }
}
