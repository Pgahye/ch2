package ch02;

import mypackage.Goods;

public class SpecialGoods extends Goods {
	
	public void test(){
		
		price=0; //protected는 다른 패키지라도 자식이라면 접근가능하다. 
	}

}
