package com.kb.appmain;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * 按照步骤来，创建module后，R文件可能找不到
         * Google报错信息
         * https://github.com/wequick/Small/issues/315
         * 修改Small的版本，使用最新版就好了
         */
    }
}
