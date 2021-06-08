package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editview1;
    EditText editview2;
    EditText editview3;
    EditText editview4;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editview1 = findViewById(R.id.editview1);
        editview2 = findViewById(R.id.editview2);
        editview3 = findViewById(R.id.editview3);
        editview4 = findViewById(R.id.editview4);
        button1 = findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                GotoActivity();
            }
        });

    }

    public void GotoActivity()

    {
        String s = null;
        Intent intent = new Intent(this,Activity2.class);
        intent.putExtra("name",s);
        startActivity(intent);
}
}

