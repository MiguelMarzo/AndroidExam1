package org.zterr.miguelmarzoexamen;

import android.os.AsyncTask;
import android.os.Vibrator;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class TextAsyncTask extends AsyncTask<Void,String,Void> {

    private SplashActivity splashActivity;



    public TextAsyncTask(SplashActivity splashActivity) {
        attach(splashActivity);
    }


    public void attach(SplashActivity splashActivity) {
        this.splashActivity = splashActivity;
    }

    public void detach () {
        this.splashActivity = null;
    }


    @Override
    protected void onPreExecute () {

    }

    @Override
    protected Void doInBackground(Void... params) {

        String frase = "A,player,that,makes,a,team,great,is,more,valuable,than,a,great,player";
        String[] words = frase.split(",");
        for (int i = 0; i< words.length; i++) {
            try {
                Thread.sleep(1000);
                this.publishProgress(words[i].toString());
            } catch (Exception e) {
                Log.d("MigDebug","Exception sleeping: " + e.getMessage());
            }

        }

        return null;
    }

    @Override
    protected void onProgressUpdate(String... palabra) {
        this.splashActivity.getIntro().setText(palabra[0]);
    }

    @Override
    protected void onPostExecute(Void unused) {

    }
}
