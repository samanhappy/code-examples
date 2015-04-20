package org.guava.objects;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class MultiMapUse {

	public static void main(String[] args) {
		// ArrayListMultimap:键行为类似HashMap、值行为类似ArrayList
		Multimap<String, String> mmap = ArrayListMultimap.create();
		
		mmap.put("k1", "v1");
		mmap.put("k1", "v2");
		mmap.put("k2", "v1");
		List<String> list = new ArrayList<String>();
		list.add("v3");
		list.add("v4");
		mmap.putAll("k1", list);
		System.out.println(mmap);
		
		mmap.remove("k1", "v1");
		System.out.println(mmap);
		
		mmap.removeAll("k1");
		System.out.println(mmap);
		
		mmap.replaceValues("k2", list);
		System.out.println(mmap);
		
		// 为Multimap<K, V>提供Map<K,Collection<V>>形式的视图
		System.out.println(mmap.asMap());
		
		// 返回Multimap中所有”键-单个值映射”——包括重复键
		System.out.println(mmap.entries());
		
		// 用Set表示Multimap中所有不同的键
		System.out.println(mmap.keySet());
		
		// 用Multiset表示Multimap中的所有键，每个键重复出现的次数等于它映射的值的个数
		System.out.println(mmap.keys());
		
		// 用一个”扁平”的Collection<V>包含Multimap中的所有值，包含重复
		mmap.put("k1", "v3");
		System.out.println(mmap.values());
	}

}
