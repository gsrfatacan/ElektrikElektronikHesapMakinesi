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
import com.gserifatacan.elektrikelektronikhesapmakinesi.databinding.FragmentBesBantDirencBinding

class BesBantDirencFragment : Fragment() {

    fun buttonRenkSifirla(){
        binding.buttonSiyah51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
        binding.buttonSiyah51.setTextColor(Color.WHITE)
        binding.buttonSiyah52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
        binding.buttonSiyah52.setTextColor(Color.WHITE)
        binding.buttonSiyah53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
        binding.buttonSiyah53.setTextColor(Color.WHITE)
        binding.buttonSiyah54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
        binding.buttonSiyah54.setTextColor(Color.WHITE)
        binding.buttonSiyah55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
        binding.buttonSiyah55.setTextColor(Color.WHITE)

        binding.buttonKahve51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
        binding.buttonKahve51.setTextColor(Color.WHITE)
        binding.buttonKahve52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
        binding.buttonKahve52.setTextColor(Color.WHITE)
        binding.buttonKahve53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
        binding.buttonKahve53.setTextColor(Color.WHITE)
        binding.buttonKahve54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
        binding.buttonKahve54.setTextColor(Color.WHITE)
        binding.buttonKahve55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
        binding.buttonKahve55.setTextColor(Color.WHITE)

        binding.buttonKirmizi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
        binding.buttonKirmizi51.setTextColor(Color.WHITE)
        binding.buttonKirmizi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
        binding.buttonKirmizi52.setTextColor(Color.WHITE)
        binding.buttonKirmizi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
        binding.buttonKirmizi53.setTextColor(Color.WHITE)
        binding.buttonKirmizi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
        binding.buttonKirmizi54.setTextColor(Color.WHITE)
        binding.buttonKirmizi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
        binding.buttonKirmizi55.setTextColor(Color.WHITE)

        binding.buttonTuruncu51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
        binding.buttonTuruncu51.setTextColor(Color.BLACK)
        binding.buttonTuruncu52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
        binding.buttonTuruncu52.setTextColor(Color.BLACK)
        binding.buttonTuruncu53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
        binding.buttonTuruncu53.setTextColor(Color.BLACK)
        binding.buttonTuruncu54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
        binding.buttonTuruncu54.setTextColor(Color.BLACK)
        binding.buttonTuruncu55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
        binding.buttonTuruncu55.setTextColor(Color.BLACK)

        binding.buttonSari51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
        binding.buttonSari51.setTextColor(Color.BLACK)
        binding.buttonSari52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
        binding.buttonSari52.setTextColor(Color.BLACK)
        binding.buttonSari53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
        binding.buttonSari53.setTextColor(Color.BLACK)
        binding.buttonSari54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
        binding.buttonSari54.setTextColor(Color.BLACK)
        binding.buttonSari55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
        binding.buttonSari55.setTextColor(Color.BLACK)

        binding.buttonYesil51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
        binding.buttonYesil51.setTextColor(Color.WHITE)
        binding.buttonYesil52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
        binding.buttonYesil52.setTextColor(Color.WHITE)
        binding.buttonYesil53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
        binding.buttonYesil53.setTextColor(Color.WHITE)
        binding.buttonYesil54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
        binding.buttonYesil54.setTextColor(Color.WHITE)
        binding.buttonYesil55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
        binding.buttonYesil55.setTextColor(Color.WHITE)

        binding.buttonMavi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
        binding.buttonMavi51.setTextColor(Color.WHITE)
        binding.buttonMavi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
        binding.buttonMavi52.setTextColor(Color.WHITE)
        binding.buttonMavi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
        binding.buttonMavi53.setTextColor(Color.WHITE)
        binding.buttonMavi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
        binding.buttonMavi54.setTextColor(Color.WHITE)
        binding.buttonMavi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
        binding.buttonMavi55.setTextColor(Color.WHITE)

        binding.buttonMor51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
        binding.buttonMor51.setTextColor(Color.WHITE)
        binding.buttonMor52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
        binding.buttonMor52.setTextColor(Color.WHITE)
        binding.buttonMor53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
        binding.buttonMor53.setTextColor(Color.WHITE)
        binding.buttonMor54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
        binding.buttonMor54.setTextColor(Color.WHITE)
        binding.buttonMor55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
        binding.buttonMor55.setTextColor(Color.WHITE)

        binding.buttonGri51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
        binding.buttonGri51.setTextColor(Color.WHITE)
        binding.buttonGri52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
        binding.buttonGri52.setTextColor(Color.WHITE)
        binding.buttonGri53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
        binding.buttonGri53.setTextColor(Color.WHITE)
        binding.buttonGri54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
        binding.buttonGri54.setTextColor(Color.WHITE)
        binding.buttonGri55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
        binding.buttonGri55.setTextColor(Color.WHITE)

        binding.buttonBeyaz51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
        binding.buttonBeyaz51.setTextColor(Color.BLACK)
        binding.buttonBeyaz52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
        binding.buttonBeyaz52.setTextColor(Color.BLACK)
        binding.buttonBeyaz53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
        binding.buttonBeyaz53.setTextColor(Color.BLACK)
        binding.buttonBeyaz54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
        binding.buttonBeyaz54.setTextColor(Color.BLACK)
        binding.buttonBeyaz55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
        binding.buttonBeyaz55.setTextColor(Color.BLACK)

        binding.buttonAltin5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
        binding.buttonAltin5.setTextColor(Color.BLACK)

        binding.buttonGumus5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
        binding.buttonGumus5.setTextColor(Color.BLACK)
    }

