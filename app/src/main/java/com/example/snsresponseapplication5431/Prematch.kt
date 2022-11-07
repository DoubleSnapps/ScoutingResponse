package com.example.snsresponseapplication5431

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.navigation.fragment.findNavController
import com.example.snsresponseapplication5431.databinding.FragmentFirstBinding

/**
 * Prematch Fragment.
 */
class Prematch : Fragment() {
    public var teamThere = false
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        // is the team showed check box clicked?
        var button = view.findViewById<CheckBox>(R.id.didTeamShow)
        button.setOnClickListener {
            // if so, set teamThere to true
            if(button.isChecked) {
                var teamThere = true;

            }
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

