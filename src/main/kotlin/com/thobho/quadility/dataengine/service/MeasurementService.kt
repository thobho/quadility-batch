package com.thobho.quadility.dataengine.service

import com.thobho.quadility.commons.business.Measurement


interface MeasurementService {

    fun handleMeasurement(measurement: Measurement)

}