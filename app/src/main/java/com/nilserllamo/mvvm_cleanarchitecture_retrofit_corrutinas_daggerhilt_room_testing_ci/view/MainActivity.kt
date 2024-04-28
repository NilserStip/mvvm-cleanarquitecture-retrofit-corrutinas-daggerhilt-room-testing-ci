package com.nilserllamo.mvvm_cleanarchitecture_retrofit_corrutinas_daggerhilt_room_testing_ci.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.nilserllamo.mvvm_cleanarchitecture_retrofit_corrutinas_daggerhilt_room_testing_ci.R
import com.nilserllamo.mvvm_cleanarchitecture_retrofit_corrutinas_daggerhilt_room_testing_ci.databinding.ActivityMainBinding
import com.nilserllamo.mvvm_cleanarchitecture_retrofit_corrutinas_daggerhilt_room_testing_ci.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        quoteViewModel.quoteModel.observe(this) { quoteModel ->
            binding.textViewQuote.text = quoteModel.quote
            binding.textViewAuthor.text = quoteModel.author
        }

        binding.root.setOnClickListener { quoteViewModel.getRandomQuote() }
    }

}