    private var _binding: FragmentBesBantDirencBinding? = null
    private val binding get() = _binding!!

    var gelenSayi1: Int? = null
    var gelenSayi2: Int? = null
    var gelenSayi3: Int? = null
    var gelenSayi4: Long? = null
    var gelenSayi5: Float? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBesBantDirencBinding.inflate(inflater, container, false)
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

        binding.buttonSiyah51.setOnClickListener() {
            binding.buttonSiyah51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKahve51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah51.setTextColor(Color.BLACK)
            binding.buttonKahve51.setTextColor(Color.WHITE)
            binding.buttonKirmizi51.setTextColor(Color.WHITE)
            binding.buttonYesil51.setTextColor(Color.WHITE)
            binding.buttonMavi51.setTextColor(Color.WHITE)
            binding.buttonMor51.setTextColor(Color.WHITE)
            binding.buttonGri51.setTextColor(Color.WHITE)
            gelenSayi1 = 0
        }

        binding.buttonKahve51.setOnClickListener() {
            binding.buttonSiyah51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKirmizi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah51.setTextColor(Color.WHITE)
            binding.buttonKahve51.setTextColor(Color.BLACK)
            binding.buttonKirmizi51.setTextColor(Color.WHITE)
            binding.buttonYesil51.setTextColor(Color.WHITE)
            binding.buttonMavi51.setTextColor(Color.WHITE)
            binding.buttonMor51.setTextColor(Color.WHITE)
            binding.buttonGri51.setTextColor(Color.WHITE)
            gelenSayi1 = 100
        }

        binding.buttonKirmizi51.setOnClickListener() {
            binding.buttonSiyah51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonTuruncu51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah51.setTextColor(Color.WHITE)
            binding.buttonKahve51.setTextColor(Color.WHITE)
            binding.buttonKirmizi51.setTextColor(Color.BLACK)
            binding.buttonYesil51.setTextColor(Color.WHITE)
            binding.buttonMavi51.setTextColor(Color.WHITE)
            binding.buttonMor51.setTextColor(Color.WHITE)
            binding.buttonGri51.setTextColor(Color.WHITE)
            gelenSayi1 = 200
        }

        binding.buttonTuruncu51.setOnClickListener() {
            binding.buttonSiyah51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSari51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah51.setTextColor(Color.WHITE)
            binding.buttonKahve51.setTextColor(Color.WHITE)
            binding.buttonKirmizi51.setTextColor(Color.WHITE)
            binding.buttonYesil51.setTextColor(Color.WHITE)
            binding.buttonMavi51.setTextColor(Color.WHITE)
            binding.buttonMor51.setTextColor(Color.WHITE)
            binding.buttonGri51.setTextColor(Color.WHITE)
            gelenSayi1 = 300
        }

        binding.buttonSari51.setOnClickListener() {
            binding.buttonSiyah51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonYesil51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah51.setTextColor(Color.WHITE)
            binding.buttonKahve51.setTextColor(Color.WHITE)
            binding.buttonKirmizi51.setTextColor(Color.WHITE)
            binding.buttonYesil51.setTextColor(Color.WHITE)
            binding.buttonMavi51.setTextColor(Color.WHITE)
            binding.buttonMor51.setTextColor(Color.WHITE)
            binding.buttonGri51.setTextColor(Color.WHITE)
            gelenSayi1 = 400
        }

        binding.buttonYesil51.setOnClickListener() {
            binding.buttonSiyah51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMavi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah51.setTextColor(Color.WHITE)
            binding.buttonKahve51.setTextColor(Color.WHITE)
            binding.buttonKirmizi51.setTextColor(Color.WHITE)
            binding.buttonYesil51.setTextColor(Color.BLACK)
            binding.buttonMavi51.setTextColor(Color.WHITE)
            binding.buttonMor51.setTextColor(Color.WHITE)
            binding.buttonGri51.setTextColor(Color.WHITE)
            gelenSayi1 = 500
        }

        binding.buttonMavi51.setOnClickListener() {
            binding.buttonSiyah51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMor51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah51.setTextColor(Color.WHITE)
            binding.buttonKahve51.setTextColor(Color.WHITE)
            binding.buttonKirmizi51.setTextColor(Color.WHITE)
            binding.buttonYesil51.setTextColor(Color.WHITE)
            binding.buttonMavi51.setTextColor(Color.BLACK)
            binding.buttonMor51.setTextColor(Color.WHITE)
            binding.buttonGri51.setTextColor(Color.WHITE)
            gelenSayi1 = 600
        }

