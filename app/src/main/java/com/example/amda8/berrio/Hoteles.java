package com.example.amda8.berrio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class Hoteles extends AppCompatActivity {
    private ImageButton hotel_malecon;
    private ImageButton hotel_central;
    private ImageButton hotel_2palmas;
    private TextView information;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        ImageButton hotel_malecon = (ImageButton)findViewById(R.id.malecon);
        ImageButton hotel_central = (ImageButton)findViewById(R.id.central);
        ImageButton hotel_2palmas = (ImageButton)findViewById(R.id.dospalmas);
        final TextView information = (TextView)findViewById(R.id.information);

        hotel_malecon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                information.setText(getText(R.string.inf_malecon));

            }
        });

        hotel_central.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                information.setText(getText(R.string.inf_central));

            }
        });
        hotel_2palmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                information.setText(getText(R.string.info_2palmas));

            }
        });
    }

}
