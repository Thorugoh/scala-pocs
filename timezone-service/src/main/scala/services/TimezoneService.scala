package services

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.HttpRequest
import akka.util.ByteString
import spray.json.{DefaultJsonProtocol, RootJsonFormat}
import models.*
import spray.json._
import scala.concurrent.{ExecutionContext, Future}



object TimezoneJsonProtocol extends DefaultJsonProtocol {
  implicit val tzFormat: RootJsonFormat[TimezoneDBResponse] = jsonFormat4(TimezoneDBResponse.apply)
}

class TimezoneService(apiKey: String)(implicit system: ActorSystem, ec: ExecutionContext) {
  import TimezoneJsonProtocol._

  def getByLatLon(lat: Double, lon: Double): Future[Timezone] = {
    val url = s"http://api.timezonedb.com/v2.1/get-time-zone?key=$apiKey&format=json&by=position&lat=$lat&lng=$lon"

    Http().singleRequest(HttpRequest(uri = url)).flatMap { res =>
      res.entity.dataBytes.runFold(ByteString(""))(_ ++ _).map { body =>
        val json = body.utf8String.parseJson.convertTo[TimezoneDBResponse]
        Timezone(
          location = json.zoneName,
          timezone = json.abbreviation,
          utc_offset = json.gmtOffset.toString,
          currentTime = json.formatted
        )
      }
    }
  }
}
