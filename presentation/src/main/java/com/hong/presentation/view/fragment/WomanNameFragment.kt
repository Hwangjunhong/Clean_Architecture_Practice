package com.hong.presentation.view.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import com.hong.presentation.R
import com.hong.presentation.base.BaseFragment
import com.hong.presentation.databinding.FragmentWomanNameBinding

class WomanNameFragment : BaseFragment<FragmentWomanNameBinding>(
    R.layout.fragment_woman_name
) {

    override fun init() {
        binding.fragment = this
    }

    fun startBtnClick(v: View) {
        findNavController().navigate(R.id.action_womanNameFragment_to_manNameFragment)
    }
}