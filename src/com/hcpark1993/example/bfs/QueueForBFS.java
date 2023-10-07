package com.hcpark1993.example.bfs;
import java.util.*;

public class QueueForBFS {
	/*
	 * BFS(Breadth-First-Search) 예제
	 * 루트 노드에서 간선을 따라 너비(breadth)를 우선으로 모든 노드를 방문하는 함수를 스택으로 구현
	 * 
	 * 해설 주소: 
	 */

	public static void main(String[] args){
		int countNode = 7;
		int[][] edges = new int[][]{{1,3}, {3,4}, {3,5}, {1,2}, {2,6}, {1, 7}};
		boolean[] isVisited = new boolean[countNode+1];
		
		LinkedList<Integer> queue = new LinkedList<>();
		queue.add(1);
		
		while(!queue.isEmpty()) {
			int currentNode = queue.poll();
			
			if(isVisited[currentNode] == true) {
				System.out.println("Visitd Node " + currentNode);
				continue;
			}
			
			System.out.println("Visit Node " + currentNode);
			isVisited[currentNode] = true;
			
			for(int i=0; i<edges.length; i++) {
				if(edges[i][0] == currentNode) {
					queue.add(edges[i][1]);
				}
			}
		}
	}
}
