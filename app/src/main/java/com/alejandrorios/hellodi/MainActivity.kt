package com.alejandrorios.hellodi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.rewedigital.katana.Component

class MainActivity : AppCompatActivity() {

    // Component
    private val component = Component(modules = listOf(bag))

    // Retrieve Dependencies
    private val magicBox: Info by component.inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_view.text = magicBox.text
    }
}
