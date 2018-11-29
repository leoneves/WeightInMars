package br.com.neves.weightinmars

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val marsGravity = 0.38

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultTextView.visibility = View.INVISIBLE

        val weight= enterWeight.text

        showWeightButton.setOnClickListener {
            val weightOnMars = calculateWeight(weight.toString().toDouble())
            resultTextView.visibility = View.VISIBLE
            resultTextView.text = getString(R.string.result, weightOnMars.toString())
        }
    }

    fun calculateWeight(userWeight: Double): Double {
        return userWeight * marsGravity
    }
}
