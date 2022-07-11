package com.example.boqueixon

import android.provider.Settings.Global.getString
import kotlin.collections.ArrayList
import kotlin.collections.LinkedHashMap

internal object FestasRelixiosas {
    val data: LinkedHashMap<String, List<String>>
        get() {
            val expandableListDetail =
                LinkedHashMap<String, List<String>>()

            val festasBoqueixon: MutableList<String> =
                ArrayList()
            festasBoqueixon.add("Romaría de San Sebastián do Pico Sacro: o día 20 de xaneiro e o último domingo de maio.")
            festasBoqueixon.add("San Lourenzo: os días 10, 11 e 12 de agosto")

            val festasGranxa: MutableList<String> =
                ArrayList()
            festasGranxa.add("Romaría de San Sebastián do Pico Sacro: o día 20 de xaneiro e o último domingo de maio")
            festasGranxa.add("San Lourenzo: os días 10, 11 e 12 de agosto")


            val festasCodeso: MutableList<String> =
                ArrayList()
            festasCodeso.add("Festa das Flores: 1º ou 2º domingo de maio")
            festasCodeso.add("San Antonio e San Paio: último domingo de xuño")
            festasCodeso.add("Santa Baia, o Carme e o Corpus: 10, 11 e 12 de decembro")

            val festasDonas: MutableList<String> =
                ArrayList()
            festasDonas.add("Santa Rita: 22 de maio.")
            festasDonas.add("San Pedro e o Santísimo: 29 e 30 de xuño")

            val festasSucira: MutableList<String> =
                ArrayList()
            festasSucira.add("Santa Mariña: os días 18, 19 e 20 de xullo")

            val festasGastrar: MutableList<String> =
                ArrayList()
            festasGastrar.add("Santa Mariña: 18 de xullo")
            festasGastrar.add("A Nosa Señora do Socorro: o 2 º domingo de agosto")

            val festasLestedo: MutableList<String> =
                ArrayList()
            festasLestedo.add("Romaría de San Sebastián: o día 20 de xaneiro e o último domingo de maio")
            festasLestedo.add("A Nosa Señora: 15 e 16 de agosto")
            festasLestedo.add("Corpus Christi: domingo seguinte ao día 15 de agosto")
            festasLestedo.add("Virxe de Lourdes: segundo domingo de setembro")

            val festasLamas: MutableList<String> =
                ArrayList()
            festasLamas.add("Santo Cristo e a Candelaria: última fin de semana de abril")
            festasLamas.add("A Nosa Señora: 15, 16 e 17 de agosto")

            val festasLoureda: MutableList<String> =
                ArrayList()
            festasLoureda.add("San Pedro, o Santísimo e o Rosario: 29 e 30 de xuño e 1 de xullo")
            festasLoureda.add("A Nosa Señora do Carme: primeiro domingo de agosto")

            val festasOural: MutableList<String> =
                ArrayList()
            festasOural.add("San Amaro: o día 15 de xaneiro")
            festasOural.add("San Isidro: o domingo seguinte ao 15 de maio")
            festasOural.add("A Nosa Señora: o 15, 16, e 17 de agosto")

            val festasLedesma: MutableList<String> =
                ArrayList()
            festasLedesma.add("San Salvador: 6,7 e 8 de agosto")
            festasLedesma.add("San Ramón: o día 31 de agosto")
            festasLedesma.add("A Nosa Señora do Rosario: o día 7 de outubro")

            val festasPousada: MutableList<String> =
                ArrayList()
            festasPousada.add("A Pascuiña: mes de marzo")
            festasPousada.add("San Lourenzo: 10, 11 e 12 de agosto")

            val festasSergude: MutableList<String> =
                ArrayList()
            festasSergude.add("Festa das Flores: o 20 de maio")
            festasSergude.add("San Antonio e o Santísimo: segunda fin de semana de xuño")
            festasSergude.add("Romaría de San Bieito: segundo domingo de xullo")
            festasSergude.add("San Breixo: primeira fin de semana de outubro")

            val festasVigo: MutableList<String> =
                ArrayList()
            festasVigo.add("San Antonio: o día 13 de xuño")
            festasVigo.add("A Nosa Señora das Dores: terceiro domingo de setembro")
            festasVigo.add("A Nosa Señora da Saeta: cuarto domingo de setembro")
            festasVigo.add("Santa Baia e o Santísimo: 10 e 11 de decembro")

//            expandableListDetail[getString(R.string.xaneiro)] = festasXaneiro
            expandableListDetail["Parroquia de Boqueixón"]= festasBoqueixon
            expandableListDetail["Parroquia da Granxa"] = festasGranxa
            expandableListDetail["Parroquia da Codeso"] = festasCodeso
            expandableListDetail["Parroquia da Donas"] = festasDonas
            expandableListDetail["Parroquia da Sucira"] = festasSucira
            expandableListDetail["Parroquia da Gastrar"] = festasGastrar
            expandableListDetail["Parroquia da Lestedo"] = festasLestedo
            expandableListDetail["Parroquia da Lamas"] = festasLamas
            expandableListDetail["Parroquia da Loureda"] = festasLoureda
            expandableListDetail["Parroquia da Oural"] = festasOural
            expandableListDetail["Parroquia da Ledesma"] = festasLedesma
            expandableListDetail["Parroquia da Pousada"] = festasPousada
            expandableListDetail["Parroquia da Sergude"] = festasSergude
            expandableListDetail["Parroquia da Vigo"] = festasVigo

            return expandableListDetail
        }


}