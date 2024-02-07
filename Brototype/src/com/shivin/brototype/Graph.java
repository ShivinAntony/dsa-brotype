package com.shivin.brototype;
import java.util.*;



public class Graph {
	
	private Map<Integer, List<Integer>> map = new HashMap<>();
	
	private void addVertex(Integer data) {
		map.put(data, new ArrayList<>());
		
	}
	
	public void insert(Integer vertex, Integer edge, boolean isBidirectional) {
		
		if(!map.containsKey(vertex)) {
			addVertex(vertex);
		}
		if(!map.containsKey(edge)) {
			addVertex(edge);
		}
		
		map.get(vertex).add(edge);
		if(isBidirectional) {
			map.get(edge).add(vertex);
		}
		
	}
	
	public void display() {
		for(Integer x : map.keySet()) {
			System.out.print(x+": ");
			for(Integer y : map.get(x)) {
				System.out.print(y+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Graph graph = new Graph();
		
		graph.insert(3, 5, true);
		graph.insert(3, 4, true);
		graph.insert(5, 6, false);
		
		
		graph.display();
	}

}
