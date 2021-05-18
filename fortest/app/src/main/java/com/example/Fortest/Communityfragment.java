package com.example.Fortest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.app.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.Fortest.community.frag_com_btn1_1;
import com.example.Fortest.community.frag_com_btn2_1;
import com.example.Fortest.community.frag_com_btn3_1;

public class Communityfragment extends Fragment implements View.OnClickListener {
    Button btn_com_1,btn_com_2,btn_com_3,btn_com_4;
    com.example.Fortest.community.frag_com_btn1_1 frag_com_btn1_1=new frag_com_btn1_1();
    com.example.Fortest.community.frag_com_btn2_1 frag_com_btn2_1=new frag_com_btn2_1();
    com.example.Fortest.community.frag_com_btn3_1 frag_com_btn3_1=new frag_com_btn3_1();
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        View view=inflater.inflate(R.layout.fragment_community, container, false);
        btn_com_1=(Button)view.findViewById(R.id.btn_com_1);
        btn_com_2=(Button)view.findViewById(R.id.btn_com_2);
        btn_com_3=(Button)view.findViewById(R.id.btn_com_3);
        btn_com_4=(Button)view.findViewById(R.id.btn_com_4);

        btn_com_1.setOnClickListener(this);
        btn_com_2.setOnClickListener(this);
        btn_com_3.setOnClickListener(this);
        btn_com_4.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_com_1:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, frag_com_btn1_1).commit();
                break;

            case R.id.btn_com_2:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,frag_com_btn2_1 ).commit();
                break;
            case R.id.btn_com_3:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,frag_com_btn3_1).commit();
                break;

        }
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onStop() {
        super.onStop();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }
}
