package com.example.dm2.ejer6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    Switch swCam1;
    Switch swLuz1;
    ToggleButton tbCam2;
    ToggleButton tbLuz2;
    ImageView imgcam1;
    ImageView imgcam2;
    ImageView imgluz1;
    ImageView imgLuz2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swCam1 = (Switch) findViewById(R.id.sw1);
        swLuz1 = (Switch) findViewById(R.id.sw2);
        tbCam2 = (ToggleButton) findViewById(R.id.tb1);
        tbLuz2 = (ToggleButton) findViewById(R.id.tb2);
        imgcam1 = (ImageView) findViewById(R.id.imgcam1);
        imgcam2 = (ImageView) findViewById(R.id.imgcam2);
        imgluz1 = (ImageView) findViewById(R.id.imgluz1);
        imgLuz2 = (ImageView) findViewById(R.id.imgluz2);

        swCam1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (swCam1.isChecked()){
                    imgcam1.setImageResource(R.mipmap.ic_camara);
                }else{
                    imgcam1.setImageResource(0);
                }
            }
        });
        swLuz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (swLuz1.isChecked()){
                    imgluz1.setImageResource(R.mipmap.ic_luzon);
                }else{
                    imgluz1.setImageResource(R.mipmap.ic_luzoff);
                }
            }
        });
        tbCam2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbCam2.isChecked()){
                    imgcam2.setImageResource(R.mipmap.ic_camara);
                }else{
                    imgcam2.setImageResource(0);
                }
            }
        });
        tbLuz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tbLuz2.isChecked()){
                    imgLuz2.setImageResource(R.mipmap.ic_luzon);
                }else{
                    imgLuz2.setImageResource(R.mipmap.ic_luzoff);
                }
            }
        });


    }
}
