package com.example.onsitetask1_aparna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MyInterface{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Result result = new Result();
        Input input =  new Input();
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.result_fragment_container, result,"Result").commit();
        fragmentManager.beginTransaction().add(R.id.input_fragment_container, input).commit();
    }

    @Override
    public void setResult(String s) {
        Fragment fragment = getSupportFragmentManager().findFragmentByTag("Result");
        Result result = (Result) fragment;
        result.setResult(s);

    }
}