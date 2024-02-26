package com.example.webtestclientpoc.connectors

import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono

abstract class BaseConnector(baseUrl: String) {
    protected val webClient: WebClient = WebClient.builder()
        .baseUrl(baseUrl)
        .defaultHeader("Content-Type", "application/json")
//        .defaultHeader("Authorization", "Bearer ${getOktaToken()}")
        .build()

    private fun getOktaToken(): String {
        // Implement the logic to obtain the Okta2 authentication token.
        // Make sure this method returns a valid and current token.
        return "your_actual_token_here"
    }

    // Implement your HTTP methods (GET, POST, etc.) here
}


