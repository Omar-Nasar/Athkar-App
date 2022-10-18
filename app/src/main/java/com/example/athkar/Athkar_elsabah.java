package com.example.athkar;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Athkar_elsabah extends AppCompatActivity {
    ImageView P1,P2,P3,PU1,PU2,PU3,ZI1,ZI2,ZI3,ZO1,ZO2,ZO3; // تعريف الازرار على هيئة صور
    TextView tv1,tv2,tv3; // تعريف النصوص
    MediaPlayer mp1,mp2,mp3; // تعريف الملفات الصوتية

    // قيمة حجم النص الافتراضية
    int ss1 = 15;
    int ss2 = 15;
    int ss3 = 15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // ربط الاكتفتي مع اللياوت
        setContentView(R.layout.athkar_elsabah_layout);
        // ربط المتغيرات بالاي دي حسب المذكور باللياوت
        P1 = (ImageView)findViewById(R.id.B11);
        P2 = (ImageView)findViewById(R.id.B211);
        P3 = (ImageView)findViewById(R.id.B311);
        PU1 = (ImageView)findViewById(R.id.B22);
        PU2 = (ImageView)findViewById(R.id.B222);
        PU3 = (ImageView)findViewById(R.id.B322);
        ZI1 = (ImageView)findViewById(R.id.B33);
        ZI2 = (ImageView)findViewById(R.id.B233);
        ZI3 = (ImageView)findViewById(R.id.B333);
        ZO1 = (ImageView)findViewById(R.id.B44);
        ZO2 = (ImageView)findViewById(R.id.B244);
        ZO3 = (ImageView)findViewById(R.id.B344);
        tv1 = (TextView)findViewById(R.id.textView11);
        tv2 = (TextView)findViewById(R.id.textView22);
        tv3 = (TextView)findViewById(R.id.textView33);
        mp1 = MediaPlayer.create(this,R.raw.mp01);
        mp2 = MediaPlayer.create(this,R.raw.mp02);
        mp3 = MediaPlayer.create(this,R.raw.mp03);
        //
        // ربط قيمة وحجم النص بالنص
        tv1.setTextSize(ss1);
        tv2.setTextSize(ss2);
        tv3.setTextSize(ss3);
        /////////////////////////////////////////////////////////

        P1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.start();
            }
        });
        P2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.start();
            }
        });
        P3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.start();
            }
        });
        PU1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp1.pause();
            }
        });
        PU2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp2.pause();
            }
        });
        PU3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp3.pause();
            }
        });
        ZI1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss1 < 25){
                    ss1++;
                }else {
                    Toast.makeText(Athkar_elsabah.this, "عفواً لا يمكنك تكبير النص أكثر", Toast.LENGTH_SHORT).show();
                }
                tv1.setTextSize(ss1);
            }
        });
        ZI2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss2 < 25){
                    ss2++;
                }else {
                    Toast.makeText(Athkar_elsabah.this, "عفواً لا يمكنك تكبير النص أكثر", Toast.LENGTH_SHORT).show();
                }
                tv2.setTextSize(ss2);
            }
        });
        ZI3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss3 < 25){
                    ss3++;
                }else {
                    Toast.makeText(Athkar_elsabah.this, "عفواً لا يمكنك تكبير النص أكثر", Toast.LENGTH_SHORT).show();
                }
                tv3.setTextSize(ss3);
            }
        });
        ZO1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss1 > 15){
                    ss1--;
                }else {
                    Toast.makeText(Athkar_elsabah.this, "عفواً لا يمكنك تصغير النص أكثر", Toast.LENGTH_SHORT).show();
                }
                tv1.setTextSize(ss1);
            }
        });
        ZO2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss2 > 15){
                    ss2--;
                }else {
                    Toast.makeText(Athkar_elsabah.this, "عفواً لا يمكنك تصغير النص أكثر", Toast.LENGTH_SHORT).show();
                }
                tv2.setTextSize(ss2);
            }
        });
        ZO3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ss3 > 15){
                    ss3--;
                }else {
                    Toast.makeText(Athkar_elsabah.this, "عفواً لا يمكنك تصغير النص أكثر", Toast.LENGTH_SHORT).show();
                }
                tv3.setTextSize(ss3);
            }
        });


    }
}
