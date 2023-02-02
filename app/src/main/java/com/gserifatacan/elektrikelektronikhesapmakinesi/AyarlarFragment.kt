package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentAyarlarBinding
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentDirencBinding

class AyarlarFragment : Fragment() {
    private var _binding: FragmentAyarlarBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentAyarlarBinding.inflate(inflater, container, false)
        val view = binding.root
        return view

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.actionPaylas.setOnClickListener() {
            val shareBody =
                "Elektrik Elektronik Hesap Makinesi Uygulamasını Play Store'dan Indir: https://play.google.com/store/apps/details?id=com.gserifatacan.elektrikelektronikhesapmakinesi&pli=1"
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.type = "Text/Plain"
            shareIntent.putExtra(Intent.EXTRA_TEXT, shareBody)
            startActivity(Intent.createChooser(shareIntent, "Paylaş"))
            return@setOnClickListener
        }

        binding.actionDegerlendir.setOnClickListener() {
            val packageName = "com.gserifatacan.elektrikelektronikhesapmakinesi"
            val intent =
                Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=$packageName"))
            startActivity(intent)
            return@setOnClickListener
        }
    }
}
