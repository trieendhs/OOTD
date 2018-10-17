package com.example.ahmadrizaldi.praktikum2.ui;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ahmadrizaldi.praktikum2.R;
import com.example.ahmadrizaldi.praktikum2.data.BodyImageAssets;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inisialisasi Fragment

        if (savedInstanceState == null) {
            BodyPartFragments bodyFragment;
            FragmentManager fm = getSupportFragmentManager();

            //membuat object pakaian
            bodyFragment = new BodyPartFragments();
            bodyFragment.setImgId(BodyImageAssets.getPakaian()); //menset resource gambar Pakaian
            bodyFragment.setIndexImg(0); //Menset index image dari 0
            fm.beginTransaction().add(R.id.headsContainer, bodyFragment).commit(); //Mengganti fragment Pakaian dengan resoucre gambar

            //membuat object celana
            bodyFragment = new BodyPartFragments();
            bodyFragment.setImgId(BodyImageAssets.getCelana());//menset resource gambar Celana
            bodyFragment.setIndexImg(0); //Menset index image dari 0
            fm.beginTransaction().add(R.id.bodyContainer, bodyFragment).commit(); //Mengganti fragment Celana dengan resoucre gambar
        }


    }
}