        binding.buttonMor51.setOnClickListener() {
            binding.buttonSiyah51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonGri51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah51.setTextColor(Color.WHITE)
            binding.buttonKahve51.setTextColor(Color.WHITE)
            binding.buttonKirmizi51.setTextColor(Color.WHITE)
            binding.buttonYesil51.setTextColor(Color.WHITE)
            binding.buttonMavi51.setTextColor(Color.WHITE)
            binding.buttonMor51.setTextColor(Color.BLACK)
            binding.buttonGri51.setTextColor(Color.WHITE)
            gelenSayi1 = 700
        }

        binding.buttonGri51.setOnClickListener() {
            binding.buttonSiyah51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonBeyaz51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah51.setTextColor(Color.WHITE)
            binding.buttonKahve51.setTextColor(Color.WHITE)
            binding.buttonKirmizi51.setTextColor(Color.WHITE)
            binding.buttonYesil51.setTextColor(Color.WHITE)
            binding.buttonMavi51.setTextColor(Color.WHITE)
            binding.buttonMor51.setTextColor(Color.WHITE)
            binding.buttonGri51.setTextColor(Color.BLACK)
            gelenSayi1 = 800
        }

        binding.buttonBeyaz51.setOnClickListener() {
            binding.buttonSiyah51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz51.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSiyah51.setTextColor(Color.WHITE)
            binding.buttonKahve51.setTextColor(Color.WHITE)
            binding.buttonKirmizi51.setTextColor(Color.WHITE)
            binding.buttonYesil51.setTextColor(Color.WHITE)
            binding.buttonMavi51.setTextColor(Color.WHITE)
            binding.buttonMor51.setTextColor(Color.WHITE)
            binding.buttonGri51.setTextColor(Color.WHITE)
            gelenSayi1 = 900
        }

        binding.buttonSiyah52.setOnClickListener() {
            binding.buttonSiyah52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKahve52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah52.setTextColor(Color.BLACK)
            binding.buttonKahve52.setTextColor(Color.WHITE)
            binding.buttonKirmizi52.setTextColor(Color.WHITE)
            binding.buttonYesil52.setTextColor(Color.WHITE)
            binding.buttonMavi52.setTextColor(Color.WHITE)
            binding.buttonMor52.setTextColor(Color.WHITE)
            binding.buttonGri52.setTextColor(Color.WHITE)
            gelenSayi2 = 0
        }

        binding.buttonKahve52.setOnClickListener() {
            binding.buttonSiyah52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKirmizi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah52.setTextColor(Color.WHITE)
            binding.buttonKahve52.setTextColor(Color.BLACK)
            binding.buttonKirmizi52.setTextColor(Color.WHITE)
            binding.buttonYesil52.setTextColor(Color.WHITE)
            binding.buttonMavi52.setTextColor(Color.WHITE)
            binding.buttonMor52.setTextColor(Color.WHITE)
            binding.buttonGri52.setTextColor(Color.WHITE)
            gelenSayi2 = 10
        }

        binding.buttonKirmizi52.setOnClickListener() {
            binding.buttonSiyah52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonTuruncu52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah52.setTextColor(Color.WHITE)
            binding.buttonKahve52.setTextColor(Color.WHITE)
            binding.buttonKirmizi52.setTextColor(Color.BLACK)
            binding.buttonYesil52.setTextColor(Color.WHITE)
            binding.buttonMavi52.setTextColor(Color.WHITE)
            binding.buttonMor52.setTextColor(Color.WHITE)
            binding.buttonGri52.setTextColor(Color.WHITE)
            gelenSayi2 = 20
        }

        binding.buttonTuruncu52.setOnClickListener() {
            binding.buttonSiyah52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSari52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah52.setTextColor(Color.WHITE)
            binding.buttonKahve52.setTextColor(Color.WHITE)
            binding.buttonKirmizi52.setTextColor(Color.WHITE)
            binding.buttonYesil52.setTextColor(Color.WHITE)
            binding.buttonMavi52.setTextColor(Color.WHITE)
            binding.buttonMor52.setTextColor(Color.WHITE)
            binding.buttonGri52.setTextColor(Color.WHITE)
            gelenSayi2 = 30
        }

        binding.buttonSari52.setOnClickListener() {
            binding.buttonSiyah52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonYesil52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah52.setTextColor(Color.WHITE)
            binding.buttonKahve52.setTextColor(Color.WHITE)
            binding.buttonKirmizi52.setTextColor(Color.WHITE)
            binding.buttonYesil52.setTextColor(Color.WHITE)
            binding.buttonMavi52.setTextColor(Color.WHITE)
            binding.buttonMor52.setTextColor(Color.WHITE)
            binding.buttonGri52.setTextColor(Color.WHITE)
            gelenSayi2 = 40
        }

        binding.buttonYesil52.setOnClickListener() {
            binding.buttonSiyah52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMavi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah52.setTextColor(Color.WHITE)
            binding.buttonKahve52.setTextColor(Color.WHITE)
            binding.buttonKirmizi52.setTextColor(Color.WHITE)
            binding.buttonYesil52.setTextColor(Color.BLACK)
            binding.buttonMavi52.setTextColor(Color.WHITE)
            binding.buttonMor52.setTextColor(Color.WHITE)
            binding.buttonGri52.setTextColor(Color.WHITE)
            gelenSayi2 = 50
        }

