package com.example.suki.myapplication2;


import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;
import android.content.Intent;


public class P002OptionsMenu extends Activity {

    public static final int FIRST_MENU=Menu.FIRST;
    public static final int SECOND_MENU=Menu.FIRST+1;
    public static final int TIRHD_MENU=Menu.FIRST+2;
    public static final int FOUTH_MENU=Menu.FIRST+3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RelativeLayout relativeLayout=new RelativeLayout(this);
        relativeLayout.setBackgroundColor(getResources().getColor(R.color.color4c));

        setContentView(relativeLayout);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(menu.NONE,FIRST_MENU,0,"FIRSTONE");
        menu.add(menu.NONE,SECOND_MENU,1,"SECONDONE");
        menu.add(menu.NONE,TIRHD_MENU,2,"TIRTHONE");
        menu.add(menu.NONE,FOUTH_MENU,3,"FOURTH");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){

            case FIRST_MENU:
                Toast.makeText(this,"You selected the first one",Toast.LENGTH_SHORT).show();
                break;
            case SECOND_MENU:
                Toast.makeText(this,"You selected the second one",Toast.LENGTH_SHORT).show();
                break;
            case TIRHD_MENU:
                Toast.makeText(this,"You selected the thrid one",Toast.LENGTH_SHORT).show();
                break;
            case FOUTH_MENU:
                Toast.makeText(this,"You selected the fourth one",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
