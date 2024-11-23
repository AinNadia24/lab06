package com.ainadia.lab06

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.ainadia.lab06.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
      binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.courses.setOnClickListener{
        binding.InfoTextView.text = "Android ATC 881 " + "UI Creation"
        }

        binding.exams.setOnClickListener{
            binding.InfoTextView.text = "Exam consist of 45 questions"
        }

        binding.freelance.setOnClickListener{
            binding.InfoTextView.text = "Freelance details"
        }


    }
}