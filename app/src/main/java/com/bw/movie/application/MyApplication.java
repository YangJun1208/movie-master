package com.bw.movie.application;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.view.WindowManager;

public class MyApplication extends Application {
    private static Context context;
    public final static float DESIGN_WIDTH = 750;
    @Override
    public void onCreate() {
        super.onCreate();
        context=getApplicationContext();
    }

    @Override public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig); resetDensity();
    }
    public void resetDensity(){
        Point size = new Point();
        ((WindowManager)getSystemService(WINDOW_SERVICE)).getDefaultDisplay().getSize(size);
        getResources().getDisplayMetrics().xdpi = size.x/DESIGN_WIDTH*72f;
    }

    public static Context MyApplication() {
        return context;
    }
}
