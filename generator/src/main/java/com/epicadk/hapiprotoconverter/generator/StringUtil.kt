package com.epicadk.hapiprotoconverter.generator

import com.google.common.base.Ascii
import java.util.regex.Matcher
import java.util.regex.Pattern

private val RESERVED_FIELD_NAME_KOTLIN = listOf("when", "for")
private val ACRONYM_PATTERN: Pattern = Pattern.compile("([A-Z])([A-Z]+)(?![a-z])")

/**
 * if String is a kotlin keyword wraps the string in `
 *
 * for example if the string value is when it will return `when`
 */
internal fun String.checkForKotlinKeyWord(): String {
    if (lowerCaseFirst() in RESERVED_FIELD_NAME_KOTLIN) {
        return "`$this`"
    }
    return this
}

/**
 * returns string with the first character in lowercase
 *
 * for example, if the string is Proto it will return proto
 */
internal fun CharSequence.lowerCaseFirst() =
    (if (this[0].isUpperCase()) this[0] + 32 else this[0]).toChar().toString() + this.drop(1)

/**
 * returns string with the first character in uppercase
 *
 * for example, if the string is proto it will return Proto
 */
internal fun CharSequence.capitalizeFirst() =
    (if (this[0].isLowerCase()) this[0] - 32 else this[0]).toChar().toString() + this.drop(1)

/**
 * returns title case notation of a string in camelCase
 *
 * For example ProtoFHIR will return ProtoFhir
 */
internal fun String.resolveAcronyms(): String {

    val matcher: Matcher = ACRONYM_PATTERN.matcher(this)
    val sb = StringBuffer()
    while (matcher.find()) {
        matcher.appendReplacement(sb, matcher.group(1)!! + Ascii.toLowerCase(matcher.group(2)!!))
    }
    matcher.appendTail(sb)
    return sb.toString()
}
