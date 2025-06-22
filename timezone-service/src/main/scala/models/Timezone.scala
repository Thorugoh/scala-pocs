package models

import spray.json.RootJsonFormat
import spray.json.DefaultJsonProtocol.*

case class Timezone(location: String, timezone: String, utc_offset: String, currentTime: String)

object TimezoneJsonProtocol {
  implicit val timezonePayloadFormat: RootJsonFormat[Timezone] = jsonFormat4(Timezone.apply)
}
