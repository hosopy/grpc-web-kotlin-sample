package com.hosopy.kotlingrpcsample.grpc.service

import com.hosopy.kotlingrpcsample.greeter.proto.GreeterGrpc
import com.hosopy.kotlingrpcsample.greeter.proto.GreeterProtobuf
import com.hosopy.kotlingrpcsample.grpc.client.TextAnalyzerClient
import io.grpc.stub.StreamObserver
import org.lognet.springboot.grpc.GRpcService

@GRpcService
class GreeterGRpcService(
    private val textAnalyzerClient: TextAnalyzerClient
): GreeterGrpc.GreeterImplBase() {
    override fun sayHello(
        request: GreeterProtobuf.HelloRequest,
        responseObserver: StreamObserver<GreeterProtobuf.HelloReply>
    ) {
        val replyBuilder = GreeterProtobuf.HelloReply.newBuilder()
        replyBuilder.message = "Hello " + request.name
        replyBuilder.nameLength = textAnalyzerClient.analyzeText(request.name).length
        responseObserver.onNext(replyBuilder.build())
        responseObserver.onCompleted()
    }
}
