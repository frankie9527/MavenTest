package com.maven.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.demo.library.TestJava
import com.demo.library.TestKotlin

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TestJava.hello();
        TestKotlin.hello();
        //demo
    }
}