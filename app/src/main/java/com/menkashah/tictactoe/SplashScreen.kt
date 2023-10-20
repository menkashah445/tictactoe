package com.menkashah.tictactoe

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity


class SplashScreen : AppCompatActivity() {

    private  val binding by lazy {

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        Handler().postDelayed(Runnable { // This method will be executed once the timer is over
            // Start your app main activity
            val i = Intent(this@SplashScreen, MainActivity::class.java)
            startActivity(i)

            // close this activity
            finish()
        }, 3000)

    }
}