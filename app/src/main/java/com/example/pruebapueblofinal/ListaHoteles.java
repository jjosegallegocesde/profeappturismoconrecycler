package com.example.pruebapueblofinal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.example.pruebapueblofinal.adaptadores.HotelAdaptador;
import com.example.pruebapueblofinal.modelos.Hotel;

import java.util.ArrayList;

public class ListaHoteles extends AppCompatActivity {

    //ATRIBUTOS DE LA CLASE
    ArrayList<Hotel> lista = new ArrayList<>();
    RecyclerView listaLogica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_hoteles);

        listaLogica=findViewById(R.id.recycler);
        listaLogica.setLayoutManager(new LinearLayoutManager(this,RecyclerView.VERTICAL,false));

        crearListaHoteles();
        HotelAdaptador adaptador=new HotelAdaptador(lista);
        listaLogica.setAdapter(adaptador);

    }

    public void crearListaHoteles(){

        lista.add(new Hotel(R.drawable.hotel1,"Hotel 1","$150000"));
        lista.add(new Hotel(R.drawable.hotel2,"Hotel 2","$250000"));
        lista.add(new Hotel(R.drawable.hotel3,"Hotel 3","$50000"));
        lista.add(new Hotel(R.drawable.hotel4,"Hotel 4","$130000"));

    }

}