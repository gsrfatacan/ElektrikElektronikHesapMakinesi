package com.gserifatacan.elektrikelektronikhesapmakinesi

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentDortBantDirencBinding

class DortBantDirencFragment : Fragment() {

    fun buttonRenkSifirla(){
        binding.buttonSiyah41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
        binding.buttonSiyah41.setTextColor(Color.WHITE)
        binding.buttonSiyah42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
        binding.buttonSiyah42.setTextColor(Color.WHITE)
        binding.buttonSiyah43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
        binding.buttonSiyah43.setTextColor(Color.WHITE)
        binding.buttonSiyah44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
        binding.buttonSiyah44.setTextColor(Color.WHITE)

        binding.buttonKahverengi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
        binding.buttonKahverengi41.setTextColor(Color.WHITE)
        binding.buttonKahverengi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
        binding.buttonKahverengi42.setTextColor(Color.WHITE)
        binding.buttonKahverengi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
        binding.buttonKahverengi43.setTextColor(Color.WHITE)
        binding.buttonKahverengi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
        binding.buttonKahverengi44.setTextColor(Color.WHITE)

        binding.buttonKirmizi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
        binding.buttonKirmizi41.setTextColor(Color.WHITE)
        binding.buttonKirmizi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
        binding.buttonKirmizi42.setTextColor(Color.WHITE)
        binding.buttonKirmizi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
        binding.buttonKirmizi43.setTextColor(Color.WHITE)
        binding.buttonKirmizi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
        binding.buttonKirmizi44.setTextColor(Color.WHITE)

        binding.buttonTuruncu41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
        binding.buttonTuruncu41.setTextColor(Color.BLACK)
        binding.buttonTuruncu42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
        binding.buttonTuruncu42.setTextColor(Color.BLACK)
        binding.buttonTuruncu43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
        binding.buttonTuruncu43.setTextColor(Color.BLACK)
        binding.buttonTuruncu44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
        binding.buttonTuruncu44.setTextColor(Color.BLACK)

        binding.buttonSari41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
        binding.buttonSari41.setTextColor(Color.BLACK)
        binding.buttonSari42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
        binding.buttonSari42.setTextColor(Color.BLACK)
        binding.buttonSari43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
        binding.buttonSari43.setTextColor(Color.BLACK)
        binding.buttonSari44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
        binding.buttonSari44.setTextColor(Color.BLACK)

        binding.buttonYesil41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
        binding.buttonYesil41.setTextColor(Color.WHITE)
        binding.buttonYesil42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
        binding.buttonYesil42.setTextColor(Color.WHITE)
        binding.buttonYesil43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
        binding.buttonYesil43.setTextColor(Color.WHITE)
        binding.buttonYesil44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
        binding.buttonYesil44.setTextColor(Color.WHITE)

        binding.buttonMavi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
        binding.buttonMavi41.setTextColor(Color.WHITE)
        binding.buttonMavi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
        binding.buttonMavi42.setTextColor(Color.WHITE)
        binding.buttonMavi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
        binding.buttonMavi43.setTextColor(Color.WHITE)
        binding.buttonMavi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
        binding.buttonMavi44.setTextColor(Color.WHITE)

        binding.buttonMor41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
        binding.buttonMor41.setTextColor(Color.WHITE)
        binding.buttonMor42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
        binding.buttonMor42.setTextColor(Color.WHITE)
        binding.buttonMor43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
        binding.buttonMor43.setTextColor(Color.WHITE)
        binding.buttonMor44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
        binding.buttonMor44.setTextColor(Color.WHITE)

        binding.buttonGri41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
        binding.buttonGri41.setTextColor(Color.WHITE)
        binding.buttonGri42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
        binding.buttonGri42.setTextColor(Color.WHITE)
        binding.buttonGri43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
        binding.buttonGri43.setTextColor(Color.WHITE)
        binding.buttonGri44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
        binding.buttonGri44.setTextColor(Color.WHITE)

        binding.buttonBeyaz41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
        binding.buttonBeyaz41.setTextColor(Color.BLACK)
        binding.buttonBeyaz42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
        binding.buttonBeyaz42.setTextColor(Color.BLACK)
        binding.buttonBeyaz43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
        binding.buttonBeyaz43.setTextColor(Color.BLACK)
        binding.buttonBeyaz44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
        binding.buttonBeyaz44.setTextColor(Color.BLACK)

        binding.buttonAltin4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
        binding.buttonAltin4.setTextColor(Color.BLACK)

        binding.buttonGumus4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
        binding.buttonGumus4.setTextColor(Color.BLACK)
    }

