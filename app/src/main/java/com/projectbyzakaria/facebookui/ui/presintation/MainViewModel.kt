package com.projectbyzakaria.facebookui.ui.presintation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.projectbyzakaria.facebookui.utils.Response
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel(
    private  val repository: MainRepository
) :ViewModel()
{




    private val _posts = MutableStateFlow<List<Response>>(emptyList())
    val posts = _posts.asStateFlow()

    init {
        fetch()
    }

    private fun fetch() {
        viewModelScope.launch {
            val data = repository.fetch()
            _posts.emit(data)
        }
    }


}