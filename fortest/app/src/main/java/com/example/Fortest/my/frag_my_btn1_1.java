package com.example.Fortest.my;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.Fortest.R;

import static com.example.Fortest.login.login._id;

public class frag_my_btn1_1 extends Fragment implements View.OnClickListener{
    private EditText an_name,an_sex,an_type,an_describe,an_birth;
    private DBOpenHelper mDBOpenHelper;
    private Button tijiao;
    public static Integer id;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_frag_my_btn1_1, container, false);
        initView(view);


        return view;
    }
    private void initView(View view){
        an_name=view.findViewById(R.id.an_name);
        an_describe=view.findViewById(R.id.an_describe);
        an_birth=view.findViewById(R.id.an_birth);
        an_sex=view.findViewById(R.id.an_sex);
        an_type=view.findViewById(R.id.an_type);
        tijiao=view.findViewById(R.id.tijiao);

        mDBOpenHelper = new DBOpenHelper(this.getActivity()); //获取数据库操作类---

        tijiao.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tijiao:
                //String animalName, String animalSex, String animalType, String animalBirth, String animalDescribe
                String animalName = an_name.getText().toString().trim();
                String animalSex = an_sex.getText().toString().trim();
                String animalType = an_type.getText().toString().trim();
                String animalBirth = an_birth.getText().toString().trim();
                String animalDescribe = an_describe.getText().toString().trim();

                if (!TextUtils.isEmpty(animalName) && !TextUtils.isEmpty(animalSex) && !TextUtils.isEmpty(animalType)
                   && !TextUtils.isEmpty(animalBirth) && !TextUtils.isEmpty(animalDescribe)) {

                     id=_id;//用了login的—_id
                    mDBOpenHelper.add(id,animalName,animalSex,animalType,animalBirth,animalDescribe);
                    Toast.makeText(getActivity(),"设置成功，可在我的界面查看", Toast.LENGTH_SHORT).show();
                }
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
