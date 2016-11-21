package com.lyh.section_01;

@ThreadSafe
public class Sequence {
	@GuardedBy private int Value;
	
	public synchronized int getNext(){
		return Value++;
	}
}
