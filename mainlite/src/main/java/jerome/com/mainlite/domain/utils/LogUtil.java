package jerome.com.mainlite.domain.utils;

import android.util.Log;

public class LogUtil {

    private static final String TAG = "框架搭建";


    public static boolean isShow = true;

    public static void d(String s) {
        if (isShow) {
            Log.d(TAG, s);
        }
    }

    public static void e(String s) {
        if (isShow) {
            Log.e(TAG, s);
        }
    }

    public static void w(String s) {
        if (isShow) {
            Log.w(TAG, s);
        }
    }

    public static void i(String s) {
        if (isShow) {
            Log.i(TAG, s);
        }
    }

}
