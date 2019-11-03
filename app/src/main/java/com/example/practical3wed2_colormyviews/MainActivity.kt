package com.example.practical3wed2_colormyviews

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText: ImageView = findViewById(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        val six = findViewById<TextView>(R.id.box_six_text)
        val seven = findViewById<TextView>(R.id.box_seven_text)
        val eight = findViewById<TextView>(R.id.box_eight_text)
        val nine = findViewById<TextView>(R.id.box_nine_text)
        val ten = findViewById<TextView>(R.id.box_ten_text)
        val eleven = findViewById<TextView>(R.id.box_eleven_text)
        val twelve = findViewById<TextView>(R.id.box_twelve_text)

//        val redButton = findViewById<TextView>(R.id.red_button)
//        val greenButton = findViewById<TextView>(R.id.green_button)
//        val yellowButton = findViewById<TextView>(R.id.yellow_button)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)


        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,
            six,seven,eight,nine,ten, eleven,twelve)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
    private fun makeColored(view: View){
//        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
//        val boxFourText = findViewById<TextView>(R.id.box_four_text)
//        val boxFiveText = findViewById<TextView>(R.id.box_five_text)
        when (view.id) {

            // Boxes using Color class colors for the background
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.user)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_six_text -> view.setBackgroundColor(Color.CYAN)
            R.id.box_seven_text -> view.setBackgroundResource(R.color.my_red)
            R.id.box_eight_text -> view.setBackgroundResource(R.color.my_yellow)
            R.id.box_nine_text -> view.setBackgroundResource(R.color.my_green)
            R.id.box_ten_text -> view.setBackgroundColor(Color.GREEN)
            R.id.box_eleven_text -> view.setBackgroundColor(Color.RED)
            R.id.box_twelve_text -> view.setBackgroundColor(Color.YELLOW)
//            R.id.red_button -> boxThreeText.setBackgroundResource(R.color.my_red)
//            R.id.yellow_button -> boxFourText.setBackgroundResource(R.color.my_yellow)
//            R.id.green_button -> boxFiveText.setBackgroundResource(R.color.my_green)
            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }


}
