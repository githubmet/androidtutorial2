package com.example.suki.myapplication2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import android.content.Intent;

public class P000Menu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p000menu);

        ListView listViewP000 =(ListView)findViewById(R.id.listViewP000);
        String[] activities=getResources().getStringArray(R.array.activity_names);
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,activities);
        listViewP000.setAdapter(arrayAdapter);

        listViewP000.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Class className= null;
                        try {
                            className = Class.forName("com.example.suki.myapplication2."+parent.getItemAtPosition(position).toString());
                            Intent intent =new Intent(P000Menu.this,className);
                            startActivity(intent);
                        } catch (ClassNotFoundException e) {
                            e.printStackTrace();
                        }

                    }
                }
        );
    }
}
