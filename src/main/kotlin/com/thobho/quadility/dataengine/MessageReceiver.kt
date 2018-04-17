package com.thobho.quadility.dataengine

import com.thobho.quadility.Measurement
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jms.annotation.JmsListener
import org.springframework.jms.support.converter.MappingJackson2MessageConverter
import org.springframework.stereotype.Component
import javax.jms.Message
import javax.jms.MessageListener

@Component
class MessageReceiver() {

    @JmsListener(destination = "quadility_message")
    fun onMessage(measurement: Measurement) {
        print("recived!")
    }
}

