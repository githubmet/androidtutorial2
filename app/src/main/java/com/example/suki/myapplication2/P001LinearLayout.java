package com.example.suki.myapplication2;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class P001LinearLayout extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayoutAna=new LinearLayout(this);
        linearLayoutAna.setOrientation(LinearLayout.VERTICAL);

        LinearLayout.LayoutParams layoutParamsAna=new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        linearLayoutAna.setLayoutParams(layoutParamsAna);


        LinearLayout linearLayoutName=new LinearLayout(this);
        linearLayoutName.setOrientation(LinearLayout.HORIZONTAL);

        LinearLayout.LayoutParams layoutParamsName=new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        linearLayoutName.setLayoutParams(layoutParamsName);

        TextView textViewName=new TextView(this);
        textViewName.setText(getResources().getString(R.string.Name));
        EditText editText=new EditText(this);

        linearLayoutName.addView(textViewName);
        linearLayoutName.addView(editText);


        LinearLayout linearLayoutSurname=new LinearLayout(this);
        linearLayoutSurname.setOrientation(LinearLayout.HORIZONTAL);

        LinearLayout.LayoutParams layoutParamsSurname=new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        linearLayoutSurname.setLayoutParams(layoutParamsSurname);

        TextView textViewSurname=new TextView(this);
        textViewSurname.setText(getResources().getString(R.string.Surname));
        EditText editTextSurname=new EditText(this);

        linearLayoutSurname.addView(textViewSurname);
        linearLayoutSurname.addView(editTextSurname);


        Button buttonSave =new Button(this);
        buttonSave.setText(getResources().getString(R.string.save));

        linearLayoutAna.addView(linearLayoutName);
        linearLayoutAna.addView(linearLayoutSurname);
        linearLayoutAna.addView(buttonSave);

        setContentView(linearLayoutAna);
    }
}
