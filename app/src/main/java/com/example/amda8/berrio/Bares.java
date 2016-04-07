package com.example.amda8.berrio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Bares extends AppCompatActivity {

    private ImageButton carnaval;
    private ImageButton barra;
    private ImageButton jalisco;
    private TextView informationbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bares);

        ImageButton carnaval = (ImageButton)findViewById(R.id.carnaval);
        ImageButton barra = (ImageButton)findViewById(R.id.barra);
        ImageButton jalisco = (ImageButton)findViewById(R.id.jalisco);
        final TextView informationbar = (TextView)findViewById(R.id.informationbares);

        carnaval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                informationbar.setText(getText(R.string.inf_carnaval));

            }
        });

        barra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                informationbar.setText(getText(R.string.inf_barra));

            }
        });
        jalisco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                informationbar.setText(getText(R.string.inf_jalisco));

            }
        });


    }

}
