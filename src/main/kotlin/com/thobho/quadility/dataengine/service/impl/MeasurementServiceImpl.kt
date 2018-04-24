package com.thobho.quadility.dataengine.service.impl

import com.thobho.quadility.commons.business.Measurement
import com.thobho.quadility.dataengine.dataaccess.MeasurementEntity
import com.thobho.quadility.dataengine.service.MeasurementService
import org.jtransforms.fft.FloatFFT_1D
import org.jtransforms.fft.FloatFFT_2D
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.stereotype.Service

@Service
class MeasurementServiceImpl : MeasurementService {
    @Autowired
    private lateinit var mongoTemplate: MongoTemplate

    override fun handleMeasurement(measurement: Measurement) {
        mongoTemplate.save(toMeasurementEntity(measurement), "measurement")
    }

    private fun toMeasurementEntity(measurement: Measurement): MeasurementEntity {
        val size = measurement.x.size

        val transformer = FourierTransformer(size)

        return MeasurementEntity(measurement.startLatt,
                measurement.startLong,
                measurement.startTimestamp,
                measurement.endLatt,
                measurement.endLong,
                measurement.endTimestamp,
                measurement.timestamps,
                measurement.x,
                measurement.y,
                measurement.z,
                transformer.transform(measurement.x),
                transformer.transform(measurement.y),
                transformer.transform(measurement.z))
    }
}

private class FourierTransformer(size: Int) {
    val transformer = FloatFFT_1D(size.toLong())

    fun transform(array: FloatArray): FloatArray {
        val preparedForFft = FloatArray(array.size * 2, { i -> if (i < array.size) array[i] else 0f })
        transformer.complexForward(preparedForFft)
        return preparedForFft
    }
}