package com.example.laptop.zoomcontrol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ZoomControls zoomControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        imageView = findViewById(R.id.imageId);

        zoomControls = findViewById(R.id.zoomControlarId);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                imageView.setScaleX(x+1);
                imageView.setScaleY(y+1);
            }
        });

        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                imageView.setScaleX(x-1);
                imageView.setScaleY(y-1);
            }
        });
    }
}