    private var _binding: FragmentDortBantDirencBinding? = null
    private val binding get() = _binding!!

    var gelenSayi1: Int? = null
    var gelenSayi2: Int? = null
    var gelenSayi3: Long? = null
    var gelenSayi4: Float? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDortBantDirencBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonSiyah41.setOnClickListener() {
            binding.buttonSiyah41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKahverengi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah41.setTextColor(Color.BLACK)
            binding.buttonKahverengi41.setTextColor(Color.WHITE)
            binding.buttonKirmizi41.setTextColor(Color.WHITE)
            binding.buttonYesil41.setTextColor(Color.WHITE)
            binding.buttonMavi41.setTextColor(Color.WHITE)
            binding.buttonMor41.setTextColor(Color.WHITE)
            binding.buttonGri41.setTextColor(Color.WHITE)
            gelenSayi1 = 0
        }

        binding.buttonKahverengi41.setOnClickListener() {
            binding.buttonSiyah41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKirmizi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah41.setTextColor(Color.WHITE)
            binding.buttonKahverengi41.setTextColor(Color.BLACK)
            binding.buttonKirmizi41.setTextColor(Color.WHITE)
            binding.buttonYesil41.setTextColor(Color.WHITE)
            binding.buttonMavi41.setTextColor(Color.WHITE)
            binding.buttonMor41.setTextColor(Color.WHITE)
            binding.buttonGri41.setTextColor(Color.WHITE)
            gelenSayi1 = 10
        }

        binding.buttonKirmizi41.setOnClickListener() {
            binding.buttonSiyah41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonTuruncu41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah41.setTextColor(Color.WHITE)
            binding.buttonKahverengi41.setTextColor(Color.WHITE)
            binding.buttonKirmizi41.setTextColor(Color.BLACK)
            binding.buttonYesil41.setTextColor(Color.WHITE)
            binding.buttonMavi41.setTextColor(Color.WHITE)
            binding.buttonMor41.setTextColor(Color.WHITE)
            binding.buttonGri41.setTextColor(Color.WHITE)
            gelenSayi1 = 20
        }

        binding.buttonTuruncu41.setOnClickListener() {
            binding.buttonSiyah41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSari41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah41.setTextColor(Color.WHITE)
            binding.buttonKahverengi41.setTextColor(Color.WHITE)
            binding.buttonKirmizi41.setTextColor(Color.WHITE)
            binding.buttonYesil41.setTextColor(Color.WHITE)
            binding.buttonMavi41.setTextColor(Color.WHITE)
            binding.buttonMor41.setTextColor(Color.WHITE)
            binding.buttonGri41.setTextColor(Color.WHITE)
            gelenSayi1 = 30
        }

        binding.buttonSari41.setOnClickListener() {
            binding.buttonSiyah41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonYesil41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah41.setTextColor(Color.WHITE)
            binding.buttonKahverengi41.setTextColor(Color.WHITE)
            binding.buttonKirmizi41.setTextColor(Color.WHITE)
            binding.buttonYesil41.setTextColor(Color.WHITE)
            binding.buttonMavi41.setTextColor(Color.WHITE)
            binding.buttonMor41.setTextColor(Color.WHITE)
            binding.buttonGri41.setTextColor(Color.WHITE)
            gelenSayi1 = 40
        }

        binding.buttonYesil41.setOnClickListener() {
            binding.buttonSiyah41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMavi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah41.setTextColor(Color.WHITE)
            binding.buttonKahverengi41.setTextColor(Color.WHITE)
            binding.buttonKirmizi41.setTextColor(Color.WHITE)
            binding.buttonYesil41.setTextColor(Color.BLACK)
            binding.buttonMavi41.setTextColor(Color.WHITE)
            binding.buttonMor41.setTextColor(Color.WHITE)
            binding.buttonGri41.setTextColor(Color.WHITE)
            gelenSayi1 = 50
        }

