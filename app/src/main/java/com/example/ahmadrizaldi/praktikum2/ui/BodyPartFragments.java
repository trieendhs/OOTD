package com.example.ahmadrizaldi.praktikum2.ui;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.ahmadrizaldi.praktikum2.R;
import com.example.ahmadrizaldi.praktikum2.data.BodyImageAssets;

import java.util.ArrayList;
import java.util.List;

public class BodyPartFragments extends Fragment {

    //variabel global
    private List<Integer> imgId;
    private Integer indexImg;
    public static final String IMAGE_ID_LIST = "image_ids";
    public static final String LIST_INDEX = "list_index";

    public BodyPartFragments() {
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        //menset arraylist kedalam bundle
        outState.putIntegerArrayList(IMAGE_ID_LIST, (ArrayList<Integer>) imgId);
        //menset index terakhir
        outState.putInt(LIST_INDEX,indexImg);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //Membuat tampilan fragment
        View rootView = inflater.inflate(R.layout.fragment_layout,container, false);
        final ImageView imageView = (ImageView)rootView.findViewById(R.id.imageViewFragment);
//        imageView.setImageResource(BodyImageAssets.getHeads().get(0));

        if (savedInstanceState != null) {
            //memanggil bundle arraylist
            imgId =savedInstanceState.getIntegerArrayList(IMAGE_ID_LIST);
            //memanggil index terakhir pada bundle
            indexImg = savedInstanceState.getInt(LIST_INDEX);
            imageView.setImageResource(imgId.get(indexImg));
        }else{
            imageView.setImageResource(imgId.get(indexImg));
        }

        //untuk menambah event klik
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (indexImg < imgId.size() -1){
                    //menambah nilai index
                    indexImg++;
                }else{
                    //memulai index gambar menjadi 0
                    indexImg = 0;
                }

                //menset resource dari image
                imageView.setImageResource(imgId.get(indexImg));
            }
        });

        return rootView;
    }


    //Menset Image
    public void setImgId(List<Integer> imgId) {
        this.imgId = imgId;
    }

    //Menset Nilai index gambar
    public void setIndexImg(Integer indexImg) {
        this.indexImg = indexImg;
    }
}
