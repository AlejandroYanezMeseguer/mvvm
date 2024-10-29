package com.example.lamierdadelputomvvm.Data

import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.graphics.Color
import java.lang.reflect.Modifier

object Data {
    var num = 0
}

enum class Colores(val color: Color, val txt: String,val modifier: Modifier) {
    CLASE_ROJO(color = Color.Red, txt = "roxo", modifier = Modifier.size(80.dp, 40.dp).offset(x = 30.dp, y = 100.dp)),
    CLASE_VERDE(color = Color.Green, txt = "verde"),
    CLASE_AZUL(color = Color.Blue, txt = "azul"),
    CLASE_AMARILLO(color = Color.Yellow, txt = "melo")
}