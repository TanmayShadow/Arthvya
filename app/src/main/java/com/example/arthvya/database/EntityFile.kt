package com.example.arthvya.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "expense")
data class EntityFile(
    @PrimaryKey(autoGenerate = true) var id:Int,
    var income:Int=0,
    var exp:Int=0,
    var date:String,
    var reason:String,
    var category:String="NA"
)
//id  income  exp date    reason  category