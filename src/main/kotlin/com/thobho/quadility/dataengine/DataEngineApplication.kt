package com.thobho.quadility.dataengine

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class DataEngineApplication

fun main(args: Array<String>) {
    runApplication<DataEngineApplication>(*args)
}
