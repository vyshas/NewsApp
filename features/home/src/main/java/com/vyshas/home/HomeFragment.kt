package com.vyshas.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.vyshas.core.extensions.viewBinding
import com.vyshas.home.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupButtonClick()
    }

    private fun setupButtonClick() {
        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_fragment_home_to_homeDetailsFragment)
        }
    }
}