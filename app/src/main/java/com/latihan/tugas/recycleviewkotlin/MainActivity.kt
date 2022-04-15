package com.latihan.ravysholihin.recycleviewkotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val superheroList= listOf<superhero>(
            superhero(R.drawable.spiderman,
                nameSuperhero = "spiderman",
                descSuperhero = "Spider-Man has spider-like abilities including superhuman strength and the ability to cling to most surfaces. He is also extremely agile and has amazing reflexes. Spider-Man also has a “spider sense,” that warns him of impending danger. Spider-Man has supplemented his powers with technology."
            ),
            superhero(R.drawable.hulk,
                nameSuperhero = "hulk",
                descSuperhero = "In his comic book appearances, the character is both the Hulk, a green-skinned, hulking and muscular humanoid possessing a limitless degree of physical strength, and his alter ego Dr. Robert Bruce Banner, a physically weak, socially withdrawn, and emotionally reserved physicist."
            ),
            superhero(R.drawable.capten_amerika,
            nameSuperhero = "Capten America",
            descSuperhero = "In his comic book appearances, the character is both the Hulk, a green-skinned, hulking and muscular humanoid possessing a limitless degree of physical strength, and his alter ego Dr. Robert Bruce Banner, a physically weak, socially withdrawn, and emotionally reserved physicist."
            ),superhero(R.drawable.capten_amerika,
                nameSuperhero = "Capten America",
                descSuperhero = "In his comic book appearances, the character is both the Hulk, a green-skinned, hulking and muscular humanoid possessing a limitless degree of physical strength, and his alter ego Dr. Robert Bruce Banner, a physically weak, socially withdrawn, and emotionally reserved physicist."
            ),superhero(R.drawable.capten_amerika,
                nameSuperhero = "Capten America",
                descSuperhero = "In his comic book appearances, the character is both the Hulk, a green-skinned, hulking and muscular humanoid possessing a limitless degree of physical strength, and his alter ego Dr. Robert Bruce Banner, a physically weak, socially withdrawn, and emotionally reserved physicist."
            ),superhero(R.drawable.capten_amerika,
                nameSuperhero = "Capten America",
                descSuperhero = "In his comic book appearances, the character is both the Hulk, a green-skinned, hulking and muscular humanoid possessing a limitless degree of physical strength, and his alter ego Dr. Robert Bruce Banner, a physically weak, socially withdrawn, and emotionally reserved physicist."
            )
        )
        val recyclerView=findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this,superheroList){

        }
    }
}