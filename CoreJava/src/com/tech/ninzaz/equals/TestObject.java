package com.tech.ninzaz.equals;

public class TestObject {
	
	private int i1;

	public TestObject(int i1){
		this.i1 = i1;
	}
		
	public int getI1() {
		return i1;
	}

	public void setI1(int i1) {
		this.i1 = i1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + i1;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestObject other = (TestObject) obj;
		if (i1 != other.i1)
			return false;
		return true;
	}
	
	
}
