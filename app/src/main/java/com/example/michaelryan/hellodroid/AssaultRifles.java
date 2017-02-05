package com.example.michaelryan.hellodroid;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class AssaultRifles extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assault_rifles);

        Toolbar myToolbar = (Toolbar) findViewById(R.id.assault_toolbar);
        setSupportActionBar(myToolbar);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_assault_rifles);
        layout.addView(textView);

        // Get a support ActionBar corresponding to this toolbar
        ActionBar ab = getSupportActionBar();

        // Enable the Up button
        ab.setDisplayHomeAsUpEnabled(true);
//        public class ArticleFragment extends Fragment {
//            @Override
//            public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                                     Bundle savedInstanceState) {
//                // Inflate the layout for this fragment
//                return inflater.inflate(R.layout.article_view, container, false);
//            }
//        }

    }
    public void ak47_button(View view) {
        Intent intent = new Intent(this, ak47.class);
        startActivity(intent);
    }
    public void m4a4_button(View view) {
        Intent intent = new Intent(this, m4a4.class);
        startActivity(intent);
    }
    public void m4a1_button(View view) {
        Intent intent = new Intent(this, M4A1.class);
        startActivity(intent);
    }
    public void m4a1s_button(View view) {
        Intent intent = new Intent(this, m4a1s.class);
        startActivity(intent);
    }
    public void galil_ar_button(View view) {
        Intent intent = new Intent(this, Galil_AR.class);
        startActivity(intent);
    }
    public void g3_sg1_button(View view) {
        Intent intent = new Intent(this, G3SG1.class);
        startActivity(intent);
    }
    public void scar_20_button(View view) {
        Intent intent = new Intent(this, Scar_20.class);
        startActivity(intent);
    }
    public void ssg_08_button(View view) {
        Intent intent = new Intent(this, SSG_08.class);
        startActivity(intent);
    }
    public void famas_button(View view) {
        Intent intent = new Intent(this, FAMAS.class);
        startActivity(intent);
    }

    public void aug_button(View view) {
        Intent intent = new Intent(this, AUG.class);
        startActivity(intent);
    }
    public void sg_553_button(View view) {
        Intent intent = new Intent(this, SG_553.class);
        startActivity(intent);
    }
}
