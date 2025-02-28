package com.example.cricradio.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.imthiyas.cricradio.ApiService
import com.imthiyas.cricradio.MiniScorecardResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MiniScorecardViewModel @Inject constructor(
    private val apiService: ApiService
) : ViewModel() {

    private val _miniScorecard = MutableStateFlow<MiniScorecardResponse?>(null)
    val miniScorecard: StateFlow<MiniScorecardResponse?> = _miniScorecard

    init {
        fetchMiniScorecard()
    }

    private fun fetchMiniScorecard() {
        viewModelScope.launch {
            try {
                val response = apiService.getMiniScorecard()
                _miniScorecard.value = response
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
