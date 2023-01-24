package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentUcBantDirencBinding
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentUcRenkDirencBinding

class UcRenkDirencFragment : Fragment() {

    private var _binding: FragmentUcRenkDirencBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentUcRenkDirencBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }
}