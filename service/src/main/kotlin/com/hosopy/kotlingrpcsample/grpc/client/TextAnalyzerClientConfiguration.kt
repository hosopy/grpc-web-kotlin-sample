package com.hosopy.kotlingrpcsample.grpc.client

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties(prefix="internal-service.text-analyzer")
class TextAnalyzerClientConfiguration {
    lateinit var host: String
    // NOTE: Cannot use primitive type ...
    lateinit var port: String

    val portInt: Int
      get() = Integer.parseInt(port)
}
