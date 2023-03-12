package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username =(TextView) findViewById(R.id.mail);
        TextView password =(TextView) findViewById(R.id.pass);

        Button loginbtn = (Button) findViewById(R.id.button);


        //elius and 123 (username and password) check

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("elius") && password.getText().toString().equals("123")) {
                    //correct
                    Toast.makeText(MainActivity.this, "LOGIN SUCCESSFUL",Toast.LENGTH_SHORT).show();
                }else
                    //incorrect
                    Toast.makeText(MainActivity.this, "LOGIN FAILED!!!",Toast.LENGTH_SHORT).show();
            }
        });



    }
}