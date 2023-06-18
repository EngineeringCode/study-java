package com.hcpark1993.example.random;

import java.util.Random;

public class RandomExample {
	public static void main(String[] args){
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		
		System.out.println("Random Integer: " + random.nextInt());
		System.out.println("Random Long: " + random.nextLong());
		System.out.println("Random Float: " + random.nextFloat());
		System.out.println("Random Double: " + random.nextDouble());
		System.out.println("Random Boolean: " + random.nextBoolean());
	}
}
