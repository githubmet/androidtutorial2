package com.example.suki.myapplication2;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Spinner;
import android.widget.ArrayAdapter;
import java.util.List;
import java.util.ArrayList;

public class P000StyleColorsXml extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p000stylecolorsxml);

        String veri=getResources().getString(R.string.hello_world);
        TextView textViewP000=(TextView)findViewById(R.id.textViewP000);
        textViewP000.setText(veri);

        Spinner spinnerP000=(Spinner)findViewById(R.id.spinnerP000);
        String[] colors=getResources().getStringArray(R.array.colorsp000);

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_spinner_item,colors);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerP000.setAdapter(arrayAdapter);


        Spinner spinner2P000= (Spinner)findViewById(R.id.spinner2P000);
        List<String> colorsList=listColors();
        ArrayAdapter arrayAdapter2=new ArrayAdapter(this,android.R.layout.simple_spinner_item,colorsList);
        spinner2P000.setAdapter(arrayAdapter2);

    }
    private List<String> listColors(){

        List<String> listReturn=new ArrayList();
            listReturn.add("Purple");
            listReturn.add("White");
            listReturn.add("Red");
            listReturn.add("Blue");
            listReturn.add("Black");
            listReturn.add("Yellow");

        return listReturn;
    }
}
