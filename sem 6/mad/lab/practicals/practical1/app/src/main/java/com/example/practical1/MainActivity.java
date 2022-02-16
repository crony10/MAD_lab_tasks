package com.example.practical1;

import android.content.Intent;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static String TAG = "mainActivity";
    Button mySignInbtn;
    TextView emailText;
    EditText passwordText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mybtn = new Button(this);
        mySignInbtn = findViewById(R.id.button);
        emailText = (EditText)findViewById(R.id.editTextTextEmailAddress);
        passwordText = findViewById(R.id.editTextTextPassword);

        mySignInbtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                Log.v(TAG,"Button clicked");
                String email = emailText.getText().toString();
                String password = passwordText.getText().toString();
                if(email.equals("user@gmail.com") && password.equals("user")){
                    Log.v(TAG,"validated");
                    Intent intent = new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "invalid", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}