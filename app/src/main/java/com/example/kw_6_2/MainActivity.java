package com.example.kw_6_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         CardView cardView = findViewById(R.id.card_view);


        cardView.setBackgroundResource(R.drawable.bg_card_view);

        Button button = findViewById(R.id.button_one);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (cardView.getAlpha() == 0){
                    cardView.animate().alpha(1);
                }else {
                    cardView.animate().alpha(0);
                }
            }
        });

        Button bigButton = findViewById(R.id.big_button);
        LinearLayout container = findViewById(R.id.container);

        bigButton.setOnClickListener(view -> {
            if (container.getVisibility() == View.GONE){
                container.setVisibility(View.VISIBLE);
            }else {
                container.setVisibility(View.GONE);
            }
        });

    }
}