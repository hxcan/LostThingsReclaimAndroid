package com.stupidbeauty.lostthingsreclaim;

import android.app.Application;
import android.util.Log;
import org.acra.ACRA;
import org.acra.config.mailSender;
import org.acra.config.toastSender;
import org.acra.data.StringFormat;

/**
 * Application 类，初始化 ACRA 崩溃监控。
 * 
 * 崩溃时会把日志发送到指定邮箱，方便定位问题。
 */
@org.acra.annotation.AcraCore(
    reportFormat = StringFormat.JSON,
    logcatArguments = {"-t", "200", "*:V"}
)
@org.acra.annotation.AcraMailSender(
    mailTo = "stupidbeauty@qq.com",
    subject = "LostThingsReclaim Android 崩溃报告",
    reportAsBody = true
)
@org.acra.annotation.AcraToast(
    resText = "抱歉，应用遇到了崩溃，已记录日志"
)
public class LostThingsApp extends Application {

    private static final String TAG = "LostThingsApp";

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i(TAG, "Application onCreate: 初始化 ACRA 崩溃监控");
        
        // 初始化 ACRA
        ACRA.init(this);
        Log.i(TAG, "ACRA 初始化完成");
    }
}
