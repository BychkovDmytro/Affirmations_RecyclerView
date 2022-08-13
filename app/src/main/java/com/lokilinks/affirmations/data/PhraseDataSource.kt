package com.lokilinks.affirmations.data

import com.lokilinks.affirmations.R
import com.lokilinks.affirmations.model.Affirmations

class PhraseDataSource {

    fun loadAffirmations(): List<Affirmations>{

        return listOf(
            Affirmations(R.string.phrase1, R.drawable.phrase1),
            Affirmations(R.string.phrase2, R.drawable.phrase2),
            Affirmations(R.string.phrase3, R.drawable.phrase3),
            Affirmations(R.string.phrase4, R.drawable.phrase4),
            Affirmations(R.string.phrase5, R.drawable.phrase5),
            Affirmations(R.string.phrase6, R.drawable.phrase6),
            Affirmations(R.string.phrase7, R.drawable.phrase7),
            Affirmations(R.string.phrase8, R.drawable.phrase8),
            Affirmations(R.string.phrase9, R.drawable.phrase9),
            Affirmations(R.string.phrase10, R.drawable.phrase10)
        )

    }
}