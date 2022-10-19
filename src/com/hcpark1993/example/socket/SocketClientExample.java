package com.hcpark1993.example.socket;

import java.io.*;
import java.net.*;

public class SocketClientExample {
	public static final String SERVER_IP_ADDRESS = "127.0.0.1";
	public static final int SERVER_PORT = 50001;
	public static final int BUFFER_SIZE = 1024;
	public static final int PACKET_STX = 2;
	public static final int PACKET_ETX = 3;
	
	public static void main(String args[]) throws IOException  {
		try {
			System.out.println("소켓 클라이언트 시작");	
			
			Socket socket = new Socket();
			SocketAddress socketAddress = new InetSocketAddress(SERVER_IP_ADDRESS , SERVER_PORT);
			socket.connect(socketAddress);
			
			if(!socket.isConnected()) {
				System.out.println("서버 연결 실패");
				return;
			}
			
			System.out.println("서버 연결 성공");
			
			/* 데이터 전송 */
			OutputStream outputStream = socket.getOutputStream();
			System.out.println("데이터 전송 시작");		
			outputStream.write(PACKET_STX);
			outputStream.write(1);
			outputStream.write(PACKET_ETX);
			//outputStream.flush();
			System.out.println("데이터 전송 끝");
			
			
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
			
			socket.shutdownOutput(); // Half close
		} catch (Exception e) {
			if(e.getMessage().contains("Socket is closed")) {
				System.out.println("연결이 끊겼습니다.");
				return;
			} else if(e.getMessage().contains("Connection refused")) {
				System.out.println("연결에 실패하였습니다.");
				return;
			}
			e.printStackTrace();
		}
		
	}
}