package com.thobho.quadility.dataengine.dataaccess

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.sql.Timestamp
import java.util.*

@Document(collection = "measurement_transformed")
class MeasurementEntity(val startLat: Double,
                        val startLng: Double,
                        val startTimestamp: Long,
                        val endLat: Double,
                        val endLng: Double,
                        val endTimestamp: Long,
                        val timestamps: LongArray,
                        val x: FloatArray,
                        val y: FloatArray,
                        val z: FloatArray,
                        val fftx: FloatArray,
                        val ffty: FloatArray,
                        val fftz: FloatArray) {

    @Id
    lateinit var id: String

}