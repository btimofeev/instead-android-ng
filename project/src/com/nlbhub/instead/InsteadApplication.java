package com.nlbhub.instead;

import android.app.Application;
import android.content.Context;

/**
 * This should be TEMPORARY workaround! I mean it! :)
 * This class provides method to statically obtain application context.
 * Instead of using this class, Globals class should be fully rewritten (and probably obliterated for greater good)
 */
public class InsteadApplication extends Application {
    private static Context context;

    public void onCreate(){
        super.onCreate();
        InsteadApplication.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return context;
    }
}
