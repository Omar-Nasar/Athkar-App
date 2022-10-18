package com.example.athkar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;


import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Quran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quran);


        ListView pdflistview;
        pdflistview=(ListView)findViewById(R.id.listview1);


        String[] PdfFileNames={"سورة الفاتِحة","سورة البقْرة","سورة آلعمران","سورة النساء",
                "سورة المائدةْ","سورة الأنعام","سورة الرحمنٍْ","سورة الحُجرات",
                "سورة مريم","سورة المُلك","سورة الفجِر","سورة الفَلق"};

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,PdfFileNames);
        /*{
            @NonNull
            @Override
            public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)

            {
                View view=super.getView(position, convertView, parent);

                TextView myText=(TextView) view.findViewById(android.R.id.text1);

                return view;
            }
        };*/

        pdflistview.setAdapter(adapter);

        pdflistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                String item=pdflistview.getItemAtPosition(position).toString();

                Intent intent=new Intent(getApplicationContext(),OpenPdf.class);
                intent.putExtra("pdfFileName",item);
                startActivity(intent);
            }
        });
    }
}