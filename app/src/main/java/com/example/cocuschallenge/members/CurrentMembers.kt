package com.example.cocuschallenge.members

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.cocuschallenge.R

class CurrentMembers : Fragment() {

    companion object {
        fun newInstance() = CurrentMembers()
    }

    private lateinit var viewModel: CurrentMembersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.current_members_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CurrentMembersViewModel::class.java)
        // TODO: Use the ViewModel
    }

}