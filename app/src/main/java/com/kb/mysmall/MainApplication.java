package com.kb.mysmall;

import android.app.Application;

import net.wequick.small.Small;

/**
 * Created by Administrator on 2017/5/8.
 */

public class MainApplication extends Application {

    public MainApplication(){
        Small.preSetUp(this);
    }
}
