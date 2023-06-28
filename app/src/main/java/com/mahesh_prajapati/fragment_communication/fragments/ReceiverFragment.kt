package com.mahesh_prajapati.fragment_communication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.mahesh_prajapati.fragment_communication.R
import com.mahesh_prajapati.fragment_communication.viewModel.CommunicationViewModel


class ReceiverFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view= inflater.inflate(R.layout.fragment_receiver, container, false)
        // Owener must be getActivity or requireActivity. this will not work
        val viewModel= ViewModelProvider(requireActivity())[CommunicationViewModel::class.java]
        val text= view.findViewById<TextView>(R.id.tvReceivedText)
        // we can use any Owener getActivity or requireActivity or this
        viewModel.messageLiveData.observe(requireActivity()) {
            text.text = it
        }
        return view
    }

}