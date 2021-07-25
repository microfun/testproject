package com.example.testproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import androidx.databinding.DataBindingUtil
import com.example.testproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.activitymain=this

        binding.activityMainButtonClick.setOnClickListener {
            println("버튼이 클릭되었습니다.")
            binding.activityMainTextviewTitle.text = "버튼이 클릭 되었습니다."
        }

        binding.activityMainButtonNextpage.setOnClickListener {
            var intent=Intent(binding.root.context,SubActivity::class.java)
            intent.apply {
            startActivity(intent)
            }
        }

        binding.activityMainButtonCalc.setOnClickListener {
            var intent=Intent(binding.root.context,CalcActivity::class.java)
            intent.apply {
                startActivity(intent)
            }
        }

        binding.activityMainEdittext.addTextChangedListener {
        text ->
            println(text.toString())
            if (text!!.length > 10){
                var intent = Intent(binding.root.context,SubActivity::class.java)
                intent.apply {
                    putExtra("pone_number",text.toString())
                    startActivity(intent)
                }
            }
        }

    }
}