package com.example.athkar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainAthkar extends AppCompatActivity {

    private Button Sbaa7, Msaa2, Quraan, D3aa2, Tasbe7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_athkar);
        Sbaa7 = (Button)findViewById(R.id.btn_sba7); // zorar el ezkarat
        Msaa2 = (Button)findViewById(R.id.btn_msa2); // zorar el e5laq
        Tasbe7 = findViewById(R.id.btn_tasbe7);
        Quraan = findViewById(R.id.btn_quran);
        D3aa2 = findViewById(R.id.btn_d3a2);

        Sbaa7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2 = new Intent(MainAthkar.this,AthkarElsaba7.class);
                startActivity(i2);
            }
        });
        Msaa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3 = new Intent(MainAthkar.this,AthkarElmasa2.class);
                startActivity(i3);
            }
        });
        Tasbe7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainAthkar.this, Tasbee7.class));
            }
        });
        Quraan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainAthkar.this, Quran.class));
            }
        });
        D3aa2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainAthkar.this, D3aa2.class));
            }
        });


    }
    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.item1:
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                break;
            case R.id.member1:
                Toast.makeText(getApplicationContext(), "Omar Sheref", Toast.LENGTH_SHORT).show();
                break;
            case R.id.member2:
                Toast.makeText(getApplicationContext(), "Amr Elghanam", Toast.LENGTH_SHORT).show();
                break;
            case R.id.member3:
                Toast.makeText(getApplicationContext(), "Mohamed Nor Eldin", Toast.LENGTH_SHORT).show();
                break;
            case R.id.member4:
                Toast.makeText(getApplicationContext(), "Ahmed Mabrouk", Toast.LENGTH_SHORT).show();
                break;
            case R.id.member5:
                Toast.makeText(getApplicationContext(), "Ahmed Magdy", Toast.LENGTH_SHORT).show();
                break;
            case R.id.member6:
                Toast.makeText(getApplicationContext(), "Ahmed Hossam", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }
}