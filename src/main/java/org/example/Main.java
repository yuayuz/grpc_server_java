package org.example;

import grpc.service.service;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 8980;
        Server server = ServerBuilder.forPort(port).addService(new service()).build().start();
        System.out.printf("GRPC服务端启动成功，端口号为%d%n",port);
        server.awaitTermination();
    }
}