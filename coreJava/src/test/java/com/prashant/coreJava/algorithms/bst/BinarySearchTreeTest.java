package com.prashant.coreJava.algorithms.bst;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchTreeTest {

	BinarySearchTree<Integer> underTest;
	
	@Before
	public void setup() throws Exception {
		Node<Integer> root = new Node<>(5);
		underTest = new BinarySearchTree<>(root);
	}
	
	@Test
	public void givenOnlyRootNodeSizeShouldBeOne() {
		assertEquals("Tree size do not match" ,  1, underTest.size());
	}
	
	@Test
	public void givenEmptyBinaryTreeSizeShouldBeZero() {
		underTest.setRoot(null);
		assertEquals("Tree size is not 0 for empty tree", 0, underTest.size());
	}

}
