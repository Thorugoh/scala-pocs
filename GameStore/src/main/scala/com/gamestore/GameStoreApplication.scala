package com.gamestore

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication



@SpringBootApplication
class GameStoreApplication

object GameStoreApplication
def main(args: Array[String]): Unit =
    SpringApplication.run(classOf[GameStoreApplication], args*)