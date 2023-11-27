package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentUcBantDirencBinding

class UcBantDirencFragment : Fragment() {

    fun buttonRenkSifirla(){
        binding.buttonSiyah1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
        binding.buttonSiyah1.setTextColor(Color.WHITE)
        binding.buttonSiyah2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
        binding.buttonSiyah2.setTextColor(Color.WHITE)
        binding.buttonSiyah3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
        binding.buttonSiyah3.setTextColor(Color.WHITE)

        binding.buttonKahverengi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
        binding.buttonKahverengi1.setTextColor(Color.WHITE)
        binding.buttonKahverengi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
        binding.buttonKahverengi2.setTextColor(Color.WHITE)
        binding.buttonKahverengi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
        binding.buttonKahverengi3.setTextColor(Color.WHITE)

        binding.buttonKirmizi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
        binding.buttonKirmizi1.setTextColor(Color.WHITE)
        binding.buttonKirmizi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
        binding.buttonKirmizi2.setTextColor(Color.WHITE)
        binding.buttonKirmizi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
        binding.buttonKirmizi3.setTextColor(Color.WHITE)

        binding.buttonTuruncu1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
        binding.buttonTuruncu1.setTextColor(Color.BLACK)
        binding.buttonTuruncu2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
        binding.buttonTuruncu2.setTextColor(Color.BLACK)
        binding.buttonTuruncu3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
        binding.buttonTuruncu3.setTextColor(Color.BLACK)

        binding.buttonSari1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
        binding.buttonSari1.setTextColor(Color.BLACK)
        binding.buttonSari2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
        binding.buttonSari2.setTextColor(Color.BLACK)
        binding.buttonSari3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
        binding.buttonSari3.setTextColor(Color.BLACK)

        binding.buttonYesil1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
        binding.buttonYesil1.setTextColor(Color.WHITE)
        binding.buttonYesil2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
        binding.buttonYesil2.setTextColor(Color.WHITE)
        binding.buttonYesil3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
        binding.buttonYesil3.setTextColor(Color.WHITE)

        binding.buttonMavi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
        binding.buttonMavi1.setTextColor(Color.WHITE)
        binding.buttonMavi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
        binding.buttonMavi2.setTextColor(Color.WHITE)
        binding.buttonMavi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
        binding.buttonMavi3.setTextColor(Color.WHITE)

        binding.buttonMor1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
        binding.buttonMor1.setTextColor(Color.WHITE)
        binding.buttonMor2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
        binding.buttonMor2.setTextColor(Color.WHITE)
        binding.buttonMor3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
        binding.buttonMor3.setTextColor(Color.WHITE)

        binding.buttonGri1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
        binding.buttonGri1.setTextColor(Color.WHITE)
        binding.buttonGri2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
        binding.buttonGri2.setTextColor(Color.WHITE)
        binding.buttonGri3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
        binding.buttonGri3.setTextColor(Color.WHITE)

        binding.buttonBeyaz1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
        binding.buttonBeyaz1.setTextColor(Color.BLACK)
        binding.buttonBeyaz2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
        binding.buttonBeyaz2.setTextColor(Color.BLACK)
        binding.buttonBeyaz3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
        binding.buttonBeyaz3.setTextColor(Color.BLACK)
    }

    private var _binding: FragmentUcBantDirencBinding? = null
    private val binding get() = _binding!!

    var gelenSayi1: Int? = null
    var gelenSayi2: Int? = null
    var gelenSayi3: Long? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentUcBantDirencBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    @SuppressLint("SetTextI18n", "ResourceAsColor")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSiyah1.setOnClickListener() {
            binding.buttonSiyah1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKahverengi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah1.setTextColor(Color.BLACK)
            binding.buttonKahverengi1.setTextColor(Color.WHITE)
            binding.buttonKirmizi1.setTextColor(Color.WHITE)
            binding.buttonYesil1.setTextColor(Color.WHITE)
            binding.buttonMavi1.setTextColor(Color.WHITE)
            binding.buttonMor1.setTextColor(Color.WHITE)
            binding.buttonGri1.setTextColor(Color.WHITE)
            gelenSayi1 = 0
        }

