package com.example.myapplication112


import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ZViewModel : ViewModel(){

    private var _visible = MutableLiveData(false)
    var visibleOuter : LiveData<Boolean> = _visible

    fun setVisibilidad(view: View){
        _visible.value = _visible.value?.not()
    }

}