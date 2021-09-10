package com.epicadk.hapiprotoconverter.converter

import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.ExtensionConverter.toProto
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.PeriodConverter.toProto
import com.epicadk.hapiprotoconverter.converter.StringConverter.toHapi
import com.epicadk.hapiprotoconverter.converter.StringConverter.toProto
import com.google.fhir.r4.core.Address
import com.google.fhir.r4.core.AddressTypeCode
import com.google.fhir.r4.core.AddressUseCode
import com.google.fhir.r4.core.String

public object AddressConverter {
  public fun Address.toHapi(): org.hl7.fhir.r4.model.Address {
    val hapiValue = org.hl7.fhir.r4.model.Address()
    if (hasId()) {
      hapiValue.id = id.value
    }
    if (extensionCount > 0) {
      hapiValue.setExtension(extensionList.map { it.toHapi() })
    }
    if (hasUse()) {
      hapiValue.setUse(org.hl7.fhir.r4.model.Address.AddressUse.valueOf(use.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasType()) {
      hapiValue.setType(org.hl7.fhir.r4.model.Address.AddressType.valueOf(type.value.name.hapiCodeCheck().replace("_", "")))
    }
    if (hasText()) {
      hapiValue.setTextElement(text.toHapi())
    }
    if (lineCount > 0) {
      hapiValue.setLine(lineList.map { it.toHapi() })
    }
    if (hasCity()) {
      hapiValue.setCityElement(city.toHapi())
    }
    if (hasDistrict()) {
      hapiValue.setDistrictElement(district.toHapi())
    }
    if (hasState()) {
      hapiValue.setStateElement(state.toHapi())
    }
    if (hasPostalCode()) {
      hapiValue.setPostalCodeElement(postalCode.toHapi())
    }
    if (hasCountry()) {
      hapiValue.setCountryElement(country.toHapi())
    }
    if (hasPeriod()) {
      hapiValue.setPeriod(period.toHapi())
    }
    return hapiValue
  }

  public fun org.hl7.fhir.r4.model.Address.toProto(): Address {
    val protoValue = Address.newBuilder()
    if (hasId()) {
      protoValue.setId(String.newBuilder().setValue(id))
    }
    if (hasExtension()) {
      protoValue.addAllExtension(extension.map { it.toProto() })
    }
    if (hasUse()) {
      protoValue.setUse(Address.UseCode.newBuilder().setValue(AddressUseCode.Value.valueOf(use.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasType()) {
      protoValue.setType(Address.TypeCode.newBuilder().setValue(AddressTypeCode.Value.valueOf(type.toCode().protoCodeCheck().replace("-",
          "_").toUpperCase())).build())
    }
    if (hasText()) {
      protoValue.setText(textElement.toProto())
    }
    if (hasLine()) {
      protoValue.addAllLine(line.map { it.toProto() })
    }
    if (hasCity()) {
      protoValue.setCity(cityElement.toProto())
    }
    if (hasDistrict()) {
      protoValue.setDistrict(districtElement.toProto())
    }
    if (hasState()) {
      protoValue.setState(stateElement.toProto())
    }
    if (hasPostalCode()) {
      protoValue.setPostalCode(postalCodeElement.toProto())
    }
    if (hasCountry()) {
      protoValue.setCountry(countryElement.toProto())
    }
    if (hasPeriod()) {
      protoValue.setPeriod(period.toProto())
    }
    return protoValue.build()
  }
}
