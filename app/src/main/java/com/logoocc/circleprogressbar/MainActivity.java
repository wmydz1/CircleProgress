package com.logoocc.circleprogressbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    private CircleProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (CircleProgressBar) findViewById(R.id.main_cpb);
        new Thread() {
            @Override
            public void run() {
                int i = 0;
                while (i <= 100) {
                    progressBar.setProgressNotInUiThread(i);
                    i++;

                    try {
                        sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        }.start();
    }


}
