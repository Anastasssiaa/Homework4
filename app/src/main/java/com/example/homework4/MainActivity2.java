package com.example.homework4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity  implements Constants {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Parcel parcel = (Parcel) getIntent().getExtras().getSerializable(TEXT);

        TextView country = findViewById(R.id.text);
        country.setText(parcel.text);

        TextView number = findViewById(R.id.number);
        number.setText(parcel.number);

        Button back = findViewById(R.id.buttonBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}