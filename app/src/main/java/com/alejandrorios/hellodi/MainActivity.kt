package com.alejandrorios.hellodi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    // Retrieve Dependencies
    @Inject
    lateinit var info: Info

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Bind dependency
        DaggerMagicBox.create().poke(this)
        text_view.text = info.text
    }
}
