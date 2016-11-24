package org.zterr.miguelmarzoexamen;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

public class IntroducePlayersActivity extends AppCompatActivity {

    EditText per1;
    EditText per2;
    EditText per3;
    EditText per4;
    EditText per5;
    EditText per6;
    EditText per7;
    EditText per8;
    EditText per9;
    ArrayList<String> people;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduce_players);
        setupActionBar();

        people = new ArrayList<String>();
        per1 = (EditText) findViewById(R.id.editText);
        per2 = (EditText) findViewById(R.id.editText2);
        per3 = (EditText) findViewById(R.id.editText3);
        per4 = (EditText) findViewById(R.id.editText4);
        per5 = (EditText) findViewById(R.id.editText5);
        per6 = (EditText) findViewById(R.id.editText6);
        per7 = (EditText) findViewById(R.id.editText7);
        per8 = (EditText) findViewById(R.id.editText8);
        per9 = (EditText) findViewById(R.id.editText9);


    }

    private void setupActionBar() {
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setTitle("Make A Team");
        }
    }

    public void sendNames(View v) {
        people.add(0, per1.getText().toString());
        people.add(1, per2.getText().toString());
        people.add(2, per3.getText().toString());
        people.add(3, per4.getText().toString());
        people.add(4, per5.getText().toString());
        people.add(5, per6.getText().toString());
        people.add(6, per7.getText().toString());
        people.add(7, per8.getText().toString());
        people.add(8, per9.getText().toString());
        Intent intent = new Intent(IntroducePlayersActivity.this, MakeTeamsActivity.class);
        intent.putExtra("People", people);
        startActivity(intent);
    }
}
