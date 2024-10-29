package com.example.lamierdadelputomvvm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Scaffold
import com.example.lamierdadelputomvvm.UI.UI
import com.example.lamierdadelputomvvm.View.View
import com.example.lamierdadelputomvvm.ui.theme.LaMierdaDelPutoMvvmTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val model = View()
        enableEdgeToEdge()
        setContent {
            LaMierdaDelPutoMvvmTheme {
                Scaffold {innerPadding ->
                    UI(model)
                }
            }
        }
    }
}
