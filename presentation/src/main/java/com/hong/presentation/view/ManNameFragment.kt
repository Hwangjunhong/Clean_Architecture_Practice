package com.hong.presentation.view

import android.view.View
import androidx.navigation.fragment.findNavController
import com.hong.presentation.R
import com.hong.presentation.base.BaseFragment
import com.hong.presentation.databinding.FragmentManNameBinding

class ManNameFragment : BaseFragment<FragmentManNameBinding>(
    R.layout.fragment_man_name
) {

    override fun init() {
        binding.fragment = this
    }

    fun startBtnClick(v: View) {
        findNavController().navigate(R.id.action_manNameFragment_to_resultFragment)
    }
}