package com.gamestore.domain

import java.util.UUID

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import scala.annotation.meta.field

@Table("games")
case class Game(
    @(Id @field) id: UUID = null,
    title: String,
    price: java.math.BigDecimal
)