        binding.buttonMavi41.setOnClickListener() {
            binding.buttonSiyah41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMor41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah41.setTextColor(Color.WHITE)
            binding.buttonKahverengi41.setTextColor(Color.WHITE)
            binding.buttonKirmizi41.setTextColor(Color.WHITE)
            binding.buttonYesil41.setTextColor(Color.WHITE)
            binding.buttonMavi41.setTextColor(Color.BLACK)
            binding.buttonMor41.setTextColor(Color.WHITE)
            binding.buttonGri41.setTextColor(Color.WHITE)
            gelenSayi1 = 60
        }

        binding.buttonMor41.setOnClickListener() {
            binding.buttonSiyah41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonGri41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah41.setTextColor(Color.WHITE)
            binding.buttonKahverengi41.setTextColor(Color.WHITE)
            binding.buttonKirmizi41.setTextColor(Color.WHITE)
            binding.buttonYesil41.setTextColor(Color.WHITE)
            binding.buttonMavi41.setTextColor(Color.WHITE)
            binding.buttonMor41.setTextColor(Color.BLACK)
            binding.buttonGri41.setTextColor(Color.WHITE)
            gelenSayi1 = 70
        }

        binding.buttonGri41.setOnClickListener() {binding.buttonSiyah41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonBeyaz41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah41.setTextColor(Color.WHITE)
            binding.buttonKahverengi41.setTextColor(Color.WHITE)
            binding.buttonKirmizi41.setTextColor(Color.WHITE)
            binding.buttonYesil41.setTextColor(Color.WHITE)
            binding.buttonMavi41.setTextColor(Color.WHITE)
            binding.buttonMor41.setTextColor(Color.WHITE)
            binding.buttonGri41.setTextColor(Color.BLACK)
            gelenSayi1 = 80
        }

        binding.buttonBeyaz41.setOnClickListener() {
            binding.buttonSiyah41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz41.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSiyah41.setTextColor(Color.WHITE)
            binding.buttonKahverengi41.setTextColor(Color.WHITE)
            binding.buttonKirmizi41.setTextColor(Color.WHITE)
            binding.buttonYesil41.setTextColor(Color.WHITE)
            binding.buttonMavi41.setTextColor(Color.WHITE)
            binding.buttonMor41.setTextColor(Color.WHITE)
            binding.buttonGri41.setTextColor(Color.WHITE)
            gelenSayi1 = 90
        }

        binding.buttonSiyah42.setOnClickListener() {
            binding.buttonSiyah42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKahverengi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah42.setTextColor(Color.BLACK)
            binding.buttonKahverengi42.setTextColor(Color.WHITE)
            binding.buttonKirmizi42.setTextColor(Color.WHITE)
            binding.buttonYesil42.setTextColor(Color.WHITE)
            binding.buttonMavi42.setTextColor(Color.WHITE)
            binding.buttonMor42.setTextColor(Color.WHITE)
            binding.buttonGri42.setTextColor(Color.WHITE)
            gelenSayi2 = 0
        }

        binding.buttonKahverengi42.setOnClickListener() {
            binding.buttonSiyah42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKirmizi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah42.setTextColor(Color.WHITE)
            binding.buttonKahverengi42.setTextColor(Color.BLACK)
            binding.buttonKirmizi42.setTextColor(Color.WHITE)
            binding.buttonYesil42.setTextColor(Color.WHITE)
            binding.buttonMavi42.setTextColor(Color.WHITE)
            binding.buttonMor42.setTextColor(Color.WHITE)
            binding.buttonGri42.setTextColor(Color.WHITE)
            gelenSayi2 = 1
        }

        binding.buttonKirmizi42.setOnClickListener() {
            binding.buttonSiyah42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonTuruncu42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah42.setTextColor(Color.WHITE)
            binding.buttonKahverengi42.setTextColor(Color.WHITE)
            binding.buttonKirmizi42.setTextColor(Color.BLACK)
            binding.buttonYesil42.setTextColor(Color.WHITE)
            binding.buttonMavi42.setTextColor(Color.WHITE)
            binding.buttonMor42.setTextColor(Color.WHITE)
            binding.buttonGri42.setTextColor(Color.WHITE)
            gelenSayi2 = 2
        }

