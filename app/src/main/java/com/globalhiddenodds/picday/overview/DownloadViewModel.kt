package com.globalhiddenodds.picday.overview

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.globalhiddenodds.picday.network.AstroImageService
import com.globalhiddenodds.picday.network.DataCloud
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DownloadViewModel : ViewModel() {
    private var dataCloud: DataCloud? = null
    private val dataCloudState = mutableStateOf(dataCloud)
    val dataImage: DataCloud?
        get() = dataCloudState.value

    fun getImage(date: String) {
        viewModelScope.launch(
            viewModelScope.coroutineContext + Dispatchers.IO
        ) {
            try {
                dataCloudState.value = AstroImageService
                    .retrofitAstroService.getAstronomicImage(date)

            } catch (ex: Exception) {
                println(ex.message)
            }
        }
    }

}