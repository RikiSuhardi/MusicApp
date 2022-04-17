package com.alfandy.utsmovieapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailMovieActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_movie)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)


        val superHero = intent.getParcelableExtra<Movie>(MainActivity.INTENT_PARCELABLE)

        val imageMovie = findViewById<ImageView>(R.id.img_item_photo)
        val nameMovie = findViewById<TextView>(R.id.tv_item_name)
        val descMovie = findViewById<TextView>(R.id.tv_item_description)

        imageMovie.setImageResource(superHero?.imageMovie!!)
        nameMovie.text = superHero.nameMovie
        descMovie.text = superHero.descMovie

    }

    override fun onSupportNavigateUp(): Boolean{
        onBackPressed()
        return true
    }
}