package com.dwivedyaakash.applicationtesting

import com.google.gson.Gson

class QuoteManager {

    var quoteList = emptyArray<Quote>()

    fun populateQuotes(jsonFileName: String) {
        val gson = Gson()
        quoteList = gson.fromJson(jsonFileName, Array<Quote>::class.java)
    }

    fun getRandomQuote(): Quote {
        val randomIndex = (quoteList.indices).random()
        return quoteList[randomIndex]
    }
}