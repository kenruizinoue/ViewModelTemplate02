package com.kenruizinoue.viewmodeltemplate02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // KTX extension function from androidx.activity
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        increaseButton.setOnClickListener { increaseScore() }
        resetButton.setOnClickListener { resetScore() }
        updateScoreText()
    }

    private fun increaseScore() {
        viewModel.increaseScore()
        updateScoreText()
    }

    private fun resetScore() {
        viewModel.resetScore()
        updateScoreText()
    }

    // update UI of the scoreTextView with this method every time
    // score from MainViewModel changes
    private fun updateScoreText() {
        scoreTextView.text = viewModel.score.toString()
    }
}