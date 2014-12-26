package com.example.krngrvr09.prettytimetest;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by krngrvr09 on 26/12/14.
 */
public class MyCustomView extends LinearLayout {

    public MyCustomView(Context context, AttributeSet attrs) {
        super(context, attrs);

        init();
    }
    private void init() {
        inflate(getContext(), R.layout.my_custom_view, this);
    }

}
