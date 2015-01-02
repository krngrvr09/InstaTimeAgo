package com.example.krngrvr09.instatime;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * Created by krngrvr09 on 26/12/14.
 */
public class InstaTime extends LinearLayout {
    private TextView time;

    public InstaTime(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.insta_time_layout, this);
        this.time = (TextView) findViewById(R.id.timeText);
    }

    public void setTime(Date date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateandTime = sdf.format(new Date());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date d1 = null;
        Date d2 = null;

        try {
            d1 = format.parse(currentDateandTime);
            d2 = format.parse(String.valueOf("2014-12-11 19:33:56"));

        } catch (ParseException e) {
            e.printStackTrace();
        }
        PrettyTime p = new PrettyTime();
        String t = p.format(new Date(System.currentTimeMillis() - (d1.getTime() - d2.getTime())));
        time.setText(t);

    }
    public void setTime(long date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateandTime = sdf.format(new Date());
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date d1 = null;

        try {
            d1 = format.parse(currentDateandTime);

        } catch (ParseException e) {
            e.printStackTrace();
        }
        PrettyTime p = new PrettyTime();
        String t = p.format(new Date(System.currentTimeMillis() - (d1.getTime() - date)));
        time.setText(t);

    }
    public void setTime(String date, String dateFormat){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentDateandTime = sdf.format(new Date());
        SimpleDateFormat format = new SimpleDateFormat(dateFormat);

        Date d1 = null;
        Date d2 = null;

        try {
            d1 = format.parse(currentDateandTime);
            d2 = format.parse(String.valueOf(date));

        } catch (ParseException e) {
            e.printStackTrace();
            time.setText("?");
            return;
        }
        PrettyTime p = new PrettyTime();
        String t = p.format(new Date(System.currentTimeMillis() - (d1.getTime() - d2.getTime())));
        time.setText(t);
    }


}
