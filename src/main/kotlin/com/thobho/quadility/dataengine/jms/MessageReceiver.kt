package com.thobho.quadility.dataengine.jms

import com.thobho.quadility.dataengine.service.MeasurementService
import com.thobho.quadility.commons.business.Measurement
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jms.annotation.JmsListener
import org.springframework.stereotype.Component

@Component
class MessageReceiver() {

    @Autowired
    lateinit var measurementService: MeasurementService

    @JmsListener(destination = "quadility_message")
    fun onMessage(measurement: Measurement) {
        measurementService.handleMeasurement(measurement)
    }
}

