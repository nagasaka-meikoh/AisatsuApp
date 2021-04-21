package jp.techacademy.yasushi.aisatsuapp

import androidx.appcompat.app.AppCompatActivity
import android.app.TimePickerDialog
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        showTimePickerDialog()

    }

    private fun showTimePickerDialog() {
        val timePickerDialog = TimePickerDialog(
            this,
            TimePickerDialog.OnTimeSetListener { view, hour, minute ->
                Log.d("UI", "$hour:$minute")
                if (hour >= 2 && 10 > hour) {
                    textView.text = "おはよう"
                } else if (hour >= 10 && 18 > hour) {
                    textView.text = "こんにちは"
                } else {
                    textView.text = "こんばんは"
                }
            },
            0, 0, true
        )
        timePickerDialog.show()
    }


}