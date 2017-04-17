package ch02;

import mypackage.Goods;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Goods camera=new Goods();
	//	camera.price=400000; //protected 같은 패키지나 자식클래스에서만 가능 
	//	camera.countStock=30; //default는 같은 패키지에서만 가능
		//camera.countSold=50; //내부에서만 사용가능
		
		//System.out.println("이름:"+camera.name+"가격:"+camera.price
			//	+"재고량:"+camera.countStock+"판매량:");
		
		camera.setCountSold(10);
		camera.showInfo();
		
		System.out.println(camera.getCountSold());
		
		camera.setPrice(-10000);
	}
	
		

}
