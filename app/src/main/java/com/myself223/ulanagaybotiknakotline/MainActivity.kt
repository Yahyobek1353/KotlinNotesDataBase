package com.myself223.ulanagaybotiknakotline

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import com.myself223.ulanagaybotiknakotline.databinding.ActivityMainBinding
import com.myself223.ulanagaybotiknakotline.databinding.ItemNoteBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
