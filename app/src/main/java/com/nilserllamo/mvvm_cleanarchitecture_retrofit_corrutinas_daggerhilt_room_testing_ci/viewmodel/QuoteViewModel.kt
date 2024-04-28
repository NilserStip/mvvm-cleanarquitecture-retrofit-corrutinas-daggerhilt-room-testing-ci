package com.nilserllamo.mvvm_cleanarchitecture_retrofit_corrutinas_daggerhilt_room_testing_ci.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.nilserllamo.mvvm_cleanarchitecture_retrofit_corrutinas_daggerhilt_room_testing_ci.model.QuoteModel
import com.nilserllamo.mvvm_cleanarchitecture_retrofit_corrutinas_daggerhilt_room_testing_ci.model.QuoteProvider

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    fun getRandomQuote() {
        val currentQuote = QuoteProvider.getQuote()
        quoteModel.postValue(currentQuote)
    }
}