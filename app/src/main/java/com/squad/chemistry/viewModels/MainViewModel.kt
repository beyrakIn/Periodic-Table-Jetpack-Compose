package com.squad.chemistry.viewModels

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.squad.chemistry.api.ApiService
import com.squad.chemistry.api.Config
import com.squad.chemistry.models.Element
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    var elements: List<Element> by mutableStateOf(listOf())
    var errorMessage: String by mutableStateOf("")


    init {
        getElementList()
    }

    fun getElementList() {
        viewModelScope.launch {
            val apiService = Config.getInstance().create(ApiService::class.java)
            try {
                elements = apiService.getElements()
            } catch (e: Exception) {
                errorMessage = e.message.toString()
                println(errorMessage)
            }
        }
    }
}
