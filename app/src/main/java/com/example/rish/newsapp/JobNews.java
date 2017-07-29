package com.example.rish.newsapp;


import android.os.AsyncTask;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

import com.example.rish.newsapp.Utilities.LoadData;

/**
 *  * Created by rish on 7/28/17. created this class that use the service for update database at 1 minute interval
 */

@RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
public class JobNews extends com.firebase.jobdispatcher.JobService {
    private    AsyncTask asyncTask;
    private final String TAG= "jobnews";

    @Override
    public boolean onStartJob(com.firebase.jobdispatcher.JobParameters job) {
        asyncTask =new AsyncTask<Void,Void,Void>() {

            @Override
            protected Void doInBackground(Void... params) {
                LoadData.DatabaseLoad(JobNews.this);
                return null;
            }

        }.execute();

        Log.d(TAG,"update");
        return false;
    }

    @Override
    public boolean onStopJob(com.firebase.jobdispatcher.JobParameters job) {

        return false;
    }



}
