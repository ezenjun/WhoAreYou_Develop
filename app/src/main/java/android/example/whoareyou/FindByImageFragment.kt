package com.example.flo

import android.example.whoareyou.databinding.FragmentFindByCameraBinding
import android.example.whoareyou.databinding.FragmentFindByImageBinding
import android.example.whoareyou.databinding.FragmentLockerBinding
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator


class FindByImageFragment : Fragment() {

    lateinit var binding: FragmentFindByImageBinding
    val information = arrayListOf("저장한 곡", "음악파일")


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFindByImageBinding.inflate(inflater, container, false)


        return binding.root
    }


}