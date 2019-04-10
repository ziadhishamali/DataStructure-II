package eg.edu.alexu.csd.filestructure.sort.cs19_cs61;

import java.util.ArrayList;
import java.util.Collection;

import eg.edu.alexu.csd.filestructure.sort.IHeap;
import eg.edu.alexu.csd.filestructure.sort.INode;

public class Heap<T extends Comparable<T>> implements IHeap {
	
	ArrayList<INode<T>> arr = new ArrayList<>();
	int size = arr.size();
	
	
	private class Node<T extends Comparable<T>> implements INode {
		
		private int index;
		private T value;
		
		public Node (int i) {
			this.index = i;
		}
		
		@Override
		public INode getLeftChild() {
			if (2 * index + 1 >= size ) {
				return null;
			} else {
				INode node = arr.get(2 * index + 1);
				return node;
			}
			
		}

		@Override
		public INode getRightChild() {
			if (2 * index + 2 >= size ) {
				return null;
			} else {
				INode node = arr.get(2 * index + 2);
				return node;
			}		
		}

		@Override
		public INode getParent() {
			if ((index - 1) / 2  >= size || (index - 1) / 2 < 0) {
				return null;
			} else {
				INode node = arr.get((index - 1) / 2);
				return node;
			}	
		}

		@Override
		public Comparable getValue() {
			if (index >= size) {
				return null;
			} else {
				INode node = arr.get(index);
				return node.getValue();
			}
		}

		@Override
		public void setValue(Comparable value) {
			if (index >= size) {
				try {
					throw new Exception();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				INode node = arr.get(index);
				node.setValue(value);
			}
		}
		
	}
	
	@Override
	public INode getRoot() {
		if (size == 0) {
			return null;
		} else {
			return arr.get(0);
		}
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public void heapify(INode node) {

	}

	@Override
	public Comparable extract() {
		return null;
	}

	@Override
	public void insert(Comparable element) {

	}

	@Override
	public void build(Collection unordered) {

	}
	


	
}
