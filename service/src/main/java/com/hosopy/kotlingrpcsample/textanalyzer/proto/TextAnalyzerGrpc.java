package com.hosopy.kotlingrpcsample.textanalyzer.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: TextAnalyzer.proto")
public final class TextAnalyzerGrpc {

  private TextAnalyzerGrpc() {}

  public static final String SERVICE_NAME = "TextAnalyzer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisRequest,
      com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisResult> getAnalizeTextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AnalizeText",
      requestType = com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisRequest.class,
      responseType = com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisRequest,
      com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisResult> getAnalizeTextMethod() {
    io.grpc.MethodDescriptor<com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisRequest, com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisResult> getAnalizeTextMethod;
    if ((getAnalizeTextMethod = TextAnalyzerGrpc.getAnalizeTextMethod) == null) {
      synchronized (TextAnalyzerGrpc.class) {
        if ((getAnalizeTextMethod = TextAnalyzerGrpc.getAnalizeTextMethod) == null) {
          TextAnalyzerGrpc.getAnalizeTextMethod = getAnalizeTextMethod = 
              io.grpc.MethodDescriptor.<com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisRequest, com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "TextAnalyzer", "AnalizeText"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisResult.getDefaultInstance()))
                  .setSchemaDescriptor(new TextAnalyzerMethodDescriptorSupplier("AnalizeText"))
                  .build();
          }
        }
     }
     return getAnalizeTextMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TextAnalyzerStub newStub(io.grpc.Channel channel) {
    return new TextAnalyzerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TextAnalyzerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TextAnalyzerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TextAnalyzerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TextAnalyzerFutureStub(channel);
  }

  /**
   */
  public static abstract class TextAnalyzerImplBase implements io.grpc.BindableService {

    /**
     */
    public void analizeText(com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisRequest request,
        io.grpc.stub.StreamObserver<com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisResult> responseObserver) {
      asyncUnimplementedUnaryCall(getAnalizeTextMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAnalizeTextMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisRequest,
                com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisResult>(
                  this, METHODID_ANALIZE_TEXT)))
          .build();
    }
  }

  /**
   */
  public static final class TextAnalyzerStub extends io.grpc.stub.AbstractStub<TextAnalyzerStub> {
    private TextAnalyzerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TextAnalyzerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextAnalyzerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TextAnalyzerStub(channel, callOptions);
    }

    /**
     */
    public void analizeText(com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisRequest request,
        io.grpc.stub.StreamObserver<com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAnalizeTextMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TextAnalyzerBlockingStub extends io.grpc.stub.AbstractStub<TextAnalyzerBlockingStub> {
    private TextAnalyzerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TextAnalyzerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextAnalyzerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TextAnalyzerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisResult analizeText(com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisRequest request) {
      return blockingUnaryCall(
          getChannel(), getAnalizeTextMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TextAnalyzerFutureStub extends io.grpc.stub.AbstractStub<TextAnalyzerFutureStub> {
    private TextAnalyzerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TextAnalyzerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TextAnalyzerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TextAnalyzerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisResult> analizeText(
        com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAnalizeTextMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ANALIZE_TEXT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TextAnalyzerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TextAnalyzerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ANALIZE_TEXT:
          serviceImpl.analizeText((com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisRequest) request,
              (io.grpc.stub.StreamObserver<com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.TextAnalysisResult>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TextAnalyzerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TextAnalyzerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.hosopy.kotlingrpcsample.textanalyzer.proto.TextAnalyzerOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TextAnalyzer");
    }
  }

  private static final class TextAnalyzerFileDescriptorSupplier
      extends TextAnalyzerBaseDescriptorSupplier {
    TextAnalyzerFileDescriptorSupplier() {}
  }

  private static final class TextAnalyzerMethodDescriptorSupplier
      extends TextAnalyzerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TextAnalyzerMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TextAnalyzerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TextAnalyzerFileDescriptorSupplier())
              .addMethod(getAnalizeTextMethod())
              .build();
        }
      }
    }
    return result;
  }
}