        binding.buttonTuruncu42.setOnClickListener() {
            binding.buttonSiyah42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSari42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah42.setTextColor(Color.WHITE)
            binding.buttonKahverengi42.setTextColor(Color.WHITE)
            binding.buttonKirmizi42.setTextColor(Color.WHITE)
            binding.buttonYesil42.setTextColor(Color.WHITE)
            binding.buttonMavi42.setTextColor(Color.WHITE)
            binding.buttonMor42.setTextColor(Color.WHITE)
            binding.buttonGri42.setTextColor(Color.WHITE)
            gelenSayi2 = 3
        }

        binding.buttonSari42.setOnClickListener() {
            binding.buttonSiyah42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonYesil42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah42.setTextColor(Color.WHITE)
            binding.buttonKahverengi42.setTextColor(Color.WHITE)
            binding.buttonKirmizi42.setTextColor(Color.WHITE)
            binding.buttonYesil42.setTextColor(Color.WHITE)
            binding.buttonMavi42.setTextColor(Color.WHITE)
            binding.buttonMor42.setTextColor(Color.WHITE)
            binding.buttonGri42.setTextColor(Color.WHITE)
            gelenSayi2 = 4
        }

        binding.buttonYesil42.setOnClickListener() {
            binding.buttonSiyah42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMavi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah42.setTextColor(Color.WHITE)
            binding.buttonKahverengi42.setTextColor(Color.WHITE)
            binding.buttonKirmizi42.setTextColor(Color.WHITE)
            binding.buttonYesil42.setTextColor(Color.BLACK)
            binding.buttonMavi42.setTextColor(Color.WHITE)
            binding.buttonMor42.setTextColor(Color.WHITE)
            binding.buttonGri42.setTextColor(Color.WHITE)
            gelenSayi2 = 5
        }

        binding.buttonMavi42.setOnClickListener() {
            binding.buttonSiyah42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMor42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah42.setTextColor(Color.WHITE)
            binding.buttonKahverengi42.setTextColor(Color.WHITE)
            binding.buttonKirmizi42.setTextColor(Color.WHITE)
            binding.buttonYesil42.setTextColor(Color.WHITE)
            binding.buttonMavi42.setTextColor(Color.BLACK)
            binding.buttonMor42.setTextColor(Color.WHITE)
            binding.buttonGri42.setTextColor(Color.WHITE)
            gelenSayi2 = 6
        }

        binding.buttonMor42.setOnClickListener() {
            binding.buttonSiyah42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonGri42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah42.setTextColor(Color.WHITE)
            binding.buttonKahverengi42.setTextColor(Color.WHITE)
            binding.buttonKirmizi42.setTextColor(Color.WHITE)
            binding.buttonYesil42.setTextColor(Color.WHITE)
            binding.buttonMavi42.setTextColor(Color.WHITE)
            binding.buttonMor42.setTextColor(Color.BLACK)
            binding.buttonGri42.setTextColor(Color.WHITE)
            gelenSayi2 = 7
        }

        binding.buttonGri42.setOnClickListener() {
            binding.buttonKahverengi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonBeyaz42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah42.setTextColor(Color.WHITE)
            binding.buttonKahverengi42.setTextColor(Color.WHITE)
            binding.buttonKirmizi42.setTextColor(Color.WHITE)
            binding.buttonYesil42.setTextColor(Color.WHITE)
            binding.buttonMavi42.setTextColor(Color.WHITE)
            binding.buttonMor42.setTextColor(Color.WHITE)
            binding.buttonGri42.setTextColor(Color.BLACK)
            gelenSayi2 = 8
        }

        binding.buttonBeyaz42.setOnClickListener() {
            binding.buttonSiyah42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz42.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSiyah42.setTextColor(Color.WHITE)
            binding.buttonKahverengi42.setTextColor(Color.WHITE)
            binding.buttonKirmizi42.setTextColor(Color.WHITE)
            binding.buttonYesil42.setTextColor(Color.WHITE)
            binding.buttonMavi42.setTextColor(Color.WHITE)
            binding.buttonMor42.setTextColor(Color.WHITE)
            binding.buttonGri42.setTextColor(Color.WHITE)
            gelenSayi2 = 9
        }

