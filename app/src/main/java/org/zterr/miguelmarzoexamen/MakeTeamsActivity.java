package org.zterr.miguelmarzoexamen;

import android.content.Intent;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MakeTeamsActivity extends AppCompatActivity {
    private ListView listViewTasks;
    private ArrayList<String> people;
    private  Vibrator vibrator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_teams);
        people = getIntent().getExtras().getStringArrayList("People");
        vibrator = (Vibrator) getSystemService(VIBRATOR_SERVICE);
        setupCustomList();

    }

    private void setupCustomList() {



        CustomizedListAdapter customizedListAdapter = new CustomizedListAdapter(this, people);

        listViewTasks = (ListView) findViewById(R.id.listViewTeams);

        listViewTasks.setAdapter(customizedListAdapter);


        vibrator.vibrate(500);
        Log.d("MigDebug", "Vibrating 500 milliseconds");




    }



}
