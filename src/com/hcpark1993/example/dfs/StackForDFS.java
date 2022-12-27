package com.hcpark1993.example.dfs;
import java.util.*;

public class StackForDFS {
	/*
	 * DFS(Depth-First-Search) 예제
	 * 루트 노드에서 간선을 따라 깊이(depth)를 우선으로 모든 노드를 방문하는 함수를 스택으로 구현
	 * 
	 * 해설 주소: https://engineeringcode.tistory.com/451
	 */

	public static void main(String[] args){
		int countNode = 7;
		int[][] edges = new int[][]{{1,3}, {3,4}, {3,5}, {1,2}, {2,6}, {1, 7}};
		boolean[] isVisited = new boolean[countNode+1];
		
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		
		while(!stack.isEmpty()) {
			int currentNode = stack.pop();
			
			if(isVisited[currentNode] == true) {
				System.out.println("Visitd Node " + currentNode);
				continue;
			}
			
			System.out.println("Visit Node " + currentNode);
			isVisited[currentNode] = true;
			
			for(int i=0; i<edges.length; i++) {
				if(edges[i][0] == currentNode) {
					stack.push(edges[i][1]);
				}
			}
		}
	}
}
