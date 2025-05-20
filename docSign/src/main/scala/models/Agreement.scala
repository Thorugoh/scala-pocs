package org.thorugoh.docsign
package models

import spray.json.DefaultJsonProtocol.*
import spray.json.{JsString, JsValue, RootJsonFormat, deserializationError}

import java.util.UUID

case class Agreement(id: UUID, title: String, version: String, content: String, hash: String)

case class AgreementPayload(title: String, content: String)

object AgreementJsonProtocol {
  implicit val uuidFormat: RootJsonFormat[UUID] = new RootJsonFormat[UUID] {
    def write(x: UUID): JsValue = JsString(x.toString)

    def read(value: JsValue): UUID = value match {
      case JsString(x) => UUID.fromString(x)
      case _ => deserializationError("Expected UUID as JsString")
    }
  }
  
  implicit val agreementPayloadFormat: RootJsonFormat[AgreementPayload] = jsonFormat2(AgreementPayload.apply)
  implicit val agreementFormat: RootJsonFormat[Agreement] = jsonFormat5(Agreement.apply)
}