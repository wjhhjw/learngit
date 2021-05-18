package com.example.Fortest;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.example.Fortest.Homepage.frag_home_btn2_1;
import com.example.Fortest.Homepage.frag_home_btn3_1;
import com.example.Fortest.Homepage.frag_home_btn4_1;
import com.example.Fortest.Homepage.frag_home_btn5_1;
import com.example.Fortest.Homepage.frag_home_btn6_1;
import com.example.Fortest.Homepage.frag_home_person;
import com.example.Fortest.login.Register;
import com.example.Fortest.login.login;

public class HomePagefragment extends Fragment implements View.OnClickListener{
    private Context mContext;
    private Button btn_one;
    private Button btn_two;
    private Button btn_three;
    private Button btn_four,btn_five,btn_six,btn_loginout;
    frag_home_person frag_home_person=new frag_home_person();
    frag_home_btn2_1 frag_home_btn2_1=new frag_home_btn2_1();
    frag_home_btn3_1 frag_home_btn3_1=new frag_home_btn3_1();
    frag_home_btn4_1 frag_home_btn4_1=new frag_home_btn4_1();
    com.example.Fortest.Homepage.frag_home_btn5_1 frag_home_btn5_1=new frag_home_btn5_1();
    com.example.Fortest.Homepage.frag_home_btn6_1 frag_home_btn6_1=new frag_home_btn6_1();
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //加载R.layout.fragment_my布局文件
        View view = inflater.inflate(R.layout.fragment_homepage,container,false);

        btn_one = (Button)view.findViewById(R.id.home_btn_1);
        btn_two = (Button)view.findViewById(R.id.home_btn_2);
        btn_three = (Button)view.findViewById(R.id.home_btn_3);
        btn_four = (Button)view.findViewById(R.id.home_btn_4);
        btn_five = (Button)view.findViewById(R.id.home_btn_5);
        btn_six = (Button)view.findViewById(R.id.home_btn_6);
        btn_loginout=(Button)view.findViewById(R.id.bt_main_logout) ;

        btn_one.setOnClickListener(this);
        btn_two.setOnClickListener(this);
        btn_three.setOnClickListener(this);
        btn_four.setOnClickListener(this);
        btn_five.setOnClickListener(this);
        btn_six.setOnClickListener(this);
        return view;  //返回该布局文件对应的view文件， 表示该fragment会显示该view文件
    }

  @Override
    public void onClick(View v) {
      switch (v.getId()) {
          case R.id.home_btn_1:
              getFragmentManager().beginTransaction().replace(R.id.fragment_container, frag_home_person).commit();
              break;
          case R.id.home_btn_2:
              getFragmentManager().beginTransaction().replace(R.id.fragment_container, frag_home_btn2_1).commit();
              break;
          case R.id.home_btn_3:
              getFragmentManager().beginTransaction().replace(R.id.fragment_container, frag_home_btn3_1).commit();
              break;
          case R.id.home_btn_4:
              getFragmentManager().beginTransaction().replace(R.id.fragment_container, frag_home_btn4_1).commit();
              break;
          case R.id.home_btn_5:
              getFragmentManager().beginTransaction().replace(R.id.fragment_container, frag_home_btn5_1).commit();
              break;
          case R.id.home_btn_6:
              getFragmentManager().beginTransaction().replace(R.id.fragment_container, frag_home_btn6_1).commit();
              break;
          case R.id.bt_main_logout:
          {
              //todo  实现结束fragment并退回登陆页面
              Register._id=null;
              login._id=null;
              getActivity().onBackPressed();//销毁自己
              onDestroy();
              break;
          }

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