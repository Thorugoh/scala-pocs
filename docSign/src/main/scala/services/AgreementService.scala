package org.thorugoh.docsign
package services

import scala.collection.mutable
import models.Agreement

import java.util.UUID

object AgreementService {
  private val agreements = mutable.Map.empty[UUID, Agreement]

  def create(agreement: Agreement): Agreement  = {
    agreements.put(agreement.id, agreement)
    agreement
  }
  
}

