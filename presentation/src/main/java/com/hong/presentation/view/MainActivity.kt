package com.hong.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.hong.presentation.R
import com.hong.presentation.base.BaseActivity
import com.hong.presentation.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(
    R.layout.activity_main
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun init() {}
}