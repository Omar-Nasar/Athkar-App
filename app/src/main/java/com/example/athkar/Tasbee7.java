package com.example.athkar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Tasbee7 extends AppCompatActivity {
    private Button ResetBtn, PressBtn, NextBtn, BackBtn;
    private TextView CountTxv, ShowTxv;
    private int Sb7aCount;
    private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasbee7);
        ////Initialize Views:)
        PressBtn = findViewById(R.id.btn_quran);
        ResetBtn=findViewById(R.id.btn_sba7);
        CountTxv=findViewById(R.id.txv_count);
        NextBtn = findViewById(R.id.btn_next);
        BackBtn = findViewById(R.id.btn_back);
        ShowTxv = findViewById(R.id.txv_show);
        ////End:)
        ///Initalize Variables:)
        count = 0;
        Sb7aCount = 0;
        ///End:)
        ///Make Text View Show From String Array:)
        String[] Sb7aStr = {"سُبْحَانَ اللهِ","الْحَمْدُ لِلَّهِ","لَا إِلَهَ إِلَّا اللهُ", "اللهُ أَكْبَرُ"};
        ShowTxv.setText(Sb7aStr[Sb7aCount]);
        ///End:)
        ///Increment Count By Press Button:)
        PressBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                CountTxv.setText(String.valueOf(count));
            }
        });
        ///End:)
        ///Return Count To Zero:)
        ResetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ResetCount();
            }
        });
        ///End:)
        ///Get Next String:)
        NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sb7aCount++;
                if(Sb7aCount == Sb7aStr.length)
                {
                    Sb7aCount = 0;
                }
                ShowTxv.setText(Sb7aStr[Sb7aCount]);
                ResetCount();
            }
        });
        ///End:)
        ///Get Previous String:)
        BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sb7aCount--;
                if(Sb7aCount < 0)
                {
                    Sb7aCount = Sb7aStr.length - 1;
                }
                ShowTxv.setText(Sb7aStr[Sb7aCount]);
                ResetCount();
            }
        });
        ///End:)

    }
    private void ResetCount()
    {
        count = 0;
        CountTxv.setText(String.valueOf(count));
    }
}