        binding.buttonMavi52.setOnClickListener() {
            binding.buttonSiyah52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMor52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah52.setTextColor(Color.WHITE)
            binding.buttonKahve52.setTextColor(Color.WHITE)
            binding.buttonKirmizi52.setTextColor(Color.WHITE)
            binding.buttonYesil52.setTextColor(Color.WHITE)
            binding.buttonMavi52.setTextColor(Color.BLACK)
            binding.buttonMor52.setTextColor(Color.WHITE)
            binding.buttonGri52.setTextColor(Color.WHITE)
            gelenSayi2 = 60
        }

        binding.buttonMor52.setOnClickListener() {
            binding.buttonSiyah52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonGri52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah52.setTextColor(Color.WHITE)
            binding.buttonKahve52.setTextColor(Color.WHITE)
            binding.buttonKirmizi52.setTextColor(Color.WHITE)
            binding.buttonYesil52.setTextColor(Color.WHITE)
            binding.buttonMavi52.setTextColor(Color.WHITE)
            binding.buttonMor52.setTextColor(Color.BLACK)
            binding.buttonGri52.setTextColor(Color.WHITE)
            gelenSayi2 = 70
        }

        binding.buttonGri52.setOnClickListener() {
            binding.buttonSiyah52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonBeyaz52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah52.setTextColor(Color.WHITE)
            binding.buttonKahve52.setTextColor(Color.WHITE)
            binding.buttonKirmizi52.setTextColor(Color.WHITE)
            binding.buttonYesil52.setTextColor(Color.WHITE)
            binding.buttonMavi52.setTextColor(Color.WHITE)
            binding.buttonMor52.setTextColor(Color.WHITE)
            binding.buttonGri52.setTextColor(Color.BLACK)
            gelenSayi2 = 80
        }

        binding.buttonBeyaz52.setOnClickListener() {
            binding.buttonSiyah52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz52.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSiyah52.setTextColor(Color.WHITE)
            binding.buttonKahve52.setTextColor(Color.WHITE)
            binding.buttonKirmizi52.setTextColor(Color.WHITE)
            binding.buttonYesil52.setTextColor(Color.WHITE)
            binding.buttonMavi52.setTextColor(Color.WHITE)
            binding.buttonMor52.setTextColor(Color.WHITE)
            binding.buttonGri52.setTextColor(Color.WHITE)
            gelenSayi2 = 90
        }

        binding.buttonSiyah53.setOnClickListener() {
            binding.buttonSiyah53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKahve53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah53.setTextColor(Color.BLACK)
            binding.buttonKahve53.setTextColor(Color.WHITE)
            binding.buttonKirmizi53.setTextColor(Color.WHITE)
            binding.buttonYesil53.setTextColor(Color.WHITE)
            binding.buttonMavi53.setTextColor(Color.WHITE)
            binding.buttonMor53.setTextColor(Color.WHITE)
            binding.buttonGri53.setTextColor(Color.WHITE)
            gelenSayi3 = 0
        }

        binding.buttonKahve53.setOnClickListener() {
            binding.buttonSiyah53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKirmizi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah53.setTextColor(Color.WHITE)
            binding.buttonKahve53.setTextColor(Color.BLACK)
            binding.buttonKirmizi53.setTextColor(Color.WHITE)
            binding.buttonYesil53.setTextColor(Color.WHITE)
            binding.buttonMavi53.setTextColor(Color.WHITE)
            binding.buttonMor53.setTextColor(Color.WHITE)
            binding.buttonGri53.setTextColor(Color.WHITE)
            gelenSayi3 = 1
        }

        binding.buttonKirmizi53.setOnClickListener() {
            binding.buttonSiyah53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonTuruncu53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah53.setTextColor(Color.WHITE)
            binding.buttonKahve53.setTextColor(Color.WHITE)
            binding.buttonKirmizi53.setTextColor(Color.BLACK)
            binding.buttonYesil53.setTextColor(Color.WHITE)
            binding.buttonMavi53.setTextColor(Color.WHITE)
            binding.buttonMor53.setTextColor(Color.WHITE)
            binding.buttonGri53.setTextColor(Color.WHITE)
            gelenSayi3 = 2
        }

        binding.buttonTuruncu53.setOnClickListener() {
            binding.buttonSiyah53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSari53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah53.setTextColor(Color.WHITE)
            binding.buttonKahve53.setTextColor(Color.WHITE)
            binding.buttonKirmizi53.setTextColor(Color.WHITE)
            binding.buttonYesil53.setTextColor(Color.WHITE)
            binding.buttonMavi53.setTextColor(Color.WHITE)
            binding.buttonMor53.setTextColor(Color.WHITE)
            binding.buttonGri53.setTextColor(Color.WHITE)
            gelenSayi3 = 3
        }

