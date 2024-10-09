package com.example.tipscalc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import com.example.tipscalc.ui.theme.TipsCalcTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            setContentView(R.layout.activity_main)
        }
    }
}

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            TipsCalcTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }
//    }
//}



//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    TipsCalcTheme {
//        Greeting("Android")
//    }
//}