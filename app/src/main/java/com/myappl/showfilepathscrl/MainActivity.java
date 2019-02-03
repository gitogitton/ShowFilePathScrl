package com.myappl.showfilepathscrl;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showData();
    }

    /*===================
                                File filesDir = getFilesDir();
                                File cacheFilesDir = getCacheDir();
                                File externalFilesDir = getExternalFilesDir( null );
                                File externalCacheDir = getExternalCacheDir();

                                File contentFilesDir = getApplicationContext().getFilesDir();
                                File contentCacheDir = getApplicationContext().getCacheDir();
                                File contextExternalDir = getApplicationContext().getExternalFilesDir(null);
                                File contextExternalCacheDir = getApplicationContext().getExternalCacheDir();

                                File envFilesDir = Environment.getDataDirectory();
                                File envExternalStrorageDir = Environment.getExternalStorageDirectory();
      ===================*/

    private void showData() {
        showFromDefault();
        showFromContext();
        showFromEnviroment();
    }

    private void showFromDefault() {
        File filesDir = getFilesDir();
        TextView textFilesDir = findViewById( R.id.textView_data1_d_fileDir );
        textFilesDir.setText( filesDir.getAbsolutePath() );

        File cacheFilesDir = getCacheDir();
        TextView textCacheDir = findViewById( R.id.textView_data1_d_cacheDir );
        textCacheDir.setText( cacheFilesDir.getAbsolutePath() );

        File externalFilesDir = getExternalFilesDir( null );
        TextView textExtFileDir = findViewById( R.id.textView_data1_d_extFilesDir );
        textExtFileDir.setText( externalFilesDir.getAbsolutePath() );

        File externalCacheDir = getExternalCacheDir();
        TextView textExtCacheDir = findViewById( R.id.textView_data1_d_extCacheDir );
        textExtCacheDir.setText( externalCacheDir.getAbsolutePath() );
    }

    private void showFromContext() {
        File contentFilesDir = getApplicationContext().getFilesDir();
        TextView textFilesDir = findViewById( R.id.textView_data1_c_fileDir );
        textFilesDir.setText( contentFilesDir.getAbsolutePath() );

        File contentCacheDir = getApplicationContext().getCacheDir();
        TextView textCacheDir = findViewById( R.id.textView_data1_c_cacheDir );
        textCacheDir.setText( contentCacheDir.getAbsolutePath() );

        File contextExternalDir = getApplicationContext().getExternalFilesDir(null);
        TextView textExtFileDir = findViewById( R.id.textView_data1_c_extFilesDir );
        textExtFileDir.setText( contextExternalDir.getAbsolutePath() );

        File contextExternalCacheDir = getApplicationContext().getExternalCacheDir();
        TextView textExtCacheDir = findViewById( R.id.textView_data1_c_extCacheDir );
        textExtCacheDir.setText( contextExternalCacheDir.getAbsolutePath() );
    }

    private void showFromEnviroment() {
        File envFilesDir = Environment.getDataDirectory();
        TextView textFilesDir = findViewById( R.id.textView_data1_e_fileDir );
        textFilesDir.setText( envFilesDir.getAbsolutePath() );

        File envExternalStrorageDir = Environment.getExternalStorageDirectory();
        TextView textCacheDir = findViewById( R.id.textView_data1_e_cacheDir );
        textCacheDir.setText( envExternalStrorageDir.getAbsolutePath() );
    }
}
