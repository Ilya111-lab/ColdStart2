package com.example.coldstart1;

import android.content.Context;
import android.os.Environment;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Test1 {
    private static File getTempFile(Context context)
    {
        File path = new File(Environment.getExternalStorageDirectory(), context.getPackageName());
        if(!path.exists())
            path.mkdir();

        return new File(path, "test1.txt");
    }
  /*  private void saveFile(String FileName) {
        try {
            OutputStreamWriter outStream =
                    new OutputStreamWriter(openFileOutput("test1.txt", 0));


        }
        catch (Throwable t) {
            Toast.makeText(getApplicationContext(),
                    "Exception: " + t.toString(), Toast.LENGTH_LONG)
                    .show();
        } }
    FileOutputStream fout = new FileOutputStream(  getTempFile(this));
            fout.write(i);
            fout.close();
    saveFile("test1.txt");*/

}
