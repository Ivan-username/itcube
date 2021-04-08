package org.uis.itcube

import android.graphics.Color
import android.graphics.YuvImage
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import org.uis.itcube.databinding.ActivityMainBinding
import kotlin.properties.Delegates

class MainActivity : AppCompatActivity() {
//    dimabulan@yandex.ru
    lateinit var bind: ActivityMainBinding
    private var list = mutableListOf(true,true,true,true,true,true,true,true,true)
    private var noughts = 0
    private var crosses = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        var move = 0 // крестики
        bind.field1.setOnClickListener {
            if (list[0]) {
                if (move % 2 == 0) {
                    bind.field1.text = "X"
                } else {
                    bind.field1.text = "O"
                }
                move++
                list[0] = false
            }
            verification()
        }
        bind.field2.setOnClickListener {
            if (list[1]) {
                bind.field2.setBackgroundColor(Color.RED)
                if (move % 2 == 0) {
                    bind.field2.text = "X"
                } else {
                    bind.field2.text = "O"
                }
                move++
                list[1] = false
            }
            verification()
        }
        bind.field3.setOnClickListener {
            if (list[2]) {
                if (move % 2 == 0) {
                    bind.field3.text = "X"
                } else {
                    bind.field3.text = "O"
                }
                move++
                list[2] = false
            }
            verification()
        }
        bind.field4.setOnClickListener {
            if (list[3]) {
                if (move % 2 == 0) {
                    bind.field4.text = "X"
                } else {
                    bind.field4.text = "O"
                }
                move++
                list[3] = false
            }
            verification()
        }
        bind.field5.setOnClickListener {
            if (list[4]) {
                if (move % 2 == 0) {
                    bind.field5.text = "X"
                } else {
                    bind.field5.text = "O"
                }
                move++
                list[4] = false
            }
            verification()
        }
        bind.field6.setOnClickListener {
            if (list[5]) {
                if (move % 2 == 0) {
                    bind.field6.text = "X"
                } else {
                    bind.field6.text = "O"
                }
                move++
                list[5] = false
            }
            verification()
        }
        bind.field7.setOnClickListener {
            if (list[6]) {
                if (move % 2 == 0) {
                    bind.field7.text = "X"
                } else {
                    bind.field7.text = "O"
                }
                move++
                list[6] = false
            }
            verification()
        }
        bind.field8.setOnClickListener {
            if (list[7]) {
                if (move % 2 == 0) {
                    bind.field8.text = "X"
                } else {
                    bind.field8.text = "O"
                }
                move++
                list[7] = false
            }
            verification()
        }
        bind.field9.setOnClickListener {
            if (list[8]) {
                if (move % 2 == 0) {
                    bind.field9.text = "X"
                } else {
                    bind.field9.text = "O"
                }
                move++
                list[8] = false
            }
            verification()
        }
//        bind.restartButton.setOnClickListener {
//            list[0] = true; list[1] = true; list[2] = true
//            list[3] = true; list[4] = true; list[5] = true
//            list[6] = true; list[7] = true; list[8] = true
//            bind.TextField.text = ""
//            bind.field1.text = ""
//            bind.field2.text = ""
//            bind.field3.text = ""
//            bind.field4.text = ""
//            bind.field5.text = ""
//            bind.field6.text = ""
//            bind.field7.text = ""
//            bind.field8.text = ""
//            bind.field9.text = ""
//        }
    }

    fun verification() {
        if (bind.field1.text == "X" && bind.field2.text == "X" && bind.field3.text == "X" ||
            bind.field4.text == "X" && bind.field5.text == "X" && bind.field6.text == "X" ||
            bind.field7.text == "X" && bind.field8.text == "X" && bind.field9.text == "X" ||
            bind.field1.text == "X" && bind.field4.text == "X" && bind.field7.text == "X" ||
            bind.field2.text == "X" && bind.field5.text == "X" && bind.field8.text == "X" ||
            bind.field3.text == "X" && bind.field6.text == "X" && bind.field9.text == "X" ||
            bind.field1.text == "X" && bind.field5.text == "X" && bind.field9.text == "X" ||
            bind.field3.text == "X" && bind.field5.text == "X" && bind.field7.text == "X"
        ) {
            crosses++
            list[0] = false; list[1] = false; list[2] = false
            list[3] = false; list[4] = false; list[5] = false
            list[6] = false; list[7] = false; list[8] = false
            bind.TextField.text = "crosses win"
            bind.score.text = "crosses $crosses : $noughts noughts"
        } else if (bind.field1.text == "O" && bind.field2.text == "O" && bind.field3.text == "O" ||
            bind.field4.text == "O" && bind.field5.text == "O" && bind.field6.text == "O" ||
            bind.field7.text == "O" && bind.field8.text == "O" && bind.field9.text == "O" ||
            bind.field1.text == "O" && bind.field4.text == "O" && bind.field7.text == "O" ||
            bind.field2.text == "O" && bind.field5.text == "O" && bind.field8.text == "O" ||
            bind.field3.text == "O" && bind.field6.text == "O" && bind.field9.text == "O" ||
            bind.field1.text == "O" && bind.field5.text == "O" && bind.field9.text == "O" ||
            bind.field3.text == "O" && bind.field5.text == "O" && bind.field7.text == "O"
        ) {
            noughts++
            list[0] = false; list[1] = false; list[2] = false
            list[3] = false; list[4] = false; list[5] = false
            list[6] = false; list[7] = false; list[8] = false
            bind.TextField.text = "noughts win"
            bind.score.text = "crosses $crosses : $noughts noughts"
        } else {
            if (bind.field1.text != "" && bind.field2.text == "" && bind.field1.text == "" &&
                bind.field4.text != "" && bind.field5.text == "" && bind.field6.text == "" &&
                bind.field7.text != "" && bind.field8.text == "" && bind.field9.text == ""
            ) {
                bind.TextField.text = "nobody win"
            }
        }
    }
}