        binding.buttonKahverengi1.setOnClickListener() {
            binding.buttonSiyah1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKirmizi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonKahverengi1.setTextColor(Color.BLACK)
            binding.buttonSiyah1.setTextColor(Color.WHITE)
            binding.buttonKirmizi1.setTextColor(Color.WHITE)
            binding.buttonYesil1.setTextColor(Color.WHITE)
            binding.buttonMavi1.setTextColor(Color.WHITE)
            binding.buttonMor1.setTextColor(Color.WHITE)
            binding.buttonGri1.setTextColor(Color.WHITE)
            gelenSayi1 = 10
        }

        binding.buttonKirmizi1.setOnClickListener() {
            binding.buttonSiyah1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonTuruncu1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonKirmizi1.setTextColor(Color.BLACK)
            binding.buttonSiyah1.setTextColor(Color.WHITE)
            binding.buttonKahverengi1.setTextColor(Color.WHITE)
            binding.buttonYesil1.setTextColor(Color.WHITE)
            binding.buttonMavi1.setTextColor(Color.WHITE)
            binding.buttonMor1.setTextColor(Color.WHITE)
            binding.buttonGri1.setTextColor(Color.WHITE)
            gelenSayi1 = 20
        }

        binding.buttonTuruncu1.setOnClickListener() {
            binding.buttonSiyah1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSari1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonTuruncu1.setTextColor(Color.BLACK)
            binding.buttonSiyah1.setTextColor(Color.WHITE)
            binding.buttonKirmizi1.setTextColor(Color.WHITE)
            binding.buttonKahverengi1.setTextColor(Color.WHITE)
            binding.buttonYesil1.setTextColor(Color.WHITE)
            binding.buttonMavi1.setTextColor(Color.WHITE)
            binding.buttonMor1.setTextColor(Color.WHITE)
            binding.buttonGri1.setTextColor(Color.WHITE)
            gelenSayi1 = 30
        }

        binding.buttonSari1.setOnClickListener() {
            binding.buttonSiyah1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonYesil1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSari1.setTextColor(Color.BLACK)
            binding.buttonSiyah1.setTextColor(Color.WHITE)
            binding.buttonKirmizi1.setTextColor(Color.WHITE)
            binding.buttonKahverengi1.setTextColor(Color.WHITE)
            binding.buttonYesil1.setTextColor(Color.WHITE)
            binding.buttonMavi1.setTextColor(Color.WHITE)
            binding.buttonMor1.setTextColor(Color.WHITE)
            binding.buttonGri1.setTextColor(Color.WHITE)
            gelenSayi1 = 40
        }

        binding.buttonYesil1.setOnClickListener() {
            binding.buttonSiyah1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMavi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonYesil1.setTextColor(Color.BLACK)
            binding.buttonSiyah1.setTextColor(Color.WHITE)
            binding.buttonKirmizi1.setTextColor(Color.WHITE)
            binding.buttonKahverengi1.setTextColor(Color.WHITE)
            binding.buttonMavi1.setTextColor(Color.WHITE)
            binding.buttonMor1.setTextColor(Color.WHITE)
            binding.buttonGri1.setTextColor(Color.WHITE)
            gelenSayi1 = 50
        }

        binding.buttonMavi1.setOnClickListener() {
            binding.buttonSiyah1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMor1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonMavi1.setTextColor(Color.BLACK)
            binding.buttonSiyah1.setTextColor(Color.WHITE)
            binding.buttonKirmizi1.setTextColor(Color.WHITE)
            binding.buttonKahverengi1.setTextColor(Color.WHITE)
            binding.buttonYesil1.setTextColor(Color.WHITE)
            binding.buttonMor1.setTextColor(Color.WHITE)
            binding.buttonGri1.setTextColor(Color.WHITE)
            gelenSayi1 = 60
        }

