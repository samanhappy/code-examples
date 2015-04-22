package org.guava.collections;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class BiMapUse {
	
	public static void main(String[] args) {
		// 实现键值对的双向映射，可以inverse
		BiMap<String, String> bmap = HashBiMap.create();
		
		bmap.put("k1", "v1");
		bmap.put("k2", "v2");
		System.out.println(bmap);
		
		System.out.println(bmap.inverse());
		System.out.println(bmap);
	}

}
