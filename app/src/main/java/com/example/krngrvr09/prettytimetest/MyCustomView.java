package com.example.krngrvr09.prettytimetest;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by krngrvr09 on 26/12/14.
 */
public class MyCustomView extends LinearLayout {
    private ImageView timeImage;
    private TextView timeText;
    public MyCustomView(Context context) {
        super(context);
        init();
    }
    public MyCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    public MyCustomView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }
    private void init() {
        inflate(getContext(), R.layout.my_custom_view, this);
        this.timeImage  = (ImageView) findViewById(R.id.timeImage);
        this.timeText = (TextView) findViewById(R.id.timeText);
    }


}