        binding.buttonMor1.setOnClickListener() {
            binding.buttonSiyah1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonGri1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonMor1.setTextColor(Color.BLACK)
            binding.buttonSiyah1.setTextColor(Color.WHITE)
            binding.buttonKirmizi1.setTextColor(Color.WHITE)
            binding.buttonKahverengi1.setTextColor(Color.WHITE)
            binding.buttonYesil1.setTextColor(Color.WHITE)
            binding.buttonMavi1.setTextColor(Color.WHITE)
            binding.buttonGri1.setTextColor(Color.WHITE)
            gelenSayi1 = 70
        }

        binding.buttonGri1.setOnClickListener() {
            binding.buttonSiyah1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonBeyaz1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonGri1.setTextColor(Color.BLACK)
            binding.buttonSiyah1.setTextColor(Color.WHITE)
            binding.buttonKirmizi1.setTextColor(Color.WHITE)
            binding.buttonKahverengi1.setTextColor(Color.WHITE)
            binding.buttonYesil1.setTextColor(Color.WHITE)
            binding.buttonMavi1.setTextColor(Color.WHITE)
            binding.buttonMor1.setTextColor(Color.WHITE)
            gelenSayi1 = 80
        }

        binding.buttonBeyaz1.setOnClickListener() {
            binding.buttonSiyah1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz1.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonBeyaz1.setTextColor(Color.BLACK)
            binding.buttonSiyah1.setTextColor(Color.WHITE)
            binding.buttonKirmizi1.setTextColor(Color.WHITE)
            binding.buttonKahverengi1.setTextColor(Color.WHITE)
            binding.buttonYesil1.setTextColor(Color.WHITE)
            binding.buttonMavi1.setTextColor(Color.WHITE)
            binding.buttonMor1.setTextColor(Color.WHITE)
            binding.buttonGri1.setTextColor(Color.WHITE)
            gelenSayi1 = 90
        }

        binding.buttonSiyah2.setOnClickListener() {
            binding.buttonSiyah2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKahverengi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah2.setTextColor(Color.BLACK)
            binding.buttonKahverengi2.setTextColor(Color.WHITE)
            binding.buttonKirmizi2.setTextColor(Color.WHITE)
            binding.buttonYesil2.setTextColor(Color.WHITE)
            binding.buttonMavi2.setTextColor(Color.WHITE)
            binding.buttonMor2.setTextColor(Color.WHITE)
            binding.buttonGri2.setTextColor(Color.WHITE)
            gelenSayi2 = 0
        }

        binding.buttonKahverengi2.setOnClickListener() {
            binding.buttonSiyah2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKirmizi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonKahverengi2.setTextColor(Color.BLACK)
            binding.buttonSiyah2.setTextColor(Color.WHITE)
            binding.buttonKirmizi2.setTextColor(Color.WHITE)
            binding.buttonYesil2.setTextColor(Color.WHITE)
            binding.buttonMavi2.setTextColor(Color.WHITE)
            binding.buttonMor2.setTextColor(Color.WHITE)
            binding.buttonGri2.setTextColor(Color.WHITE)
            gelenSayi2 = 1
        }

        binding.buttonKirmizi2.setOnClickListener() {
            binding.buttonSiyah2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonTuruncu2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonKirmizi2.setTextColor(Color.BLACK)
            binding.buttonSiyah2.setTextColor(Color.WHITE)
            binding.buttonKahverengi2.setTextColor(Color.WHITE)
            binding.buttonYesil2.setTextColor(Color.WHITE)
            binding.buttonMavi2.setTextColor(Color.WHITE)
            binding.buttonMor2.setTextColor(Color.WHITE)
            binding.buttonGri2.setTextColor(Color.WHITE)
            gelenSayi2 = 2
        }

        binding.buttonTuruncu2.setOnClickListener() {
            binding.buttonSiyah2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSari2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonTuruncu2.setTextColor(Color.BLACK)
            binding.buttonSiyah2.setTextColor(Color.WHITE)
            binding.buttonKirmizi2.setTextColor(Color.WHITE)
            binding.buttonKahverengi2.setTextColor(Color.WHITE)
            binding.buttonYesil2.setTextColor(Color.WHITE)
            binding.buttonMavi2.setTextColor(Color.WHITE)
            binding.buttonMor2.setTextColor(Color.WHITE)
            binding.buttonGri2.setTextColor(Color.WHITE)
            gelenSayi2 = 3
        }

