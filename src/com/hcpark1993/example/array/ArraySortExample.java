package com.hcpark1993.example.array;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Functional Interfaces: https://docs.oracle.com/javase/specs/jls/se17/html/jls-9.html#jls-9.8
 */
public class ArraySortExample {
	static class Location{
		public int x;
		public int y;
		
		Location(int x, int y){
			this.x = x;
			this.y = y;
		}
	}
	
	public static void main(String[] args){
		Location[] locations = new Location[3];
		locations[0] = new Location(2, 1);
		locations[1] = new Location(1, 1);
		locations[2] = new Location(1, 0);
		
		System.out.println("정렬 전");
		for(Location loc:locations) {
			System.out.println("("+loc.x+","+loc.y+")");
		}
		
		// x와 y를 기준으로 오름차순 정렬
		Arrays.sort(locations, new Comparator<Location>() {
			@Override
			public int compare(Location o1, Location o2) {
				int result = Integer.compare(o1.x, o2.x);
				if(result == 0) {
					result = Integer.compare(o1.y, o2.y);
				}
				return result;
			}
		});
		
		System.out.println("정렬 후");
		for(Location loc:locations) {
			System.out.println("("+loc.x+","+loc.y+")");
		}
	}
	
}
