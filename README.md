InstaTimeAgo
============

Represent time ago like that in Instagram, Zomato, Gmail apps.

To display time in your app, add this library to your app.

In your xml, do something like:
```
<com.example.krngrvr09.instatime.InstaTime
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        android:id="@+id/customView"
        />
```
And then refer it in Java using:
```
 InstaTime insta = (InstaTime) findViewById(R.id.customView);
```
You can provide the time, in 2 ways.
1. Long
  ``        insta.setTime(Long.parseLong("1418306636000"));``
2. String with format specified
  ``insta.setTime("2014-12-11 19:33:56","yyyy-MM-dd HH:mm:ss");``
