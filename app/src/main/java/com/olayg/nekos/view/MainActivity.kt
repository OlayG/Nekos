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

class MainActivity : AppCompatActivity(R.layout.activity_main)