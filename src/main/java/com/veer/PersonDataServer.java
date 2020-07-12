package com.veer;

import io.grpc.Server;
import io.grpc.ServerBuilder;

public class PersonDataServer {

	public static void main(String[] args) {

		Server server = ServerBuilder.forPort(50051)
			//	.addService(bindableService)
				.build();
		
		
	}
}
