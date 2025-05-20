package org.thorugoh.docsign

import akka.actor.typed.ActorSystem
import akka.actor.typed.scaladsl.Behaviors
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.*
import akka.http.scaladsl.server.Directives.*
import org.thorugoh.docsign.routes.AgreementRoutes

import scala.io.StdIn

object HttpServerRoutingMinimal {

  def main(args: Array[String]): Unit = {
    implicit val system = ActorSystem(Behaviors.empty, "DocSign-Server")
    implicit val executionContext = system.executionContext

    val bindingFuture = Http().newServerAt("localhost", 8080).bind(AgreementRoutes.route)

    println(s"Server running at http://localhost:8080/hello")
    StdIn.readLine() // let it run until user presses return
    bindingFuture
      .flatMap(_.unbind()) // trigger unbinding from the port
      .onComplete(_ => system.terminate()) // and shutdown when done
  }
}