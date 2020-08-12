package com.kenruizinoue.viewmodeltemplate02

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    var score = 0

    fun increaseScore() {
        score++
    }

    fun resetScore() {
        score = 0
    }
}