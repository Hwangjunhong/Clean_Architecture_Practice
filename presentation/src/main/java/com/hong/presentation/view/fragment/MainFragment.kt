package com.hong.presentation.view.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import com.hong.presentation.R
import com.hong.presentation.base.BaseFragment
import com.hong.presentation.databinding.FragmentMainBinding

class MainFragment : BaseFragment<FragmentMainBinding>(
    R.layout.fragment_main
) {

    override fun init() {
        binding.fragment = this
    }

    fun startBtnClick(v: View) {
        findNavController().navigate(R.id.action_mainFragment_to_womanNameFragment)
    }
}