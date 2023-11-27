package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentAlternatifAkimDevreleriBinding

class AlternatifAkimDevreleri : Fragment() {

    private var _binding: FragmentAlternatifAkimDevreleriBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAlternatifAkimDevreleriBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        activity?.onBackPressedDispatcher?.addCallback(viewLifecycleOwner, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                binding

            }
        })

        binding.buttonSeriRL.setOnClickListener(){
            startActivity(Intent(activity, SeriRL::class.java))
        }

        binding.buttonSeriRC.setOnClickListener(){
            startActivity(Intent(activity, SeriRC::class.java))
        }

        binding.buttonSeriRLC.setOnClickListener(){
            startActivity(Intent(activity, SeriRLC::class.java))
        }

        binding.buttonParalelRL.setOnClickListener(){
            startActivity(Intent(activity, ParalelRL::class.java))
        }

        binding.buttonParalelRC.setOnClickListener(){
            startActivity(Intent(activity, ParalelRC::class.java))
        }

        binding.buttonParalelRLC.setOnClickListener(){
            startActivity(Intent(activity, ParalelRLC::class.java))
        }
    }
}