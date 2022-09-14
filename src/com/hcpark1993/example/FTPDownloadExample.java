package com.hcpark1993.example;

import java.io.*;
import java.net.*;
import org.apache.commons.net.ftp.*;
/*
 * commons-net 3.8.0 is required.
 */
public class FTPDownloadExample {

	public static void main(String[] args) throws SocketException, IOException {
		FTPClient ftpClient = new FTPClient();
		ftpClient.setControlEncoding("UTF-8");
		ftpClient.connect("127.0.0.1", 21);
		
		ftpClient.setSoTimeout(3000);
		//ftpClient.enterLocalActiveMode();
		ftpClient.enterLocalPassiveMode();
		
		if (!FTPReply.isPositiveCompletion(ftpClient.getReplyCode())) {
			System.out.println("Fail to connect.");
			return;
		}
		System.out.println("Found server!");
		
		if(!ftpClient.login("id", "pw")){
			System.out.println("Authentication failed.");
			return;
		}
		System.out.println("Logged in!");
		
		String filePath = "/upload.jpg";
		FileOutputStream fileOutputStream = new FileOutputStream("download.jpg");
		
		boolean downloadResult = ftpClient.retrieveFile(filePath, fileOutputStream);
		
		if(downloadResult == false) {
			System.out.println("Fail to download.");
			return;
		}
		System.out.println("Downloaded!");
	}
}
