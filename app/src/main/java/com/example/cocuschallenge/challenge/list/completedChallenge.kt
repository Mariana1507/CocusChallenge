package com.example.cocuschallenge.list

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cocuschallenge.R

class completedChallenge : Fragment() {

    companion object {
        fun newInstance() = completedChallenge()
    }

    private lateinit var viewModel: CompletedChallengeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.completed_challenge_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CompletedChallengeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}