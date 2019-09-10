package com.hosopy.kotlingrpcsample.internal.grpc.service.interceptor

import io.grpc.Metadata
import io.grpc.ServerCall
import io.grpc.ServerCallHandler
import io.grpc.ServerInterceptor
import org.lognet.springboot.grpc.GRpcGlobalInterceptor
import org.slf4j.LoggerFactory

@GRpcGlobalInterceptor
class LogInterceptor: ServerInterceptor {
    companion object {
        private val logger = LoggerFactory.getLogger(LogInterceptor::class.java)
    }

    override fun <ReqT : Any, RespT : Any> interceptCall(
        call: ServerCall<ReqT, RespT>,
        headers: Metadata,
        next: ServerCallHandler<ReqT, RespT>
    ): ServerCall.Listener<ReqT> {
        logger.info(call.methodDescriptor.fullMethodName)
        return next.startCall(call, headers)
    }
}
