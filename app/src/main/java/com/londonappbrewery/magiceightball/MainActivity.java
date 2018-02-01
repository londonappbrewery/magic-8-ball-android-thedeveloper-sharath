package com.londonappbrewery.magiceightball;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView imageView = findViewById(R.id.ball_image);
        imageView.setVisibility(View.INVISIBLE);
        final int[] imagearray = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5};
        final Button ask_button = findViewById(R.id.ask_button);
        final TextView textView = findViewById(R.id.ask_text);
        ask_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setVisibility(View.GONE);
                Random randomnumbergenerator = new Random();

                int number = randomnumbergenerator.nextInt(5);
                imageView.setImageResource(imagearray[number]);
                imageView.setVisibility(View.VISIBLE);
            }
        });
    }
}
