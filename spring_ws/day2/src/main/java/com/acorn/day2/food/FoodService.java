package com.acorn.day2.food;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FoodService {
	public String getFood() {
		return "신라면";
	}
	
	public String getFoodver2() {
		//String[] foods;
		//foods = new String[] {"김밥","라면","불고기덮밥","순댓국","파스타"};
		
		//String[] foods = new String[] {"김밥","라면","불고기덮밥","순댓국","파스타"};
		
		String[] foods = {"김밥","라면","불고기덮밥","순댓국","파스타"};
		
		Random r = new Random();
		int index = r.nextInt(foods.length);
		String food = foods[index];
		return food;
	}
}
