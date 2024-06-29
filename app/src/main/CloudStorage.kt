package com.example.healthmonitor

import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.coroutines.tasks.await

class CloudStorage(private val db: FirebaseFirestore) {
    suspend fun saveHealthData(data: HealthData) {
        db.collection("health_data").add(data).await()
    }

    suspend fun getHealthData(): List<HealthData> {
        return db.collection("health_data").get().await().toObjects(HealthData::class.java)
    }
}
