package com.gamestore.controller

import com.gamestore.domain.Game
import com.gamestore.repository.GameRepository
import org.springframework.web.bind.annotation.{GetMapping, PostMapping, RequestBody, RequestMapping, RestController}

@RestController
@RequestMapping(Array("/api/games"))
class GameController(repository: GameRepository):

  @GetMapping
  def listAll(): java.util.List[Game] =
    repository.findAll()

  @PostMapping
  def create(@RequestBody game: Game): Game =
    repository.save(game)

