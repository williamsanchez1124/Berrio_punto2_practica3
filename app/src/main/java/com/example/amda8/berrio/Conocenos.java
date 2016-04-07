package com.example.amda8.berrio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Conocenos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conocenos);

        final TextView informationmio = (TextView)findViewById(R.id.informationmio);

        informationmio.setText(getText(R.string.acercamio));

    }

}
