package com.example.Fortest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class btn_help_2 extends Fragment implements View.OnClickListener{

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        View view= inflater.inflate(R.layout.activity_btn_help_2, container, false);

        return  view;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){

        }
    }
}
