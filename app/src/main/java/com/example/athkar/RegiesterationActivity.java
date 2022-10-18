package com.example.athkar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegiesterationActivity extends AppCompatActivity {

    private EditText UserName, UserPhone, UserCountry, UserEmail, UserPassword;
    private Button Register;
    private TextView LoginTxv;
    AthkarDB DB;
    String name, country, email, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regiesteration);

        UserName = findViewById(R.id.txt_name);
        UserCountry = findViewById(R.id.txt_country);
        UserEmail = findViewById(R.id.txt_email);
        UserPassword = findViewById(R.id.txt_password);
        Register = findViewById(R.id.btn_reg);
        LoginTxv = findViewById(R.id.txv_login);
        DB = new AthkarDB(this);


        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name = UserName.getText().toString();
                country = UserCountry.getText().toString();
                email = UserEmail.getText().toString();
                password = UserPassword.getText().toString();
                ////Check That All Fields Not Empty:)
                if(email.equals("") || password.equals("") || country.equals("") || name.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Enter Full Data", Toast.LENGTH_SHORT).show();
                }
                else{
                    boolean checkuser = DB.CheckIfUserExist(email);
                    //Check If User Already Found:)
                    if(checkuser == false){
                        boolean insert = DB.InsertNewUser(email, password, name, country);
                        //Check If Insert
                        if(insert == true){
                            Toast.makeText(getApplicationContext(), "Now You Can Login:)", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "Registration Fail:(", Toast.LENGTH_SHORT).show();

                        }
                    }
                    ///User Already Have Acount:)
                    else
                    {
                        Toast.makeText(getApplicationContext(), "User Already Exist Try To Log In", Toast.LENGTH_SHORT).show();

                    }
                }
            }
        });

        LoginTxv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });



    }
}