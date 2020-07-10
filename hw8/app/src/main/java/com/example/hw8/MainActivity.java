package com.example.hw8;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Pokemon> myPokemon =new ArrayList<>();

        Pokemon p1 = new Pokemon("bulbasaur",R.drawable.bulbasaur,60,55,405);
        Pokemon p2 = new Pokemon("charmander",R.drawable.charmander,60,55,405);
        Pokemon p3 = new Pokemon("ivysaur",R.drawable.ivysaur,60,55,405);
        Pokemon p4 = new Pokemon("venusaur",R.drawable.venusaur,60,55,405);
        Pokemon p5 = new Pokemon("bulbasaur",R.drawable.bulbasaur,60,55,405);

        myPokemon.add(p1);
        myPokemon.add(p2);
        myPokemon.add(p3);
        myPokemon.add(p4);
        myPokemon.add(p5);

        RecyclerView rv = findViewById(R.id.RecyclerView);


      /////////////////////////////////////////////////////////////////////  // ترتيب الرايكل فيو في ال اكس ام ال
        rv.setHasFixedSize(true);
        RecyclerView.LayoutManager ln =new LinearLayoutManager(this);
        rv.setLayoutManager(ln);
//////////////////////////////////////////////////////////////////////////////////////////////




MyAdapter adapter =new MyAdapter(myPokemon,this);
rv.setAdapter(adapter);




    }
}