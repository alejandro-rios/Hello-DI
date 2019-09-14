package com.alejandrorios.hellodi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MainActivity : AppCompatActivity() {

    // Retrieve Dependencies
    private val magicBox: Info by inject()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /// Bind with our activity
        startKoin {
            // Android context
            androidContext(this@MainActivity)
            // modules
            modules(bag)
        }

        text_view.text = magicBox.text
    }
}
