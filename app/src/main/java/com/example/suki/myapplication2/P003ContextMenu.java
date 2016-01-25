package com.example.suki.myapplication2;


import android.app.Activity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class P003ContextMenu extends Activity {

    public static final int FIRST_ONE= Menu.FIRST;
    public static final int SECOND_ONE=Menu.FIRST+1;
    public static final int THRID_ONE=Menu.FIRST+2;

    int selectedTextView;
    TextView textViewP003;
    TextView textView2P003;
    TextView textView3P003;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p003contextmenu);

        textViewP003= (TextView)findViewById(R.id.textViewP003);
        textView2P003= (TextView)findViewById(R.id.textView2P003);
        textView3P003= (TextView)findViewById(R.id.textView3P003);

        registerForContextMenu(textViewP003);
        registerForContextMenu(textView2P003);
        registerForContextMenu(textView3P003);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {

        selectedTextView=v.getId();
        menu.add(menu.NONE,FIRST_ONE,0,"Hello");
        menu.add(menu.NONE,SECOND_ONE,1,"New");
        menu.add(menu.NONE,THRID_ONE,2,"World");
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case FIRST_ONE:
                Toast.makeText(this,"You selected the FIRST ONE",Toast.LENGTH_SHORT).show();
                break;
            case SECOND_ONE:
                Toast.makeText(this,"You selected the SECOND ONE",Toast.LENGTH_SHORT).show();
                break;
            case THRID_ONE:
                Toast.makeText(this,"You selected the THIRD ONE",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onContextItemSelected(item);
    }
}
