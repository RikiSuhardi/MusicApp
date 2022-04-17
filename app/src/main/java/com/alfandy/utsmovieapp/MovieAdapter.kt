package com.alfandy.utsmovieapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(private val context: Context, private val movie: List<Movie>, val listener: (Movie) -> Unit)
    : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){
    class MovieViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imageMovie = view.findViewById<ImageView>(R.id.img_item_photo)
        val nameMovie = view.findViewById<TextView>(R.id.tv_item_name)
        val descMovie = view.findViewById<TextView>(R.id.tv_item_description)


        fun binView(movie: Movie, listener: (Movie) -> Unit){
            imageMovie.setImageResource(movie.imageMovie)
            nameMovie.text = movie.nameMovie
            descMovie.text = movie.descMovie
            itemView.setOnClickListener{
                listener(movie)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_movie, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.binView(movie[position], listener)
    }

    override fun getItemCount(): Int = movie.size
    }
