package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentDirencBinding
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentDirencRenkBinding

class DirencRenkFragment : Fragment() {

    private var _binding: FragmentDirencRenkBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        _binding = FragmentDirencRenkBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navHostFragmentDirencRenk = childFragmentManager.findFragmentById(R.id.nav_host_fragment_direncRenk) as NavHostFragment

        NavigationUI.setupWithNavController(binding.topNavDirencRenk,navHostFragmentDirencRenk.navController)

    }
}