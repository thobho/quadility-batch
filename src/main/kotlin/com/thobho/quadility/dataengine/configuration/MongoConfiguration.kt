package com.thobho.quadility.dataengine.configuration


import com.mongodb.MongoClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.core.MongoTemplate


@Configuration
class MongoConfiguration {

    @Bean
    fun mongoClient(): MongoClient {
        return MongoClient()
    }

    @Bean
    fun mongoTemplate(mongoClient: MongoClient): MongoTemplate {
        return MongoTemplate(mongoClient, "quadility")
    }
}