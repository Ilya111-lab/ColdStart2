package com.example.coldstart1;

import android.app.Activity;
import android.os.Bundle;

public interface ActivityLifecycleCallbacks{
    void onActivityStopped(Activity activity);
    void onActivityStarted(Activity activity);
    void onActivitySaveInstanceState(Activity activity, Bundle outState);
    void onActivityResumed(Activity activity);
    void onActivityPaused(Activity activity);
    void onActivityDestroyed(Activity activity);
    void onActivityCreated(Activity activity, Bundle savedInstanceState);
}
