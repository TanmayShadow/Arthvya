package com.example.arthvya.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [EntityFile::class],
    version = 1
)
abstract class EntityDatabase : RoomDatabase()
{
    abstract fun noteDao():expenseDAO

    companion object {
        @Volatile
        private var INSTANCE: EntityDatabase? = null

        fun getDatabase(context: Context): EntityDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    EntityDatabase::class.java,
                    "arthvyaDB"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}