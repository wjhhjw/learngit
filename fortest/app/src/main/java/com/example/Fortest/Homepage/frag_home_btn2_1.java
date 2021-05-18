package com.example.Fortest.Homepage;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.Fortest.R;

public class frag_home_btn2_1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //加载R.layout.fragment_my布局文件
        View view = inflater.inflate(R.layout.activity_frag_home_btn2_1, container, false);
        return view;
    }
}
