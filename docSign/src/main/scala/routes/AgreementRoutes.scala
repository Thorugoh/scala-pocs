package org.thorugoh.docsign
package routes

import akka.http.scaladsl.server.Directives.*
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport.*
import models.{Agreement, AgreementPayload, AgreementJsonProtocol}
import services.AgreementService

import java.util.UUID

object AgreementRoutes {
  import AgreementJsonProtocol._

  val route: Route = {
    path("agreement") {
      post {
        entity(as[AgreementPayload]) { payload =>
          val agreement = Agreement(
            id = UUID.randomUUID(),
            title = payload.title,
            version = s"v1",
            content = payload.content,
            hash = ""
          )

          AgreementService.create(agreement)
          complete(agreement)
        }
      }
    }
  }
}
