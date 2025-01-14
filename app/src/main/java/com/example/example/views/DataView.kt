package com.example.example.views

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.example.R
import com.example.example.viewmodels.pokemonViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DataView(navController: NavHostController, img: Int, trabajo: String) {

    val viewModel = pokemonViewModel()

    var name by remember {mutableStateOf("")}
    var pokemon by remember {mutableStateOf("")}

    var message by remember {mutableStateOf("Elige un pokememe")}

    Column (
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(Color(0x77005E56)),
    horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TextField(

            value = name,
            onValueChange = {name = it},
            leadingIcon = {
                Image (
                    painter = painterResource(id = R.drawable.male01),
                    contentDescription = "Person"
                )
            },
            label = { Text(text = "¿Cuál es tu nombre?")},
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(30.dp))

        Text(text = "Selecciona un pokemon para que sea tu companero de viaje")

        Spacer(modifier = Modifier.height(30.dp))

        LazyRow {
            items(viewModel.getPokeList()) {
                    poke ->
                        Card (
                            onClick = {pokemon = poke.nombre}
                        ) {
                            Column (modifier = Modifier.padding(10.dp)) {
                                Image(
                                    painter = painterResource(id = poke.img),
                                    contentDescription = poke.nombre,
                                    modifier = Modifier.size(150.dp)
                                )
                                Spacer(modifier = Modifier.height(10.dp))
                                Text(text = poke.nombre, modifier = Modifier.align(Alignment.CenterHorizontally))
                            }
                        }

                        Spacer(modifier = Modifier.width(20.dp))
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row (
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(
                onClick = {navController.popBackStack()}
            ) {
                Text(text = "Regresar")
            }

            Button(
                onClick = {
                    message = "$pokemon YO TE ELIJO!"
                }
            ) {
                Text(text = "Finalizar")
            }
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = message)
    }
}

@Preview(showBackground = true)
@Composable
fun Preview_Data() {
    DataView(navController = rememberNavController(), R.drawable.student_icon, "Pescador")
}