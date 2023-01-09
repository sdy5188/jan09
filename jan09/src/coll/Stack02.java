package coll;
// 768p
//동전 클래스
/*
 * LIFO	last in first out	-->스택
 * FIFO first in first out	-->큐 
 */

import java.util.Stack;

class Coin{
	private int value;
	
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;		
	}
}

public class Stack02 {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {//코인박스가 비어있지않다면
			Coin coin = coinBox.pop();
			System.out.println("꺼내온 동전 : "+coin.getValue());
			//결과 : 나중에 생성된 코인이 제일 먼저나온다
		}
	}
}
