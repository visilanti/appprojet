package com.example.malnavigation.ui.mylist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.malnavigation.databinding.FragmentMylistBinding

class MylistFragment: Fragment() {
    private var _binding: FragmentMylistBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val mylistViewModel =
            ViewModelProvider(this).get(MylistViewModel::class.java)

        _binding = FragmentMylistBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMylist
        mylistViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}