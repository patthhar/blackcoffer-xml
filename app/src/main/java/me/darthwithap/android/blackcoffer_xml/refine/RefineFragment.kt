package me.darthwithap.android.blackcoffer_xml.refine

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import me.darthwithap.android.blackcoffer_xml.R

class RefineFragment : Fragment() {

    companion object {
        fun newInstance() = RefineFragment()
    }

    private lateinit var viewModel: RefineViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_refine, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(RefineViewModel::class.java)
        // TODO: Use the ViewModel
    }

}