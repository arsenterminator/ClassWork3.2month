package com.geektech.classwork32month;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.text.method.PasswordTransformationMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;


import com.geektech.classwork32month.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding2;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding2 = FragmentFirstBinding.inflate(inflater);
        initViews();
        return binding2.getRoot();
    }

    private void initViews() {

        binding2.btnButton2.setOnClickListener(view -> {
            if (binding2.editText1.getText().toString().equals("login123") && binding2.editText2.getText().toString().equals("password123")) {
                Bundle bundle = new Bundle();
                bundle.putString("result", binding2.editText1.getText().toString());
                bundle.putString("result1", binding2.editText2.getText().toString());
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.fragment_container, SecondFragment.class, bundle);
                transaction.commit();
            }
        });
    }
}