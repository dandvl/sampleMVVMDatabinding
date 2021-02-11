package com.example.myapplication112


import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ZViewModel : ViewModel(){

    private var _visible = MutableLiveData("si")
    var visibleOuter : LiveData<String> = _visible

    fun setVisibilidad(view: View){
        if(_visible.value == "si")
         _visible.value = "no"
        else
         _visible.value = "si"
    }

}