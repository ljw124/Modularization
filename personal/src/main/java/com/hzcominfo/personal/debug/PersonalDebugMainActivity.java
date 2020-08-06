package com.hzcominfo.personal.debug;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.hzcominfo.personal.R;

/**
 * release 时 debug 目录下文件不需要合并到主工程
 * 可以在outputs-apk-debug-双击apk文件-classes.dex-com-order目录下查看
 */
public class PersonalDebugMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_debug_main);
    }
}
