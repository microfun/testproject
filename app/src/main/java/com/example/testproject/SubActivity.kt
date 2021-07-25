package com.example.testproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.testproject.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {

    lateinit var binding: ActivitySubBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= DataBindingUtil.setContentView(this,R.layout.activity_sub)
        binding.activitysub= this

        binding.activitySubButtonRepage.setOnClickListener {
            finish()
        }

        binding.activitySubTextviewPoneNumber.text = intent.getStringExtra("pone_number").toString()

    }
}