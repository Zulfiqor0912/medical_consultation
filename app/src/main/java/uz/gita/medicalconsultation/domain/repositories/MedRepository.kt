package uz.gita.medicalconsultation.domain.repositories

import kotlinx.coroutines.flow.Flow
import uz.gita.medicalconsultation.data.model.MedicData

interface MedRepository {
    fun getAllMedic(): Flow<Result<List<MedicData>>>

}