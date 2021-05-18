package com.example.Fortest.Homepage;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.Fortest.R;
import com.example.Fortest.my.Animal;
import com.example.Fortest.my.DBOpenHelper;

import java.util.ArrayList;

public class frag_home_btn6_1 extends Fragment implements View.OnClickListener{

    EditText edit_s;
    Button btn;
    private DBOpenHelper mDBOpenHelper;
    private TextView an_name,an_type,an_sex,an_birth,an_describe;
    String name,type,sex,birth,describe;
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState){
        View view= inflater.inflate(R.layout.activity_frag_home_btn6_1, container, false);
        initView(view);

        return view;
    }
    private void initView(View view){
        an_birth=view.findViewById(R.id.an_birth);
        an_name=view.findViewById(R.id.an_name);
        an_type=view.findViewById(R.id.an_type);
        an_sex=view.findViewById(R.id.an_sex);
        an_describe=view.findViewById(R.id.an_describe);
        edit_s=view.findViewById(R.id.edit_s);
        btn=view.findViewById(R.id.btn);

        mDBOpenHelper = new DBOpenHelper(this.getActivity()); //获取数据库操作类---
        btn.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case  R.id.btn :
                ArrayList<Animal> list = new ArrayList<Animal>();
                list=mDBOpenHelper.getAllData();
                name=edit_s.getText().toString();
                for(Animal animal:list){
                    if(name.equals(animal.getAnimalName())){
                        type=animal.getAnimalType();
                        sex=animal.getAnimalSex();
                        birth=animal.getAnimalBirth();
                        describe=animal.getAnimalDescribe();
                        an_name.setText(name);
                        an_describe.setText(describe);
                        an_type.setText(type);
                        an_sex.setText(sex);
                        an_birth.setText(birth);

                    }
                }
                list=null;
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