        binding.buttonSari53.setOnClickListener() {
            binding.buttonSiyah53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonYesil53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah53.setTextColor(Color.WHITE)
            binding.buttonKahve53.setTextColor(Color.WHITE)
            binding.buttonKirmizi53.setTextColor(Color.WHITE)
            binding.buttonYesil53.setTextColor(Color.WHITE)
            binding.buttonMavi53.setTextColor(Color.WHITE)
            binding.buttonMor53.setTextColor(Color.WHITE)
            binding.buttonGri53.setTextColor(Color.WHITE)
            gelenSayi3 = 4
        }

        binding.buttonYesil53.setOnClickListener() {
            binding.buttonSiyah53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMavi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah53.setTextColor(Color.WHITE)
            binding.buttonKahve53.setTextColor(Color.WHITE)
            binding.buttonKirmizi53.setTextColor(Color.WHITE)
            binding.buttonYesil53.setTextColor(Color.BLACK)
            binding.buttonMavi53.setTextColor(Color.WHITE)
            binding.buttonMor53.setTextColor(Color.WHITE)
            binding.buttonGri53.setTextColor(Color.WHITE)
            gelenSayi3 = 5
        }

        binding.buttonMavi53.setOnClickListener() {
            binding.buttonSiyah53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMor53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah53.setTextColor(Color.WHITE)
            binding.buttonKahve53.setTextColor(Color.WHITE)
            binding.buttonKirmizi53.setTextColor(Color.WHITE)
            binding.buttonYesil53.setTextColor(Color.WHITE)
            binding.buttonMavi53.setTextColor(Color.BLACK)
            binding.buttonMor53.setTextColor(Color.WHITE)
            binding.buttonGri53.setTextColor(Color.WHITE)
            gelenSayi3 = 6
        }

        binding.buttonMor53.setOnClickListener() {
            binding.buttonSiyah53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonGri53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah53.setTextColor(Color.WHITE)
            binding.buttonKahve53.setTextColor(Color.WHITE)
            binding.buttonKirmizi53.setTextColor(Color.WHITE)
            binding.buttonYesil53.setTextColor(Color.WHITE)
            binding.buttonMavi53.setTextColor(Color.WHITE)
            binding.buttonMor53.setTextColor(Color.BLACK)
            binding.buttonGri53.setTextColor(Color.WHITE)
            gelenSayi3 = 7
        }

        binding.buttonGri53.setOnClickListener() {
            binding.buttonSiyah53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonBeyaz53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah53.setTextColor(Color.WHITE)
            binding.buttonKahve53.setTextColor(Color.WHITE)
            binding.buttonKirmizi53.setTextColor(Color.WHITE)
            binding.buttonYesil53.setTextColor(Color.WHITE)
            binding.buttonMavi53.setTextColor(Color.WHITE)
            binding.buttonMor53.setTextColor(Color.WHITE)
            binding.buttonGri53.setTextColor(Color.BLACK)
            gelenSayi3 = 8
        }

        binding.buttonBeyaz53.setOnClickListener() {
            binding.buttonSiyah53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz53.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSiyah53.setTextColor(Color.WHITE)
            binding.buttonKahve53.setTextColor(Color.WHITE)
            binding.buttonKirmizi53.setTextColor(Color.WHITE)
            binding.buttonYesil53.setTextColor(Color.WHITE)
            binding.buttonMavi53.setTextColor(Color.WHITE)
            binding.buttonMor53.setTextColor(Color.WHITE)
            binding.buttonGri53.setTextColor(Color.WHITE)
            gelenSayi3 = 9
        }

        binding.buttonSiyah54.setOnClickListener() {
            binding.buttonSiyah54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKahve54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah54.setTextColor(Color.BLACK)
            binding.buttonKahve54.setTextColor(Color.WHITE)
            binding.buttonKirmizi54.setTextColor(Color.WHITE)
            binding.buttonYesil54.setTextColor(Color.WHITE)
            binding.buttonMavi54.setTextColor(Color.WHITE)
            binding.buttonMor54.setTextColor(Color.WHITE)
            binding.buttonGri54.setTextColor(Color.WHITE)
            gelenSayi4 = 1
        }

        binding.buttonKahve54.setOnClickListener() {
            binding.buttonSiyah54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKirmizi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah54.setTextColor(Color.WHITE)
            binding.buttonKahve54.setTextColor(Color.BLACK)
            binding.buttonKirmizi54.setTextColor(Color.WHITE)
            binding.buttonYesil54.setTextColor(Color.WHITE)
            binding.buttonMavi54.setTextColor(Color.WHITE)
            binding.buttonMor54.setTextColor(Color.WHITE)
            binding.buttonGri54.setTextColor(Color.WHITE)
            gelenSayi4 = 10
        }

        binding.buttonKirmizi54.setOnClickListener() {
            binding.buttonSiyah54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonTuruncu54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah54.setTextColor(Color.WHITE)
            binding.buttonKahve54.setTextColor(Color.WHITE)
            binding.buttonKirmizi54.setTextColor(Color.BLACK)
            binding.buttonYesil54.setTextColor(Color.WHITE)
            binding.buttonMavi54.setTextColor(Color.WHITE)
            binding.buttonMor54.setTextColor(Color.WHITE)
            binding.buttonGri54.setTextColor(Color.WHITE)
            gelenSayi4 = 100
        }

