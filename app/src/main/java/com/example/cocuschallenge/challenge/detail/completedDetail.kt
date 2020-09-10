package com.example.cocuschallenge.challenge.detail

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cocuschallenge.R

class completedDetail : Fragment() {

    companion object {
        fun newInstance() = completedDetail()
    }

    private lateinit var viewModel: CompletedDetailViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.completed_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CompletedDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}