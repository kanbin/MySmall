package com.kb.mysmall;

import android.app.Activity;
import android.os.Bundle;

import net.wequick.small.Small;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Small.setUp(this, new Small.OnCompleteListener() {
            @Override
            public void onComplete() {
                Small.openUri("main", MainActivity.this);
            }
        });
    }
}
