package com.example.shiva.try1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;

public class Cleaning extends AppCompatActivity {
    //view objects
   EditText editTextName;
    Spinner spinnerGenre;
    Button buttonAddArtist;
   // ListView listViewArtists;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cleaning);


        editTextName = (EditText) findViewById(R.id.editTextName);

    }
}
