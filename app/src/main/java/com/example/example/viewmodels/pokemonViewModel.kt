package com.example.example.viewmodels

import com.example.example.R
import com.example.example.models.pokemon

class pokemonViewModel {
    init {}

    fun getPokeList(): ArrayList<pokemon> {
        var listapokemon: ArrayList<pokemon> = ArrayList<pokemon>()

        listapokemon.add(pokemon(R.drawable.pokemon01, "Spirigatito"))
        listapokemon.add(pokemon(R.drawable.pokemon02, "Fuecoco"))
        listapokemon.add(pokemon(R.drawable.pokemon03, "Quaxly"))

        return listapokemon
    }
}