        binding.buttonSiyah43.setOnClickListener() {
            binding.buttonSiyah43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKahverengi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah43.setTextColor(Color.BLACK)
            binding.buttonKahverengi43.setTextColor(Color.WHITE)
            binding.buttonKirmizi43.setTextColor(Color.WHITE)
            binding.buttonYesil43.setTextColor(Color.WHITE)
            binding.buttonMavi43.setTextColor(Color.WHITE)
            binding.buttonMor43.setTextColor(Color.WHITE)
            binding.buttonGri43.setTextColor(Color.WHITE)
            gelenSayi3 = 1
        }

        binding.buttonKahverengi43.setOnClickListener() {
            binding.buttonSiyah43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKirmizi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah43.setTextColor(Color.WHITE)
            binding.buttonKahverengi43.setTextColor(Color.BLACK)
            binding.buttonKirmizi43.setTextColor(Color.WHITE)
            binding.buttonYesil43.setTextColor(Color.WHITE)
            binding.buttonMavi43.setTextColor(Color.WHITE)
            binding.buttonMor43.setTextColor(Color.WHITE)
            binding.buttonGri43.setTextColor(Color.WHITE)
            gelenSayi3 = 10
        }

        binding.buttonKirmizi43.setOnClickListener() {
            binding.buttonSiyah43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonTuruncu43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah43.setTextColor(Color.WHITE)
            binding.buttonKahverengi43.setTextColor(Color.WHITE)
            binding.buttonKirmizi43.setTextColor(Color.BLACK)
            binding.buttonYesil43.setTextColor(Color.WHITE)
            binding.buttonMavi43.setTextColor(Color.WHITE)
            binding.buttonMor43.setTextColor(Color.WHITE)
            binding.buttonGri43.setTextColor(Color.WHITE)
            gelenSayi3 = 100
        }

        binding.buttonTuruncu43.setOnClickListener() {
            binding.buttonSiyah43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSari43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah43.setTextColor(Color.WHITE)
            binding.buttonKahverengi43.setTextColor(Color.WHITE)
            binding.buttonKirmizi43.setTextColor(Color.WHITE)
            binding.buttonYesil43.setTextColor(Color.WHITE)
            binding.buttonMavi43.setTextColor(Color.WHITE)
            binding.buttonMor43.setTextColor(Color.WHITE)
            binding.buttonGri43.setTextColor(Color.WHITE)
            gelenSayi3 = 1000
        }

        binding.buttonSari43.setOnClickListener() {
            binding.buttonSiyah43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonYesil43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah43.setTextColor(Color.WHITE)
            binding.buttonKahverengi43.setTextColor(Color.WHITE)
            binding.buttonKirmizi43.setTextColor(Color.WHITE)
            binding.buttonYesil43.setTextColor(Color.WHITE)
            binding.buttonMavi43.setTextColor(Color.WHITE)
            binding.buttonMor43.setTextColor(Color.WHITE)
            binding.buttonGri43.setTextColor(Color.WHITE)
            gelenSayi3 = 10000
        }

        binding.buttonYesil43.setOnClickListener() {
            binding.buttonSiyah43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMavi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah43.setTextColor(Color.WHITE)
            binding.buttonKahverengi43.setTextColor(Color.WHITE)
            binding.buttonKirmizi43.setTextColor(Color.WHITE)
            binding.buttonYesil43.setTextColor(Color.BLACK)
            binding.buttonMavi43.setTextColor(Color.WHITE)
            binding.buttonMor43.setTextColor(Color.WHITE)
            binding.buttonGri43.setTextColor(Color.WHITE)
            gelenSayi3 = 100000
        }

        binding.buttonMavi43.setOnClickListener() {
            binding.buttonSiyah43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMor43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah43.setTextColor(Color.WHITE)
            binding.buttonKahverengi43.setTextColor(Color.WHITE)
            binding.buttonKirmizi43.setTextColor(Color.WHITE)
            binding.buttonYesil43.setTextColor(Color.WHITE)
            binding.buttonMavi43.setTextColor(Color.BLACK)
            binding.buttonMor43.setTextColor(Color.WHITE)
            binding.buttonGri43.setTextColor(Color.WHITE)
            gelenSayi3 = 1000000
        }

