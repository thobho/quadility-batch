package com.thobho.quadility.dataengine

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.mongodb.core.ReactiveMongoTemplate

@ComponentScan(basePackages = arrayOf(
        "com.thobho.quadility.dataengine.configuration",
        "com.thobho.quadility.dataengine.jms",
        "com.thobho.quadility.dataengine.service"))
@SpringBootApplication
open class DataEngineApplication

fun main(args: Array<String>) {
    runApplication<DataEngineApplication>(*args)
}