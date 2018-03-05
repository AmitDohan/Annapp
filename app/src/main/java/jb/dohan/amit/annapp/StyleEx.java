package jb.dohan.amit.annapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Random;

public class StyleEx extends AppCompatActivity {

    ImageButton ibBack;
    int Numhello= -1;
    Button btnWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_style_ex);
        ibBack= findViewById(R.id.ibBack);
        btnWelcome= findViewById(R.id.btnWelcome);

        getSupportActionBar().setTitle("Welcome!");

    }

    public void onClick_Back(View v){
        this.finish();
    }

    public void onClick(View v){
        btnWelcome.setText(randomHello());
    }

    private String randomHello(){
        String [] hello= {"Hi!", "Hello!", "What are you doing here?", "How are you?",
                "Go Home!", "Aloha!","DIE", "Hola!", "Shalom!", "Ahalan!"};

        int random=0;
        do{
            Random ran= new Random();
            random= ran.nextInt(10);
        }
        while(random == Numhello);

        return hello[random];

    }
}
