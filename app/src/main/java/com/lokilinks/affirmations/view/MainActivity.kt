package com.lokilinks.affirmations.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.lokilinks.affirmations.R
import com.lokilinks.affirmations.data.PhraseDataSource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val phraseDataSet = PhraseDataSource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_aff)
        recyclerView.adapter = AffirmationAdapter(this, phraseDataSet )



    }
}