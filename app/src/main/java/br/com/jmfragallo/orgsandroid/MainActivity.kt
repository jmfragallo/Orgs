package br.com.jmfragallo.orgsandroid

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val view = TextView(this)
        view.setText("Bem Vinde")
        setContentView(view)
    }
}