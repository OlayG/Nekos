package com.olayg.nekos.viewmodel

import androidx.lifecycle.*
import com.olayg.nekos.model.Category
import com.olayg.nekos.repo.NekosRepo
import com.olayg.nekos.util.logMe
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NekosViewModel : ViewModel() {

    val categories = liveData {
        try {
            emit(NekosRepo.getCategories())
        } catch (ex: Exception) {
            "Error: ${ex.message}".logMe()
        }
    }

}