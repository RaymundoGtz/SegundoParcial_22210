package com.example.example.viewmodels

import com.example.example.R
import com.example.example.models.Nino

class PersonViewModels {
    init {}

    fun getPersonList(): ArrayList<Nino> {
        var peopleList: ArrayList<Nino> = ArrayList<Nino>()

        peopleList.add(Nino
            (R.drawable.female01,
            "Estudiante",
            "Chica",
            12))

        peopleList.add(Nino
            (R.drawable.male01,
            "Estudiante",
            "Chico",
            10))

        peopleList.add(Nino
            (R.drawable.female02,
            "Youtuber",
            "Chica",
            14))

        peopleList.add(Nino
            (R.drawable.male02,
            "Profesor",
            "Chico",
            24))

        peopleList.add(Nino
            (R.drawable.female03,
            "Enfermera",
            "Chica",
            22))

        peopleList.add(Nino
            (R.drawable.male03,
            "Pescador",
            "Chico",
            65))

        peopleList.add(Nino
            (R.drawable.female04,
            "Mecanico",
            "Chica",
            21))

        peopleList.add(Nino
            (R.drawable.male04,
            "Cocinero",
            "Chica",
            21))

        peopleList.add(Nino
            (R.drawable.male04,
            "HAS LLEGADO AL FINAL DE ESTA LISTA DE ENTRENADORES",
            "ESTE ENTRENADOR NO EXISTE",
            0))







        return peopleList
    }
}