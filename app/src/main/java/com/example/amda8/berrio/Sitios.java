package com.example.amda8.berrio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Sitios extends AppCompatActivity {

    private ImageButton parque;
    private ImageButton muelle;
    private ImageButton puente;
    private TextView informationturistica;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sitios);


        ImageButton parque = (ImageButton)findViewById(R.id.parque);
        ImageButton muelle = (ImageButton)findViewById(R.id.muelle);
        ImageButton puente = (ImageButton)findViewById(R.id.puente);
        final TextView informationturistica = (TextView)findViewById(R.id.informationturistica);

        parque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                informationturistica.setText(getText(R.string.inf_parque));

            }
        });

        muelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                informationturistica.setText(getText(R.string.inf_muelle));

            }
        });
        puente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                informationturistica.setText(getText(R.string.inf_puente));

            }
        });



    }

}