        binding.buttonMor43.setOnClickListener() {
            binding.buttonSiyah43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonGri43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah43.setTextColor(Color.WHITE)
            binding.buttonKahverengi43.setTextColor(Color.WHITE)
            binding.buttonKirmizi43.setTextColor(Color.WHITE)
            binding.buttonYesil43.setTextColor(Color.WHITE)
            binding.buttonMavi43.setTextColor(Color.WHITE)
            binding.buttonMor43.setTextColor(Color.BLACK)
            binding.buttonGri43.setTextColor(Color.WHITE)
            gelenSayi3 = 10000000
        }

        binding.buttonGri43.setOnClickListener() {
            binding.buttonKahverengi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonBeyaz43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah43.setTextColor(Color.WHITE)
            binding.buttonKahverengi43.setTextColor(Color.WHITE)
            binding.buttonKirmizi43.setTextColor(Color.WHITE)
            binding.buttonYesil43.setTextColor(Color.WHITE)
            binding.buttonMavi43.setTextColor(Color.WHITE)
            binding.buttonMor43.setTextColor(Color.WHITE)
            binding.buttonGri43.setTextColor(Color.BLACK)
            gelenSayi3 = 100000000
        }

        binding.buttonBeyaz43.setOnClickListener() {
            binding.buttonSiyah43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz43.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSiyah43.setTextColor(Color.WHITE)
            binding.buttonKahverengi43.setTextColor(Color.WHITE)
            binding.buttonKirmizi43.setTextColor(Color.WHITE)
            binding.buttonYesil43.setTextColor(Color.WHITE)
            binding.buttonMavi43.setTextColor(Color.WHITE)
            binding.buttonMor43.setTextColor(Color.WHITE)
            binding.buttonGri43.setTextColor(Color.WHITE)
            gelenSayi3 = 1000000000
        }

        binding.buttonSiyah44.setOnClickListener() {
            binding.buttonSiyah44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKahverengi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah44.setTextColor(Color.BLACK)
            binding.buttonKahverengi44.setTextColor(Color.WHITE)
            binding.buttonKirmizi44.setTextColor(Color.WHITE)
            binding.buttonYesil44.setTextColor(Color.WHITE)
            binding.buttonMavi44.setTextColor(Color.WHITE)
            binding.buttonMor44.setTextColor(Color.WHITE)
            binding.buttonGri44.setTextColor(Color.WHITE)
            gelenSayi4 = 0f
        }

        binding.buttonKahverengi44.setOnClickListener() {
            binding.buttonSiyah44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKirmizi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah44.setTextColor(Color.WHITE)
            binding.buttonKahverengi44.setTextColor(Color.BLACK)
            binding.buttonKirmizi44.setTextColor(Color.WHITE)
            binding.buttonYesil44.setTextColor(Color.WHITE)
            binding.buttonMavi44.setTextColor(Color.WHITE)
            binding.buttonMor44.setTextColor(Color.WHITE)
            binding.buttonGri44.setTextColor(Color.WHITE)
            gelenSayi4 = 1f
        }

        binding.buttonKirmizi44.setOnClickListener() {
            binding.buttonSiyah44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonTuruncu44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah44.setTextColor(Color.WHITE)
            binding.buttonKahverengi44.setTextColor(Color.WHITE)
            binding.buttonKirmizi44.setTextColor(Color.BLACK)
            binding.buttonYesil44.setTextColor(Color.WHITE)
            binding.buttonMavi44.setTextColor(Color.WHITE)
            binding.buttonMor44.setTextColor(Color.WHITE)
            binding.buttonGri44.setTextColor(Color.WHITE)
            gelenSayi4 = 2f
        }

        binding.buttonTuruncu44.setOnClickListener() {
            binding.buttonSiyah44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSari44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah44.setTextColor(Color.WHITE)
            binding.buttonKahverengi44.setTextColor(Color.WHITE)
            binding.buttonKirmizi44.setTextColor(Color.WHITE)
            binding.buttonYesil44.setTextColor(Color.WHITE)
            binding.buttonMavi44.setTextColor(Color.WHITE)
            binding.buttonMor44.setTextColor(Color.WHITE)
            binding.buttonGri44.setTextColor(Color.WHITE)
            gelenSayi4 = 3f
        }

