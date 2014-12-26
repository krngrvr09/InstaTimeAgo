package com.example.krngrvr09.instatime;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;


/**
 * Created by krngrvr09 on 26/12/14.
 */
public class InstaTime extends LinearLayout {

    public InstaTime(Context context, AttributeSet attrs) {
        super(context, attrs);

        init();
    }
    private void init() {
        inflate(getContext(), R.layout.insta_time_layout, this);
    }

}
