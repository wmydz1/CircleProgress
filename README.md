# CircleProgress
![CircleProgress](http://7xir7h.com1.z0.glb.clouddn.com/CircleProgress.png)

### xml

```

      <com.logoocc.circleprogressbar.CircleProgressBar
       android:layout_centerInParent="true"
       android:id="@+id/main_cpb"
       android:layout_width="100dp"
       android:layout_height="100dp" />

```

### java

```
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

```
