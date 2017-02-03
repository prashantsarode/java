package com.prashant.coreJava.algorithms.bst;

import java.util.Stack;

public class BinarySearchTree<T> {

	private Node<T> root;

	public BinarySearchTree() {
		super();
	}

	public BinarySearchTree(Node<T> root) {
		super();
		this.root = root;
	}

	public Node<T> getRoot() {
		return root;
	}

	public void setRoot(Node<T> root) {
		this.root = root;
	}
	
	public int size() {
		Node<T> current = root;
		int size = 0;
		Stack<Node<T>> stack = new Stack<>();
		
		while (!stack.isEmpty() || current != null) {
			if (current != null) {
				stack.push(current);
				current = current.getLeft();
			} else {
				size++;
				current = stack.pop();
				current = current.getRight();
			}
		}
		
		return size;
	}

}
