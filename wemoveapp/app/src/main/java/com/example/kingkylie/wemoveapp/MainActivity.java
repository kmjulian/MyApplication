package com.example.kingkylie.wemoveapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity{

    FirebaseDatabase wemovedatabase;
    TextView textview;
    EditText edittext;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext = (EditText)findViewById(R.id.editText);
        button = (Button)findViewById(R.id.button);
        textview = (TextView)findViewById(R.id.textview);
        wemovedatabase = FirebaseDatabase.getInstance();
        final DatabaseReference wemovereference = wemovedatabase.getReference("test");

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = edittext.getText().toString().trim();
                wemovereference.setValue(edittext);
            }
        });
    }

}
