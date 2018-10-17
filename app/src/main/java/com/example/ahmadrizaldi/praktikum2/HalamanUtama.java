package com.example.ahmadrizaldi.praktikum2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ahmadrizaldi.praktikum2.ui.MainActivity;

public class HalamanUtama extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman_utama);

        Button exit = (Button)findViewById(R.id.exit);
        Button baju = (Button)findViewById(R.id.baju);

        //,embuat event pada button exit
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //keluar dari activity
                finish();
            }
        });

        //Membuat event pada button baju
        baju.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //membuat intent
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                //memulai activity
                startActivity(intent);
            }
        });

    }
}