        binding.buttonSari2.setOnClickListener() {
            binding.buttonSiyah2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonYesil2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSari2.setTextColor(Color.BLACK)
            binding.buttonSiyah2.setTextColor(Color.WHITE)
            binding.buttonKirmizi2.setTextColor(Color.WHITE)
            binding.buttonKahverengi2.setTextColor(Color.WHITE)
            binding.buttonYesil2.setTextColor(Color.WHITE)
            binding.buttonMavi2.setTextColor(Color.WHITE)
            binding.buttonMor2.setTextColor(Color.WHITE)
            binding.buttonGri2.setTextColor(Color.WHITE)
            gelenSayi2 = 4
        }

        binding.buttonYesil2.setOnClickListener() {
            binding.buttonSiyah2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMavi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonYesil2.setTextColor(Color.BLACK)
            binding.buttonSiyah2.setTextColor(Color.WHITE)
            binding.buttonKirmizi2.setTextColor(Color.WHITE)
            binding.buttonKahverengi2.setTextColor(Color.WHITE)
            binding.buttonMavi2.setTextColor(Color.WHITE)
            binding.buttonMor2.setTextColor(Color.WHITE)
            binding.buttonGri2.setTextColor(Color.WHITE)
            gelenSayi2 = 5
        }

        binding.buttonMavi2.setOnClickListener() {
            binding.buttonSiyah2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMor2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonMavi2.setTextColor(Color.BLACK)
            binding.buttonSiyah2.setTextColor(Color.WHITE)
            binding.buttonKirmizi2.setTextColor(Color.WHITE)
            binding.buttonKahverengi2.setTextColor(Color.WHITE)
            binding.buttonYesil2.setTextColor(Color.WHITE)
            binding.buttonMor2.setTextColor(Color.WHITE)
            binding.buttonGri2.setTextColor(Color.WHITE)
            gelenSayi2 = 6
        }

        binding.buttonMor2.setOnClickListener() {
            binding.buttonSiyah2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonGri2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonMor2.setTextColor(Color.BLACK)
            binding.buttonSiyah2.setTextColor(Color.WHITE)
            binding.buttonKirmizi2.setTextColor(Color.WHITE)
            binding.buttonKahverengi2.setTextColor(Color.WHITE)
            binding.buttonYesil2.setTextColor(Color.WHITE)
            binding.buttonMavi2.setTextColor(Color.WHITE)
            binding.buttonGri2.setTextColor(Color.WHITE)
            gelenSayi2 = 7
        }

        binding.buttonGri2.setOnClickListener() {
            binding.buttonSiyah2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonBeyaz2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonGri2.setTextColor(Color.BLACK)
            binding.buttonSiyah2.setTextColor(Color.WHITE)
            binding.buttonKirmizi2.setTextColor(Color.WHITE)
            binding.buttonKahverengi2.setTextColor(Color.WHITE)
            binding.buttonYesil2.setTextColor(Color.WHITE)
            binding.buttonMavi2.setTextColor(Color.WHITE)
            binding.buttonMor2.setTextColor(Color.WHITE)
            gelenSayi2 = 8
        }

        binding.buttonBeyaz2.setOnClickListener() {
            binding.buttonSiyah2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz2.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonBeyaz2.setTextColor(Color.BLACK)
            binding.buttonSiyah2.setTextColor(Color.WHITE)
            binding.buttonKirmizi2.setTextColor(Color.WHITE)
            binding.buttonKahverengi2.setTextColor(Color.WHITE)
            binding.buttonYesil2.setTextColor(Color.WHITE)
            binding.buttonMavi2.setTextColor(Color.WHITE)
            binding.buttonMor2.setTextColor(Color.WHITE)
            binding.buttonGri2.setTextColor(Color.WHITE)
            gelenSayi2 = 9
        }

