package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //SubActivity 페이지로 넘어가는 코딩
        btnGoSubActivity.setOnClickListener{
            val intent = Intent(this, SubActivity::class.java)
            startActivity(intent)
        }

        //로그인 페이지로 넘어가는 코딩
        btnGoLogActivity.setOnClickListener {
            val intent = Intent(this, LogActivity::class.java)
            startActivity(intent)
        }

        //회원가입 페이지로 넘어가는 코딩
        btnGoRegActivity.setOnClickListener {
            val intent = Intent(this, RegActivity::class.java)
            startActivity(intent)
        }

        //아이디 찾기 페이지로 넘어가는 코딩
        btnGoFindIdActivity.setOnClickListener {
            val intent = Intent(this, FindIdActivity::class.java)
            startActivity(intent)
        }

        //비밀번호 찾기 페이지로 넘어가는 코딩
        btnGoFindPwActivity.setOnClickListener {
            val intent = Intent(this, FindPwActivity::class.java)
            startActivity(intent)
        }
    }
}