package com.example.suki.myapplication2;


import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import android.view.LayoutInflater;
public class P005AlertDialogProf extends Activity {
    private TextView textViewP005;
    LinearLayout linearLayoutP005;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.p005alertdialogprof);
        textViewP005= (TextView)findViewById(R.id.textViewP005);
        linearLayoutP005= findViewById(R.id.linearLayoutP005);
    }

    public void onClickConfirmMtdP005(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this,android.R.layout.select_dialog_item);
        builder.setNegativeButton(getResources().getString(R.string.cancel), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(P005AlertDialogProf.this,"Negative",Toast.LENGTH_SHORT).show();
                textViewP005.setText(R.string.failed);
            }
        });
        builder.setPositiveButton(getResources().getString(R.string.save), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(P005AlertDialogProf.this, "Positive", Toast.LENGTH_SHORT).show();
                textViewP005.setText(R.string.successful);
            }
        });
        builder.setTitle("Are you sure?");
        builder.setIcon(R.drawable.fadein);
        builder.create();
        builder.show();
    }

    public void onClickChooseMtdP005(View view) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Please select your favouite calor");
        final String[] colors = getResources().getStringArray(R.array.colorsp000);
        builder.setSingleChoiceItems(colors, 0, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(P005AlertDialogProf.this, colors[which].toString(), Toast.LENGTH_SHORT).show();
            }
        });
        builder.create();
        builder.show();
    }

    public void onClickCheckMtdP005(View view) {
        AlertDialog.Builder builder=new AlertDialog.Builder(this,android.R.layout.select_dialog_multichoice);
        final CharSequence[] colors=getResources().getStringArray(R.array.colorsp000);
        builder.setItems(colors, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(P005AlertDialogProf.this, colors[which].toString(), Toast.LENGTH_SHORT).show();
            }
        });
        AlertDialog alertDialog= builder.create();
        alertDialog.show();
    }

    public void onClickCustomMtdP005(View view) {

        final AlertDialog.Builder builder=new AlertDialog.Builder(this);
        LayoutInflater layoutInflater=LayoutInflater.from(this);
        View viewLayout= layoutInflater.inflate(R.layout.p005customalertdialog,
                linearLayoutP005,false);
        builder.setView(viewLayout);


        final AlertDialog alertDialog= builder.create();
        builder.setTitle("Are you sure!");
        builder.show();
        Button buttonSaveP005= (Button)viewLayout.findViewById(R.id.buttonSaveP005);
        Button buttonCancelP005= (Button)viewLayout.findViewById(R.id.buttonCancelP005);

        buttonSaveP005.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textViewP005.setText(R.string.successful);
                        alertDialog.dismiss();
                        alertDialog.cancel();
                    }
                }
        );
        buttonCancelP005.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textViewP005.setText(R.string.failed);
                        alertDialog.cancel();
                        alertDialog.dismiss();
                    }
                }
        );

    }
}
