package com.example.lamierdadelputomvvm.UI

import android.util.Log
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lamierdadelputomvvm.Data.Colores
import com.example.lamierdadelputomvvm.Data.Data.num
import com.example.lamierdadelputomvvm.View.View

@Composable
fun UI(model: View) {
    Boton(Colores.CLASE_AZUL,model)
    Boton2(Colores.CLASE_AZUL,model)
}

@Composable
fun Boton(enum_color: Colores,model: View) {

    val TAG_LOG: String = "miDebug"

    Button(
        colors =  ButtonDefaults.buttonColors(enum_color.color),
        onClick = {
            model.crearRandom()
            Log.d(TAG_LOG, "Dentro del onClick"
            )

        },
        modifier = Modifier
            .size((80).dp, (40).dp)
            .offset(x = 30.dp, y = 100.dp)
    ) {
        // utilizamos el texto del enum
        Text(text = enum_color.txt, fontSize = 20.sp)
    }
}

@Composable
fun Boton2(enum_color: Colores, model: View) {

    var numV by remember {mutableStateOf(model.getNumero().toString())}
    val TAG_LOG: String = "miDebug"

    Button(
        colors =  ButtonDefaults.buttonColors(enum_color.color),
        onClick = {
            Log.d(TAG_LOG, "Dentro del onClick"
            )

            numV = model.getNumero().toString()
        },
        modifier = Modifier
            .size((80).dp, (40).dp)
            .offset(x = 130.dp, y = 100.dp)
    ) {
        // utilizamos el texto del enum
        Text(text = numV, fontSize = 20.sp)
    }
}