package com.example.Fortest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.Fortest.my.frag_my_btn1_1;

public class MyFragment extends Fragment implements View.OnClickListener{
    private Button btn1;
    com.example.Fortest.my.frag_my_btn1_1 frag_my_btn1_1=new frag_my_btn1_1();
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        View view= inflater.inflate(R.layout.fragment_my, container, false);

        btn1=(Button)view.findViewById(R.id.btn_chwu);

        btn1.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_chwu:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, frag_my_btn1_1).commit();
                break;
        }
    }

}
