package com.example.krngrvr09.prettytimetest;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by krngrvr09 on 25/12/14.
 */
public class ToDoListItemView extends TextView {
    private Paint marginPaint;
    private Paint linePaint;
    private int paperColor;
    private float margin;
    Bitmap mBitmap;

    public ToDoListItemView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }
    public ToDoListItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }
    public ToDoListItemView(Context context) {
        super(context);
        Bitmap mBitmap = Bitmap.createScaledBitmap( BitmapFactory.decodeResource(getResources(), R.drawable.ic_query_builder_black_24dp), 10, 10, false);
        init();
    }


    private void init() {
        marginPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        marginPaint.setColor(Color.RED);
        linePaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        linePaint.setColor(Color.BLUE);
        paperColor = Color.YELLOW;
        margin = Color.CYAN;
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawColor(0xFFAAAAAA);
        canvas.drawBitmap(mBitmap, 0, 0, new Paint());
//        Drawable d = getResources().getDrawable(R.drawable.ic_query_builder_black_24dp);
//        d.setBounds(10,10,10,10);
//        d.draw(canvas);
        //super.onDraw(canvas);
        }
}

