package com.dwivedyaakash.applicationtesting

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class QuoteManagerUnitTest {

    @Test
    fun test() {
        val data = "[" +
                "  {" +
                "    \"quote\": \"You miss 100% of the shots you don’t take.\"," +
                "    \"author\": \"Wayne Gretzky\"" +
                "  }," +
                "  {" +
                "    \"quote\": \"We become what we think about.\"," +
                "    \"author\": \"Earl Nightingale\"" +
                "  }" +
                "]"

        val quoteManager = QuoteManager()
        val quoteList = quoteManager.populateQuotes(data)
        val quote = quoteManager.getRandomQuote()
        Assert.assertEquals("You miss 100% of the shots you don’t take.", quote.quote)
    }
}