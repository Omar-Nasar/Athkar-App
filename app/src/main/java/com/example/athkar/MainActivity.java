package com.example.athkar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText UserName, Password;
    private Button Login, SignUp, Guest;
    AthkarDB DB;
    String user, pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        UserName = findViewById(R.id.txt_email);
        Password = findViewById(R.id.txt_password);
        Login = findViewById(R.id.btn_login);
        SignUp = findViewById(R.id.btn_signup);
        Guest = findViewById(R.id.btn_guest);
        DB = new AthkarDB(this);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user = UserName.getText().toString();
                pass = Password.getText().toString();
                if(user.equals("") || pass.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Enter Full Data", Toast.LENGTH_SHORT).show();
                }else{
                    boolean checkuserpass = DB.checkusernamepassword(user, pass);
                    if(checkuserpass == true){
                        Toast.makeText(getApplicationContext(), "Log In Succeffuly", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), MainAthkar.class));
                    }else
                    {
                        Toast.makeText(getApplicationContext(), "Invalid User Name Or Password", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, RegiesterationActivity.class));
            }
        });
        Guest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainAthkar.class));
            }
        });
    }
}