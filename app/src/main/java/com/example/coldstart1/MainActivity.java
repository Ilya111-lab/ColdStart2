package com.example.coldstart1;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LiveData;

import android.Manifest;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;

@RequiresApi(api = Build.VERSION_CODES.Q)
public class MainActivity extends AppCompatActivity {
    private final String TAG=MainActivity.class.getSimpleName();
       public Context context;
    private final String LOG_TAG = MainActivity.class.getSimpleName();
    protected MyApplication nMyApplication;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nMyApplication = (MyApplication) getApplication();
      nMyApplication.onActivityCreated(this, savedInstanceState);
        Log.v(LOG_TAG, "Number of entry:" + nMyApplication.i);
   //     getApplication().registerActivityLifecycleCallbacks(this);
      //  registerActivityLifecycleCallbacks(new MyActivityLifecycleCallbacks());
         /*   ActivityCompat.requestPermissions( this,
                    new String[]{
                            Manifest.permission.READ_EXTERNAL_STORAGE,
                            Manifest.permission.MANAGE_EXTERNAL_STORAGE
                    }, 1
            );
            if (Environment.isExternalStorageManager()){
// If you don't have access, launch a new activity to show the user the system's dialog
// to allow access to the external storage
            }else{
                Intent intent = new Intent();
                intent.setAction(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION);
                Uri uri = Uri.fromParts("package", this.getPackageName(), null);
                intent.setData(uri);
                startActivity(intent);
            }*/
            int[] price1 = {0};
      //  int[] price2 = decryptData(price1,50,1,8);
     //   System.out.println(Arrays.toString(price2));
        if(nMyApplication.i==3)    Toast.makeText(this, "Started!", Toast.LENGTH_LONG).show();

    }


        public void onActivityDestroyed(Activity activity) {
            Log.e("","onActivityDestroyed:" + activity.getLocalClassName());
        }

        public void onActivityPaused(Activity activity) {
            Log.e("","onActivityPaused:" + activity.getLocalClassName());
        }

        public void onActivityResumed(Activity activity) {
            Log.e("","onActivityResumed:" + activity.getLocalClassName());
        }

        public void onActivitySaveInstanceState(Activity activity,
                                                Bundle outState) {
            Log.e("","onActivitySaveInstanceState:" + activity.getLocalClassName());
        }

        public void onActivityStarted(Activity activity) {
            Log.e("","onActivityStarted:" + activity.getLocalClassName());
        }

        public void onActivityStopped(Activity activity) {
            Log.e("","onActivityStopped:" + activity.getLocalClassName());
        }
    }
  /*  public @Nullable
    int[] decryptData(@NonNull int[] price,
                      @IntRange(from = 1) int discount,
                      @IntRange(from = 0) int offset,
                      @IntRange(from = 1) int readLength) {int flagNegative=0;
        if((offset+readLength<=price.length)&&(discount<=99)&&(discount>=1)&&(offset>=0)&&(readLength>=1))
        {int resultPrice[] = new int[readLength];
                    for (int i = 0; i < readLength; i++) {
                resultPrice[i]=price[offset+i]*discount/100;
                if(resultPrice[i]<0) flagNegative++;
            } String intArrayString = Arrays.toString(resultPrice);
            System.out.println(intArrayString);
        if (flagNegative==0)   return resultPrice;
                else System.out.println("Prices<0");return null;}
        else if((offset+readLength>=price.length)&&(offset<price.length))
        {int resultPrice[] = new int[price.length-offset];
            for (int i = 0; i < price.length-offset; i++) {
                resultPrice[i]=price[offset+i]*discount/100;
                if(resultPrice[i]<0) flagNegative++;
        }String intArrayString = Arrays.toString(resultPrice);
            System.out.println(intArrayString);
            if (flagNegative==0)   return resultPrice;
            else System.out.println("Prices<0");return null;}
        else{System.out.println("Received argument is not appropriate");
            return null;}
    }*/




 //
/*  */