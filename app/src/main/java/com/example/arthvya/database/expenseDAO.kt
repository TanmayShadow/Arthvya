package com.example.arthvya.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface expenseDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertData(entityData:EntityFile)

    @Delete
    suspend fun deleteData(entityData: EntityFile)

    @Query("select * from expense")
    fun getAllData(): Flow<List<EntityFile>>

}