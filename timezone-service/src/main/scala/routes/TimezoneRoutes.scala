package routes

import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport.*
import akka.http.scaladsl.server.Directives.*
import akka.http.scaladsl.server.Route
import models.Timezone
import models.TimezoneJsonProtocol.*
import services.TimezoneService

class TimezoneRoutes(service: TimezoneService) {
  val route: Route = {
    path("timezone") {
      parameters("lat".as[Double], "lon".as[Double]) { (lat, lon) =>
        get {
          complete {
            service.getByLatLon(lat, lon)
          }
        }
      }
    }
  }
}
