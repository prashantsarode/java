package com.prashant.coreJava.algorithms.bst;

import java.util.Stack;

public class SimpleBST {

	private static class Node {
		private int data;
		private Node left, right;

		public Node(int value) {
			super();
			this.data = value;
			left = right = null;
		}

	}

	private Node root;

	public SimpleBST() {
		root = null;
	}
	
	public SimpleBST(int value) {
		root = new Node(value);
	}

	public Node getRoot() {
		return root;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public int size() {
		Node current = root;
		int size = 0;
		Stack<Node> stack = new Stack<>();

		while (!stack.isEmpty() || current != null) {
			if (current != null) {
				stack.push(current);
				current = current.left;
			} else {
				size++;
				current = stack.pop();
				current = current.right;
			}
		}
		return size;
	}

	public void clear() {
		root = null;
	}
}
