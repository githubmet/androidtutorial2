package com.example.suki.myapplication2;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.net.Uri;

public class P008OpenWebPage extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.p008openwebpage);
    }

    public void onClickP008(View view) {
        Intent intent=new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.google.com"));
        startActivity(intent);
    }
}
