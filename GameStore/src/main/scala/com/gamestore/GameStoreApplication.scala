package com.gamestore

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean



@SpringBootApplication
class GameStoreApplication

object GameStoreApplication:
    def main(args: Array[String]): Unit =
        SpringApplication.run(classOf[GameStoreApplication], args*)

    @Bean
    def objectMapper(): ObjectMapper =
        val mapper = ObjectMapper()
        mapper.registerModule(DefaultScalaModule)
        mapper