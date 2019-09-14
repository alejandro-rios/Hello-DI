package com.alejandrorios.hellodi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.erased.instance

class MainActivity : AppCompatActivity(), KodeinAware {

    // Bind with our activity
    override val kodein = Kodein {
        import(bag)
    }

    // Retrieve Dependencies
    private val magicBox: Info by instance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text_view.text = magicBox.text
    }
}
