package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentAyarlarBinding

class AyarlarFragment : Fragment() {
    private var _binding: FragmentAyarlarBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAyarlarBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.actionPaylas.setOnClickListener {
            val shareBody =
                "Elektrik Elektronik Hesap Makinesi Uygulamasını Play Store'dan Indir: https://play.google.com/store/apps/details?id=com.gserifatacan.elektrikelektronikhesapmakinesi&pli=1"
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "text/plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody)
            startActivity(Intent.createChooser(shareIntent, "Paylaş"))
        }

        binding.actionDegerlendir.setOnClickListener {
            val packageName = "com.gserifatacan.elektrikelektronikhesapmakinesi"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$packageName"))
            startActivity(intent)
        }

        val sharedApplication = MyApplication()
        sharedApplication.beginSharedPreferences(requireContext())
        val sharedData = sharedApplication.getData(requireContext())

        binding.themeSwitch.isChecked = sharedData
        binding.themeSwitch.setOnCheckedChangeListener { compoundButton, isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
            sharedApplication.putData(isChecked)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
