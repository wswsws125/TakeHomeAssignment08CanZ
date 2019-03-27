package com.example.wswsw.takehomeassignment08_canz;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class PokemonAdapter extends RecyclerView.Adapter<PokemonViewHolder> {

    private List<Pokemon> pokemons;
    private Context context;

    //Adapter: to show the questions on the recyclerView

    //constructor
    public PokemonAdapter(List<Pokemon> pokemons, Context context){
        this.pokemons= pokemons;
        this.context=context;
    }

    //Using ViewHolder: to improve operation efficiency
    @Override
    public PokemonViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        //find and instantiate the card_view_pokemon.xml
        View view =LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_pokemon, parent,false);
        return new PokemonViewHolder(view,context);
    }

    //Each holder is bound to the corresponding data
    @Override
    public void onBindViewHolder(PokemonViewHolder holder, int position){
        Pokemon pokemon=pokemons.get(position);
        holder.pokemonName.setText(pokemon.getName());
        holder.pokemonType.setText(pokemon.getType());
        holder.pokemonImage.setImageResource(pokemon.getPhotoId());
        holder.isShiny.setImageResource(pokemon.shinyLogo);
        //holder.isTrue=question.isTrue;

    }

    @Override
    public int getItemCount(){
        return pokemons.size();
    }

}
