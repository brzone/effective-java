package com.brzone.chapter7;

import java.util.function.DoubleBinaryOperator;
import java.util.stream.Stream;

/**
 * 
 * @author brzone
 *
 * @date 2020年7月9日下午10:10:31
 */
public enum Operation {
	
	PLUS((x,y)-> x + y) ,
	
	MINUS((x,y)-> x -y) ,
	
	TIMES((x,y)-> x * y) ,
	
	DIVIDE((x,y)-> x / y);

	private final DoubleBinaryOperator op;
	
	
	Operation(DoubleBinaryOperator op) {
		this.op = op;
	}
	
	public double apply(double x,double y) {
		return op.applyAsDouble(x, y);
	}
	
	public static void main(String[] args) {
		
		double x = 8;
		
		double y = 2;
		
		Stream.of(Operation.values()).forEach(f->{
			System.out.println(f + ":\t" + f.apply(x, y));
		});
		
		
		
		
	}
	
}
