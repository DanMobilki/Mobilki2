package com.example.msip

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.snackbar.Snackbar
import java.math.*
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    var tt: TextView? = null
    var ed: EditText? = null
    var edt: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tt = findViewById(R.id.textView2)
        ed = findViewById(R.id.editTextText)
        edt = findViewById(R.id.editTextTex)

    }
    fun ClickButton(view: View) {
        val x = ed?.text.toString().toDouble()
        var ch = 3.0
        var zn: Double = 9.999999
        var f: Double = 1/x
        while (zn >= edt?.text.toString().toFloat()){
            zn = 1/((x.pow(ch)*ch))
            f = f - zn
            ch = ch + 2
            zn = 1/((x.pow(ch)*ch))
            f = f + zn
            ch = ch + 2
        }
        tt?.text = " $f "
    }
}
