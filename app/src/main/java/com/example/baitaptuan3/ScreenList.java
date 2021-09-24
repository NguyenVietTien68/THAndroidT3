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
    ImageView imageView, imageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_list);

//        Fade fade = new Fade();
//        View decor = getWindow().getDecorView();
//
//        getWindow().setEnterTransition(fade);


        imageView.findViewById(R.id.imgLa);
        imageView2.findViewById(R.id.imgLi);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScreenList.this, Ttlavender.class);
                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(
                        ScreenList.this, imageView, ViewCompat.getTransitionName(imageView));
                startActivity(intent, options.toBundle());
            }
        });

        findViewById(R.id.txtGreen).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vaoChiTietGreen();
            }
        });

    }
    private void vaoChiTietGreen() {
        startActivity(new Intent(getApplicationContext(),MainActivity.class));
        overridePendingTransition(R.anim.list_sang_main,R.anim.list_to_main);
    }
}