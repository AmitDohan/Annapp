package jb.dohan.amit.annapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnStyle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnStyle= findViewById(R.id.btnStyle);

    }

    public void onClick(View v){

    }

    public void onClick_Style(View v){
        startActivity(new Intent(this, StyleEx.class));
    }

}