        binding.buttonSiyah3.setOnClickListener() {
            binding.buttonSiyah3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKahverengi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah3.setTextColor(Color.BLACK)
            binding.buttonKahverengi3.setTextColor(Color.WHITE)
            binding.buttonKirmizi3.setTextColor(Color.WHITE)
            binding.buttonYesil3.setTextColor(Color.WHITE)
            binding.buttonMavi3.setTextColor(Color.WHITE)
            binding.buttonMor3.setTextColor(Color.WHITE)
            binding.buttonGri3.setTextColor(Color.WHITE)
            gelenSayi3 = 1
        }

        binding.buttonKahverengi3.setOnClickListener() {
            binding.buttonSiyah3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKirmizi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonKahverengi3.setTextColor(Color.BLACK)
            binding.buttonSiyah3.setTextColor(Color.WHITE)
            binding.buttonKirmizi3.setTextColor(Color.WHITE)
            binding.buttonYesil3.setTextColor(Color.WHITE)
            binding.buttonMavi3.setTextColor(Color.WHITE)
            binding.buttonMor3.setTextColor(Color.WHITE)
            binding.buttonGri3.setTextColor(Color.WHITE)
            gelenSayi3 = 10
        }

        binding.buttonKirmizi3.setOnClickListener() {
            binding.buttonSiyah3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonTuruncu3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonKirmizi3.setTextColor(Color.BLACK)
            binding.buttonSiyah3.setTextColor(Color.WHITE)
            binding.buttonKahverengi3.setTextColor(Color.WHITE)
            binding.buttonYesil3.setTextColor(Color.WHITE)
            binding.buttonMavi3.setTextColor(Color.WHITE)
            binding.buttonMor3.setTextColor(Color.WHITE)
            binding.buttonGri3.setTextColor(Color.WHITE)
            gelenSayi3 = 100
        }

        binding.buttonTuruncu3.setOnClickListener() {
            binding.buttonSiyah3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSari3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonTuruncu3.setTextColor(Color.BLACK)
            binding.buttonSiyah3.setTextColor(Color.WHITE)
            binding.buttonKirmizi3.setTextColor(Color.WHITE)
            binding.buttonKahverengi3.setTextColor(Color.WHITE)
            binding.buttonYesil3.setTextColor(Color.WHITE)
            binding.buttonMavi3.setTextColor(Color.WHITE)
            binding.buttonMor3.setTextColor(Color.WHITE)
            binding.buttonGri3.setTextColor(Color.WHITE)
            gelenSayi3 = 1000
        }

        binding.buttonSari3.setOnClickListener() {
            binding.buttonSiyah3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonYesil3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSari3.setTextColor(Color.BLACK)
            binding.buttonSiyah3.setTextColor(Color.WHITE)
            binding.buttonKirmizi3.setTextColor(Color.WHITE)
            binding.buttonKahverengi3.setTextColor(Color.WHITE)
            binding.buttonYesil3.setTextColor(Color.WHITE)
            binding.buttonMavi3.setTextColor(Color.WHITE)
            binding.buttonMor3.setTextColor(Color.WHITE)
            binding.buttonGri3.setTextColor(Color.WHITE)
            gelenSayi3 = 10000
        }

        binding.buttonYesil3.setOnClickListener() {
            binding.buttonSiyah3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMavi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonYesil3.setTextColor(Color.BLACK)
            binding.buttonSiyah3.setTextColor(Color.WHITE)
            binding.buttonKirmizi3.setTextColor(Color.WHITE)
            binding.buttonKahverengi3.setTextColor(Color.WHITE)
            binding.buttonMavi3.setTextColor(Color.WHITE)
            binding.buttonMor3.setTextColor(Color.WHITE)
            binding.buttonGri3.setTextColor(Color.WHITE)
            gelenSayi3 = 100000
        }

