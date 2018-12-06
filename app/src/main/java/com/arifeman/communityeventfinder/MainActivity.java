package com.arifeman.communityeventfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean found = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button eventButton = findViewById(R.id.buttonMyEvents);
        Button nearMeButton = findViewById(R.id.buttonNearMe);
        Button rewardsButton = findViewById(R.id.buttonRewards);
        Button historyButton = findViewById(R.id.buttonHistory);
        final ImageView ivEvent=findViewById(R.id.EPDay);

      //  final ImageView ball = findViewById(R.id.ball);



        eventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                found = false;
                ivEvent.setImageResource(R.drawable.blank);
                Toast toast = Toast.makeText(getApplicationContext(), "You have no upcoming Activities", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        nearMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                found = true;
              ivEvent.setImageResource(R.drawable.img);

                Toast toast = Toast.makeText(getApplicationContext(), "This is the next event", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        rewardsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                found = false;
                ivEvent.setImageResource(R.drawable.blank);
                Toast toast = Toast.makeText(getApplicationContext(), "You have no Rewards yet! Try participating in more events :)", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        historyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                found = false;
                ivEvent.setImageResource(R.drawable.blank);
                Toast toast = Toast.makeText(getApplicationContext(), "You have not attended any activity yet", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        ivEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(found){
                    Intent intent = new Intent(getBaseContext(),PostActivity.class);


                    startActivity(intent);
                }
            }
        });

    }
}
