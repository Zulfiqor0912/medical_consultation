package uz.gita.medicalconsultation.domain.repositories.impl

import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.google.firebase.storage.StorageReference
import com.google.firebase.storage.ktx.storage
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import uz.gita.medicalconsultation.data.model.MedicData
import uz.gita.medicalconsultation.domain.repositories.MedRepository


class MedRepositoryImpl (
    private val fireStore: FirebaseFirestore = Firebase.firestore,
    private val storageReferences: StorageReference = Firebase.storage.reference
) : MedRepository {

    override fun getAllMedic(): Flow<Result<List<MedicData>>> = callbackFlow {
        fireStore.collection("medics")
            .get()
            .addOnSuccessListener {
                val list = arrayListOf<MedicData>()
                it.documents.forEach {
                    it.toObject(MedicData::class.java)?.let { it1 -> list.add(it1) }
                }
                trySend(Result.success(list))
            }
            .addOnFailureListener {
                trySend(Result.failure(it))
            }
        awaitClose()
    }
}