package com.example.webtestclientpoc.connectors
import com.example.webtestclientpoc.GlobalValues
import org.json.JSONObject
import reactor.core.publisher.Mono


class ActuatorConnector : BaseConnector(GlobalValues.BASE_URL) {
    private val url = GlobalValues.BASE_URL + "actuator"

    fun getActuator(): Mono<JSONObject> {
        return webClient.get()
            .uri(url)
            .retrieve()
            .bodyToMono(String::class.java) // Assuming the response is a JSON string
            .map { JSONObject(it) } // Convert the string to JSONObject
    }


}


