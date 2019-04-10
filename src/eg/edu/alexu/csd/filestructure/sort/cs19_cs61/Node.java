package eg.edu.alexu.csd.filestructure.sort.cs19_cs61;

import eg.edu.alexu.csd.filestructure.sort.INode;

public class Node<T> implements INode {
	
	private int index;
	private Comparable value;
	
	public Node (int i) {
		this.index = i;
	}
	
	
	
	@Override
	public INode getLeftChild() {
		return null;
	}

	@Override
	public INode getRightChild() {
		return null;
	}

	@Override
	public INode getParent() {
		return null;
	}

	@Override
	public Comparable getValue() {
		return null;
	}

	@Override
	public void setValue(Comparable value) {

	}
}