        binding.buttonMavi3.setOnClickListener() {
            binding.buttonSiyah3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMor3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonMavi3.setTextColor(Color.BLACK)
            binding.buttonSiyah3.setTextColor(Color.WHITE)
            binding.buttonKirmizi3.setTextColor(Color.WHITE)
            binding.buttonKahverengi3.setTextColor(Color.WHITE)
            binding.buttonYesil3.setTextColor(Color.WHITE)
            binding.buttonMor3.setTextColor(Color.WHITE)
            binding.buttonGri3.setTextColor(Color.WHITE)
            gelenSayi3 = 1000000
        }

        binding.buttonMor3.setOnClickListener() {
            binding.buttonSiyah3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonGri3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonMor3.setTextColor(Color.BLACK)
            binding.buttonSiyah3.setTextColor(Color.WHITE)
            binding.buttonKirmizi3.setTextColor(Color.WHITE)
            binding.buttonKahverengi3.setTextColor(Color.WHITE)
            binding.buttonYesil3.setTextColor(Color.WHITE)
            binding.buttonMavi3.setTextColor(Color.WHITE)
            binding.buttonGri3.setTextColor(Color.WHITE)
            gelenSayi3 = 10000000
        }

        binding.buttonGri3.setOnClickListener() {
            binding.buttonSiyah3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonBeyaz3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonGri3.setTextColor(Color.BLACK)
            binding.buttonSiyah3.setTextColor(Color.WHITE)
            binding.buttonKirmizi3.setTextColor(Color.WHITE)
            binding.buttonKahverengi3.setTextColor(Color.WHITE)
            binding.buttonYesil3.setTextColor(Color.WHITE)
            binding.buttonMavi3.setTextColor(Color.WHITE)
            binding.buttonMor3.setTextColor(Color.WHITE)
            gelenSayi3 = 100000000
        }

        binding.buttonBeyaz3.setOnClickListener() {
            binding.buttonSiyah3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz3.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonBeyaz3.setTextColor(Color.BLACK)
            binding.buttonSiyah3.setTextColor(Color.WHITE)
            binding.buttonKirmizi3.setTextColor(Color.WHITE)
            binding.buttonKahverengi3.setTextColor(Color.WHITE)
            binding.buttonYesil3.setTextColor(Color.WHITE)
            binding.buttonMavi3.setTextColor(Color.WHITE)
            binding.buttonMor3.setTextColor(Color.WHITE)
            binding.buttonGri3.setTextColor(Color.WHITE)
            gelenSayi3 = 1000000000
        }

        binding.buttonHesapla.setOnClickListener() {

            buttonRenkSifirla()

            if (gelenSayi1 != null && gelenSayi2 != null && gelenSayi3 != null) {

                val sonuc = (gelenSayi1!! + gelenSayi2!!) * gelenSayi3!!

                val sonucTamSayi = sonuc.toInt()

                if(sonuc > sonucTamSayi){
                    binding.textSonuc3bant.text = "$sonuc Ω"
                }else{
                    binding.textSonuc3bant.text = "$sonucTamSayi Ω"
                }

                if (sonuc >= 1000 || sonucTamSayi >= 1000) {
                    val cevir = sonuc / 1000.0
                    val cevirTamSayi = cevir.toInt()

                    if(cevir > cevirTamSayi){
                        binding.textSonuc3bant.text = "$cevir KΩ"
                    }else{
                        binding.textSonuc3bant.text = "$cevirTamSayi KΩ"
                    }
                }

                if (sonuc >= 1000000 || sonucTamSayi >= 1000000) {
                    val cevir = sonuc / 1000000.0
                    val cevirTamSayi = cevir.toInt()

                    if(cevir > cevirTamSayi){
                        binding.textSonuc3bant.text = "$cevir MΩ"
                    }else{
                        binding.textSonuc3bant.text = "$cevirTamSayi MΩ"
                    }
                }
            } else if (gelenSayi1 == null && gelenSayi2 == null && gelenSayi3 == null){
                Toast.makeText(activity,R.string.ucbantuyari, Toast.LENGTH_SHORT).show()
            }
            gelenSayi1 = 0
            gelenSayi2 = 0
            gelenSayi3 = 0
        }
    }
}