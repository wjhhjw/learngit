package com.example.Fortest.community;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.Fortest.R;

public class frag_com_btn1_1 extends Fragment implements View.OnClickListener {
    Button btn_com_1_1_1;
    Button btn_com_1_1_2;
    Button btn_com_1_1_3;
    frag_com_btn_1_1_1 frag_com_btn_1_1_1=new frag_com_btn_1_1_1();
    frag_com_btn_1_1_2 frag_com_btn_1_1_2=new frag_com_btn_1_1_2();
    frag_com_btn_1_1_3 frag_com_btn_1_1_3=new frag_com_btn_1_1_3();
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_frag_com_btn1_1, container, false);
        btn_com_1_1_1=(Button)view.findViewById(R.id.btn_com_1_1_1);
        btn_com_1_1_2=(Button)view.findViewById(R.id.btn_com_1_1_2);
        btn_com_1_1_3=(Button)view.findViewById(R.id.btn_com_1_1_3);

        btn_com_1_1_1.setOnClickListener(this);
        btn_com_1_1_2.setOnClickListener(this);
        btn_com_1_1_3.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
          case  R.id.btn_com_1_1_1:
              getFragmentManager().beginTransaction().replace(R.id.fragment_container, frag_com_btn_1_1_1).commit();
              break;

          case R.id.btn_com_1_1_2:
              getFragmentManager().beginTransaction().replace(R.id.fragment_container, frag_com_btn_1_1_2).commit();
                break;
            case R.id.btn_com_1_1_3:
              getFragmentManager().beginTransaction().replace(R.id.fragment_container, frag_com_btn_1_1_3).commit();
                break;
        }
     }
}
