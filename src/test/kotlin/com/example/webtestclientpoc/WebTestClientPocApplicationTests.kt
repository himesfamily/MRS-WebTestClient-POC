package com.example.webtestclientpoc

import com.example.webtestclientpoc.connectors.ActuatorConnector
import org.junit.jupiter.api.Test
import reactor.test.StepVerifier


class WebTestClientPocApplicationTests {
    private val actuator = ActuatorConnector()

    @Test
    fun contextLoads() {
        val monoResult = actuator.getActuator()

        StepVerifier.create(monoResult)
            .expectNextMatches { jsonObject ->
                jsonObject.toString().contains("_links") // Adjust based on your actual JSON response structure
            }
            .verifyComplete()
    }
}



