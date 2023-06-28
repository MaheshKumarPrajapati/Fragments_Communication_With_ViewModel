package com.mahesh_prajapati.fragment_communication.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider
import com.mahesh_prajapati.fragment_communication.R
import com.mahesh_prajapati.fragment_communication.viewModel.CommunicationViewModel


class SenderFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view=inflater.inflate(R.layout.fragment_sender, container, false)
        // Owener must be getActivity or requireActivity. this will not work
        val viewModel= ViewModelProvider(requireActivity())[CommunicationViewModel::class.java]
        val edMessage= view.findViewById<EditText>(R.id.edMessage)

        view.findViewById<Button>(R.id.btSend).setOnClickListener {
            viewModel.messageSent(edMessage.text.toString())
        }

        return view
    }


}