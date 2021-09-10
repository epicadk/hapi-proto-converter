package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.CodeableConceptConverter.toProto
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.RangeConverter.toProto
import com.google.fhir.r4.core.Population
import com.google.fhir.r4.core.String
import java.lang.IllegalArgumentException
import org.hl7.fhir.r4.model.CodeableConcept
import org.hl7.fhir.r4.model.Range
import org.hl7.fhir.r4.model.Type

public object PopulationConverter {
  private fun Population.AgeX.populationAgeToHapi(): Type {
    if (hasRange()) {
      return (this.getRange()).toHapi()
    }
    if (hasCodeableConcept()) {
      return (this.getCodeableConcept()).toHapi()
    }
    throw IllegalArgumentException("Invalid Type for Population.age[x]")
  }

  private fun Type.populationAgeToProto(): Population.AgeX {
    val protoValue = Population.AgeX.newBuilder()
    if (this is Range) {
      protoValue.setRange(this.toProto())
    }
    if (this is CodeableConcept) {
      protoValue.setCodeableConcept(this.toProto())
    }
    return protoValue.build()
  }

  public fun Population.toHapi(): org.hl7.fhir.r4.model.Population {
    val hapiValue = org.hl7.fhir.r4.model.Population()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (modifierExtensionCount > 0) {
      hapiValue.setModifierExtension(modifierExtensionList.map { it.toHapi() })
    }
    if (hasAge()) {
      hapiValue.setAge(age.populationAgeToHapi())
    }
    if (hasGender()) {
      hapiValue.setGender(gender.toHapi())
    }
    if (hasRace()) {
      hapiValue.setRace(race.toHapi())
    }
    if (hasPhysiologicalCondition()) {
      hapiValue.setPhysiologicalCondition(physiologicalCondition.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Population.toProto(): Population {
    val protoValue = Population.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasModifierExtension()) {
      protoValue.addAllModifierExtension(modifierExtension.map { it.toProto() })
    }
    if (hasAge()) {
      protoValue.setAge(age.populationAgeToProto())
    }
    if (hasGender()) {
      protoValue.setGender(gender.toProto())
    }
    if (hasRace()) {
      protoValue.setRace(race.toProto())
    }
    if (hasPhysiologicalCondition()) {
      protoValue.setPhysiologicalCondition(physiologicalCondition.toProto())
    }
    return protoValue.build()
  }
}
