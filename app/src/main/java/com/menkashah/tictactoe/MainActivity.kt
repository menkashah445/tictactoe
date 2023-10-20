package com.menkashah.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import com.menkashah.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

    }





    fun clickable(view: View) {
        val buttonSelected = view as ImageButton
        var cellId = 0
        when (buttonSelected.id) {
            R.id.imageButton -> cellId = 1
            R.id.imageButton2 -> cellId = 2
            R.id.imageButton3 -> cellId = 3
            R.id.imageButton4 -> cellId = 4
            R.id.imageButton5 -> cellId = 5
            R.id.imageButton6 -> cellId = 6
            R.id.imageButton7 -> cellId = 7
            R.id.imageButton8 -> cellId = 8
            R.id.imageButton9 -> cellId = 9
        }
        play(cellId, buttonSelected)
        winner()
        resetGame()
    }

        private fun resetGame(){
         binding.buttonresetbutton.setOnClickListener {
             recreate()
         }
        }

          fun winner() {
            var winner = 0
            // for first player
            // for first row
            if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
                winner = 1
            }

            // for second row
            if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
                winner = 1
            }

            // for third row
            if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {

                winner = 1
            }
            // for first column
            if (player1.contains(1) && player1.contains(4) && player1.contains(7)) {
                winner = 1
            }
            // for second column
            if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
                winner = 1
            }
            // for third column
            if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
                winner = 1
            }
//            diagnol
            if(player1.contains(1) && player1.contains(5) && player1.contains(9)){
                winner = 1
            }

            // for second player

            // for first row
            if (player2.contains(1) && player2.contains(2) && player2.contains(3)) {
                winner = 2
            }
            // for second row
            if (player2.contains(4) && player2.contains(5) && player2.contains(6)) {
                winner = 2
            }
            // for third row
            if (player2.contains(7) && player2.contains(8) && player2.contains(9)) {
                winner = 2
            }
// for first column
            if (player2.contains(1) && player2.contains(4) && player2.contains(7)) {
                winner = 2
            }
            // for second column
            if (player2.contains(2) && player2.contains(5) && player2.contains(8)) {
                winner = 2
            }
            // for third column
            if (player2.contains(3) && player2.contains(6) && player2.contains(9)) {
                winner = 2
            }
            if (player2.contains(1) && player2.contains(5)&& player2.contains(9)){
                winner = 2
            }
              if (winner == 1) {
                  Toast.makeText(this, "player 1 win 😁", Toast.LENGTH_SHORT).show()
                  
              } else if (winner == 2) {
                  Toast.makeText(this, "player 2 win 😁😁", Toast.LENGTH_SHORT).show()
              }

        }
    var currentPlayer = 1
    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
     private  fun play(cellId :Int, buttonSelected: ImageButton){
         if (currentPlayer == 1) {
             buttonSelected.setBackgroundResource(R.drawable.green_o)
             player1.add(cellId)
             currentPlayer = 2
         } else {
             buttonSelected.setBackgroundResource(R.drawable.red_x)
             player2.add(cellId)
             currentPlayer = 1
         }


    }
}