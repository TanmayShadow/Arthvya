//package com.example.arthvya.components
//
//import android.content.Context
//import androidx.compose.foundation.layout.Column
//import androidx.compose.material3.Button
//import androidx.compose.material3.Text
//import androidx.compose.material3.TextField
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.getValue
//import androidx.compose.runtime.mutableStateOf
//import androidx.compose.runtime.remember
//import androidx.compose.runtime.setValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.tooling.preview.Preview
//import com.example.arthvya.database.EntityDatabase
//
////@Preview(showSystemUi = true)
//@Composable
//fun UserInput(context: Context)
//{
//    var database:EntityDatabase = EntityDatabase.getDatabase(context)
//    var expense by remember {
//        mutableStateOf("")
//    }
//    var date by remember {
//        mutableStateOf("")
//    }
//    var reason by remember {
//        mutableStateOf("")
//    }
//    var cetegory by remember {
//    mutableStateOf("")
//}
//    Column(horizontalAlignment = Alignment.CenterHorizontally) {
//        TextField(value = expense, onValueChange = { expense = it },label={
//            Text(text = "Expense")
//        })
//
//        TextField(value = expense, onValueChange = { expense = it },label={
//            Text("date")
//        })
//
//        TextField(value = expense, onValueChange = { expense = it },label={
//            Text("reason")
//        })
//
//        TextField(value = expense, onValueChange = { expense = it },label={
//            Text("category")
//        })
//
//        Button(onClick = {}) {
//            Text(text = "Save Data")
//        }
//
//    }
//}