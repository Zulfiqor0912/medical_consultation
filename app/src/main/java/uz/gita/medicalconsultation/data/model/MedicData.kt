package uz.gita.medicalconsultation.data.model

data class MedicData(
    val id: Int = 0,
    val firstName: String,
    val lastName: String,
    val specialty: String,
    val imageUrl: String
)