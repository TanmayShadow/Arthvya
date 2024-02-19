package com.example.arthvya

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.example.arthvya.database.EntityDatabase
import com.example.arthvya.database.EntityFile
import com.example.arthvya.ui.theme.ArthvyaTheme
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

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
                    MyInput(context= LocalContext.current)
                }

            }
        }
    }
}


//@Composable
//fun Welcome() {
//    Text(text = "Welcome To Android Sprint")
//}

//@Composable
//fun MyImg()
//{
//    Image(painter = painterResource(id = R.drawable.money), contentDescription = "")
//}

//@Preview(showSystemUi = true)
//@Composable
//fun Text()
//{
//    Column(
//        modifier = Modifier.fillMaxHeight(),
//        verticalArrangement = Arrangement.SpaceEvenly
//    ) {
//        Welcome()
//        MyImg()
//    }
//}

@Composable
fun MyInput(context: Context)
{
    val context = LocalContext.current
    var database: EntityDatabase = EntityDatabase.getDatabase(context)
    var expense by remember {
        mutableStateOf("")
    }
    var date by remember {
        mutableStateOf("")
    }
    var reason by remember {
        mutableStateOf("")
    }
    var cetegory by remember {
        mutableStateOf("")
    }
    TextField(value = expense, onValueChange = { expense = it },label={
        Text(
            text = "Expense",
            modifier = Modifier,
            color = Color.Black,
            onTextLayout = { result ->
                // Your onTextLayout logic here
            }
            // Provide other required arguments as needed
        )
    })

    TextField(value = date, onValueChange = { date = it },label={
        Text(
            text = "Your text here",
            modifier = Modifier,
            color = Color.Black,
            onTextLayout = { result ->
                // Your onTextLayout logic here
            }
            // Provide other required arguments as needed
        )
    })

    TextField(value = reason, onValueChange = { reason = it },label={
        Text(
            text = "Your text here",
            modifier = Modifier,
            color = Color.Black,
            onTextLayout = { result ->
                // Your onTextLayout logic here
            }
            // Provide other required arguments as needed
        )

    })

    TextField(value = cetegory, onValueChange = { cetegory = it },label={
        Text(
            text = "Your text here",
            modifier = Modifier,
            color = Color.Black,
            onTextLayout = { result ->
                // Your onTextLayout logic here
            }
            // Provide other required arguments as needed
        )
    })

    Button(onClick = {
        GlobalScope.launch {
            database.noteDao().insertData(EntityFile(0,0,expense.toInt(),date,reason, category = cetegory))
        }
        Toast.makeText(context,"Data inserted successfully",Toast.LENGTH_LONG).show()
    }) {
        Text(
            text = "Submit",
            modifier = Modifier,
            color = Color.Black,
            onTextLayout = { result ->
                // Your onTextLayout logic here
            }
            // Provide other required arguments as needed
        )
    }
}
