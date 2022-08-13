package com.lokilinks.affirmations.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.lokilinks.affirmations.R
import com.lokilinks.affirmations.model.Affirmations

class AffirmationAdapter(private val context: Context, private val dataSet: List<Affirmations>): RecyclerView.Adapter<AffirmationAdapter.ItemViewHolder>() {

    class ItemViewHolder(private var view: View): RecyclerView.ViewHolder(view) {
        val phraseTitle : TextView = view.findViewById(R.id.text_item)
        val phraseImage : ImageView = view.findViewById(R.id.image_item)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
       val adapterLayout =  LayoutInflater.from(parent.context).inflate(R.layout.affirmation_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }


    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val affirmation =   dataSet[position]
        holder.phraseTitle.text = context.resources.getString(affirmation.stringResourceId)
        holder.phraseImage.setImageResource(affirmation.imageResourceId)

    }


    override fun getItemCount(): Int {
        return dataSet.size
    }

}

