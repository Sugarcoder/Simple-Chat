package com.sugarcoder.simplechat;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ChatApplication extends Application {

    public static final String YOUR_APPLICATION_ID = "9JGRp3h5BcolHQ1kmPHVGwbaORo1oTZSgZqsqS5K";
    public static final String YOUR_CLIENT_KEY = "1PvPwPtbdj3uB39mNrFcOgcfGOhDkkTklemA2GMS";

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Message.class);
        Parse.enableLocalDatastore(this);
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);
    }

}
