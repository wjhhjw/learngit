package com.example.Fortest.Homepage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.Fortest.R;
import com.example.Fortest.btn_help_1;
import com.example.Fortest.btn_help_2;

public class frag_home_btn4_1 extends Fragment implements View.OnClickListener{

    btn_help_1 btn_help_1=new btn_help_1();
    com.example.Fortest.btn_help_2 btn_help_2=new btn_help_2();
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        View view= inflater.inflate(R.layout.activity_frag_home_btn4_1, container, false);

        return  view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_help_1:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,btn_help_1);
                break;
            case R.id.btn_help_2:
                getFragmentManager().beginTransaction().replace(R.id.fragment_container,btn_help_2);
                break;
            case R.id.btn_trends_1:

                break;
            case R.id.btn_trends_2:

                break;
        }
    }
}
