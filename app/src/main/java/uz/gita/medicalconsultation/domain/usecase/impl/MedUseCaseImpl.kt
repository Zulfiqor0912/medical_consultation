package uz.gita.medicalconsultation.domain.usecase.impl

import kotlinx.coroutines.flow.Flow
import uz.gita.medicalconsultation.data.model.MedicData
import uz.gita.medicalconsultation.domain.repositories.MedRepository
import uz.gita.medicalconsultation.domain.usecase.MedUseCase
import javax.inject.Inject

class MedUseCaseImpl @Inject constructor(
    private val medRepository: MedRepository
):MedUseCase {
    override fun getAllMedics(): Flow<Result<List<MedicData>>>  = medRepository.getAllMedic()

}