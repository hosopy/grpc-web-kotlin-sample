package com.hosopy.kotlingrpcsample.grpc.service

import com.hosopy.kotlingrpcsample.greeter.proto.GreeterGrpc
import com.hosopy.kotlingrpcsample.greeter.proto.GreeterOuterClass
import com.hosopy.kotlingrpcsample.grpc.client.TextAnalyzerClient
import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService

@GRpcService
class GreeterService(
    private val textAnalyzerClient: TextAnalyzerClient
): GreeterGrpc.GreeterImplBase() {
    override fun sayHello(
        request: GreeterOuterClass.HelloRequest,
        responseObserver: StreamObserver<GreeterOuterClass.HelloReply>
    ) {
        val replyBuilder = GreeterOuterClass.HelloReply.newBuilder()
        replyBuilder.message = "Hello " + request.name
        replyBuilder.nameLength = textAnalyzerClient.analyzeText(request.name).length
        responseObserver.onNext(replyBuilder.build())
        responseObserver.onCompleted()
    }
}
