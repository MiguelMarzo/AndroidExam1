package org.zterr.miguelmarzoexamen;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SplashActivity extends AppCompatActivity {

    MediaPlayer mp;
    TextView intro;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        mp = MediaPlayer.create(SplashActivity.this, R.raw.developers);
        mp.start();

        intro = (TextView) this.findViewById(R.id.textIntro);

        TextAsyncTask textAsyncTask = new TextAsyncTask(this);
        textAsyncTask.execute();

    }


    public void openIntroducePlayersActivity(View v){
        mp.stop();
       Intent intent = new Intent(this, IntroducePlayersActivity.class);
       startActivity(intent);

    }

    public TextView getIntro() {
        return intro;
    }
}
