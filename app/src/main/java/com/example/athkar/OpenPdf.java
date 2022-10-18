package com.example.athkar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.github.barteksc.pdfviewer.PDFView;

public class OpenPdf extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_pdf);


        PDFView mypdfviewer;
        mypdfviewer=(PDFView)findViewById(R.id.pdfviewer);

        String getitem=getIntent().getStringExtra("pdfFileName");
        if (getitem.equals("سورة الفاتِحة"))
        {
            mypdfviewer.fromAsset("alfatha.pdf").load();
        }
        if (getitem.equals("سورة البقْرة"))
        {
            mypdfviewer.fromAsset("البقرة.pdf").load();
        }
        if (getitem.equals("سورة آلعمران"))
        {
            mypdfviewer.fromAsset("العمران.pdf").load();
        }
        if (getitem.equals("سورة النساء"))
        {
            mypdfviewer.fromAsset("النساء.pdf").load();
        } if (getitem.equals("سورة المائدة"))
        {
            mypdfviewer.fromAsset("المائدة.pdf").load();
        }
        if (getitem.equals("سورة الأنعام"))
        {
            mypdfviewer.fromAsset("الانعام.pdf").load();
        }
        if (getitem.equals("سورة الرحمنٍْ"))
        {
            mypdfviewer.fromAsset("rahman.pdf").load();
        } if (getitem.equals("سورة يسٍ"))
        {
            mypdfviewer.fromAsset("Surah_Al-Hujurat.pdf").load();
        }
        if (getitem.equals("سورة مريم"))
        {
            mypdfviewer.fromAsset("rahmsan.pdf").load();
        }
        if (getitem.equals("سورة المُلك"))
        {
            mypdfviewer.fromAsset("Surah_Al-Mulk.pdf").load();
        }
        if (getitem.equals("سورة الفجِر"))
        {
            mypdfviewer.fromAsset("Surah_Al-Fajr.pdf").load();
        }
        if (getitem.equals("سورة الفَلق"))
        {
            mypdfviewer.fromAsset("Surah_Al-Falaq.pdf").load();
        }
    }
}