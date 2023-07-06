package uz.gita.medicalconsultation.data.source.local.room.entities

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity("users")
data class UserEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val userName: String,
    val password: String
)