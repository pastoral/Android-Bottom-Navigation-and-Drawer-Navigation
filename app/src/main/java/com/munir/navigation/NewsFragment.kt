package com.munir.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.munir.navigation.databinding.FragmentHomeBinding
import com.munir.navigation.databinding.FragmentNewsBinding

/**
 * A simple [Fragment] subclass.
 */
class NewsFragment : Fragment() {

    lateinit var binding : FragmentNewsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentNewsBinding.inflate(inflater)


        return(binding.root)
    }

}
