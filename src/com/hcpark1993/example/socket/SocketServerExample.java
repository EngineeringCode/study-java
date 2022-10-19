package com.hcpark1993.example.socket;

import java.io.*;
import java.net.*;

public class SocketServerExample {
	public static final String SERVER_IP_ADDRESS = "127.0.0.1";
	public static final int SERVER_PORT = 50001;
	public static final int BUFFER_SIZE = 1024;
	public static final int PACKET_STX = 0x02;
	public static final int PACKET_ETX = 0x03;
	
	public static void main(String args[]) throws IOException {
		try {
			System.out.println("소켓 서버 시작");	
			
			/* 클라이언트로부터 연결 요청이 올 때 까지 대기 */
			ServerSocket serverSocket = new ServerSocket(SERVER_PORT);
			Socket socket = serverSocket.accept();
			System.out.println("클라이언트 IP 주소: "+ socket.getInetAddress());
			
			/* 데이터 수신 */
			byte[] buffer = new byte[BUFFER_SIZE];
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			System.out.println("데이터 수신 시작");
			int bufferIndex = 0;		
			while(bufferIndex < buffer.length) {
				buffer[bufferIndex] = (byte) bufferedReader.read();
				System.out.printf("%d ", buffer[bufferIndex]);
				++bufferIndex;
				
				if(bufferIndex == 3 && buffer[2] == PACKET_ETX){
					System.out.println("정상적으로 패킷이 수신되었습니다.");
					break;
				}
			}
			System.out.println("데이터 수신 끝");

			/* 데이터 전송 */
			OutputStream outputStream = socket.getOutputStream();
			System.out.println("데이터 전송 시작");		
			outputStream.write(PACKET_STX);
			outputStream.write(7);
			outputStream.write(PACKET_ETX);
			//outputStream.flush();
			System.out.println("데이터 전송 끝");
			
			socket.shutdownOutput(); // Half close
		} catch (Exception e) {
			if(e.getMessage().contains("Socket is closed")) {
				System.out.println("연결이 끊겼습니다.");
				return;
			}
			e.printStackTrace();
		}
	}
}