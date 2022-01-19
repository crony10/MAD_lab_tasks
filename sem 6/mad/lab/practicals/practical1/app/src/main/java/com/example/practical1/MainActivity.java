package com.example.practical1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button mybtn;
    TextView textView;
    EditText edtText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mybtn = new Button(this);
        mybtn = findViewById(R.id.button);
        textView = findViewById(R.id.txt1);
        edtText = findViewById(R.id.editTextTextPersonName);

        mybtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view)
            {
                String text=edtText.getText().toString();
                Toast.makeText(getBaseContext(), text , Toast.LENGTH_SHORT ).show();
                textView.setText(text);
            }
        });
    }
}