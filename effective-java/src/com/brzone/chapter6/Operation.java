package com.brzone.chapter6;

import java.util.stream.Stream;

/**
 * 
 * @author brzone
 *
 */
public enum Operation {

	PLUS	{
		@Override
		public double apply(double x, double y) {
			return x + y;
		}
	},

	MINUS	{
		@Override
		public double apply(double x, double y) {
			return x - y;
		}
	},

	TIMES	{
		@Override
		public double apply(double x, double y) {
			return x * y;
		}
	},
	DIVIDE(Type.BAD) {
		@Override
		public double apply(double x, double y) {
			return x / y;
		}
	};

	public abstract double apply(double x, double y);
	
	public void info() {
		System.out.println(type);
	}
	
	private final Type type;
	
	Operation (){
		this.type = Type.GOOD; 
	}
	
	Operation (Type type){
		this.type = type; 
	}
	
	private enum Type {
		
		GOOD, 
		
		BAD;
		
	}

	public static void main(String[] args) {

		Stream.of(Operation.values()).forEach(System.out::println);
		
		Stream.of(Operation.values()).forEach(f->f.info());

		Stream.of(Operation.values()).forEach(f->System.out.println(f.apply(8, 2)));
	}

}
