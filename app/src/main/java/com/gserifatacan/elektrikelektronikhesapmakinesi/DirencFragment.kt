package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.ActivityMainBinding.inflate
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentDirencBinding

class DirencFragment : Fragment() {
    private var _binding: FragmentDirencBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        _binding = FragmentDirencBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

        override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

            val navHostFragmentDirenc = childFragmentManager.findFragmentById(R.id.nav_host_fragment_direnc) as NavHostFragment

            NavigationUI.setupWithNavController(binding.topNavDirenc,navHostFragmentDirenc.navController)
    }
}