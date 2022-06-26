package com.hong.presentation.view.fragment

import android.view.View
import androidx.navigation.fragment.findNavController
import com.hong.presentation.R
import com.hong.presentation.base.BaseFragment
import com.hong.presentation.databinding.FragmentResultBinding

class ResultFragment : BaseFragment<FragmentResultBinding>(
    R.layout.fragment_result
) {
    override fun init() {
        binding.fragment = this
    }

    fun toMainFragmentBtnClick(v: View) {
        findNavController().navigate(R.id.action_resultFragment_to_mainFragment)
    }


}