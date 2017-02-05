package com.example.michaelryan.hellodroid;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SMGs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smgs);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.smgs_toolbar);
        setSupportActionBar(myToolbar);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_smgs);
        layout.addView(textView);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);
    }

    public void mac10_button(View view) {
        Intent intent = new Intent(this, mac10.class);
        startActivity(intent);
    }

    public void ump45_button(View view) {
        Intent intent = new Intent(this, ump45.class);
        startActivity(intent);
    }

    public void mp9_button(View view) {
        Intent intent = new Intent(this, mp9.class);
        startActivity(intent);
    }

    public void mp7_button(View view) {
        Intent intent = new Intent(this, mp7.class);
        startActivity(intent);
    }

    public void p90_button(View view) {
        Intent intent = new Intent(this, p90.class);
        startActivity(intent);
    }

    public void ppbizon_button(View view) {
        Intent intent = new Intent(this, ppbizon.class);
        startActivity(intent);
    }
}
