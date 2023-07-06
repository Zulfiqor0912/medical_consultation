package uz.gita.medicalconsultation.domain.usecase

import kotlinx.coroutines.flow.Flow
import uz.gita.medicalconsultation.data.model.MedicData

interface MedUseCase {
    fun getAllMedics(): Flow<Result<List<MedicData>>>

}