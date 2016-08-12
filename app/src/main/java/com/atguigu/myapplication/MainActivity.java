package com.atguigu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG =MainActivity.class.getSimpleName() ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("一键交友完成了");
        System.out.println("摇一摇交友完成了");
        System.out.println("摇一摇交友完成了");
        System.out.println("摇一摇交友完成了，上传到github全球都可以看到");
        Log.e(TAG, "上传");

    }
}
