package com.example.boringgame;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

private Button btnUp,btnDown,btnRight,btnLeft;
private ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnUp = findViewById(R.id.up);
        btnDown = findViewById(R.id.Down);
        btnRight = findViewById(R.id.Right);
        btnLeft = findViewById(R.id.left);
        i = findViewById(R.id.imageView);
        btnDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i.setY(i.getY()+30);
                if(i.getY()<295)
                    i.setImageResource(R.drawable.ppg1);
                else
                    i.setImageResource(R.drawable.ppgboy);
            }
        });
        btnUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i.setY(i.getY() - 15);
                if (i.getY() < 37)
                    i.setImageResource(R.drawable.ppgboy);
                else
                    i.setImageResource(R.drawable.ppg1);

            }
        });
        btnRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i.setX(i.getX() + 15);
                if (i.getX() > 356)
                    i.setImageResource(R.drawable.ppgboy);
                else
                    i.setImageResource(R.drawable.ppg1);
            }
            });
        btnLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i.setX(i.getX()-15);
                if(i.getX()<50)
                    i.setImageResource(R.drawable.ppgboy);
                else
                    i.setImageResource(R.drawable.ppg1);
            }
        });





    }
}