package com.example.android_app01

import android.os.Bundle
import android.widget.GridLayout
import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.*
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class DemoActtivity2_nostatic : ComponentActivity() {

}

@Preview(showBackground = true)
@Composable
fun EchoText(){

    var displayedText = remember {
        mutableStateOf("")
    }

    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        if (displayedText.value.isNotEmpty()){
            Text(text = "Hai " + displayedText.value)
        }
        Spacer(modifier = Modifier.height((24.dp)))
        OutlinedTextField(
            value = displayedText.value,
            onValueChange = {displayedText.value = it})
    }
}
