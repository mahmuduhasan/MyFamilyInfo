package com.example.myfamilyinfo

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myfamilyinfo.databinding.MemberViewBinding

class MemberAdapter : ListAdapter<MemberInfo, MemberAdapter.MemberViewHolder>(MemberDiffUtil()) {
    class MemberViewHolder(private val binding: MemberViewBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(member : MemberInfo){
            binding.member = member
        }
    }

    class MemberDiffUtil : DiffUtil.ItemCallback<MemberInfo>(){
        override fun areItemsTheSame(oldItem: MemberInfo, newItem: MemberInfo): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: MemberInfo, newItem: MemberInfo): Boolean {
            return oldItem == newItem
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MemberViewHolder {
        val binding = MemberViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return MemberViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MemberViewHolder, position: Int) {
        val member = getItem(position)
        holder.bind(member)
    }
}