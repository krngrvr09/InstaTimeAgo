package com.example.krngrvr09.prettytimetest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.example.krngrvr09.instatime.InstaTest;
import com.example.krngrvr09.instatime.PrettyTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class ActivityMain extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        new InstaTest();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String currentDateandTime = sdf.format(new Date());
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//        Date d1 = null;
//        Date d2 = null;
//
//        try {
//            d1 = format.parse(currentDateandTime);
//            d2 = format.parse(String.valueOf("2014-12-11 19:33:56 +0530").replace("+0530", ""));
//
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        PrettyTime p = new PrettyTime();
//
//        String time = p.format(new Date(System.currentTimeMillis() - (d1.getTime() - d2.getTime())));
//        Log.d("time ago",time);
//        ListView myListView = (ListView) findViewById(R.id.myListView);
//        final EditText myEditText = (EditText) findViewById(R.id.myEditText);
//        final ArrayList<String> todoItems = new ArrayList<String>();
//        int resID = R.layout.row;
//        final ArrayAdapter<String> aa = new ArrayAdapter<String>(this, resID,
//                todoItems);
//        myListView.setAdapter(aa);
//        myEditText.setOnKeyListener(new View.OnKeyListener() {
//            public boolean onKey(View v, int keyCode, KeyEvent event) {
//                    if (keyCode == KeyEvent.KEYCODE_ENTER) {
//                        todoItems.add(0, myEditText.getText().toString());
//                        myEditText.setText("");
//                        aa.notifyDataSetChanged();
//                        return true;
//                    }
//                return false;
//            }
//        });
//        LinearLayout l = (LinearLayout) findViewById(R.id.linearLayout);
//        ToDoListItemView toDo = new ToDoListItemView(this);
//        l.addView(toDo);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
