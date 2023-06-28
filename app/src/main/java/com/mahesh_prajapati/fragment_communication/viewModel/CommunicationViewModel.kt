package com.mahesh_prajapati.fragment_communication.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CommunicationViewModel : ViewModel() {

    var messageLiveData: MutableLiveData<String> = MutableLiveData<String>()

    fun messageSent(message:String){
        messageLiveData.postValue(message)
    }
}