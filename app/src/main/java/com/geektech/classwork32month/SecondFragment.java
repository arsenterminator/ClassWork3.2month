package com.geektech.classwork32month;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.geektech.classwork32month.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding3 = FragmentSecondBinding.inflate(inflater);
        initViews();
        return binding3.getRoot();
    }

    private void initViews() {
        if (!getArguments().getString("result").isEmpty()){
            binding3.bgText1.setText(getArguments().getString("result"));
            binding3.bgText2.setText(getArguments().getString("result1"));
        } else {

        }
    }
}