        binding.buttonTuruncu54.setOnClickListener() {
            binding.buttonSiyah54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSari54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah54.setTextColor(Color.WHITE)
            binding.buttonKahve54.setTextColor(Color.WHITE)
            binding.buttonKirmizi54.setTextColor(Color.WHITE)
            binding.buttonYesil54.setTextColor(Color.WHITE)
            binding.buttonMavi54.setTextColor(Color.WHITE)
            binding.buttonMor54.setTextColor(Color.WHITE)
            binding.buttonGri54.setTextColor(Color.WHITE)
            gelenSayi4 = 1000
        }

        binding.buttonSari54.setOnClickListener() {
            binding.buttonSiyah54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonYesil54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah54.setTextColor(Color.WHITE)
            binding.buttonKahve54.setTextColor(Color.WHITE)
            binding.buttonKirmizi54.setTextColor(Color.WHITE)
            binding.buttonYesil54.setTextColor(Color.WHITE)
            binding.buttonMavi54.setTextColor(Color.WHITE)
            binding.buttonMor54.setTextColor(Color.WHITE)
            binding.buttonGri54.setTextColor(Color.WHITE)
            gelenSayi4 = 10000
        }

        binding.buttonYesil54.setOnClickListener() {
            binding.buttonSiyah54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMavi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah54.setTextColor(Color.WHITE)
            binding.buttonKahve54.setTextColor(Color.WHITE)
            binding.buttonKirmizi54.setTextColor(Color.WHITE)
            binding.buttonYesil54.setTextColor(Color.BLACK)
            binding.buttonMavi54.setTextColor(Color.WHITE)
            binding.buttonMor54.setTextColor(Color.WHITE)
            binding.buttonGri54.setTextColor(Color.WHITE)
            gelenSayi4 = 100000
        }

        binding.buttonMavi54.setOnClickListener() {
            binding.buttonSiyah54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMor54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah54.setTextColor(Color.WHITE)
            binding.buttonKahve54.setTextColor(Color.WHITE)
            binding.buttonKirmizi54.setTextColor(Color.WHITE)
            binding.buttonYesil54.setTextColor(Color.WHITE)
            binding.buttonMavi54.setTextColor(Color.BLACK)
            binding.buttonMor54.setTextColor(Color.WHITE)
            binding.buttonGri54.setTextColor(Color.WHITE)
            gelenSayi4 = 1000000
        }

        binding.buttonMor54.setOnClickListener() {
            binding.buttonSiyah54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonGri54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah54.setTextColor(Color.WHITE)
            binding.buttonKahve54.setTextColor(Color.WHITE)
            binding.buttonKirmizi54.setTextColor(Color.WHITE)
            binding.buttonYesil54.setTextColor(Color.WHITE)
            binding.buttonMavi54.setTextColor(Color.WHITE)
            binding.buttonMor54.setTextColor(Color.BLACK)
            binding.buttonGri54.setTextColor(Color.WHITE)
            gelenSayi4 = 10000000
        }

        binding.buttonGri54.setOnClickListener() {
            binding.buttonSiyah54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonBeyaz54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonSiyah54.setTextColor(Color.WHITE)
            binding.buttonKahve54.setTextColor(Color.WHITE)
            binding.buttonKirmizi54.setTextColor(Color.WHITE)
            binding.buttonYesil54.setTextColor(Color.WHITE)
            binding.buttonMavi54.setTextColor(Color.WHITE)
            binding.buttonMor54.setTextColor(Color.WHITE)
            binding.buttonGri54.setTextColor(Color.BLACK)
            gelenSayi4 = 100000000
        }

        binding.buttonBeyaz54.setOnClickListener() {
            binding.buttonSiyah54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz54.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSiyah54.setTextColor(Color.WHITE)
            binding.buttonKahve54.setTextColor(Color.WHITE)
            binding.buttonKirmizi54.setTextColor(Color.WHITE)
            binding.buttonYesil54.setTextColor(Color.WHITE)
            binding.buttonMavi54.setTextColor(Color.WHITE)
            binding.buttonMor54.setTextColor(Color.WHITE)
            binding.buttonGri54.setTextColor(Color.WHITE)
            gelenSayi4 = 1000000000
        }

        binding.buttonSiyah55.setOnClickListener() {
            binding.buttonSiyah55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKahve55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah55.setTextColor(Color.BLACK)
            binding.buttonKahve55.setTextColor(Color.WHITE)
            binding.buttonKirmizi55.setTextColor(Color.WHITE)
            binding.buttonYesil55.setTextColor(Color.WHITE)
            binding.buttonMavi55.setTextColor(Color.WHITE)
            binding.buttonMor55.setTextColor(Color.WHITE)
            binding.buttonGri55.setTextColor(Color.WHITE)
            gelenSayi5 = 0f
        }

