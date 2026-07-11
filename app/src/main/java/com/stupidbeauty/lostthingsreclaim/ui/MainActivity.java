package com.stupidbeauty.lostthingsreclaim.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.lostthings.reclaim.R;

/**
 * 主 Activity，应用入口。
 * <p>
 * 后续子任务会逐步接入 Fragment / 导航 / 登录界面等。
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
