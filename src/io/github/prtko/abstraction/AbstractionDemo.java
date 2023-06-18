package io.github.prtko.abstraction;

public class AbstractionDemo {

	public static void main(String[] args) {
		
		GraphicObject circle=new Cicle();
		circle.draw();
		circle.resize();
		
		GraphicObject rectangle=new Rectangle();
		rectangle.draw();
		rectangle.resize();


	}

}
