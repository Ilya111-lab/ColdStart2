package com.example.coldstart1;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MyApplication extends Application implements ActivityLifecycleCallbacks{
    boolean firstActivityCreated = false;String FILENAME = "abc.txt";

    public int i;
    public  int b;
    FileOutputStream fileOutputStream;
    @Override
    public void onCreate() {
       super.onCreate();
//       registerActivityLifecycleCallbacks((ActivityLifecycleCallbacks) MyApplication.this/*(Your Application Name)*/);
    }
    public void onActivityCreated(Activity activity, Bundle bundle) {
        if (firstActivityCreated) return;
        firstActivityCreated = true;
        if (firstActivityCreated) {
            try {
                File dir = getFilesDir();
                File myFile = new File(dir,"abc.txt");
                FileInputStream fileInputStream;
                fileInputStream = openFileInput(FILENAME);
                i=fileInputStream.read();
                fileInputStream.close();
                FileOutputStream fstream = openFileOutput(FILENAME, Context.MODE_PRIVATE);
                i++;
                fstream.write(i);
                fstream.flush();
                fstream.close();


              //  Log.v(LOG_TAG, "Number of entry:" + i);

            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    @Override
    public void onActivityStarted(@NonNull Activity activity) {

    }

    @Override
    public void onActivityResumed(@NonNull Activity activity) {

    }

    @Override
    public void onActivityPaused(@NonNull Activity activity) {

    }

    @Override
    public void onActivityStopped(@NonNull Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {

    }

    @Override
    public void onActivityDestroyed(@NonNull Activity activity) {

    }

}