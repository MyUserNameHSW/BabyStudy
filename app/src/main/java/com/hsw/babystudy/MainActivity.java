package com.hsw.babystudy;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showToast1(View view){
        Toast.makeText(getApplicationContext(),"已经点击",Toast.LENGTH_SHORT).show();
    }
}
