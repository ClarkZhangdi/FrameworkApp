package jerome.com.mainlite.base.componments;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

public class BaseApplication extends Application {
    private static int APPCOUNT = 0;
    private ActivityLifecycleCallbacks mActivityLifecycleCallbacks;
    private Map<String, WeakReference<View>> decorViews = new LinkedHashMap<>();

    @Override
    public void onCreate() {
        super.onCreate();
        APPCOUNT++;
        super.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
            @Override
            public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
                String activityName = activity.getClass().getSimpleName();
                if (!decorViews.containsKey(activityName)) {
                    View decorView = activity.getWindow().getDecorView();
                    decorViews.put(activityName, new WeakReference<View>(decorView));
                }
            }

            @Override
            public void onActivityStarted(Activity activity) {

            }

            @Override
            public void onActivityResumed(Activity activity) {

            }

            @Override
            public void onActivityPaused(Activity activity) {

            }

            @Override
            public void onActivityStopped(Activity activity) {

            }

            @Override
            public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

            }

            @Override
            public void onActivityDestroyed(Activity activity) {
                String activityName = activity.getClass().getSimpleName();
                if (decorViews.containsKey(activityName)) {
                    decorViews.remove(activityName);
                }
            }
        });
    }

    protected int getAppCount() {
        return APPCOUNT;
    }
}
