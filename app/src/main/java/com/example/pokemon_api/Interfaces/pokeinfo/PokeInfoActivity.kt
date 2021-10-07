package com.example.pokemon_api.Interfaces.pokeinfo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.Observer
import com.bumptech.glide.Glide
import com.example.pokemon_api.R
import kotlinx.android.synthetic.main.activity_pokeinfo.*

class PokeInfoActivity : AppCompatActivity(){

    lateinit var viewModel: PokeInfoViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pokeinfo)

        viewModel = ViewModelProvider(this).get(PokeInfoViewModel::class.java)

        initUI()
    }

    private fun initUI(){
        val id = intent.extras?.get("id") as Int

        viewModel.getPokemonInfo(id)

        viewModel.pokemonInfo.observe(this, Observer { pokemon ->
            nombreTxt.text = pokemon.name
            Especietxt.text = "Especie: ${pokemon.especie.Especie1}"
            XpText.text ="Experiencia: ${pokemon.experience}"
            TamanioTxt.text = "Altura: ${pokemon.height/10.0} m"
            PesoTxt.text = "Peso: ${pokemon.weight/10.0} kg"


            Glide.with(this).load(pokemon.sprites.frontDefault).into(imgPokemon)
           // Glide.with(this).load(pokemon.sprites.frontDefault).into((ImgLista))
        })
    }
}