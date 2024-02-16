package com.example.arthvya

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.arthvya.ui.theme.ArthvyaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArthvyaTheme {
                Column(
                    modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceEvenly
                ) {
//                    Welcome()
//                    MyImg()
                    MyInput()
                }

            }
        }
    }
}


@Composable
fun Welcome() {
    Text(text = "Welcome To Android Sprint")
}

@Composable
fun MyImg()
{
    Image(painter = painterResource(id = R.drawable.money), contentDescription = "")
}

@Preview(showSystemUi = true)
@Composable
fun Text()
{
    Column(
        modifier = Modifier.fillMaxHeight(),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Welcome()
        MyImg()
    }
}

@Composable
fun MyInput()
{
    val context = LocalContext.current
    var input by remember{
        mutableStateOf("")
    }
//    TextField(value = input, onValueChange = {value->})
//    TextField(value = input, onValueChange = {input.value=})
    TextField(value = input, onValueChange = {value->input=value})
    Button(onClick = { Toast.makeText(context,"$input", Toast.LENGTH_SHORT).show()}) {
        Text("Click here")
    }
}
