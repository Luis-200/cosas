package me.lavila.androidApp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.Toast
import java.util.*

class Registro2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro2)


//      calendar_view.setOnDateChangeListener(object : CalendarView.OnDateChangeListener {
//            override fun onSelectedDayChange(p0: CalendarView, p1: Int, p2: Int, p3: Int) {
//                Toast.makeText(
//                    this@MainActivity,
//                    "The selected date is $p3.${p2 + 1}.$p1",
//                    Toast.LENGTH_SHORT
//                ).show()
//            }
//        })
    }
}