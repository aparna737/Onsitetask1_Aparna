package com.example.onsitetask1_aparna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class Input extends Fragment {
    public TextView textView;
    private String input, data;
    View fragmentView;

    public Input(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstances){
        View rootView = inflater.inflate(R.layout.input_fragment, container, false);
         textView =  rootView.findViewById(R.id.detailed_tv);
        Button button0 = (Button) rootView.findViewById(R.id.btn0);
        Button button1 = (Button) rootView.findViewById(R.id.btn1);
        Button button2 = (Button) rootView.findViewById(R.id.btn2);
        Button button3 = (Button) rootView.findViewById(R.id.btn3);
        Button button4 = (Button) rootView.findViewById(R.id.btn4);
        Button button5 = (Button) rootView.findViewById(R.id.btn5);
        Button button6 = (Button) rootView.findViewById(R.id.btn6);
        Button button7 = (Button) rootView.findViewById(R.id.btn7);
        Button button8 = (Button) rootView.findViewById(R.id.btn8);
        Button button9 = (Button) rootView.findViewById(R.id.btn9);
        Button buttonAdd = (Button) rootView.findViewById(R.id.btn10);
        Button buttonMultiply = (Button) rootView.findViewById(R.id.btn11);
        Button buttonDiv = (Button) rootView.findViewById(R.id.btn12);
        Button buttonSubs = (Button) rootView.findViewById(R.id.btn13);
        Button buttonPoint = (Button) rootView.findViewById(R.id.btn14);

        Button buttonEqual = (Button) rootView.findViewById(R.id.btn16);
        Button buttonPercent = (Button) rootView.findViewById(R.id.btn17);
        Button buttonClear = (Button) rootView.findViewById(R.id.btn18);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView.getText().toString();
                textView.setText(data+"0");

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView.getText().toString();
                textView.setText(data+"1");

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView.getText().toString();
                textView.setText(data+"2");

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView.getText().toString();
                textView.setText(data+"3");

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView.getText().toString();
                textView.setText(data+"4");

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView.getText().toString();
                textView.setText(data+"5");

            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView.getText().toString();
                textView.setText(data+"6");

            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView.getText().toString();
                textView.setText(data+"7");

            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView.getText().toString();
                textView.setText(data+"8");

            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView.getText().toString();
                textView.setText(data+"9");

            }
        });

        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView.getText().toString();
                textView.setText(data+".");

            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
                MainActivity activity = (MainActivity) getActivity();
                activity.setResult("");

            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView.getText().toString();
                textView.setText(data+"+");

            }
        });

        buttonSubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView.getText().toString();
                textView.setText(data+"-");

            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView.getText().toString();
                textView.setText(data+"*");

            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView.getText().toString();
                textView.setText(data+"/");

            }
        });

        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView.getText().toString();
                textView.setText(data+"%");

            }
        });



        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                data = textView.getText().toString();
                data = data.replaceAll("%", "/100");
                Context rhino= Context.enter();
                rhino.setOptimizationLevel(-1);
                String finalResults= "";
                Scriptable scriptable = rhino.initStandardObjects();
                finalResults = rhino.evaluateString(scriptable, data, "Javascript", 1,null).toString();
                MainActivity activity = (MainActivity) getActivity();
                activity.setResult(finalResults);

            }
        });

        return rootView;
    }






}
