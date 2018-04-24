package com.thobho.quadility.dataengine.configuration

import org.apache.activemq.ActiveMQConnectionFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.jms.annotation.EnableJms
import org.springframework.jms.connection.CachingConnectionFactory
import org.springframework.jms.support.converter.MappingJackson2MessageConverter
import org.springframework.jms.support.converter.MessageConverter
import org.springframework.jms.support.converter.MessageType


@EnableJms
@Configuration
open class Configuration {

    @Bean
    open fun amqConnectionFactory(): ActiveMQConnectionFactory {
        val activeMQConnectionFactory = ActiveMQConnectionFactory()
        activeMQConnectionFactory.brokerURL = "tcp://localhost:61616"
        return activeMQConnectionFactory
    }

    @Bean(name = ["connectionFactoryBean"])
    @Primary
    open fun connectionFactory(activeMQConnectionFactory: ActiveMQConnectionFactory): CachingConnectionFactory {
        return CachingConnectionFactory(activeMQConnectionFactory)
    }

    @Bean
    open fun messageConverter(): MessageConverter {
        val mapper = MappingJackson2MessageConverter()
        mapper.setTargetType(MessageType.TEXT)
        mapper.setTypeIdPropertyName("Measurement")
        return mapper
    }
}


