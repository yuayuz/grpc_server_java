package grpc.service;

import grpc.GreeterGrpc;
import grpc.Hello;
import io.grpc.stub.StreamObserver;

public class service extends GreeterGrpc.GreeterImplBase {
    @Override
    public void sayHello(Hello.HelloRequest request, StreamObserver<Hello.HelloReply> responseObserver) {
        String name=request.getName();
        Hello.HelloReply reply = Hello.HelloReply.newBuilder().setMessage("hello"+name).build();
        responseObserver.onNext(reply);
        responseObserver.onCompleted();
    }
}
