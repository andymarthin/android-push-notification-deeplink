package id.web.marthin.pushnotificationdeeplink;

import android.app.Application;

import com.pushbots.push.Pushbots;


public class MyApplication extends Application {
    @Override
    public void onCreate() {
        Pushbots.sharedInstance().init(this);
    }
}
