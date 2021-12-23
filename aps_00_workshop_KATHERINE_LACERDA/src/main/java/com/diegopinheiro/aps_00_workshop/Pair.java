package com.diegopinheiro.aps_00_workshop;

public class Pair {
	private String left;
	private String right;
	public Pair (String left, String right) {
		this.setLeft(left);
		this.setRight(right);
	}
	public String getRight() {
		return right;
	}
	public void setRight(String right) {
		this.right = right;
	}
	public String getLeft() {
		return left;
	}
	public void setLeft(String left) {
		this.left = left;
	}
	@Override
	public String toString() {
		return "("+ this.left + ", " + this.right + ")";
	}
	
	@Override
	public boolean equals (Object a) {
		if(a != null) {
			Pair pairObjectOne = (Pair) a;
			if(pairObjectOne.getLeft().equals(this.getLeft()) == true && pairObjectOne.getRight().equals(this.getRight())==true) {
				return true;
			}else {
				return false;
			}
		} else {
			return false;
		}
		
	}

}
