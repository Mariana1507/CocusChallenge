package com.example.cocuschallenge.list

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cocuschallenge.R

class authoredChallenge : Fragment() {

    companion object {
        fun newInstance() = authoredChallenge()
    }

    private lateinit var viewModel: AuthoredChallengeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.authored_challenge_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AuthoredChallengeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}