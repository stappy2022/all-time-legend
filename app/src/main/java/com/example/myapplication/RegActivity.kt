package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_reg.*
import kotlinx.android.synthetic.main.activity_sub.*

class RegActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)

        btnGoReg1Activity.setOnClickListener{
            val intent = Intent(this, Reg1Activity::class.java)
            startActivity(intent)
        }
        //Go Back 버튼 누르면 main 창으로 넘어감
        btnClose1.setOnClickListener {
            finish()
        }
    }
}