package com.example.lamierdadelputomvvm.View

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.lamierdadelputomvvm.Data.Data

class View(): ViewModel() {

    private val TAG_LOG = "miDebug"
    var _numbers = mutableStateOf(0)

    fun crearRandom() {
        _numbers.value = (0..10).random()
        Log.d(TAG_LOG, "creamos random ${_numbers.value}")
        actualizarNumero(_numbers.value)
    }

    fun actualizarNumero(numero: Int) {
        Log.d(TAG_LOG, "actualizamos numero en Datos")
        Data.num = numero
    }

    fun getNumero(): Int {
        return Data.num
    }
}