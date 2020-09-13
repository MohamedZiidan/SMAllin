package com.example.android.socialmediaan1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView facebook;
    ImageView twitter;
    ImageView youtube;
    ImageView pinterest;
    ImageView instagram;
    ImageView behance;
    ImageView soundcloud;
    ImageView linkedin;
    ImageView add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        facebook = findViewById(R.id.facebook);
        twitter = findViewById(R.id.twitter);
        youtube = findViewById(R.id.youtube);
        pinterest = findViewById(R.id.pinterest);
        instagram = findViewById(R.id.instagram);
        behance = findViewById(R.id.behance);
        soundcloud = findViewById(R.id.soundcloud);
        linkedin = findViewById(R.id.linkedin);
        add = findViewById(R.id.plus_icon);


        facebook.setOnClickListener(this);
        twitter.setOnClickListener(this);
        youtube.setOnClickListener(this);
        pinterest.setOnClickListener(this);
        instagram.setOnClickListener(this);
        behance.setOnClickListener(this);
        soundcloud.setOnClickListener(this);
        linkedin.setOnClickListener(this);
        add.setOnClickListener(this);

    }

    public void ToWebview(String url) {
        Intent intent = new Intent(MainActivity.this, Webview_Activity.class);
        intent.putExtra("URL", url);
        startActivity(intent);
    }



    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.facebook) {
            ToWebview("https://www.facebook.com/");
        } else if (v.getId() == R.id.twitter) {
            ToWebview("https://twitter.com/");
        } else if (v.getId() == R.id.youtube) {
            ToWebview("https://www.youtube.com/");
        } else if (v.getId() == R.id.youtube) {
            ToWebview("https://www.pinterest.com/");
        } else if (v.getId() == R.id.instagram) {
            ToWebview("https://www.instagram.com/");
        } else if (v.getId() == R.id.behance) {
            ToWebview("https://www.behance.net/");
        } else if (v.getId() == R.id.soundcloud) {
            ToWebview("https://soundcloud.com/");
        } else if (v.getId() == R.id.linkedin) {
            ToWebview("https://www.linkedin.com/");
        }else if (v.getId() == R.id.plus_icon) {
            String startUrl = "https://";
            final EditText newWebSite = new EditText(this);
            newWebSite.setHint("  https://www.example.com  ");
            newWebSite.setText(startUrl);
            new AlertDialog.Builder(this)
                    .setTitle("New Website")
                    .setMessage("Add website url here ;)")
                    .setView(newWebSite)
                    .setPositiveButton("Go!", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ToWebview(newWebSite.getText().toString());
                        }
                    })
                    .setNegativeButton("Cancel", null).show();
        }

    }

}