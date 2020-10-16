package com.example.homework4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements Constants {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button next = findViewById(R.id.buttonTo);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText txt = findViewById(R.id.editText);
                EditText num = findViewById(R.id.number);

                Parcel parcel = new Parcel();
                parcel.text = txt.getText().toString();
                parcel.number = Integer.parseInt(num.getText().toString());

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra(TEXT, parcel);
                startActivity(intent);
            }
        });
    }
}