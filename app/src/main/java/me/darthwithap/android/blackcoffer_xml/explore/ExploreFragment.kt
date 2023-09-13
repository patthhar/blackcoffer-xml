package me.darthwithap.android.blackcoffer_xml.explore

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import me.darthwithap.android.blackcoffer_xml.R
import me.darthwithap.android.blackcoffer_xml.databinding.FragmentExploreBinding

class ExploreFragment : Fragment(R.layout.fragment_explore) {

    private var _binding: FragmentExploreBinding? = null
    private val binding: FragmentExploreBinding
        get() = _binding!!

    private val exploreViewModel: ExploreViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentExploreBinding.bind(view)
//        val adapter = ExplorePagerAdapter(this)
//        binding.viewPager.adapter = adapter
//        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, position ->
//            tab.text = "Tab ${position + 1}"
//        }.attach()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}