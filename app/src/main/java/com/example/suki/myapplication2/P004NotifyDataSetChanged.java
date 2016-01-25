package com.example.suki.myapplication2;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;
import java.util.ArrayList;
import android.widget.ArrayAdapter;
import android.widget.Toast;

public class P004NotifyDataSetChanged extends Activity {

    private List<CharSequence> getColors(){

        List<CharSequence> colors= new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Grey");
        colors.add("Black");
        colors.add("Yellow");

        return colors;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.p004notifydatasetchanged);

        Spinner spinnerP004= (Spinner)findViewById(R.id.spinnerP004);
        final EditText editTextP004=(EditText)findViewById(R.id.editTextP004);

        final List<CharSequence> colors=getColors();
        final ArrayAdapter<CharSequence> arrayAdapter= new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,colors);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerP004.setAdapter(arrayAdapter);

        Button buttonP004= (Button)findViewById(R.id.buttonP004);
        buttonP004.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        CharSequence yeniColor=editTextP004.getText().toString();
                        colors.add(yeniColor);
                        arrayAdapter.notifyDataSetChanged();

                        Toast.makeText(P004NotifyDataSetChanged.this,"yeni color ("+yeniColor+") eklendi!",Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}
