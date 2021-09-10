package com.epicadk.hapiprotoconverter.converter

internal fun String.hapiCodeCheck(): String {
  return if (equals("INVALID_UNINITIALIZED", true) ||
      equals("UNRECOGNIZED", true) ||
      isNullOrBlank()
  )
    "NULL"
  else this
}

internal fun String?.protoCodeCheck(): String {
  return if (isNullOrBlank()) "INVALID_UNINITIALIZED"
  else if (equals("NULL", true)) "UNRECOGNIZED" else this
}
