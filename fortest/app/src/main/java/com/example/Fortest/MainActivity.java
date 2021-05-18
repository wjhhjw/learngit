package com.example.Fortest;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.Fortest.login.User;
import com.example.Fortest.login.login;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout ly_one,ly_two,ly_three,ly_four;
    private TextView mTextView1,mTextView2,mTextView3,mTextView4;
    private TextView mTextNum1,mTextNum2,mTextNum3,mTxetNum3;
    private ImageView mImageView;
 //   private TextView Text1,Text2,Text3,Text4;

   static int flag=0;
    MyFragment fg1 = new MyFragment();
    Connectfragment fg3=new Connectfragment();
    Communityfragment fg2=new Communityfragment();
    HomePagefragment fg4=new HomePagefragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindView();
//        ly_one.performClick();  //使用代码主动去调用控件的点击事件（模拟人手去触摸控件）



        //先登陆页面，再进入主页
        if(flag==0) {
            flag++;
            Intent intent = new Intent(this, login.class);
            startActivity(intent);
            finish();
        }


        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.add(R.id.fragment_container,fg4);
        transaction.commit();


    }



    private void bindView() {

        ly_one = (LinearLayout)findViewById(R.id.ly_tab_menu_deal);
        ly_two = (LinearLayout)findViewById(R.id.ly_tab_menu_poi);
        ly_three = (LinearLayout)findViewById(R.id.ly_tab_menu_more);
        ly_four = (LinearLayout)findViewById(R.id.ly_tab_menu_user);

        mTextView1 = (TextView)findViewById(R.id.tab_menu_deal);
        mTextView2 = (TextView)findViewById(R.id.tab_menu_poi);
        mTextView3 = (TextView)findViewById(R.id.tab_menu_more);
        mTextView4 = (TextView)findViewById(R.id.tab_menu_user);

        mTextNum1 = (TextView)findViewById(R.id.tab_menu_deal_num);
        mTextNum2 = (TextView)findViewById(R.id.tab_menu_poi_num);
        mTextNum3 = (TextView)findViewById(R.id.tab_menu_more_num);

        mImageView = (ImageView)findViewById(R.id.tab_menu_setting_partner);


        ly_one.setOnClickListener(this);
        ly_two.setOnClickListener(this);
        ly_three.setOnClickListener(this);
        ly_four.setOnClickListener(this);
    }

    //重置所有文本的选中状态
    private void setSelected() {
        mTextView1.setSelected(false);
        mTextView2.setSelected(false);
        mTextView3.setSelected(false);
        mTextView4.setSelected(false);
    }
    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.ly_tab_menu_deal:
                setSelected();
                mTextView1.setSelected(true);
                mTextNum1.setVisibility(View.INVISIBLE);
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, fg1).commit();
                break;
            case R.id.ly_tab_menu_poi:
                setSelected();
                mTextView2.setSelected(true);
                mTextNum2.setVisibility(View.INVISIBLE);

                getFragmentManager().beginTransaction().replace(R.id.fragment_container, fg2).commit();

                break;
            case R.id.ly_tab_menu_more:
                setSelected();
                mTextView3.setSelected(true);
                mTextNum3.setVisibility(View.INVISIBLE);
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, fg3).commit();
                break;

            case R.id.ly_tab_menu_user:
                setSelected();
                mTextView4.setSelected(true);
                mImageView.setVisibility(View.INVISIBLE);
                getFragmentManager().beginTransaction().replace(R.id.fragment_container, fg4).commit();
//                transaction.hide(fg3);
//                transaction.hide(fg2);
//                transaction.hide(fg1);
//                transaction.add(R.id.fragment_container,fg4);
//                getFragmentManager().beginTransaction().replace(R.id.fragment_container, fg4).commit();
                break;


        }

    }



}
