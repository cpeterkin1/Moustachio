/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Map.Entry;

/**
 *
 * @author Zach
 */
public class Pair<K extends Object, V extends Object> implements Entry {
	
	K key;
	V value;
	
	public Pair(Object key, Object value) {
		this.key = (K) key;
		this.value = (V) value;
	}
	
	@Override
	public Object getKey() {
		return key;
	}

	@Override
	public Object getValue() {
		return value;
	}

	@Override
	public Object setValue(Object v) {
		this.value = (V) v;
		return value;
	}
	
}