        binding.buttonKahve55.setOnClickListener() {
            binding.buttonSiyah55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonKirmizi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah55.setTextColor(Color.WHITE)
            binding.buttonKahve55.setTextColor(Color.BLACK)
            binding.buttonKirmizi55.setTextColor(Color.WHITE)
            binding.buttonYesil55.setTextColor(Color.WHITE)
            binding.buttonMavi55.setTextColor(Color.WHITE)
            binding.buttonMor55.setTextColor(Color.WHITE)
            binding.buttonGri55.setTextColor(Color.WHITE)
            gelenSayi5 = 1f
        }

        binding.buttonKirmizi55.setOnClickListener() {
            binding.buttonSiyah55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonTuruncu55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah55.setTextColor(Color.WHITE)
            binding.buttonKahve55.setTextColor(Color.WHITE)
            binding.buttonKirmizi55.setTextColor(Color.BLACK)
            binding.buttonYesil55.setTextColor(Color.WHITE)
            binding.buttonMavi55.setTextColor(Color.WHITE)
            binding.buttonMor55.setTextColor(Color.WHITE)
            binding.buttonGri55.setTextColor(Color.WHITE)
            gelenSayi5 = 2f
        }

        binding.buttonTuruncu55.setOnClickListener() {
            binding.buttonSiyah55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSari55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah55.setTextColor(Color.WHITE)
            binding.buttonKahve55.setTextColor(Color.WHITE)
            binding.buttonKirmizi55.setTextColor(Color.WHITE)
            binding.buttonYesil55.setTextColor(Color.WHITE)
            binding.buttonMavi55.setTextColor(Color.WHITE)
            binding.buttonMor55.setTextColor(Color.WHITE)
            binding.buttonGri55.setTextColor(Color.WHITE)
            gelenSayi5 = 3f
        }

        binding.buttonSari55.setOnClickListener() {
            binding.buttonSiyah55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonYesil55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah55.setTextColor(Color.WHITE)
            binding.buttonKahve55.setTextColor(Color.WHITE)
            binding.buttonKirmizi55.setTextColor(Color.WHITE)
            binding.buttonYesil55.setTextColor(Color.WHITE)
            binding.buttonMavi55.setTextColor(Color.WHITE)
            binding.buttonMor55.setTextColor(Color.WHITE)
            binding.buttonGri55.setTextColor(Color.WHITE)
            gelenSayi5 = 4f
        }

        binding.buttonYesil55.setOnClickListener() {
            binding.buttonSiyah55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMavi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah55.setTextColor(Color.WHITE)
            binding.buttonKahve55.setTextColor(Color.WHITE)
            binding.buttonKirmizi55.setTextColor(Color.WHITE)
            binding.buttonYesil55.setTextColor(Color.BLACK)
            binding.buttonMavi55.setTextColor(Color.WHITE)
            binding.buttonMor55.setTextColor(Color.WHITE)
            binding.buttonGri55.setTextColor(Color.WHITE)
            gelenSayi5 = 0.5f
        }

        binding.buttonMavi55.setOnClickListener() {
            binding.buttonSiyah55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonMor55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah55.setTextColor(Color.WHITE)
            binding.buttonKahve55.setTextColor(Color.WHITE)
            binding.buttonKirmizi55.setTextColor(Color.WHITE)
            binding.buttonYesil55.setTextColor(Color.WHITE)
            binding.buttonMavi55.setTextColor(Color.BLACK)
            binding.buttonMor55.setTextColor(Color.WHITE)
            binding.buttonGri55.setTextColor(Color.WHITE)
            gelenSayi5 = 0.25f
        }

        binding.buttonMor55.setOnClickListener() {
            binding.buttonSiyah55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonGri55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah55.setTextColor(Color.WHITE)
            binding.buttonKahve55.setTextColor(Color.WHITE)
            binding.buttonKirmizi55.setTextColor(Color.WHITE)
            binding.buttonYesil55.setTextColor(Color.WHITE)
            binding.buttonMavi55.setTextColor(Color.WHITE)
            binding.buttonMor55.setTextColor(Color.BLACK)
            binding.buttonGri55.setTextColor(Color.WHITE)
            gelenSayi5 = 0.1f
        }

        binding.buttonGri55.setOnClickListener() {
            binding.buttonSiyah55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonBeyaz55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah55.setTextColor(Color.WHITE)
            binding.buttonKahve55.setTextColor(Color.WHITE)
            binding.buttonKirmizi55.setTextColor(Color.WHITE)
            binding.buttonYesil55.setTextColor(Color.WHITE)
            binding.buttonMavi55.setTextColor(Color.WHITE)
            binding.buttonMor55.setTextColor(Color.WHITE)
            binding.buttonGri55.setTextColor(Color.BLACK)
            gelenSayi5 = 0.05f
        }

        binding.buttonBeyaz55.setOnClickListener() {
            binding.buttonSiyah55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonAltin5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah55.setTextColor(Color.WHITE)
            binding.buttonKahve55.setTextColor(Color.WHITE)
            binding.buttonKirmizi55.setTextColor(Color.WHITE)
            binding.buttonYesil55.setTextColor(Color.WHITE)
            binding.buttonMavi55.setTextColor(Color.WHITE)
            binding.buttonMor55.setTextColor(Color.WHITE)
            binding.buttonGri55.setTextColor(Color.WHITE)
            gelenSayi5 = 0f
        }

