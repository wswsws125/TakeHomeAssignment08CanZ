package com.example.wswsw.takehomeassignment08_canz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    public List<Pokemon> pokemons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle(R.string.app_name);

        //create a new arrayList of Pokemon objects
        pokemons=new ArrayList<>();
        pokemons.add(new Pokemon(R.string.bulbasaur_name, R.string.bulbasaur_type,R.mipmap.bulbasaur,true,R.mipmap.stars));
        pokemons.add(new Pokemon(R.string.charmander_name, R.string.charmander_type,R.mipmap.charmander,true,R.mipmap.stars));
        pokemons.add(new Pokemon(R.string.squirtle_name, R.string.squirtle_type,R.mipmap.squirtle,true,R.mipmap.stars));
        pokemons.add(new Pokemon(R.string.pikachu_name, R.string.pikachu_type,R.mipmap.pikachu,true,R.mipmap.stars));
        pokemons.add(new Pokemon(R.string.cubone_name, R.string.cubone_type,R.mipmap.cubone,true,R.mipmap.stars));
        pokemons.add(new Pokemon(R.string.gengar_name, R.string.gengar_type,R.mipmap.gengar,true,R.mipmap.stars));
        pokemons.add(new Pokemon(R.string.eevee_name, R.string.eevee_type,R.mipmap.eevee,true,R.mipmap.stars));
        pokemons.add(new Pokemon(R.string.meowth_name, R.string.meowth_type,R.mipmap.meowth,false,R.mipmap.blank));
        pokemons.add(new Pokemon(R.string.oddish_name, R.string.oddish_type,R.mipmap.oddish,false,R.mipmap.blank));
        pokemons.add(new Pokemon(R.string.vulpix_name, R.string.vulpix_type,R.mipmap.vulpix,false,R.mipmap.blank));

        //find the recyclerView
        recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
        // keep the width and height of the recyclerView
        recyclerView.setHasFixedSize(true);
        //set layout manager for the recyclerView
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        ////Adapter: to show the pokemon cards on the recyclerView
        recyclerView.setAdapter(new PokemonAdapter(pokemons,this));

    }
}
