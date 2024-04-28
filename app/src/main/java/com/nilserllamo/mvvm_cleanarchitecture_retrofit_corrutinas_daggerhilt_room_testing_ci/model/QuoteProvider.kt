package com.nilserllamo.mvvm_cleanarchitecture_retrofit_corrutinas_daggerhilt_room_testing_ci.model

class QuoteProvider {

    companion object {

        fun getQuote() : QuoteModel{
            val number = (0..4).random()
            return quotes[number]
        }

        private val quotes = listOf(
            QuoteModel("Cita 1", "Autor 1"),
            QuoteModel("Cita 2", "Autor 2"),
            QuoteModel("Cita 3", "Autor 3"),
            QuoteModel("Cita 4", "Autor 4"),
            QuoteModel("Cita 5", "Autor 5")
        )
    }
}