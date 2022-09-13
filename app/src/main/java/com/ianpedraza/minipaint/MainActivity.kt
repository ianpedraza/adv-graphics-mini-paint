package com.ianpedraza.minipaint

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val myCanvasView = MyCanvasView(this).apply {
            contentDescription = getString(R.string.canvasContentDescription)
        }

        hideNotificationBar()

        setContentView(myCanvasView)
    }
}
