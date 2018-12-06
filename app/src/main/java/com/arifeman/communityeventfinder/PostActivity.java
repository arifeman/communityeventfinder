package com.arifeman.communityeventfinder;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class PostActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        ImageView ivImg=findViewById(R.id.ivPhoto);
        ivImg.setImageResource(R.drawable.img);
    }

}
