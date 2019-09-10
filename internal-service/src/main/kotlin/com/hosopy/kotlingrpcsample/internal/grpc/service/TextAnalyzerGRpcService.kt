package com.hosopy.kotlingrpcsample.internal.grpc.service

import com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerGrpc
import com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerProtobuf
import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService

@GRpcService
class TextAnalyzerGRpcService: TextAnalyzerGrpc.TextAnalyzerImplBase() {
    override fun analizeText(
        request: TextAnalyzerProtobuf.TextAnalysisRequest,
        responseObserver: StreamObserver<TextAnalyzerProtobuf.TextAnalysisResult>
    ) {
        val resultBuilder = TextAnalyzerProtobuf.TextAnalysisResult.newBuilder().setLength(request.getText().length)
        responseObserver.onNext(resultBuilder.build())
        responseObserver.onCompleted()
    }
}
