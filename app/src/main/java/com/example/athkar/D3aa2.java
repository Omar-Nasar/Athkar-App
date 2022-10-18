package com.example.athkar;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.athkar.databinding.ActivityD3aa2Binding;

public class D3aa2 extends AppCompatActivity {
    ActivityD3aa2Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityD3aa2Binding.inflate(getLayoutInflater());

        setContentView(binding.getRoot());
        String[] flowername={"عند الاستيقاظ","قبل النوم","عند الهم والحزن","زيارة المريض","دخول الخلاء"
                ," الخروج من الخلاء ","ليس الثوب","عند دخول السوق"
                ,"الخروج من المنزل",    "دعاء الكرب"
                ,"دعاء الكرب","دعاء الفرج"
        };
        int[]flowerimage={R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.c4,R.drawable.c5,R.drawable.c6,
                R.drawable.c7,R.drawable.c8,R.drawable.c9,R.drawable.c10,R.drawable.c11,R.drawable.c12,R.drawable.c13,
                R.drawable.c14,R.drawable.c15};
        gridAdapter gridAdapter= new gridAdapter(D3aa2.this,flowername,flowerimage);

        binding.gridview.setAdapter(gridAdapter);


        binding.gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(D3aa2.this, "" + flowername[i], Toast.LENGTH_SHORT).show();
            }
        });
    }


}