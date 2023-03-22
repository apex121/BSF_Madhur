package com.bsf.firebaselogin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bsf.firebaselogin.databinding.ActivityFormBinding

class FormActivity : AppCompatActivity() {
    private var binding: ActivityFormBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFormBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

    }
}