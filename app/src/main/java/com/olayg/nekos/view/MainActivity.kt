package com.olayg.nekos.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.olayg.nekos.R
import com.olayg.nekos.adapter.CategoryAdapter
import com.olayg.nekos.databinding.ActivityMainBinding
import com.olayg.nekos.model.Category
import com.olayg.nekos.util.logMe
import com.olayg.nekos.viewmodel.NekosViewModel

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val nekosVM by viewModels<NekosViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        observeObservables()
    }

    private fun observeObservables() = with(nekosVM) {
        categories.observe(this@MainActivity) { categories ->
            binding.rvCategories.adapter = CategoryAdapter(categories, ::categoryClicked)
        }
    }

    private fun categoryClicked(category: Category) {
        category.toString().logMe()
    }
}