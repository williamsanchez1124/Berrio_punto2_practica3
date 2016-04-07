package com.example.amda8.berrio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button hoteles, bares, turistico, conocenos, demografity ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hoteles = (Button) findViewById(R.id.hoteles);
        bares = (Button)findViewById(R.id.bares);
        turistico = (Button)findViewById(R.id.sitios);
        conocenos = (Button)findViewById(R.id.conocenos);
    }
    public void mostrar(View View)

    {
        Intent hotel = new Intent(this, Hoteles.class);
        startActivity(hotel);

    }
    public void mostrarbares(View View)

    {
        Intent bar1 = new Intent(this, Bares.class);
        startActivity(bar1);

    }
    public void mostrarsitios(View View)

    {
        Intent sitios1 = new Intent(this, Sitios.class);
        startActivity(sitios1);

    }
    public void mostrarme(View View)

    {
        Intent yo = new Intent(this, Conocenos.class);
        startActivity(yo);

    }
    public void mostrar_demografia(View View)

    {
        Intent demo = new Intent(this, Demografia.class);
        startActivity(demo);

    }
}
