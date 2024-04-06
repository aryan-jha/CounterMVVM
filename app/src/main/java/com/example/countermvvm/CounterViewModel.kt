package com.example.countermvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel(){

    private val _count = mutableStateOf(0)

    // to let user access count->
    val cnt : MutableState<Int> = _count

    fun incrementer(){
        _count.value++
    }

    fun decrementer(){
        _count.value--
    }


}