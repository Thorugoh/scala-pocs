import akka.actor.typed.scaladsl.Behaviors
import akka.actor.typed.ActorSystem
import akka.http.scaladsl.Http
import routes.TimezoneRoutes
import akka.http.scaladsl.server.Directives.*
import services.TimezoneService

import scala.io.StdIn

object Main {
  def main(args: Array[String]): Unit = {
    val typedSystem = ActorSystem(Behaviors.empty, "Timezone-Service")
    implicit val system: akka.actor.ActorSystem = typedSystem.classicSystem
    implicit val ec = system.dispatcher

    val apiKey = ""
    val service = TimezoneService(apiKey)
    val routes = TimezoneRoutes(service)
    
    val bindingFuture = Http().newServerAt("localhost", 8080).bind(routes.route)

    println(s"Server running at http://localhost:8080")
    StdIn.readLine()
    bindingFuture
      .flatMap(_.unbind())
      .onComplete(_ => system.terminate())
  }
}
