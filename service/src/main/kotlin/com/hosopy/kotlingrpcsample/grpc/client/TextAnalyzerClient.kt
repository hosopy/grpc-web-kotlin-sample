package com.hosopy.kotlingrpcsample.grpc.client

import com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerGrpc
import com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass
import io.grpc.ManagedChannelBuilder
import org.springframework.stereotype.Component

@Component
class TextAnalyzerClient(
    private val configuration: TextAnalyzerClientConfiguration
) {

    fun analyzeText(text: String): TextAnalysisResult {
        // NOTE: usePlaintext only for development/test
        val channel =
            ManagedChannelBuilder.forAddress(
                configuration.host, configuration.portInt
            ).usePlaintext(true).build()
        val blockingStub = TextAnalyzerGrpc.newBlockingStub(channel)
        val requestBuilder = TextAnalyzerOuterClass.TextAnalysisRequest.newBuilder()
        requestBuilder.text = text
        val response = blockingStub.analizeText(requestBuilder.build())
        return TextAnalysisResult(response.length)
    }
}

data class TextAnalysisResult(val length: Int)
