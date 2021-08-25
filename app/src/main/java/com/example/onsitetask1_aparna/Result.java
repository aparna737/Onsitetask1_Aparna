package com.example.onsitetask1_aparna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Result extends Fragment implements MyInterface {
    public TextView textView;
    public Result(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstances){
        View rootView = inflater.inflate(R.layout.result_fragment, container, false);
        textView = rootView.findViewById(R.id.result);
        return rootView;
    }

    @Override
    public void setResult(String s) {
        textView.setText(s);

    }
}
