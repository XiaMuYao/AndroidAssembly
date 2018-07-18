package com.xiamuyao.androidassembly;

import android.app.Application;
import android.content.Context;

import com.didi.virtualapk.PluginManager;

public class App extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        PluginManager.getInstance(base).init();
    }
}
