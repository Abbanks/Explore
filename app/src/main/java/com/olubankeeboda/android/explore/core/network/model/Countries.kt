package com.olubankeeboda.android.explore.core.network.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CountriesContainer(
    val countries: List<Countries>
)

@Serializable
data class Countries(
    val name: CountryName,
    val currencies: HashMap<String, CountryCurrency>,
    @SerialName("idd") val callingCode: CountryCallingCode,
    val capital: ArrayList<String>,
    val region: String,
    val languages: HashMap<String, String>,
    val area: Double,
    val maps: CountryMap,
    val population: Int,
    val car: CountryDrivingSide,
    val timezones: ArrayList<String>,
    val flags: CountryFlags,
    val coatOfArms: CountryCoatOfArms

)

@Serializable
data class CountryName(
    val common: String
)

@Serializable
data class CountryCurrency(
    val name: String
)

@Serializable
data class CountryCallingCode(
    val root: String,
    val suffixes: List<String>
)

@Serializable
data class CountryMap(
    val googleMaps: String
)

@Serializable
data class CountryDrivingSide(
    val side: String
)

@Serializable
data class CountryFlags(
    val png: String
)

@Serializable
data class CountryCoatOfArms(
    val png: String
)
