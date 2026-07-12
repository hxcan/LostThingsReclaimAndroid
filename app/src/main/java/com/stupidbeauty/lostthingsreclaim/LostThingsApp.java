package com.stupidbeauty.lostthingsreclaim;

import android.app.Application;
import android.util.Log;
import com.stupidbeauty.crashdetector.CrashHandler;

/**
 * Application 类，初始化崩溃监控。
 *
 * 借鉴 sisterfuture 项目（SisterFutureApplication.java）的风格：
 * - 简洁、不引入过多第三方依赖
 * - 使用自家 android-crash-detector 库
 * - 崩溃日志自动写入外置存储，方便后续排查
 */
public class LostThingsApp extends Application
{
    private static final String TAG = "LostThingsApp";

    @Override
    public void onCreate()
    {
        super.onCreate();

        // 初始化全局崩溃检测器 - 与 sisterfuture 项目保持一致
        CrashHandler.init(this);
        Log.i(TAG, "✅ android-crash-detector 库已初始化");
    }
}