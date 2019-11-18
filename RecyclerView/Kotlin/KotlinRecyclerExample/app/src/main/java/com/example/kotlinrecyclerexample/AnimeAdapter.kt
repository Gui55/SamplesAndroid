package com.example.kotlinrecyclerexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_line.view.*

class AnimeAdapter(val animeList: List<Anime>) : RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {

        var itemView : View = LayoutInflater.from(parent.context)
            .inflate(R.layout.recycler_line, parent, false)

        return AnimeViewHolder(itemView)

    }

    override fun getItemCount(): Int {
        return animeList.size
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {

        val anime = animeList.get(position)

        holder.nome.setText(anime.nome)
        holder.protagonista.setText(anime.protagonista)

    }

    class AnimeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val nome = itemView.nomeAnime
        val protagonista = itemView.nomeProtagonista

    }
}