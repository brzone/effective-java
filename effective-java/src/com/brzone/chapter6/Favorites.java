package com.brzone.chapter6;

import java.util.HashMap;
import java.util.Map;


/**
 * 
 * @author brzone
 *
 */
public class Favorites {

	private Map<Class<?>, Object> favorites = new HashMap<>();
	
	public <T> void putFavorites(Class<T> type,T instance) {
		favorites.put(type, instance);
	}
	
	public <T> T getFavoritets(Class<T> type) {
		Object obj = favorites.get(type);
		
		return type.cast(obj);
	}
	
	public static void main(String[] args) {
		
		Favorites f  = new Favorites();
		
		f.putFavorites(String.class, "I love");
		
		f.putFavorites(Integer.class, 781);
		
		System.out.println(f.getFavoritets(String.class) + "\t" + f.getFavoritets(Integer.class));
	}
	
}