        binding.buttonSari44.setOnClickListener() {
            binding.buttonSiyah44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonYesil44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah44.setTextColor(Color.WHITE)
            binding.buttonKahverengi44.setTextColor(Color.WHITE)
            binding.buttonKirmizi44.setTextColor(Color.WHITE)
            binding.buttonYesil44.setTextColor(Color.WHITE)
            binding.buttonMavi44.setTextColor(Color.WHITE)
            binding.buttonMor44.setTextColor(Color.WHITE)
            binding.buttonGri44.setTextColor(Color.WHITE)
            gelenSayi4 = 4f
        }

        binding.buttonYesil44.setOnClickListener() {
            binding.buttonSiyah44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMavi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah44.setTextColor(Color.WHITE)
            binding.buttonKahverengi44.setTextColor(Color.WHITE)
            binding.buttonKirmizi44.setTextColor(Color.WHITE)
            binding.buttonYesil44.setTextColor(Color.BLACK)
            binding.buttonMavi44.setTextColor(Color.WHITE)
            binding.buttonMor44.setTextColor(Color.WHITE)
            binding.buttonGri44.setTextColor(Color.WHITE)
            gelenSayi4 = 0.5f
        }

        binding.buttonMavi44.setOnClickListener() {
            binding.buttonSiyah44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMor44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah44.setTextColor(Color.WHITE)
            binding.buttonKahverengi44.setTextColor(Color.WHITE)
            binding.buttonKirmizi44.setTextColor(Color.WHITE)
            binding.buttonYesil44.setTextColor(Color.WHITE)
            binding.buttonMavi44.setTextColor(Color.BLACK)
            binding.buttonMor44.setTextColor(Color.WHITE)
            binding.buttonGri44.setTextColor(Color.WHITE)
            gelenSayi4 = 0.25f
        }

        binding.buttonMor44.setOnClickListener() {
            binding.buttonSiyah44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonGri44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah44.setTextColor(Color.WHITE)
            binding.buttonKahverengi44.setTextColor(Color.WHITE)
            binding.buttonKirmizi44.setTextColor(Color.WHITE)
            binding.buttonYesil44.setTextColor(Color.WHITE)
            binding.buttonMavi44.setTextColor(Color.WHITE)
            binding.buttonMor44.setTextColor(Color.BLACK)
            binding.buttonGri44.setTextColor(Color.WHITE)
            gelenSayi4 = 0.1f
        }

        binding.buttonGri44.setOnClickListener() {
            binding.buttonSiyah44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonBeyaz44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah44.setTextColor(Color.WHITE)
            binding.buttonKahverengi44.setTextColor(Color.WHITE)
            binding.buttonKirmizi44.setTextColor(Color.WHITE)
            binding.buttonYesil44.setTextColor(Color.WHITE)
            binding.buttonMavi44.setTextColor(Color.WHITE)
            binding.buttonMor44.setTextColor(Color.WHITE)
            binding.buttonGri44.setTextColor(Color.BLACK)
            gelenSayi4 = 0.05f
        }

        binding.buttonBeyaz44.setOnClickListener() {
            binding.buttonSiyah44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonAltin4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah44.setTextColor(Color.WHITE)
            binding.buttonKahverengi44.setTextColor(Color.WHITE)
            binding.buttonKirmizi44.setTextColor(Color.WHITE)
            binding.buttonYesil44.setTextColor(Color.WHITE)
            binding.buttonMavi44.setTextColor(Color.WHITE)
            binding.buttonMor44.setTextColor(Color.WHITE)
            binding.buttonGri44.setTextColor(Color.WHITE)
            gelenSayi4 = 0f
        }