        binding.buttonAltin5.setOnClickListener() {
            binding.buttonSiyah55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonGumus5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongumus))
            binding.buttonSiyah55.setTextColor(Color.WHITE)
            binding.buttonKahve55.setTextColor(Color.WHITE)
            binding.buttonKirmizi55.setTextColor(Color.WHITE)
            binding.buttonYesil55.setTextColor(Color.WHITE)
            binding.buttonMavi55.setTextColor(Color.WHITE)
            binding.buttonMor55.setTextColor(Color.WHITE)
            binding.buttonGri55.setTextColor(Color.WHITE)
            gelenSayi5 = 5f
        }

        binding.buttonGumus5.setOnClickListener() {
            binding.buttonSiyah55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsiyah))
            binding.buttonKahve55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkahve))
            binding.buttonKirmizi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonkirmizi))
            binding.buttonTuruncu55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonturuncu))
            binding.buttonSari55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsari))
            binding.buttonYesil55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonyesil))
            binding.buttonMavi55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmavi))
            binding.buttonMor55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonmor))
            binding.buttonGri55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butongri))
            binding.buttonBeyaz55.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonbeyaz))
            binding.buttonAltin5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonaltin))
            binding.buttonGumus5.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.butonsecim))
            binding.buttonSiyah55.setTextColor(Color.WHITE)
            binding.buttonKahve55.setTextColor(Color.WHITE)
            binding.buttonKirmizi55.setTextColor(Color.WHITE)
            binding.buttonYesil55.setTextColor(Color.WHITE)
            binding.buttonMavi55.setTextColor(Color.WHITE)
            binding.buttonMor55.setTextColor(Color.WHITE)
            binding.buttonGri55.setTextColor(Color.WHITE)
            gelenSayi5 = 10f
        }

        binding.buttonHesapla5.setOnClickListener(){

            buttonRenkSifirla()

            if (gelenSayi1 != null && gelenSayi2 != null && gelenSayi3 != null && gelenSayi4 != null && gelenSayi5 != null) {

                val sonuc = (gelenSayi1!! + gelenSayi2!! + gelenSayi3!!) * gelenSayi4!!

                val sonucTamSayi = sonuc.toInt()

                val ToleransTamSayi = gelenSayi5!!.toInt()

                if(sonuc > sonucTamSayi){
                    if(gelenSayi5!! >= 1){
                        binding.textSonuc5bant.text = "$sonuc Ω ±%$ToleransTamSayi"
                    }else{
                        binding.textSonuc5bant.text = "$sonuc Ω ±%$gelenSayi5"
                    }
                }else{
                    if(gelenSayi5!! >=1 ){
                        binding.textSonuc5bant.text = "$sonucTamSayi Ω ±%$ToleransTamSayi"
                    }else{
                        binding.textSonuc5bant.text = "$sonucTamSayi Ω ±%$gelenSayi5"
                    }
                }

                if (sonuc >= 1000 || sonucTamSayi >= 1000) {
                    val cevir = sonuc / 1000.0
                    val cevirTamSayi = cevir.toInt()

                    if(cevir > cevirTamSayi){
                        if(gelenSayi5!! >= 1){
                            binding.textSonuc5bant.text = "$cevir KΩ ±%$ToleransTamSayi"
                        }else{
                            binding.textSonuc5bant.text = "$cevir KΩ ±%$gelenSayi5"
                        }
                    }else{
                        if(gelenSayi4!! >= 1){
                            binding.textSonuc5bant.text = "$cevirTamSayi KΩ ±%$ToleransTamSayi"
                        }else{
                            binding.textSonuc5bant.text = "$cevirTamSayi KΩ ±%$gelenSayi5"
                        }
                    }
                }

                if (sonuc >= 1000000 || sonucTamSayi >= 1000000) {
                    val cevir = sonuc / 1000000.0
                    val cevirTamSayi = cevir.toInt()

                    if(cevir > cevirTamSayi){
                        if(gelenSayi5!! >= 1){
                            binding.textSonuc5bant.text = "$cevir MΩ ±%$ToleransTamSayi"
                        }else{
                            binding.textSonuc5bant.text = "$cevir MΩ ±%$gelenSayi5"
                        }
                    }else{
                        if(gelenSayi5!! >=1){
                            binding.textSonuc5bant.text = "$cevirTamSayi MΩ ±%$ToleransTamSayi"
                        }else{
                            binding.textSonuc5bant.text = "$cevirTamSayi MΩ ±%$gelenSayi5"
                        }
                    }
                }
            }else if (gelenSayi1 == null && gelenSayi2 == null && gelenSayi3 == null && gelenSayi4 == null && gelenSayi5 == null){
                Toast.makeText(activity,"Lütfen sırayla beş renk seçimi yapınız", Toast.LENGTH_SHORT).show()
            }
            gelenSayi1 = 0
            gelenSayi2 = 0
            gelenSayi3 = 0
            gelenSayi4 = 0
            gelenSayi5 = 0f
        }
    }
}