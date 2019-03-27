package com.example.wswsw.takehomeassignment08_canz;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class PokemonViewHolder extends RecyclerView.ViewHolder {

    public CardView cardView;
    public TextView pokemonName;
    public TextView pokemonType;
    public ImageView pokemonImage;
    public ImageView isShiny;

    //find and save the views
    public PokemonViewHolder(View itemView, final Context context){
        super(itemView);
        cardView=(CardView)itemView.findViewById(R.id.card_view);
        pokemonName=(TextView) itemView.findViewById(R.id.pokemon_name);
        pokemonType=(TextView)itemView.findViewById(R.id.pokemon_type);
        pokemonImage=(ImageView) itemView.findViewById(R.id.pokemon_image);
        isShiny=(ImageView) itemView.findViewById(R.id.shiny_logo);

//        cardView.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                String hasShiny1=hasShiny.toString();
//
//
//                Toast.makeText(context,hasShiny1,Toast.LENGTH_SHORT).show();
//            }
//        });

    }



}
