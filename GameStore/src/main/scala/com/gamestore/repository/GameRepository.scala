package com.gamestore.repository

import com.gamestore.domain.Game
import org.springframework.data.repository.ListCrudRepository
import org.springframework.stereotype.Repository

import java.util.UUID

@Repository
trait GameRepository extends ListCrudRepository[Game, UUID]
