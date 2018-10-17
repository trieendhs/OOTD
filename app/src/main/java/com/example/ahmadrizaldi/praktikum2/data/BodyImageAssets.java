package com.example.ahmadrizaldi.praktikum2.data;

import com.example.ahmadrizaldi.praktikum2.R;

import java.util.ArrayList;
import java.util.List;

public class BodyImageAssets {

    //mengumpulkan Pakaian menajdi satu
    private static final List<Integer> Pakaian = new ArrayList<Integer>() {{
        add(R.drawable.s11);
        add(R.drawable.s22);
        add(R.drawable.s33);
        add(R.drawable.s44);
        add(R.drawable.s1);
        add(R.drawable.s2);
        add(R.drawable.s3);
        add(R.drawable.s4);
        add(R.drawable.s5a);
        add(R.drawable.s1a);
        add(R.drawable.s2a);
        add(R.drawable.s3a);
        add(R.drawable.s4a);
        add(R.drawable.s5a);
    }};

    //mengumpulkan Celana menajdi satu
    private static final List<Integer> Celana = new ArrayList<Integer>() {{
        add(R.drawable.t11);
        add(R.drawable.t67);
        add(R.drawable.t3);
        add(R.drawable.t3);
        add(R.drawable.t56);
        add(R.drawable.t33);
        add(R.drawable.t22);
    }};

    //mengumpulkan Pakaian dan Celana menajdi satu
    private static final List<Integer> all = new ArrayList<Integer>() {{
        addAll(Pakaian);
        addAll(Celana);
    }};

    //untuk menbgambil gambar pakaian
    public static List<Integer> getPakaian() {
        return Pakaian;
    }

    //untuk menbgambil gambar Celana
    public static List<Integer> getCelana() {
        return Celana;
    }

    //untuk mengambil semua gambar
    public static List<Integer> getAll() {
        return all;
    }

}