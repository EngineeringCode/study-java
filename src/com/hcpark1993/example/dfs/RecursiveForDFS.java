package com.hcpark1993.example.dfs;

public class RecursiveForDFS {
	/*
	 * DFS(Depth-First-Search) 예제
	 * 루트 노드에서 간선을 따라 깊이(depth)를 우선으로 모든 노드를 방문하는 재귀 함수 구현
	 * 
	 * 해설 주소: https://engineeringcode.tistory.com/451
	 */

	public static void main(String[] args){
		int countNode = 7;
		int[][] edges = new int[][]{{1,3}, {3,4}, {3,5}, {1,2}, {2,6}, {1, 7}};
		boolean[] isVisited = new boolean[countNode+1];
		
		dfsRecursive(edges, countNode, 1, isVisited);
	}
	
	static void dfsRecursive(int[][] edges, int countNode, int currentNode, boolean[] isVisited) {
		if(isVisited[currentNode] == true) {
			return;
		}
		
		System.out.println("Visit Node " + currentNode);
		isVisited[currentNode] = true;
		
		for(int i=0; i<edges.length; i++) {
			if(edges[i][0] == currentNode) {
				dfsRecursive(edges, countNode, edges[i][1], isVisited);
			}
		}
	}
}
