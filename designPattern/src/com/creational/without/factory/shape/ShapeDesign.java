package com.creational.without.factory.shape;

public class ShapeDesign {
	
	public void makedesign(String shapeType) {
		if(shapeType.equalsIgnoreCase("triangle")) {
			designtriangle();
			drawTrinangle();
		}
		if(shapeType.equalsIgnoreCase("circle")) {
			designCircle();
			designCircle();
		}
		
	}

	private void drawTrinangle() {
		System.out.println("design triangle ");
		
	}

	private void designtriangle() {
		System.out.println("design triangle ");
		
	}
	
	private void designCircle() {
		System.out.println("design triangle ");
		
	}


}
