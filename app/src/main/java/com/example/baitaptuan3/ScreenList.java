package com.example.baitaptuan3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.view.ViewCompat;
import androidx.transition.Fade;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ScreenList extends AppCompatActivity {
    ImageView imgLa, imgLi, imgShort, imgYellow, imgGreen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_list);

        imgLa = findViewById(R.id.imgLa);
        imgLi = findViewById(R.id.imgLi);
        imgShort = findViewById(R.id.imgShort);
        imgYellow = findViewById(R.id.imgYellow);
        imgGreen = findViewById(R.id.imgGreen);

        imgLa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScreenList.this, Ttlavender.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                        ScreenList.this, imgLa, ViewCompat.getTransitionName(imgLa));
                startActivity(intent, options.toBundle());
            }
        });

        imgLi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScreenList.this, Ttlight.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                        ScreenList.this, imgLi, ViewCompat.getTransitionName(imgLi));
                startActivity(intent, options.toBundle());
            }
        });

        imgGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScreenList.this, MainActivity.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                        ScreenList.this, imgGreen, ViewCompat.getTransitionName(imgGreen));
                startActivity(intent, options.toBundle());
            }
        });

    }
//    private void vaoChiTietGreen() {
//        startActivity(new Intent(getApplicationContext(),MainActivity.class));
//        overridePendingTransition(R.anim.list_sang_main,R.anim.list_to_main);
//    }
}