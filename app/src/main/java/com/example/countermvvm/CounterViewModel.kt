package com.example.countermvvm

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel(){

    private var _repository : CounterRepository = CounterRepository()


    private val _count = mutableStateOf(0)

    // to let user access count->
    val cnt : MutableState<Int> = _count

    fun incrementer(){
        _repository.incrementCounter()
        _count.value = _repository.getCounter().count
    }

    fun decrementer(){

        _repository.decrementCounter()
        _count.value = _repository.getCounter().count

    }


}