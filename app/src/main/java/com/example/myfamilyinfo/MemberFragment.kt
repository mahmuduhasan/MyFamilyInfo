package com.example.myfamilyinfo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfamilyinfo.databinding.FragmentMemberBinding


class MemberFragment : Fragment() {
    private lateinit var binding : FragmentMemberBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMemberBinding.inflate(inflater,container,false)
        val adapter = MemberAdapter()
        binding.memberRecycleView.layoutManager = LinearLayoutManager(activity)
        binding.memberRecycleView.adapter = adapter
        adapter.submitList(memberList)
        return binding.root
    }

}