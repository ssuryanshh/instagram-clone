package com.example.instagramclone.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.instagramclone.Posts.PostActivity
import com.example.instagramclone.Posts.ReelsActivity
import com.example.instagramclone.databinding.FragmentAddBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class AddFragment : BottomSheetDialogFragment() {
    private lateinit var binding : FragmentAddBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentAddBinding.inflate(inflater,container,false)
            binding.post.setOnClickListener{
                activity?.startActivity(Intent(requireContext(),PostActivity::class.java))
            }
            binding.video.setOnClickListener{
                activity?.startActivity(Intent(requireContext(),ReelsActivity::class.java))
            }
        return binding.root
    }

    companion object {
        }
}