        binding.buttonAltin4.setOnClickListener() {
            binding.buttonSiyah44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonGumus4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah44.setTextColor(Color.WHITE)
            binding.buttonKahverengi44.setTextColor(Color.WHITE)
            binding.buttonKirmizi44.setTextColor(Color.WHITE)
            binding.buttonYesil44.setTextColor(Color.WHITE)
            binding.buttonMavi44.setTextColor(Color.WHITE)
            binding.buttonMor44.setTextColor(Color.WHITE)
            binding.buttonGri44.setTextColor(Color.WHITE)
            gelenSayi4 = 5f
        }

        binding.buttonGumus4.setOnClickListener() {
            binding.buttonSiyah44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahverengi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz44.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus4.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSiyah44.setTextColor(Color.WHITE)
            binding.buttonKahverengi44.setTextColor(Color.WHITE)
            binding.buttonKirmizi44.setTextColor(Color.WHITE)
            binding.buttonYesil44.setTextColor(Color.WHITE)
            binding.buttonMavi44.setTextColor(Color.WHITE)
            binding.buttonMor44.setTextColor(Color.WHITE)
            binding.buttonGri44.setTextColor(Color.WHITE)
            gelenSayi4 = 10f
        }

        binding.buttonHesapla4.setOnClickListener() {

            buttonRenkSifirla()

            if (gelenSayi1 != null && gelenSayi2 != null && gelenSayi3 != null && gelenSayi4 != null) {

                val sonuc = (gelenSayi1!! + gelenSayi2!!) * gelenSayi3!!

                val sonucTamSayi = sonuc.toInt()

                val ToleransTamSayi = gelenSayi4!!.toInt()

                /*val tolerans = (sonuc * gelenSayi4!!) / 100

                val ustDeger = sonuc + tolerans
                val altDeger = sonuc - tolerans*/

                if(sonuc > sonucTamSayi){
                    if(gelenSayi4!! >= 1){
                        binding.textsonuc4bant.text = "$sonuc Ω ±%$ToleransTamSayi"
                    }else{
                        binding.textsonuc4bant.text = "$sonuc Ω ±%$gelenSayi4"
                    }
                }else{
                    if(gelenSayi4!! >= 1){
                        binding.textsonuc4bant.text = "$sonucTamSayi Ω ±%$ToleransTamSayi"
                    }else{
                        binding.textsonuc4bant.text = "$sonucTamSayi Ω ±%$gelenSayi4"
                    }
                }

                if (sonuc >= 1000 || sonucTamSayi >= 1000) {
                    val cevir = sonuc / 1000.0
                    val cevirTamSayi = cevir.toInt()

                    if(cevir > cevirTamSayi){
                        if(gelenSayi4!! >= 1){
                            binding.textsonuc4bant.text = "$cevir KΩ ±%$ToleransTamSayi"
                        }else{
                            binding.textsonuc4bant.text = "$cevir KΩ ±%$gelenSayi4"
                        }
                    }else{
                        if(gelenSayi4!! >= 1){
                            binding.textsonuc4bant.text = "$cevirTamSayi KΩ ±%$ToleransTamSayi"
                        }else{
                            binding.textsonuc4bant.text = "$cevirTamSayi KΩ ±%$gelenSayi4"
                        }
                    }
                }
                if (sonuc >= 1000000 || sonucTamSayi >= 1000000) {
                    val cevir = sonuc / 1000000.0
                    val cevirTamSayi = cevir.toInt()

                    if(cevir > cevirTamSayi){
                        if(gelenSayi4!! >= 1){
                            binding.textsonuc4bant.text = "$cevir MΩ ±%$ToleransTamSayi"
                        }else{
                            binding.textsonuc4bant.text = "$cevir MΩ ±%$gelenSayi4"
                        }
                    }else{
                        if(gelenSayi4!! >=1){
                            binding.textsonuc4bant.text = "$cevirTamSayi MΩ ±%$ToleransTamSayi"
                        }else{
                            binding.textsonuc4bant.text = "$cevirTamSayi MΩ ±%$gelenSayi4"
                        }
                    }
                }
            }else if (gelenSayi1 == null && gelenSayi2 == null && gelenSayi3 == null && gelenSayi4 == null){
                Toast.makeText(activity,R.string.dortbantuyari, Toast.LENGTH_SHORT).show()
            }
            gelenSayi1 = 0
            gelenSayi2 = 0
            gelenSayi3 = 0
            gelenSayi4 = 0f
        }
    }
}
