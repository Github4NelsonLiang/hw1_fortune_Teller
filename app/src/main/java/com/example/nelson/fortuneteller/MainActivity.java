package com.example.nelson.fortuneteller;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

import static com.example.nelson.fortuneteller.R.array.fortunemessage;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicked (View view){

        String[] fortune= getResources().getStringArray(R.array.fortunemessage);
        String message = fortune[new Random().nextInt(fortune.length)];

        TextView textView = (TextView)findViewById(R.id.textView);

        textView.setVisibility(View.VISIBLE);
        textView.setText(message);
    }

}
